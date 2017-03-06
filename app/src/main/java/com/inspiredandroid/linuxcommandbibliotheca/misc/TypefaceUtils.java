package com.inspiredandroid.linuxcommandbibliotheca.misc;

import android.content.Context;
import android.graphics.Typeface;

public class TypefaceUtils {

    private static Typeface typeface;

    /**
     * Get typeface by filename from assets main directory
     *
     * @param context
     * @return
     */
    public static Typeface getTypeFace(final Context context) {
        if (typeface == null) {
            typeface = Typeface.createFromAsset(context.getAssets(), "ShareTechMono-Regular.ttf");
        }
        return typeface;
    }
}