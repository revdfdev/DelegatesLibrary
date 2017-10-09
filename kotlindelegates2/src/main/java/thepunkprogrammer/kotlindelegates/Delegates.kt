package thepunkprogrammer.kotlindelegates

import android.animation.Animator
import android.annotation.SuppressLint
import android.app.*
import android.content.*
import android.database.sqlite.SQLiteDatabase
import android.os.*
import android.support.annotation.RequiresApi
import android.support.v4.app.NotificationCompat
import android.support.v4.view.ViewPager
import android.support.v7.app.AlertDialog
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.widget.*

/**
 * Created by webcubictech2 on 9/10/17.
 */


inline fun dialogBuidlers(context: Context, func: AlertDialog.Builder.() -> Unit): AlertDialog {
    val builder = AlertDialog.Builder(context)
    builder.func()
    return builder.create()
}





object DelegateTextWatcher: TextWatcher {
    override fun afterTextChanged(s: Editable?) {
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
    }

}

object DelegateAnimationListener: Animator.AnimatorListener {
    override fun onAnimationRepeat(animation: Animator?) {
    }

    override fun onAnimationEnd(animation: Animator?) {
    }

    override fun onAnimationCancel(animation: Animator?) {
    }

    override fun onAnimationStart(animation: Animator?) {
    }

}

object DelegatePagechangeListener: ViewPager.OnPageChangeListener {
    override fun onPageScrollStateChanged(state: Int) {
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
    }

    override fun onPageSelected(position: Int) {
    }

}

object DelegateSeekBarChangeListener: SeekBar.OnSeekBarChangeListener {
    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
    }

}