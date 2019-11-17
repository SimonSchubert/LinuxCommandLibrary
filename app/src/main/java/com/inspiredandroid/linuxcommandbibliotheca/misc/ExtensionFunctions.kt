package com.inspiredandroid.linuxcommandbibliotheca.misc

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat
import com.inspiredandroid.linuxcommandbibliotheca.R
import java.io.File
import java.io.InputStream
import java.text.Normalizer

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

/**
 * Hide the softkeyboard
 */
fun Activity.hideKeyboard() {
    currentFocus?.let {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(it.windowToken, 0)
    }
}

/**
 * Show app details page in the Play Store. If Play Store is not installed, show it in the browser instead.
 *
 * @param appPackageName package mName
 */
fun Context.showPlayStoreActivity(appPackageName: String) {
    try {
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$appPackageName")))
    } catch (e: ActivityNotFoundException) {
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=$appPackageName")))
    }
}

fun File.copyInputStreamToFile(inputStream: InputStream) {
    inputStream.use { input ->
        this.outputStream().use { fileOut ->
            input.copyTo(fileOut)
        }
    }
}

class SearchResult(var result: CharSequence, var indexes: ArrayList<Int>)

class SearchIndex(var pos: Int, var index: Int)
