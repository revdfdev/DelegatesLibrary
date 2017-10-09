package thepunkprogrammer.kotlindelegates

import android.content.Intent
import android.os.Bundle

/**
 * Created by webcubictech2 on 9/10/17.
 */
infix fun Bundle.saveString(pair: Pair<String, String>) =  putString(pair.first, pair.second)

infix fun Bundle.saveInt(pair: Pair<String, Int>) = putInt(pair.first, pair.second)

infix fun Bundle.saveLong(pair: Pair<String, Long>) = putLong(pair.first, pair.second)

infix fun Bundle.saveFloat(pair: Pair<String, Float>) = putFloat(pair.first, pair.second)

infix fun Bundle.saveBoolean(pair: Pair<String, Boolean>) = putBoolean(pair.first, pair.second)

infix fun Bundle.getString(key: String) = getString(key)

infix fun Bundle.getInt(key: String) = getInt(key, 0)

infix fun Bundle.getLong(key: String) = getLong(key, 0L)

infix fun Bundle.getFloat(key: String) = getFloat(key, 0F)

infix fun Bundle.getBoolean(key: String) = getBoolean(key, false)
