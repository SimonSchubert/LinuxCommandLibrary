package com.linuxcommandlibrary.app.data

import com.linuxcommandlibrary.app.data.migration.LEGACY_BOOKMARK_ID_TO_NAME
import com.linuxcommandlibrary.app.platform.defaultAutoExpandCommandSections
import com.linuxcommandlibrary.shared.platform.PreferencesStorage
import kotlinx.collections.immutable.ImmutableSet
import kotlinx.collections.immutable.persistentSetOf
import kotlinx.collections.immutable.toImmutableSet
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DataManager(private val prefs: PreferencesStorage) {

    private val _bookmarkNames = MutableStateFlow(loadBookmarks())

    /**
     * Live set of bookmarked command names. Updated on every add/remove so any
     * collector (CommandListViewModel, CommandDetailViewModel, etc.) sees the
     * change without an explicit refresh call.
     */
    val bookmarkNames: StateFlow<ImmutableSet<String>> = _bookmarkNames.asStateFlow()

    private fun loadBookmarks(): ImmutableSet<String> {
        val v2 = parseV2Bookmarks()
        if (prefs.getBoolean(KEY_BOOKMARKS_V1_MIGRATED, false)) return v2

        // Pre-v3.5.0 bookmarks were stored as comma-separated SQLite row IDs under
        // KEY_BOOKMARKS. The v3.5.0 db→markdown migration switched to KEY_BOOKMARKS_V2
        // (comma-separated names) but didn't translate existing entries, so users
        // upgrading from a pre-v3.5.0 build saw their bookmarks vanish (issue #104).
        // Translate legacy ids to names via the baked-in map and merge into V2.
        val legacy = parseLegacyBookmarks()
        if (legacy.isEmpty()) {
            prefs.putBoolean(KEY_BOOKMARKS_V1_MIGRATED, true)
            return v2
        }

        // Order matters: persist the merged V2 before the flag so that if we
        // crash mid-migration we re-run on next launch (idempotent — the union
        // of V2 and legacy is identical the second time).
        val merged = (v2 + legacy).toImmutableSet()
        saveBookmarkNames(merged)
        prefs.putBoolean(KEY_BOOKMARKS_V1_MIGRATED, true)
        prefs.putString(KEY_BOOKMARKS_V1, "")
        return merged
    }

    private fun parseV2Bookmarks(): ImmutableSet<String> {
        val bookmarksChain = prefs.getString(KEY_BOOKMARKS_V2, "")
        return bookmarksChain.split(",").filter { it.isNotBlank() }.toImmutableSet()
    }

    private fun parseLegacyBookmarks(): ImmutableSet<String> {
        val bookmarksChain = prefs.getString(KEY_BOOKMARKS_V1, "")
        if (bookmarksChain.isBlank()) return persistentSetOf()
        return bookmarksChain.split(",")
            .mapNotNull { it.trim().toLongOrNull() }
            .mapNotNull { LEGACY_BOOKMARK_ID_TO_NAME[it] }
            .toImmutableSet()
    }

    private fun saveBookmarkNames(names: Set<String>) {
        prefs.putString(KEY_BOOKMARKS_V2, names.joinToString(separator = ","))
    }

    fun addBookmark(name: String) {
        val updated = (_bookmarkNames.value + name).toImmutableSet()
        _bookmarkNames.value = updated
        saveBookmarkNames(updated)
    }

    fun removeBookmark(name: String) {
        val updated = (_bookmarkNames.value - name).toImmutableSet()
        _bookmarkNames.value = updated
        saveBookmarkNames(updated)
    }

    fun hasBookmark(name: String): Boolean = _bookmarkNames.value.contains(name)

    fun setAutoExpandSections(autoExpand: Boolean) {
        prefs.putBoolean(KEY_AUTO_EXPAND_SECTIONS, autoExpand)
    }

    fun isAutoExpandSections(): Boolean = prefs.getBoolean(KEY_AUTO_EXPAND_SECTIONS, defaultAutoExpandCommandSections)

    companion object {
        const val KEY_BOOKMARKS_V1 = "KEY_BOOKMARKS"
        const val KEY_BOOKMARKS_V2 = "KEY_BOOKMARKS_V2"
        const val KEY_BOOKMARKS_V1_MIGRATED = "KEY_BOOKMARKS_V1_MIGRATED"
        const val KEY_AUTO_EXPAND_SECTIONS = "auto_expand_sections"
    }
}
