package com.inspiredandroid.linuxcommandbibliotheca.misc

import android.content.Context
import android.content.pm.PackageManager
import android.support.v4.content.ContextCompat
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan

import com.inspiredandroid.linuxcommandbibliotheca.R

import java.text.Normalizer

/**
 * Created by Simon Schubert
 */
object Utils {

    val PACKAGE_BURGER = "com.inspiredandroid.stopandroll"
    val PACKAGE_LINUXREMOTE = "com.inspiredandroid.linuxcontrolcenter"
    val PACKAGE_LINUXREMOTE_PRO = "com.inspiredandroid.linuxcontrolcenterpro"
    val PACKAGE_ORCGENOCIDE = "com.inspiredandroid.orcgenocide"
    val PACKAGE_BIMO = "com.inspiredandroid.bimo"
    val PACKAGE_QUIZ = "com.inspiredandroid.twoplayerquiz"
    val PACKAGE_COMMANDLIBRARY = "com.inspiredandroid.linuxcommandbibliotheca"

    /**
     * Check if app is installed
     *
     * @param packageName
     * @return
     */
    fun isAppInstalled(context: Context, packageName: String): Boolean {
        val pm = context.packageManager
        var installed: Boolean
        try {
            pm.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES)
            installed = true
        } catch (e: PackageManager.NameNotFoundException) {
            installed = false
        }

        return installed
    }

    /**
     * Highlight the the appearance of search query inside originalText
     *
     * @param context
     * @param query
     * @param originalText
     * @return
     */
    fun highlightQueryInsideText(context: Context, query: String, originalText: String): CharSequence {
        if (query.isEmpty() || originalText.isEmpty()) {
            return originalText
        }

        // ignore case and accents
        // the same thing should have been done for the search text
        val normalizedText = Normalizer.normalize(originalText, Normalizer.Form.NFD).replace("\\p{InCombiningDiacriticalMarks}+".toRegex(), "").toLowerCase()
        val highlighted = SpannableString(originalText)

        for (subSearchQuery in query.split("[,\\s]+".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()) {
            var start = normalizedText.indexOf(subSearchQuery)
            while (start >= 0) {
                val spanStart = Math.min(start, originalText.length)
                val spanEnd = Math.min(start + subSearchQuery.length, originalText.length)

                if (spanStart == -1 || spanEnd == -1) {
                    break
                }

                highlighted.setSpan(ForegroundColorSpan(ContextCompat.getColor(context, R.color.ab_primary)), spanStart, spanEnd, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

                start = normalizedText.indexOf(subSearchQuery, spanEnd)
            }
        }

        return highlighted
    }
}
