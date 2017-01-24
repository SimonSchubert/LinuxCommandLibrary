package com.inspiredandroid.linuxcommandbibliotheca.asnytasks;

import android.content.Context;
import android.os.AsyncTask;

import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnConvertFromHtmlToSpannableListener;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;

import java.util.ArrayList;

/**
 * Created by Simon Schubert
 */
public class SearchManAsyncTask extends AsyncTask<String, ArrayList<ArrayList<CharSequence>>, ArrayList<ArrayList<CharSequence>>> {

    private OnConvertFromHtmlToSpannableListener mCallback;
    private Context mContext;
    private ArrayList<ArrayList<CharSequence>> mChildren;
    private String mQuery;

    public SearchManAsyncTask(Context context, String query, ArrayList<ArrayList<CharSequence>> children, OnConvertFromHtmlToSpannableListener callback) {
        mContext = context;
        mChildren = children;
        mCallback = callback;
        mQuery = query;
    }

    @Override
    protected ArrayList<ArrayList<CharSequence>> doInBackground(String... params) {
        for (ArrayList<CharSequence> children : mChildren) {
            for (int i = 0; i < children.size(); i++) {
                CharSequence chld = children.get(i);
                children.set(i, Utils.highlightQueryInsideText(mContext, mQuery, chld.toString()));
            }
        }

        return mChildren;
    }

    @Override
    protected void onPostExecute(ArrayList<ArrayList<CharSequence>> children) {
        super.onPostExecute(children);

        mCallback.onConvertHtmlToSpannable(children);
    }

}


