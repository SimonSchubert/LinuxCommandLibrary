package com.inspiredandroid.linuxcommandbibliotheca;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;

import com.inspiredandroid.linuxcommandbibliotheca.fragments.CommandManFragment;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

/**
 * Created by Simon Schubert
 *
 * This Activity just holds the CommandManFragment
 */
public class CommandManActivity extends ActionBarActivity {

    public final static String EXTRA_COMMAND_ID = "EXTRA_COMMAND_ID"; //NON-NLS

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_man);

        // Get unique command id
        Bundle b = getIntent().getExtras();
        long id = b.getLong(EXTRA_COMMAND_ID);

        // Init cursor
        CommandsDbHelper mDbHelper = new CommandsDbHelper(this);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM commands WHERE _id = " + id, null);
        c.moveToFirst();

        // Get command name
        String name = c.getString(c.getColumnIndex(CommandsDBTableModel.COL_NAME)).toUpperCase();

        // Set name as actionbar title
        setTitle(name);

        Fragment fragment = new CommandManFragment();

        // Add unique command ID for fragment
        fragment.setArguments(b);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }

}
