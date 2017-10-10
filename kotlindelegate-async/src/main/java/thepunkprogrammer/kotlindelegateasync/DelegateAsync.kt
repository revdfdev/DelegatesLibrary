package thepunkprogrammer.kotlindelegateasync

import android.content.Context
import android.os.AsyncTask
import android.util.Log
import java.lang.ref.WeakReference
import java.util.concurrent.Executor

/**
 * Created by webcubictech2 on 9/10/17.
 */
abstract class Task<T>(private val backgroundWork: BackgroundWork<T>): AsyncTask<Void, Void, T>() {

    var exception: Exception? = null

    override fun onPostExecute(result: T) {
        if (isCancelled) {
            Log.e("Async", "Exception recorded due to task cancelled")
            error(RuntimeException("Task cancelled"))
        } else {
            if (exception != null) {
                Log.e("Async task", "Exception + ${exception?.message}")
                error(exception)
            } else {
                success(result)
            }
        }
    }

    override fun doInBackground(vararg params: Void?) = try {
            Log.d("Async task", "Enter in do in background")
            backgroundWork.doinBackGround()
        }catch (e: Exception) {
            exception = e
            error(exception)
            null
        }

    protected abstract fun success(result: T?)
    protected abstract fun error(e: Exception?)
}

interface BackgroundWork<out T> {

    @Throws(Exception::class)
    fun doinBackGround(): T
}

interface Completion<in T> {

    fun onsuccess(context: Context?, result: T?)
    fun onerror(context: Context?, e: Exception?)
}

class DelegateTask<T>(private var context: WeakReference<Context>, backgroundWork: BackgroundWork<T>, val completion: Completion<T>): Task<T>(backgroundWork) {


    override fun success(result: T?) {
            completion.onsuccess(context.get(), result)
    }

    override fun error(e: Exception?) {
        completion.onerror(context.get(), e)
    }

}

sealed class Tasker {

    companion object {

        fun<T> executeInBackground(context: Context?, backgroundWork: BackgroundWork<T>, completion: Completion<T>) {
            executeInBackground(context, backgroundWork, completion, AsyncTask.THREAD_POOL_EXECUTOR)
        }

        private fun<T> executeInBackground(context: Context?, backgroundWork: BackgroundWork<T>, completion: Completion<T>, executor: Executor) {
            val weakRef = WeakReference<Context>(context)
            DelegateTask(weakRef, backgroundWork, completion).executeOnExecutor(executor)
        }

    }

}


inline fun<T> async(func: Tasker.Companion.() -> Unit) {
    Tasker.Companion.func()
}