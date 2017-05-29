package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IntDef;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inspiredandroid.linuxcommandbibliotheca.R;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Simon Schubert
 */
public class NavigationFragmentFragment extends Fragment {

    @BindView(R.id.navigation)
    BottomNavigationView navigation;
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

    public NavigationFragmentFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bibliotheca, container, false);

        ButterKnife.bind(this, view);

        int defaultPosition = R.id.navigation_commands;
        int bottomNavigationPosition = savedInstanceState == null ? defaultPosition :
                savedInstanceState.getInt("opened_fragment", defaultPosition);
        navigation.setSelectedItemId(bottomNavigationPosition);

        Log.e("TAG", "position: " + bottomNavigationPosition);

        switch (bottomNavigationPosition) {
            case R.id.navigation_commands:
                startFragment(ID.COMMANDS);
            case R.id.navigation_basics:
                startFragment(ID.BASIC);
            case R.id.navigation_tips:
                startFragment(ID.TIPS);
        }

        /*
        if (shouldShowTipsFragment(getActivity().getIntent())) {
            startFragment(ID.TIPS);
        } else {
            startFragment(ID.COMMANDS);
        }
        */

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        return view;
    }

    private boolean shouldShowTipsFragment(Intent intent) {
        String action = intent.getAction();
        String data = intent.getDataString();
        return Intent.ACTION_VIEW.equals(action) && data != null;
    }

    private void startFragment(@ID int id) {
        Fragment fragment = null;
        switch (id) {
            case ID.COMMANDS:
                fragment = new CommandsFragment();
                getActivity().setTitle(R.string.fragment_bibliotheca_commands);
                break;
            case ID.BASIC:
                fragment = new BasicGroupsFragment();
                getActivity().setTitle(R.string.fragment_bibliotheca_basic);
                break;
            case ID.TIPS:
                fragment = new TipsFragment();
                getActivity().setTitle(R.string.tip);
                break;
        }

        final FragmentManager fragmentManager = getChildFragmentManager();
        final FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main_container, fragment).commitAllowingStateLoss();
    }

    @IntDef({ID.COMMANDS, ID.BASIC, ID.TIPS})
    @Retention(RetentionPolicy.SOURCE)
    @interface ID {
        int COMMANDS = 0;
        int BASIC = 1;
        int TIPS = 2;
    }

}
