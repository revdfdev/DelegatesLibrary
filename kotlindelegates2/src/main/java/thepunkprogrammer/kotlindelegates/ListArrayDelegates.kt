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