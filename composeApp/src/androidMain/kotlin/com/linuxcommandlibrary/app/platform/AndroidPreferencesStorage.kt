package com.linuxcommandlibrary.app.platform

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import androidx.preference.PreferenceManager
import com.linuxcommandlibrary.shared.platform.PreferencesStorage

class AndroidPreferencesStorage(context: Context) : PreferencesStorage {
    // Use default shared preferences for backward compatibility with existing user data
    private val prefs: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)

    override fun getString(key: String, defaultValue: String): String {
        return prefs.getString(key, defaultValue) ?: defaultValue
    }

    override fun putString(key: String, value: String) {
        prefs.edit { putString(key, value) }
    }

    override fun getBoolean(key: String, defaultValue: Boolean): Boolean {
        return prefs.getBoolean(key, defaultValue)
    }

    override fun putBoolean(key: String, value: Boolean) {
        prefs.edit { putBoolean(key, value) }
    }

    override fun getInt(key: String, defaultValue: Int): Int {
        return prefs.getInt(key, defaultValue)
    }

    override fun putInt(key: String, value: Int) {
        prefs.edit { putInt(key, value) }
    }
}
