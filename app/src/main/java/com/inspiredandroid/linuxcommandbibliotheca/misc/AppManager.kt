package com.inspiredandroid.linuxcommandbibliotheca.misc

import android.content.Context
import android.preference.PreferenceManager
import com.inspiredandroid.linuxcommandbibliotheca.R
import java.io.File
import java.io.InputStream
import java.util.*

/**
 * Created by simon on 29.11.15.
 */
object AppManager {

    private val KEY_APP_OPEN_COUNT = "KEY_APP_OPEN_COUNT"
    private val KEY_RATING_DIALOG_STATE = "KEY_RATING_DIALOG_STATE"
    private val KEY_BOOKMARKS = "KEY_BOOKMARKS"
    private val KEY_BOOKMARKCHANGED = "KEY_BOOKMARKCHANGED"
    private val KEY_DATABASE_VERSION = "KEY_DATABASE_VERSION"
    private val KEY_NEWS_DIALOG_STATE = "KEY_NEWS_DIALOG_STATE"

    private val CURRENTDATABSEVERSION = 4

    fun isDatabaseVersionUpToDate(context: Context): Boolean {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        return prefs.getInt(KEY_DATABASE_VERSION, 0) == CURRENTDATABSEVERSION
    }

    fun setDatabaseVersionUpToDate(context: Context) {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = prefs.edit()
        editor.putInt(KEY_DATABASE_VERSION, CURRENTDATABSEVERSION)
        editor.apply()
    }

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

    fun disableRateDialog(context: Context?) {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val edit = prefs.edit()
        edit.putInt(KEY_RATING_DIALOG_STATE, 1)
        edit.apply()
    }

    /**
     * get arraylist of ids
     *
     * @param context
     * @return
     */
    fun getBookmarkIds(context: Context?): ArrayList<Long> {
        val bookmarkIds = getBookmarkIdsChain(context).split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val ids = ArrayList<Long>()
        for (id in bookmarkIds) {
            if (!id.isEmpty()) {
                ids.add(java.lang.Long.valueOf(id))
            }
        }
        return ids
    }

    /**
     * get list of ids divided by commas
     *
     * @param context
     * @return
     */
    private fun getBookmarkIdsChain(context: Context?): String {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        var bookmarksChain = prefs.getString(KEY_BOOKMARKS, "")
        if (bookmarksChain.isNotEmpty()) {
            bookmarksChain = bookmarksChain.substring(1)
        }
        return bookmarksChain
    }

    /**
     * ad id to bookmark list
     *
     * @param context
     * @param id
     */
    fun addBookmark(context: Context?, id: Long) {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        var bookmarksChain = prefs.getString(KEY_BOOKMARKS, "")
        bookmarksChain += ",$id"
        prefs.edit().putString(KEY_BOOKMARKS, bookmarksChain).apply()
        bookmarkHasChanged(context)
    }

    /**
     * is id bookmarked
     *
     * @param context
     * @param id
     * @return
     */
    fun hasBookmark(context: Context?, id: Long): Boolean {
        return getBookmarkIds(context).contains(id)
    }

    /**
     * remove id from list
     *
     * @param context
     * @param id
     */
    fun removeBookmark(context: Context?, id: Long) {
        val bookmarksIds = getBookmarkIds(context)

        bookmarksIds.remove(id)

        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        var bookmarksChain = ""
        for (bookmark in bookmarksIds) {
            bookmarksChain += ",$bookmark"
        }
        prefs.edit().putString(KEY_BOOKMARKS, bookmarksChain).apply()

        bookmarkHasChanged(context)
    }

    /**
     * Set a flag for the list view that the content has changed
     *
     * @param context
     */
    private fun bookmarkHasChanged(context: Context?) {
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
        prefs.edit().putBoolean(KEY_BOOKMARKCHANGED, false).apply()
        return changed
    }

    fun shouldShowNewsDialog(context: Context?): Boolean {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        if (prefs.getInt(KEY_NEWS_DIALOG_STATE, 0) < 1) {

            val edit = prefs.edit()
            edit.putInt(KEY_NEWS_DIALOG_STATE, 1)
            edit.apply()

            return true
        }
        return false
    }

    fun createDatabase(context: Context) {
        val file = File(context.filesDir, Constants.REALM_DATABASE)
        file.delete()
        file.copyInputStreamToFile(context.resources.openRawResource(R.raw.database))
    }

    fun File.copyInputStreamToFile(inputStream: InputStream) {
        inputStream.use { input ->
            this.outputStream().use { fileOut ->
                input.copyTo(fileOut)
            }
        }
    }

    fun missingDatabase(context: Context): Boolean {
        val file = File(context.filesDir.toString() + "/" + Constants.REALM_DATABASE)
        return !file.exists()
    }
}
