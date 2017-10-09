package thepunkprogrammer.kotlindelegates

import android.util.Log

/**
 * Created by webcubictech2 on 9/10/17.
 */

infix fun Any.debug(tagmessagePair: Pair<String, Any>) {
    Log.d(tagmessagePair.first, tagmessagePair.second.toString())
}


infix fun Any.error(tagmessagePair: Pair<String, Any>) {
    Log.e(tagmessagePair.first, tagmessagePair.second.toString())
}


infix fun Any.info(tagmessagePair: Pair<String, Any>) {
    Log.i(tagmessagePair.first, tagmessagePair.second.toString())
}


infix fun Any.verbose(tagmessagePair: Pair<String, Any>) {
    Log.v(tagmessagePair.first, tagmessagePair.second.toString())
}