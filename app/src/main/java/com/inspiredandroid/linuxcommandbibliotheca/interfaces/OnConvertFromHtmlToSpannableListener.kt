package com.inspiredandroid.linuxcommandbibliotheca.interfaces

import java.util.ArrayList

/**
 * Created by Simon Schubert
 */
interface OnConvertFromHtmlToSpannableListener {

    /**
     * @param spannable
     */
    fun onConvertHtmlToSpannable(spannable: ArrayList<ArrayList<CharSequence>>)
}
