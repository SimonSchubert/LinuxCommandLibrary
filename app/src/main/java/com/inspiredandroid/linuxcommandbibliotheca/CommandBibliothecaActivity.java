package com.inspiredandroid.linuxcommandbibliotheca;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.inspiredandroid.linuxcommandbibliotheca.fragments.BibliothecaFragment;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.DatabaseLoadingFragment;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.CraftDatabaseInterface;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

import java.io.File;

/**
 * Created by Simon Schubert
 * <p/>
 * This Activity just holds the BibliothecaFragment
 */
public class CommandBibliothecaActivity extends AppCompatActivity implements CraftDatabaseInterface {

    public final static String EXTRA_COMMAND = "extra_command"; //NON-NLS
    public static final String EXTRA_ICON = "extra_icon"; //NON-NLS

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commands);

        File database = getDatabasePath(CommandsDbHelper.DATABASE_NAME);
        if (!database.exists()) {
            showLoadingFragment();
            new LoadDatabaseTask(this, this).execute();
        } else {
            showBibliothecaFragment();
        }
    }

    private void showBibliothecaFragment() {
        Fragment fragment = new BibliothecaFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }

    private void showLoadingFragment() {
        Fragment fragment = new DatabaseLoadingFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onSuccessCraftingDatabase()
    {
        showBibliothecaFragment();
    }

    @Override
    public void onFailedCraftingDatabase()
    {
        Toast.makeText(getBaseContext(), R.string.fragment_datanase_loading_failed_craftin_database, Toast.LENGTH_LONG).show();
    }
}
