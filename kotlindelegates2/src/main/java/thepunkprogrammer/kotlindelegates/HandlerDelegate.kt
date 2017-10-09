package thepunkprogrammer.kotlindelegates

import android.os.Handler

/**
 * Created by webcubictech2 on 9/10/17.
 */
infix fun<T: Any> Handler.now(func: () -> T) = this.post({func()})

infix fun<T: Any> Handler.front(func: () -> T) = this.postAtFrontOfQueue({func()})

inline fun<T: Any> Handler.time(time: Long, crossinline func: () -> T) = this.postAtTime({func()}, time)

inline fun<T: Any> Handler.delay(time: Long, crossinline func: () -> T) = this.postDelayed({func()}, time)

