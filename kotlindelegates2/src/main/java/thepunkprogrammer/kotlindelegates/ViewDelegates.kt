package thepunkprogrammer.kotlindelegates

import android.text.TextWatcher
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.widget.*

/**
 * Created by webcubictech2 on 9/10/17.
 */




infix fun View.onclick(f: (View) -> Unit) {
    this.setOnClickListener(f)
}

infix fun View.onlongClick(f: (View) -> Boolean) {
    this.setOnLongClickListener(f)
}

infix fun View.ontouch(f: (View, MotionEvent) -> Boolean) {
    this.setOnTouchListener(f)
}

infix fun View.keyevent(f: (View, Int, KeyEvent) -> Boolean) {
    this.setOnKeyListener(f)
}

infix fun View.focuschange(f: (View, Boolean) -> Unit) {
    this.setOnFocusChangeListener(f)
}

infix fun CompoundButton.checkchanged(f: (CompoundButton, Boolean) -> Unit) {
    this.setOnCheckedChangeListener(f)
}

infix fun AdapterView<*>.itemclicked(f: (AdapterView<*>, View, Int, Long) -> Unit) {
    this.setOnItemClickListener(f)
}

infix fun <T: AbsListView>T.scrollchange(statechange: (View, Int) -> Unit) {
    val listener = object: AbsListView.OnScrollListener {
        override fun onScroll(view: AbsListView, firstVisibleItem: Int, visibleItemCount: Int, totalItemCount: Int) {
        }

        override fun onScrollStateChanged(view: AbsListView, scrollState: Int) {
            statechange(view, scrollState)
        }

    }
    this.setOnScrollListener(listener)
}


infix fun EditText.ontextchange(f: (CharSequence, Int, Int, Int) -> Unit) {
    val listener = object: TextWatcher by DelegateTextWatcher {
        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            f(s, start, before, count)
        }
    }
    this.addTextChangedListener(listener)
}


infix fun SeekBar.progresschange(f: (SeekBar, Int, Boolean) -> Unit) {
    val listener = object : SeekBar.OnSeekBarChangeListener by DelegateSeekBarChangeListener {
        override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
            f(seekBar, progress, fromUser)
        }
    }

    this.setOnSeekBarChangeListener(listener)
}