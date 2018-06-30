package com.inspiredandroid.linuxcommandbibliotheca.misc

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.support.v4.content.ContextCompat
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.inputmethod.InputMethodManager

import com.inspiredandroid.linuxcommandbibliotheca.R

import java.text.Normalizer

/**
 * Created by Simon Schubert
 */
object Utils {

    const val PACKAGE_LINUXREMOTE = "com.inspiredandroid.linuxcontrolcenter"
    const val PACKAGE_LINUXREMOTE_PRO = "com.inspiredandroid.linuxcontrolcenterpro"
    const val PACKAGE_ORCGENOCIDE = "com.inspiredandroid.orcgenocide"
    const val PACKAGE_BIMO = "com.inspiredandroid.bimo"
    const val PACKAGE_QUIZ = "com.inspiredandroid.twoplayerquiz"
    const val PACKAGE_COMMANDLIBRARY = "com.inspiredandroid.linuxcommandbibliotheca"
}

/**
 * Check if app is installed
 *
 * @param packageName
 * @return
 */
fun Context.isAppInstalled(packageName: String): Boolean {
    return try {
        packageManager.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES)
        true
    } catch (e: PackageManager.NameNotFoundException) {
        false
    }
}

/**
 * Highlight the the appearance of search query inside originalText
 */
fun String.highlightQueryInsideText(context: Context?, query: String): SearchResult {
    if (query.isEmpty() || this.isEmpty() || context == null) {
        return SearchResult(this, arrayListOf())
    }

    val indexes = arrayListOf<Int>()
    val normalizedText = Normalizer.normalize(this, Normalizer.Form.NFD).replace("\\p{InCombiningDiacriticalMarks}+".toRegex(), "").toLowerCase()
    val highlighted = SpannableString(this)

    var start = normalizedText.indexOf(query)
    while (start >= 0) {
        val spanStart = Math.min(start, this.length)
        val spanEnd = Math.min(start + query.length, this.length)

        if (spanStart == -1 || spanEnd == -1) {
            break
        }

        highlighted.setSpan(ForegroundColorSpan(ContextCompat.getColor(context, R.color.primary)), spanStart, spanEnd, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        start = normalizedText.indexOf(query, spanEnd)
        indexes.add(spanStart)
    }

    return SearchResult(highlighted, indexes)
}

fun Activity.hideKeyboard() {
    currentFocus?.let {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(it.windowToken, 0)
    }
}

class SearchResult(var result: CharSequence, var indexes: ArrayList<Int>)

class SearchIndex(var pos: Int, var index: Int)
