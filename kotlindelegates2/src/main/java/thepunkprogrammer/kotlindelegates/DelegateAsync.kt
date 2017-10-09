package thepunkprogrammer.kotlindelegates

import android.os.AsyncTask

/**
 * Created by webcubictech2 on 9/10/17.
 */
class DelegateAsync<Task>(val task: () -> Task, val success: (Task) -> Any = {}, val failure: (Exception?) -> Any = {}) : AsyncTask<Void, Void, Task>() {

    var exception: Exception? = null


    override fun doInBackground(vararg params: Void?): Task? =
            try {
                this debug ("Async" to "Do in background executed")
                kotlin.run { task() }
            } catch (e: Exception) {
                exception = e
                this error ("Async" to "Error in background task")
                null
            }

    override fun onPostExecute(result: Task) {
        this debug ("Async" to "Post execute started")
        if (isCancelled) {
            this error ("Async" to "Failure due to task cancelled")
            kotlin.run { RuntimeException("Task Cancelled") }
        } else {
            if (exception != null) {
                this error ("Async" to "Failed with exception")
                kotlin.run { failure(exception) }
            } else {
                this verbose ("Async" to "Async task successful")
                kotlin.run { success(result) }
            }
        }
    }


    fun start() {
        execute()
    }

    fun stop() {
        cancel(true)
    }
}