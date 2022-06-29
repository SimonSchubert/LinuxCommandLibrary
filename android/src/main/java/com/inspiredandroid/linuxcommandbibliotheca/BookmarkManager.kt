package com.inspiredandroid.linuxcommandbibliotheca

import android.content.Context
import android.preference.PreferenceManager

class BookmarkManager {
    private val KEY_BOOKMARKS = "KEY_BOOKMARKS"

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

    private fun saveBookmarkIds(context: Context?, ids: MutableList<Long>) {
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
}