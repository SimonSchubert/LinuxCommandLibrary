package com.linuxcommandlibrary.shared.platform

/**
 * Platform abstraction for storing preferences (bookmarks, settings).
 */
interface PreferencesStorage {
    fun getString(key: String, defaultValue: String): String
    fun putString(key: String, value: String)
    fun getBoolean(key: String, defaultValue: Boolean): Boolean
    fun putBoolean(key: String, value: Boolean)
    fun getInt(key: String, defaultValue: Int): Int
    fun putInt(key: String, value: Int)
}
