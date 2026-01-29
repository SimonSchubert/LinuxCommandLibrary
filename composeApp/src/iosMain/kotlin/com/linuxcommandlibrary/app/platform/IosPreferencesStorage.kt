package com.linuxcommandlibrary.app.platform

import com.linuxcommandlibrary.shared.platform.PreferencesStorage
import platform.Foundation.NSUserDefaults

class IosPreferencesStorage : PreferencesStorage {
    private val defaults = NSUserDefaults.standardUserDefaults

    override fun getString(key: String, defaultValue: String): String = defaults.stringForKey(key) ?: defaultValue

    override fun putString(key: String, value: String) {
        defaults.setObject(value, key)
    }

    override fun getBoolean(key: String, defaultValue: Boolean): Boolean = if (defaults.objectForKey(key) != null) {
        defaults.boolForKey(key)
    } else {
        defaultValue
    }

    override fun putBoolean(key: String, value: Boolean) {
        defaults.setBool(value, key)
    }

    override fun getInt(key: String, defaultValue: Int): Int = if (defaults.objectForKey(key) != null) {
        defaults.integerForKey(key).toInt()
    } else {
        defaultValue
    }

    override fun putInt(key: String, value: Int) {
        defaults.setInteger(value.toLong(), key)
    }
}
