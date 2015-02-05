package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.ResourceCursorAdapter;
import android.view.View;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;

/**
 * Created by Simon Schubert
 */
public class CommandsAdapter extends ResourceCursorAdapter {

    public CommandsAdapter(Context context, int layout, Cursor c, boolean autoRequery)
    {
        super(context, layout, c, autoRequery);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor)
    {
        TextView tvName = (TextView) view.findViewById(R.id.title);
        String name = cursor.getString(cursor.getColumnIndex(CommandsDBTableModel.COL_NAME));
        tvName.setText(name);
        TextView tvDescription = (TextView) view.findViewById(R.id.desc);
        String description = cursor.getString(cursor.getColumnIndex(CommandsDBTableModel.COL_DESCRIPTION));
        tvDescription.setText(description.trim());
    }
}
