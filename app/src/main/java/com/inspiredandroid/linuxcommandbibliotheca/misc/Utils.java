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
 * Created by simon on 08.09.14.
 */
public class Utils {

    public final static String PACKAGE_LINUXREMOTE = "com.inspiredandroid.linuxcontrolcenter";
    public final static String PACKAGE_LINUXREMOTE_PRO = "com.inspiredandroid.linuxcontrolcenterpro";

    /**
     * @param context
     * @param resName
     * @return
     */
    public static String getBase64StringByResourceName(Context context, String resName)
    {
        int imageRes = context.getResources().getIdentifier(resName, "drawable", context.getPackageName());

        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), imageRes);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);

        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return Base64.encodeToString(byteArray, Base64.DEFAULT);
    }

    /**
     * read a text file by inputstream and return as string
     *
     * @param inputStream
     * @return
     */
    public static String readTextFile(InputStream inputStream)
    {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte buf[] = new byte[1024];
        int len;
        try {
            while ((len = inputStream.read(buf)) != -1) {
                outputStream.write(buf, 0, len);
            }
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outputStream.toString();
    }

    /**
     * Check if app is installed
     *
     * @param packageName
     * @return
     */
    public static boolean isAppInstalled(Context context, String packageName)
    {
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
     * @param dogList
     * @return
     */
    public static ArrayList<String> cloneList(ArrayList<String> dogList) {
        if(dogList == null) {
            return null;
        }
        ArrayList<String> clonedList = new ArrayList<>(dogList.size());
        for (String dog : dogList) {
            clonedList.add(dog);
        }
        return clonedList;
    }

    /**
     * Highlight the the appereance of search inside originalText
     * @param context
     * @param search
     * @param originalText
     * @return
     */
    public static CharSequence highlight(Context context, String search, String originalText)
    {
        if (search.isEmpty() || originalText.isEmpty()) {
            return originalText;
        }

        // ignore case and accents
        // the same thing should have been done for the search text
        String normalizedText = Normalizer.normalize(originalText, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").toLowerCase();

        int start = normalizedText.indexOf(search);
        if (start < 0) {
            // not found, nothing to to
            return originalText;
        } else {
            // highlight each appearance in the original text
            // while searching in normalized text
            Spannable highlighted = new SpannableString(originalText);
            while (start >= 0) {
                int spanStart = Math.min(start, originalText.length());
                int spanEnd = Math.min(start + search.length(), originalText.length());

                highlighted.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.ab_primary_dark)), spanStart, spanEnd, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                start = normalizedText.indexOf(search, spanEnd);
            }

            return highlighted;
        }
    }
}
