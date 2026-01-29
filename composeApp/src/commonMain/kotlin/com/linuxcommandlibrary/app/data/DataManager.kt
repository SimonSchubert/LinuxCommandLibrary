package com.linuxcommandlibrary.app.data

import com.linuxcommandlibrary.shared.platform.PreferencesStorage

class DataManager(private val prefs: PreferencesStorage) {

    private val bookmarkNames = getBookmarkNames()

    private fun getBookmarkNames(): MutableSet<String> {
        val bookmarksChain = prefs.getString(KEY_BOOKMARKS_V2, "")
        return bookmarksChain.split(",").filter { it.isNotBlank() }.toMutableSet()
    }

    private fun saveBookmarkNames() {
        val bookmarksChain = bookmarkNames.joinToString(separator = ",")
        prefs.putString(KEY_BOOKMARKS_V2, bookmarksChain)
    }

    fun addBookmark(name: String) {
        bookmarkNames.add(name)
        saveBookmarkNames()
    }

    fun removeBookmark(name: String) {
        bookmarkNames.remove(name)
        saveBookmarkNames()
    }

    fun hasBookmark(name: String): Boolean = bookmarkNames.contains(name)

    fun setAutoExpandSections(autoExpand: Boolean) {
        prefs.putBoolean(KEY_AUTO_EXPAND_SECTIONS, autoExpand)
    }

    fun isAutoExpandSections(): Boolean = prefs.getBoolean(KEY_AUTO_EXPAND_SECTIONS, false)

    companion object {
        const val KEY_BOOKMARKS_V2 = "KEY_BOOKMARKS_V2"
        const val KEY_AUTO_EXPAND_SECTIONS = "auto_expand_sections"
    }
}
