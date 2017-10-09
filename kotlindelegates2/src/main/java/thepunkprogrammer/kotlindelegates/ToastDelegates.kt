package thepunkprogrammer.kotlindelegates

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast

/**
 * Created by webcubictech2 on 9/10/17.
 */

infix fun Context.toast (message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

@SuppressLint("ShowToast")
infix fun Context.TOAST(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

