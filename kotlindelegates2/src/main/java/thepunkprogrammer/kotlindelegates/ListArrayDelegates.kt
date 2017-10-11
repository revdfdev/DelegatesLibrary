package thepunkprogrammer.kotlindelegates

import java.io.Serializable

/**
 * Created by webcubictech2 on 10/10/17.
 */

public infix fun<A, B>A.and(that: B): Pair<A, B> =  Pair(this, that)

public data class Quadruple<out A, out B, out C, out D>(
        public val first: A,
        public val second: B,
        public val third: C,
        public val fourth: D
): Serializable {
    public override fun toString(): String = "($first, $second, $third, $fourth)"
}

public fun<T>Quadruple<T,T,T,T>.toList():List<T> = listOf(first, second, third, fourth)

public infix fun<A, B> Pair<A, B>.combine(otherPair: Pair<A, B>) = Quadruple(this.first, this.second, otherPair.first, otherPair.second)

public inline infix fun<T> Iterable<T>.forEach(action: (T) -> Unit) {
    for (element in this) action(element)
}

public inline infix fun<T> Iterable<T>.forEachIndexed(action: (index: Int, T) -> Unit) {
    var index: Int = 0
    for (element in this) action(index++, element)
}

public infix fun<T> Iterable<T>.lastIndexOf(element: T): Int {
    (this as? List)?.lastIndexOf(element)
    var lastIndex = -1
    var index = 0
    for (item in this) {
        if (element == item) lastIndex = index
        index++
    }
    return lastIndex
}

public infix fun<T> List<T>.indexOf(element: T): Int {
    return indexOf(element)
}

public infix fun<T> Iterable<T>.indexOf(element: T): Int {
    (this as? List)?.indexOf(element)
    var index = 0
    for (item in this) {
        if (element == item) return index
        index++
    }
    return -1
}