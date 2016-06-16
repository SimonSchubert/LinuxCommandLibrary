package com.inspiredandroid.linuxcommandbibliotheca.misc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.content.ContextCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Base64;

import com.inspiredandroid.linuxcommandbibliotheca.R;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.Normalizer;
import java.util.ArrayList;

/**
 * Created by Simon Schubert
 */
public class Utils {

    public final static String PACKAGE_BURGER = "com.inspiredandroid.stopandroll";
    public final static String PACKAGE_LINUXREMOTE = "com.inspiredandroid.linuxcontrolcenter";
    public final static String PACKAGE_LINUXREMOTE_PRO = "com.inspiredandroid.linuxcontrolcenterpro";
    public static final String PACKAGE_ORCGENOCIDE = "com.inspiredandroid.orcgenocide";
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
     * Clone string array list
     *
     * @param list
     * @return
     */
    public static ArrayList<String> cloneList(ArrayList<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList<String> clonedList = new ArrayList<>(list.size());
        for (String dog : list) {
            clonedList.add(dog);
        }
        return clonedList;
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

        int start = normalizedText.indexOf(query);
        if (start < 0) {
            // not found, nothing to to
            return originalText;
        } else {
            // highlightQueryInsideText each appearance in the original text
            // while searching in normalized text
            Spannable highlighted = new SpannableString(originalText);
            while (start >= 0) {
                int spanStart = Math.min(start, originalText.length());
                int spanEnd = Math.min(start + query.length(), originalText.length());

                highlighted.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.ab_primary_dark)), spanStart, spanEnd, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                start = normalizedText.indexOf(query, spanEnd);
            }

            return highlighted;
        }
    }
}
