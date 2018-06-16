package com.inspiredandroid.linuxcommandbibliotheca.misc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.content.ContextCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;

import com.inspiredandroid.linuxcommandbibliotheca.R;

import java.text.Normalizer;

/**
 * Created by Simon Schubert
 */
public class Utils {

    public final static String PACKAGE_BURGER = "com.inspiredandroid.stopandroll";
    public final static String PACKAGE_LINUXREMOTE = "com.inspiredandroid.linuxcontrolcenter";
    public final static String PACKAGE_LINUXREMOTE_PRO = "com.inspiredandroid.linuxcontrolcenterpro";
    public static final String PACKAGE_ORCGENOCIDE = "com.inspiredandroid.orcgenocide";
    public static final String PACKAGE_BIMO = "com.inspiredandroid.bimo";
    public static final String PACKAGE_QUIZ = "com.inspiredandroid.twoplayerquiz";
    public static final String PACKAGE_COMMANDLIBRARY = "com.inspiredandroid.linuxcommandbibliotheca";

    /**
     * Check if app is installed
     *
     * @param packageName
     * @return
     */
    public static boolean isAppInstalled(Context context, String packageName) {
        PackageManager pm = context.getPackageManager();
        boolean installed;
        try {
            pm.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
            installed = true;
        } catch (PackageManager.NameNotFoundException e) {
            installed = false;
        }
        return installed;
    }

    /**
     * Highlight the the appearance of search query inside originalText
     *
     * @param context
     * @param query
     * @param originalText
     * @return
     */
    public static CharSequence highlightQueryInsideText(Context context, String query, String originalText) {
        if (query.isEmpty() || originalText.isEmpty()) {
            return originalText;
        }

        // ignore case and accents
        // the same thing should have been done for the search text
        String normalizedText = Normalizer.normalize(originalText, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").toLowerCase();
        Spannable highlighted = new SpannableString(originalText);

        for (String subSearchQuery : query.split("[,\\s]+")) {
            int start = normalizedText.indexOf(subSearchQuery);
            while (start >= 0) {
                int spanStart = Math.min(start, originalText.length());
                int spanEnd = Math.min(start + subSearchQuery.length(), originalText.length());

                if(spanStart == -1 || spanEnd == -1) {
                    break;
                }

                highlighted.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.ab_primary)), spanStart, spanEnd, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                start = normalizedText.indexOf(subSearchQuery, spanEnd);
            }
        }

        return highlighted;
    }
}
