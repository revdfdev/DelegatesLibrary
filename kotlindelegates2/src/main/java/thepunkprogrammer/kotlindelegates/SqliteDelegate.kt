package thepunkprogrammer.kotlindelegates

import android.database.sqlite.SQLiteDatabase
import android.util.Log

/**
 * Created by webcubictech2 on 9/10/17.
 */


inline fun SQLiteDatabase.inTransaction(func: SQLiteDatabase.() -> Unit) {
    beginTransaction()
    try {
        func()
    } catch (e: Exception) {
        Log.d("Delegates", e.message!!)
    } finally {
        endTransaction()
    }
}