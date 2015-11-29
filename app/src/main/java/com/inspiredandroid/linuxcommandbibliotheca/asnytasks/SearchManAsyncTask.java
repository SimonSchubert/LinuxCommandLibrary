package com.inspiredandroid.linuxcommandbibliotheca.asnytasks;

import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.text.Html;
import android.text.Spanned;

import com.inspiredandroid.linuxcommandbibliotheca.interfaces.ConvertManFromHtmlToSpannableInterface;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

import java.text.Normalizer;
import java.util.ArrayList;

/**
 * Created by Simon Schubert
 */
public class SearchManAsyncTask extends AsyncTask<String, ArrayList<ArrayList<CharSequence>>, ArrayList<ArrayList<CharSequence>>> {

    ConvertManFromHtmlToSpannableInterface callback;
    Context context;
    ArrayList<ArrayList<CharSequence>> mChildren;
    String query;

    public SearchManAsyncTask(Context context, String query, ArrayList<ArrayList<CharSequence>> children, ConvertManFromHtmlToSpannableInterface callback)
    {
        this.context = context;
        this.mChildren = children;
        this.callback = callback;
        this.query = query;
    }

    @Override
    protected ArrayList<ArrayList<CharSequence>> doInBackground(String... params)
    {
        for(ArrayList<CharSequence> children : mChildren) {
            for(int i = 0; i < children.size(); i++) {
                CharSequence chld = children.get(i);

                // String normalizedText = Normalizer.normalize(chld, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").toLowerCase();

                // (re)init global variables
                //indexes.clear();
                //indexesPosition = 0;
                //query = q;
                // int indexStart = 0;

                // find all indexes
                // while (normalizedText.indexOf(query, indexStart) != -1) {

                //    indexStart = normalizedText.indexOf(query, indexStart);
                    //indexes.add(indexStart);
                //    indexStart++;
                //}

                children.set(i, Utils.highlightQueryInsideText(context, query, chld.toString()));
            }
        }

        return mChildren;
    }

    @Override
    protected void onPostExecute(ArrayList<ArrayList<CharSequence>> children)
    {
        super.onPostExecute(children);

        callback.onConvertedHtmlToSpannable(children);
    }

}


