package com.inspiredandroid.linuxcommandbibliotheca;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.inspiredandroid.linuxcommandbibliotheca.asnytasks.LoadDatabaseAsyncTask;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.BibliothecaFragment;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.DatabaseLoadingFragment;

/**
 * Created by Simon Schubert
 * <p/>
 * This Activity just holds the BibliothecaFragment
 */
public class CommandBibliothecaActivity extends LoadingBaseActivity {

    public final static String EXTRA_COMMAND = "extra_command"; //NON-NLS
    public static final String EXTRA_ICON = "extra_icon"; //NON-NLS

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commands);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        showLoadingFragment();

        asyncTask = new LoadDatabaseAsyncTask(this, this);
        asyncTask.execute();
    }

    /**
     *
     */
    private void showBibliothecaFragment()
    {
        Fragment fragment = new BibliothecaFragment();
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
