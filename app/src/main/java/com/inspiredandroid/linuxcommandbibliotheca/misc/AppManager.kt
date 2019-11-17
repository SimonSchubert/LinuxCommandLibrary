package com.inspiredandroid.linuxcommandbibliotheca.misc

import android.content.Context
import android.preference.PreferenceManager
import com.inspiredandroid.linuxcommandbibliotheca.R
import java.io.File

/* Copyright 2019 Simon Schubert
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
object AppManager {

    private const val KEY_APP_OPEN_COUNT = "KEY_APP_OPEN_COUNT"
    private const val KEY_RATING_DIALOG_STATE = "KEY_RATING_DIALOG_STATE"
    private const val KEY_BOOKMARKS = "KEY_BOOKMARKS"
    private const val KEY_BOOKMARKCHANGED = "KEY_BOOKMARKCHANGED"
    private const val KEY_DATABASE_VERSION = "KEY_DATABASE_VERSION"
    private const val KEY_NEWS_DIALOG_STATE = "KEY_NEWS_DIALOG_STATE"
    private const val CURRENT_DATABASE_VERSION = 8

    /**
     * Check if latest database version is copied to app storage
     */
    fun isDatabaseVersionUpToDate(context: Context): Boolean {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        return prefs.getInt(KEY_DATABASE_VERSION, 0) == CURRENT_DATABASE_VERSION
    }

    /**
     * Mark latest database version as up to date
     */
    fun setDatabaseVersionUpToDate(context: Context) {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = prefs.edit()
        editor.putInt(KEY_DATABASE_VERSION, CURRENT_DATABASE_VERSION)
        editor.apply()
    }

    /**
     * Copy realm database from resource to app storage
     */
    fun createDatabase(context: Context) {
        val file = File(context.filesDir, Constants.REALM_DATABASE)
        file.delete()
        file.copyInputStreamToFile(context.resources.openRawResource(R.raw.database))
    }

    /**
     * Does realm database exist in app storage
     */
    fun isDatabaseMissing(context: Context): Boolean {
        val file = File(context.filesDir.toString() + "/" + Constants.REALM_DATABASE)
        return !file.exists()
    }

    /**
     * Show every 10th time until user hits "Rate" or "Don't show again" button
     */
    fun shouldShowRateDialog(context: Context?): Boolean {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        if (prefs.getInt(KEY_RATING_DIALOG_STATE, 0) == 0) {

            val edit = prefs.edit()
            edit.putInt(KEY_APP_OPEN_COUNT, prefs.getInt(KEY_APP_OPEN_COUNT, 0) + 1)
            edit.apply()

            if (prefs.getInt(KEY_APP_OPEN_COUNT, 0) % 10 == 0) {
                return true
            }
        }
        return false
    }

    /**
     * Don't show dialog again
     */
    fun disableRateDialog(context: Context?) {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val edit = prefs.edit()
        edit.putInt(KEY_RATING_DIALOG_STATE, 1)
        edit.apply()
    }

    /**
     * Get list of ids
     *
     * @param context
     * @return
     */
    fun getBookmarkIds(context: Context?): MutableList<Long> {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val bookmarksChain = prefs.getString(KEY_BOOKMARKS, "") ?: ""
        return bookmarksChain.split(",".toRegex()).filter { it.isNotEmpty() }.map { it.trim().toLong() }.toMutableList()
    }

    /**
     * Is position bookmarked
     *
     * @param context
     * @param id
     * @return
     */
    fun hasBookmark(context: Context?, id: Long): Boolean {
        return getBookmarkIds(context).contains(id)
    }

    /**
     * Add position to bookmark list
     *
     * @param context
     * @param id
     */
    fun addBookmark(context: Context?, id: Long) {
        val bookmarksIds = getBookmarkIds(context)
        bookmarksIds.add(id)
        saveBookmarkIds(context, bookmarksIds)
        markBookmarkChange(context)
    }

    /**
     * Remove id from list
     *
     * @param context
     * @param id
     */
    fun removeBookmark(context: Context?, id: Long) {
        val bookmarksIds = getBookmarkIds(context)
        bookmarksIds.remove(id)
        saveBookmarkIds(context, bookmarksIds)
        markBookmarkChange(context)
    }

    /**
     * Save ids in comma separated string
     */
    private fun saveBookmarkIds(context: Context?, ids: MutableList<Long>) {
        val bookmarksChain = ids.joinToString(separator = ",")
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        prefs.edit().putString(KEY_BOOKMARKS, bookmarksChain).apply()
    }

    /**
     * Set a flag for the list view that the content has changed
     *
     * @param context
     */
    private fun markBookmarkChange(context: Context?) {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        prefs.edit().putBoolean(KEY_BOOKMARKCHANGED, true).apply()
    }

    /**
     * Reads the flag if bookmark has changed, automatically resets flag
     *
     * @param context
     * @return
     */
    fun hasBookmarkChanged(context: Context?): Boolean {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val changed = prefs.getBoolean(KEY_BOOKMARKCHANGED, false)
        if (changed) {
            prefs.edit().putBoolean(KEY_BOOKMARKCHANGED, false).apply()
        }
        return changed
    }

    fun shouldShowNewsDialog(context: Context?): Boolean {
        return false
        /*
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        if (prefs.getInt(KEY_NEWS_DIALOG_STATE, 0) < 1) {

            val edit = prefs.edit()
            edit.putInt(KEY_NEWS_DIALOG_STATE, 1)
            edit.apply()

            return true
        }
        return false
        */
    }
}