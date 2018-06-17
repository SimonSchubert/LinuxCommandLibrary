package com.inspiredandroid.linuxcommandbibliotheca.asnytasks

import android.content.Context
import android.os.AsyncTask
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnConvertFromHtmlToSpannableListener
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils
import java.util.*

/**
 * Created by Simon Schubert
 */
class SearchManAsyncTask(private val mContext: Context, private val mQuery: String, private val mChildren: ArrayList<ArrayList<CharSequence>>, private val mCallback: OnConvertFromHtmlToSpannableListener) : AsyncTask<String, ArrayList<ArrayList<CharSequence>>, ArrayList<ArrayList<CharSequence>>>() {

    override fun doInBackground(vararg params: String): ArrayList<ArrayList<CharSequence>> {
        for (children in mChildren) {
            for (i in children.indices) {
                val chld = children[i]
                children[i] = Utils.highlightQueryInsideText(mContext, mQuery, chld.toString())
            }
        }

        return mChildren
    }

    override fun onPostExecute(children: ArrayList<ArrayList<CharSequence>>) {
        super.onPostExecute(children)

        mCallback.onConvertHtmlToSpannable(children)
    }

}


