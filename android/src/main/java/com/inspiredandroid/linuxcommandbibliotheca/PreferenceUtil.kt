package com.inspiredandroid.linuxcommandbibliotheca

import android.content.Context
import androidx.preference.PreferenceManager

class PreferenceUtil {

    fun addBookmark(context: Context, id: Long) {
        val bookmarksIds = getBookmarkIds(context)
        bookmarksIds.add(id)
        saveBookmarkIds(context, bookmarksIds)
    }

    fun removeBookmark(context: Context, id: Long) {
        val bookmarksIds = getBookmarkIds(context)
        bookmarksIds.remove(id)
        saveBookmarkIds(context, bookmarksIds)
    }

    private fun saveBookmarkIds(context: Context, ids: MutableList<Long>) {
        val bookmarksChain = ids.joinToString(separator = ",")
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        prefs.edit().putString(KEY_BOOKMARKS, bookmarksChain).apply()
    }

    fun getBookmarkIds(context: Context): MutableList<Long> {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val bookmarksChain = prefs.getString(KEY_BOOKMARKS, "") ?: ""
        return bookmarksChain.split(",").mapNotNull { it.trim().toLongOrNull() }.toMutableList()
    }

    fun hasBookmark(context: Context, id: Long): Boolean {
        return getBookmarkIds(context).contains(id)
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
        const val CURRENT_DATABASE_VERSION = 2
    }
}