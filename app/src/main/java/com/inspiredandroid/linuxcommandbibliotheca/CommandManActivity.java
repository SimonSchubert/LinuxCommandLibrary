package com.inspiredandroid.linuxcommandbibliotheca;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.inspiredandroid.linuxcommandbibliotheca.fragments.CommandManFragment;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.DatabaseLoadingFragment;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.CraftDatabaseInterface;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

import java.io.File;

/**
 * Created by Simon Schubert
 * <p/>
 * This Activity just holds the CommandManFragment
 */
public class CommandManActivity extends AppCompatActivity implements CraftDatabaseInterface {

    public final static String EXTRA_COMMAND_ID = "EXTRA_COMMAND_ID"; //NON-NLS
    public final static String EXTRA_COMMAND_NAME = "EXTRA_COMMAND_NAME"; //NON-NLS

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_man);

        File database = getDatabasePath(CommandsDbHelper.DATABASE_NAME);
        if (!database.exists()) {
            showLoadingFragment();
            new LoadDatabaseTask(this, this).execute();
        } else {
            showManFragment();
        }
    }

    private void showManFragment() {

        Bundle b = getIntent().getExtras();
        long id = b.getLong(EXTRA_COMMAND_ID, -1);

        CommandsDbHelper mDbHelper = new CommandsDbHelper(this);
        Cursor c;

        if(id != -1) {
            c = mDbHelper.getCommandFromId(id); //db.rawQuery("SELECT * FROM "+CommandsDBTableModel.TABLE_COMMANDS+" WHERE "+CommandsDBTableModel.COL_ID+" = " + id, null);
        } else {
            String name = b.getString(EXTRA_COMMAND_NAME);
            c = mDbHelper.getCommandFromName(name); // db.rawQuery("SELECT * FROM "+CommandsDBTableModel.TABLE_COMMANDS+" WHERE "+CommandsDBTableModel.COL_NAME+" LIKE '" + name + "'", null);
        }
        c.moveToFirst();

        // Get command name
        String name = c.getString(c.getColumnIndex(CommandsDBTableModel.COL_NAME)).toUpperCase();


        // Set name as actionbar title
        setTitle(name);

        Fragment fragment = new CommandManFragment();

        // Add unique command ID for fragment
        Bundle bundle = new Bundle();
        bundle.putLong(EXTRA_COMMAND_ID, c.getLong(c.getColumnIndex(CommandsDBTableModel.COL_ID)));
        fragment.setArguments(bundle);

        c.close();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }

    private void showLoadingFragment() {

        setTitle(R.string.app_lcl_name);

        Fragment fragment = new DatabaseLoadingFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onSuccessCraftingDatabase()
    {
        showManFragment();
    }

    @Override
    public void onFailedCraftingDatabase()
    {
        Toast.makeText(getBaseContext(), R.string.fragment_datanase_loading_failed_craftin_database, Toast.LENGTH_LONG).show();
    }
}
