package thepunkprogrammer.kotlindelegates

import android.content.SharedPreferences

/**
 * Created by webcubictech2 on 9/10/17.
 */


inline fun SharedPreferences.edit(func: SharedPreferences.Editor.() -> Unit) {
    val editor = edit()
    editor.func()
    editor.apply()
}


infix fun SharedPreferences.Editor.saveString(pair: Pair<String, String>) = this.putString(pair.first, pair.second)

infix fun SharedPreferences.Editor.saveInt(pair: Pair<String, Int>) = this.putInt(pair.first, pair.second)


infix fun SharedPreferences.Editor.saveFloat(pair: Pair<String, Float>) = this.putFloat(pair.first, pair.second)


infix fun SharedPreferences.Editor.saveLong(pair: Pair<String, Long>) = this.putLong(pair.first, pair.second)


infix fun SharedPreferences.Editor.saveBoolean(pair: Pair<String, Boolean>) = this.putBoolean(pair.first, pair.second)

infix fun SharedPreferences.valueOf(key: String) = this.getString(key, "")

infix fun SharedPreferences.inValueOf(key: String) = this.getInt(key, 0)

infix fun SharedPreferences.floatValueOf(key: String) = this.getFloat(key, 0f)

infix fun SharedPreferences.longValueOf(key: String) = this.getLong(key, 0L)

infix fun SharedPreferences.boolValueOf(key: String) = this.getBoolean(key, false)

infix fun SharedPreferences.Editor.remove(key: String) = this.remove(key)


