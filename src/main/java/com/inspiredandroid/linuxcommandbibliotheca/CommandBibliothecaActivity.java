package com.inspiredandroid.linuxcommandbibliotheca;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;

import com.inspiredandroid.linuxcommandbibliotheca.fragments.BibliothecaFragment;

/**
 * Created by Simon Schubert
 *
 * This Activity just holds the BibliothecaFragment
 */
public class CommandBibliothecaActivity extends ActionBarActivity {

    public final static String EXTRA_COMMAND = "extra_command"; //NON-NLS
    public static final String EXTRA_ICON = "extra_icon"; //NON-NLS

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commands);

        Fragment fragment = new BibliothecaFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }

}
