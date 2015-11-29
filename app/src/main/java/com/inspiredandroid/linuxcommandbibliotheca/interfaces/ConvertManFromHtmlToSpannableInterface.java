package com.inspiredandroid.linuxcommandbibliotheca.interfaces;

import android.text.Spanned;

import java.util.ArrayList;

/**
 * Created by Simon Schubert
 */
public interface ConvertManFromHtmlToSpannableInterface {

    /**
     * @param spannable
     */
    void onConvertedHtmlToSpannable(ArrayList<ArrayList<CharSequence>> spannable);
}
