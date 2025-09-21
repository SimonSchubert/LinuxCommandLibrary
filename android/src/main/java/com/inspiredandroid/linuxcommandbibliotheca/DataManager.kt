package com.inspiredandroid.linuxcommandbibliotheca

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import androidx.preference.PreferenceManager

class DataManager(context: Context) {

    val prefs: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)

    private val bookmarksIds = getBookmarkIds()

    private fun getBookmarkIds(): MutableList<Long> {
        val bookmarksChain = prefs.getString(KEY_BOOKMARKS, "") ?: ""
        return bookmarksChain.split(",").mapNotNull { it.trim().toLongOrNull() }.toMutableList()
    }

    private fun saveBookmarkIds() {
        val bookmarksChain = bookmarksIds.joinToString(separator = ",")
        prefs.edit { putString(KEY_BOOKMARKS, bookmarksChain) }
    }

    fun addBookmark(id: Long) {
        bookmarksIds.add(id)
        saveBookmarkIds()
    }

    fun removeBookmark(id: Long) {
        bookmarksIds.remove(id)
        saveBookmarkIds()
    }

    fun hasBookmark(id: Long): Boolean = bookmarksIds.contains(id)

    fun isDatabaseUpToDate(): Boolean {
        val databaseVersion = prefs.getInt(KEY_DATABASE_VERSION, 0)
        return databaseVersion == CURRENT_DATABASE_VERSION
    }

    fun updateDatabaseVersion() {
        prefs.edit { putInt(KEY_DATABASE_VERSION, CURRENT_DATABASE_VERSION) }
    }

    fun setAutoExpandSections(autoExpand: Boolean) {
        prefs.edit { putBoolean(KEY_AUTO_EXPAND_SECTIONS, autoExpand) }
    }

    fun isAutoExpandSections(): Boolean = prefs.getBoolean(KEY_AUTO_EXPAND_SECTIONS, false)

    companion object {
        const val KEY_BOOKMARKS = "KEY_BOOKMARKS"
        const val KEY_DATABASE_VERSION = "DATABASE_VERSION"
        const val KEY_AUTO_EXPAND_SECTIONS = "auto_expand_sections"
        const val CURRENT_DATABASE_VERSION = 29
    }
}
