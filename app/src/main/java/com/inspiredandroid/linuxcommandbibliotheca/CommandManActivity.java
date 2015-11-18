package com.inspiredandroid.linuxcommandbibliotheca;

import android.content.Intent;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.inspiredandroid.linuxcommandbibliotheca.asnytasks.LoadDatabaseAsyncTask;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.CommandManFragment;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.DatabaseLoadingFragment;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.CraftDatabaseInterface;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

/**
 * Created by Simon Schubert
 * <p/>
 * This Activity just holds the CommandManFragment
 */
public class CommandManActivity extends BaseActivity implements CraftDatabaseInterface {

    public final static String EXTRA_COMMAND_ID = "EXTRA_COMMAND_ID"; //NON-NLS
    public final static String EXTRA_COMMAND_NAME = "EXTRA_COMMAND_NAME"; //NON-NLS

    LoadDatabaseAsyncTask asyncTask;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_man);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        assert getSupportActionBar() != null;

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        showLoadingFragment();

        asyncTask = new LoadDatabaseAsyncTask(this, this);
        asyncTask.execute();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();

        if (isTaskRunning()) {
            asyncTask.cancel(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
        }

        return (super.onOptionsItemSelected(item));
    }

    private void handleIntent()
    {
        Intent intent = getIntent();

        Bundle b = intent.getExtras();
        long id = b.getLong(EXTRA_COMMAND_ID, -1);
        String name = b.getString(EXTRA_COMMAND_NAME);

        if (id != -1) {
            // id is set
            showManFragmentById(id);
        } else if (name != null) {
            // name is set
            showManFragmentById(getIdByCommandName(name));
        } else {
            // activity intent filter
            String action = intent.getAction();
            String data = intent.getDataString();
            if (Intent.ACTION_VIEW.equals(action) && data != null) {
                String recipeId = data.substring(data.lastIndexOf("/") + 1);

                String name2 = recipeId.substring(6, recipeId.length() - 5);

                showManFragmentById(getIdByCommandName(name2));
            }
        }
    }

    /**
     * Check if asynctask is not null and already running
     *
     * @return
     */
    private boolean isTaskRunning()
    {
        return (asyncTask != null) && (asyncTask.getStatus() == AsyncTask.Status.RUNNING);
    }

    /**
     * @param name
     * @return
     */
    private long getIdByCommandName(String name)
    {
        CommandsDbHelper mDbHelper = new CommandsDbHelper(this);

        Cursor c = mDbHelper.getCommandFromName(name);
        c.moveToFirst();
        long id = c.getLong(c.getColumnIndex(CommandsDBTableModel.COL_ID));
        c.close();

        mDbHelper.close();

        return id;
    }

    private void showManFragmentById(long id)
    {
        if (id == -1) {
            finish();
        }

        CommandsDbHelper mDbHelper = new CommandsDbHelper(this);

        Cursor c = mDbHelper.getCommandFromId(id);
        c.moveToFirst();
        // Get command name
        String name = c.getString(c.getColumnIndex(CommandsDBTableModel.COL_NAME)).toUpperCase();
        c.close();

        mDbHelper.close();

        showManFragment(name, id);
    }

    private void showManFragment(String name, long id)
    {
        // Set command name as actionbar title
        setTitle(name);

        Fragment fragment = new CommandManFragment();

        // Add unique command ID for fragment
        Bundle bundle = new Bundle();
        bundle.putLong(EXTRA_COMMAND_ID, id);
        fragment.setArguments(bundle);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }

    private void showLoadingFragment()
    {
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
        handleIntent();
    }

    @Override
    public void onFailedCraftingDatabase()
    {
        Toast.makeText(getBaseContext(), R.string.fragment_datanase_loading_failed_craftin_database, Toast.LENGTH_LONG).show();
    }
}
