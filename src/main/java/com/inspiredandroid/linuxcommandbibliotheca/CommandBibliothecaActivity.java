package com.inspiredandroid.linuxcommandbibliotheca;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

import com.inspiredandroid.linuxcommandbibliotheca.fragments.BibliothecaFragment;

/**
 * Created by simon on 2/23/14.
 */
public class CommandBibliothecaActivity extends ActionBarActivity {

    public final static String EXTRA_COMMAND = "extra_command"; //NON-NLS
    public static final String EXTRA_ICON = "extra_icon"; //NON-NLS

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commands);

        try {
            ActionBar bar = getSupportActionBar();
            bar.setBackgroundDrawable(getResources().getDrawable(R.drawable.ab_solid_dark_holo));
            bar.setTitle("Linux Command Library");
            bar.setIcon(R.drawable.ic_launcher);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Fragment fragment = new BibliothecaFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }

}
