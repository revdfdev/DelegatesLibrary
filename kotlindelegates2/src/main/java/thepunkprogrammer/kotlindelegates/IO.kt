package thepunkprogrammer.kotlindelegates

/**
 * Created by webcubictech2 on 9/10/17.
 */
infix fun String.append(appendWith: Char):String {
    val builder = StringBuilder(this)
    return builder.append(appendWith).toString()
}

//TODO