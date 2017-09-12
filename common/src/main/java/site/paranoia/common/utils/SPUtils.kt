package site.paranoia.common.utils

import android.content.SharedPreferences
import android.preference.PreferenceManager
import site.paranoia.common.Common

/**
 * Created by Paranoia on 17-9-11.
 */
object SPUtils {
    private var mSharedPreferences=PreferenceManager.getDefaultSharedPreferences(Common.context)

    fun setInt(key: String, value: Int) = mSharedPreferences.edit().putInt(key, value).apply()

    fun getInt(key: String, defaultValue: Int = 0) = mSharedPreferences.getInt(key, defaultValue)

    fun setLong(key: String, value: Long) = mSharedPreferences.edit().putLong(key, value).apply()

    fun getLong(key: String, defaultValue: Long = 0L) = mSharedPreferences.getLong(key, defaultValue)

    fun setFloat(key: String, value: Float) = mSharedPreferences.edit().putFloat(key, value).apply()

    fun getFloat(key: String, defaultValue: Float = 0f) = mSharedPreferences.getFloat(key, defaultValue)

    fun setBoolean(key: String, value: Boolean) = mSharedPreferences.edit().putBoolean(key, value).apply()

    fun getBoolean(key: String, defaultValue: Boolean = false) = mSharedPreferences.getBoolean(key, defaultValue)

    fun setString(key: String, value: String) = mSharedPreferences.edit().putString(key, value).apply()

    fun getString(key: String, defaultValue: String = "") = mSharedPreferences.getString(key, defaultValue)!!

    fun remove(key: String) = mSharedPreferences.edit().remove(key).apply()

    fun clearAll() = mSharedPreferences.edit().clear().apply()
}