package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.CommandManActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

/**
 * Created by Simon Schubert
 */
public class CommandManFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_command_man, container, false);

        // Get unique command id
        Bundle b = getArguments();
        long id = b.getLong(CommandManActivity.EXTRA_COMMAND_ID);

        // Init cursor
        CommandsDbHelper mDbHelper = new CommandsDbHelper(getActivity());
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM commands WHERE _id = " + id, null);

        // Get description
        c.moveToFirst();
        String description = c.getString(c.getColumnIndex(CommandsDBTableModel.COL_MANPAGE));

        // Init view
        TextView tvDescription = (TextView) view.findViewById(R.id.fragment_command_man_tv);
        tvDescription.setText(Html.fromHtml(description));

        return view;
    }

}
