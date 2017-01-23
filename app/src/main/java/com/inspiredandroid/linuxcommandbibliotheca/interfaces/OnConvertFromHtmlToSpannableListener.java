package com.inspiredandroid.linuxcommandbibliotheca.interfaces;

import java.util.ArrayList;

/**
 * Created by Simon Schubert
 */
public interface OnConvertFromHtmlToSpannableListener {

    /**
     * @param spannable
     */
    void onConvertHtmlToSpannable(ArrayList<ArrayList<CharSequence>> spannable);
}
