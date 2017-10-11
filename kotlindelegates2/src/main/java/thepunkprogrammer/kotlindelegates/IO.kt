package thepunkprogrammer.kotlindelegates

import android.util.Log
import java.io.Closeable

/**
 * Created by webcubictech2 on 9/10/17.
 */
public infix fun String.append(appendWith: Char):String {
    val builder = StringBuilder(this)
    return builder.append(appendWith).toString()
}

public inline infix fun Closeable.using(action: Closeable.() -> Unit) {
    try {
        action()
    } catch (e: Exception) {
        Log.e("Using block", e.message!!)
    }finally {
        this.close()
    }
}

//TODO