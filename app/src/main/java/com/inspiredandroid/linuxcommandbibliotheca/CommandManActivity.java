package com.inspiredandroid.linuxcommandbibliotheca;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.inspiredandroid.linuxcommandbibliotheca.fragments.CommandManFragment;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.DatabaseLoadingFragment;
import com.inspiredandroid.linuxcommandbibliotheca.models.Command;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

import io.realm.Realm;

/**
 * Created by Simon Schubert
 * <p/>
 * This Activity tries to get a command based on different opening types and starts a
 * CommandManFragment if successfully fetched or finishes immediately
 */
public class CommandManActivity extends LoadingBaseActivity {

    public final static String EXTRA_COMMAND_ID = "EXTRA_COMMAND_ID"; //NON-NLS
    public final static String EXTRA_COMMAND_NAME = "EXTRA_COMMAND_NAME"; //NON-NLS
    public final static String EXTRA_COMMAND_CATEGORY = "EXTRA_COMMAND_CATEGORY"; //NON-NLS

    final static int INVALID = -1;

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

    /**
     * Start man fragment based on the intent data
     */
    private void handleIntent()
    {
        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        long id = b != null ? b.getLong(EXTRA_COMMAND_ID, INVALID) : INVALID;
        String name = b != null ? b.getString(EXTRA_COMMAND_NAME) : null;

        if (id != INVALID) {
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
     * @param name name of the command
     * @return unique command id
     */
    private long getIdByCommandName(String name)
    {
        Realm realm = Realm.getInstance(this);
        Command command = realm.where(Command.class).equalTo("name", name).findFirst();
        long id = INVALID;
        if (command != null) {
            id = command.getId();
        }
        realm.close();

        return id;
    }

    /**
     * Find command name and category by id. If id is INVALID then stop and finish activity
     *
     * @param id unique id of command
     */
    private void showManFragmentById(long id)
    {
        if (id == INVALID) {
            finish();
            return;
        }

        Realm realm = Realm.getInstance(this);

        Command command = realm.where(Command.class).equalTo("id", id).findFirst();
        String name = command.getName().toUpperCase();
        int category = command.getId();

        realm.close();

        showManFragment(name, id, category);
    }

    /**
     * @param name     command name
     * @param id       unique command id
     * @param category command category
     */
    private void showManFragment(String name, long id, int category)
    {
        // Set command name as actionbar title
        setTitle(name);

        Fragment fragment = new CommandManFragment();

        // Add unique command ID for fragment
        Bundle bundle = new Bundle();
        bundle.putLong(EXTRA_COMMAND_ID, id);
        bundle.putString(EXTRA_COMMAND_NAME, name);
        bundle.putInt(EXTRA_COMMAND_CATEGORY, category);
        fragment.setArguments(bundle);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }

    /**
     *
     */
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
