package thepunkprogrammer.kotlindelegates

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle

/**
 * Created by webcubictech2 on 9/10/17.
 */
inline fun fireActivity(context: Context, target: Class<*>, func: Intent.() -> Unit) {
    val intent = Intent(context, target).apply {
        func()
    }
    context.startActivity(intent)
}

inline fun fireForResult(activity: Activity, target: Class<*>, requestCode: Int, func: Intent.() -> Unit) {
    val intent = Intent(activity, target).apply(func)
    activity.startActivityForResult(intent, requestCode)

}

inline fun fireService(context: Context, service: Class<*>, func: Intent.() -> Unit) {
    val intent = Intent(context, service).apply(func)
    context.startService(intent)
}


infix fun Intent.saveString(pair: Pair<String, String>) =  putExtra(pair.first, pair.second)

infix fun Intent.saveInt(pair: Pair<String, Int>) = putExtra(pair.first, pair.second)

infix fun Intent.saveLong(pair: Pair<String, Long>) = putExtra(pair.first, pair.second)

infix fun Intent.saveFloat(pair: Pair<String, Float>) = putExtra(pair.first, pair.second)

infix fun Intent.saveBoolean(pair: Pair<String, Boolean>) = putExtra(pair.first, pair.second)

infix fun Intent.saveBundle(pair: Pair<String, Bundle>) = putExtra(pair.first, pair.second)

infix fun Intent.getString(key: String) = getStringExtra(key)

infix fun Intent.getInt(key: String) = getIntExtra(key, 0)

infix fun Intent.getLong(key: String) = getLongExtra(key, 0L)

infix fun Intent.getFloat(key: String) = getFloatExtra(key, 0F)

infix fun Intent.getBoolean(key: String) = getBooleanExtra(key, false)

infix fun Intent.getBundle(key: String) = getBundleExtra(key)