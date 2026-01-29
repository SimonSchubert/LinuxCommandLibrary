package com.linuxcommandlibrary.app.platform

import com.linuxcommandlibrary.shared.platform.PreferencesStorage
import java.util.prefs.Preferences

class DesktopPreferencesStorage : PreferencesStorage {
    private val prefs: Preferences = Preferences.userNodeForPackage(DesktopPreferencesStorage::class.java)

    override fun getString(key: String, defaultValue: String): String {
        return prefs.get(key, defaultValue)
    }

    override fun putString(key: String, value: String) {
        prefs.put(key, value)
    }

    override fun getBoolean(key: String, defaultValue: Boolean): Boolean {
        return prefs.getBoolean(key, defaultValue)
    }

    override fun putBoolean(key: String, value: Boolean) {
        prefs.putBoolean(key, value)
    }

    override fun getInt(key: String, defaultValue: Int): Int {
        return prefs.getInt(key, defaultValue)
    }

    override fun putInt(key: String, value: Int) {
        prefs.putInt(key, value)
    }
}
