package com.inspiredandroid.linuxcommandbibliotheca.asnytasks;

import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.text.Html;
import android.text.Spanned;

import com.inspiredandroid.linuxcommandbibliotheca.interfaces.ConvertManFromHtmlToSpannableInterface;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

/**
 * Created by simon on 09.08.15.
 */
public class GrepManAsHtml extends AsyncTask<String, Spanned, Spanned> {

    ConvertManFromHtmlToSpannableInterface callback;
    Context context;
    long id;

    public GrepManAsHtml(Context context, long id, ConvertManFromHtmlToSpannableInterface callback)
    {
        this.context = context;
        this.id = id;
        this.callback = callback;
    }

    @Override
    protected Spanned doInBackground(String... params)
    {
        // Init cursor
        CommandsDbHelper mDbHelper = new CommandsDbHelper(context);
        Cursor c = mDbHelper.getCommandFromId(id);

        // Get description
        c.moveToFirst();
        String description = c.getString(c.getColumnIndex(CommandsDBTableModel.COL_MANPAGE));

        c.close();

        return Html.fromHtml(description);
    }

    @Override
    protected void onPostExecute(Spanned spanned)
    {
        super.onPostExecute(spanned);

        callback.onHtmlGraped(spanned);
    }

}


