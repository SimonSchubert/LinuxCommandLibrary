package com.inspiredandroid.linuxcommandbibliotheca

import android.content.Context
import androidx.preference.PreferenceManager

class PreferenceUtil(private val context: Context) {

    val bookmarksIds = getBookmarkIds()

    private fun getBookmarkIds(): MutableList<Long> {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val bookmarksChain = prefs.getString(KEY_BOOKMARKS, "") ?: ""
        return bookmarksChain.split(",").mapNotNull { it.trim().toLongOrNull() }.toMutableList()
    }

    private fun saveBookmarkIds() {
        val bookmarksChain = bookmarksIds.joinToString(separator = ",")
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        prefs.edit().putString(KEY_BOOKMARKS, bookmarksChain).apply()
    }

    fun addBookmark(id: Long) {
        bookmarksIds.add(id)
        saveBookmarkIds()
    }

    fun removeBookmark(id: Long) {
        bookmarksIds.remove(id)
        saveBookmarkIds()
    }

    fun hasBookmark(id: Long): Boolean {
        return bookmarksIds.contains(id)
    }

    fun isDatabaseUpToDate(context: Context): Boolean {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val databaseVersion = prefs.getInt(KEY_DATABASE_VERSION, 0)
        return databaseVersion == CURRENT_DATABASE_VERSION
    }

    fun updateDatabaseVersion(context: Context) {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        prefs.edit().putInt(KEY_DATABASE_VERSION, CURRENT_DATABASE_VERSION).apply()
    }

    companion object {
        const val KEY_BOOKMARKS = "KEY_BOOKMARKS"
        const val KEY_DATABASE_VERSION = "DATABASE_VERSION"
        const val CURRENT_DATABASE_VERSION = 7
    }
}