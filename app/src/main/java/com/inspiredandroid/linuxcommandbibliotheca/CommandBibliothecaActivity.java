package com.inspiredandroid.linuxcommandbibliotheca;

import android.os.Bundle;
import android.support.annotation.IntDef;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.inspiredandroid.linuxcommandbibliotheca.fragments.BasicGroupsFragment;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.CommandsFragment;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.DatabaseLoadingFragment;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.TipsFragment;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Simon Schubert
 * <p/>
 * This Activity just holds the NavigationFragmentFragment
 */
public class CommandBibliothecaActivity extends LoadingBaseActivity {

    @BindView(R.id.navigation)
    BottomNavigationView navigation;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = item -> {
        switch (item.getItemId()) {
            case R.id.navigation_commands:
                startFragment(ID.COMMANDS);
                return true;
            case R.id.navigation_basics:
                startFragment(ID.BASIC);
                return true;
            case R.id.navigation_tips:
                startFragment(ID.TIPS);
                return true;
        }
        return false;
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commandbibliotheca);

        ButterKnife.bind(this, this);

        setSupportActionBar(toolbar);

        if (savedInstanceState == null) {
            showLoadingFragment();
        } else {
            CharSequence title = savedInstanceState.getCharSequence("title");
            setTitle(title);
        }

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putCharSequence("title", getTitle());
        super.onSaveInstanceState(outState);
    }

    private void startFragment(@ID int id) {
        Fragment fragment = null;
        switch (id) {
            case ID.COMMANDS:
                fragment = new CommandsFragment();
                setTitle(R.string.fragment_bibliotheca_commands);
                break;
            case ID.BASIC:
                fragment = new BasicGroupsFragment();
                setTitle(R.string.fragment_bibliotheca_basic);
                break;
            case ID.TIPS:
                fragment = new TipsFragment();
                setTitle(R.string.tip);
                break;
        }

        final FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment).commitAllowingStateLoss();
    }

    /**
     *
     */
    private void showLoadingFragment() {
        Fragment fragment = new DatabaseLoadingFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commitAllowingStateLoss();
        navigation.setVisibility(View.GONE);
    }

    @Override
    public void onDatabaseCreateSuccess() {
        if(isFinishing()) {
            return;
        }
        startFragment(ID.COMMANDS);
        navigation.setVisibility(View.VISIBLE);
    }

    @Override
    public void onDatabaseCreateFail() {
        Toast.makeText(getBaseContext(), R.string.fragment_datanase_loading_failed_craftin_database, Toast.LENGTH_LONG).show();
    }

    @IntDef({ID.COMMANDS, ID.BASIC, ID.TIPS})
    @Retention(RetentionPolicy.SOURCE)
    @interface ID {
        int COMMANDS = 0;
        int BASIC = 1;
        int TIPS = 2;
    }
}
