package com.inspiredandroid.linuxcommandbibliotheca;

import android.content.Intent;
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
    private long mId = INVALID;
    private String mName = "";
    private int mCategory = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_man);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        assert getSupportActionBar() != null;

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (savedInstanceState == null) {
            showLoadingFragment();
        } else {
            CharSequence title = savedInstanceState.getCharSequence("title");
            setTitle(title);
        }

        handleIntent();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
        }

        return (super.onOptionsItemSelected(item));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putCharSequence("title", getTitle());
        super.onSaveInstanceState(outState);
    }

    /**
     * Start man fragment based on the intent data
     */
    private void handleIntent() {
        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        mId = b != null ? b.getLong(EXTRA_COMMAND_ID, INVALID) : INVALID;
        mName = b != null ? b.getString(EXTRA_COMMAND_NAME, "") : "";

        String action = intent.getAction();
        String data = intent.getDataString();
        if (Intent.ACTION_VIEW.equals(action) && data != null) {
            String commandId = data.substring(data.lastIndexOf("/") + 1);
            mName = commandId.substring(6, commandId.length() - 5);
        }

        Realm realm = Realm.getDefaultInstance();
        if (mId != INVALID) {
            Command command = realm.where(Command.class).equalTo(Command.Companion.getID(), mId).findFirst();
            if(command != null) {
                mCategory = command.getCategory();
                mName = command.getName().toUpperCase();
            }
        } else {
            Command command = realm.where(Command.class).equalTo(Command.Companion.getNAME(), mName).findFirst();
            if(command != null) {
                mCategory = command.getCategory();
                mId = command.getId();
            }
        }
        realm.close();
    }


    /**
     * Find command name and category by id. If id is INVALID then stop and finish activity
     *
     * @param id unique id of command
     */
    private void showManFragmentById(long id) {
        if (id == INVALID) {
            finish();
            return;
        }

        setTitle(mName);

        Fragment fragment = new CommandManFragment();

        // Add unique command ID for fragment
        Bundle bundle = new Bundle();
        bundle.putLong(EXTRA_COMMAND_ID, id);
        bundle.putString(EXTRA_COMMAND_NAME, mName);
        bundle.putInt(EXTRA_COMMAND_CATEGORY, mCategory);
        fragment.setArguments(bundle);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commitAllowingStateLoss();
    }

    /**
     *
     */
    private void showLoadingFragment() {
        setTitle(R.string.app_lcl_name);

        Fragment fragment = new DatabaseLoadingFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commitAllowingStateLoss();
    }

    @Override
    public void onDatabaseCreateSuccess() {
        showManFragmentById(mId);
    }

    @Override
    public void onDatabaseCreateFail() {
        Toast.makeText(getBaseContext(), R.string.fragment_datanase_loading_failed_craftin_database, Toast.LENGTH_LONG).show();
    }
}
