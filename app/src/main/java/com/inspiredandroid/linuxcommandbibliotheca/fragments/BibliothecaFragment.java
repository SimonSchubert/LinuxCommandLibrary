package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.models.Command;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Simon Schubert
 */
public class BibliothecaFragment extends Fragment {

    private ScreenSlidePagerAdapter mAdapter;
    private ViewPager mPager;

    public BibliothecaFragment() {

    }

    private boolean showTipsFragment(Intent intent) {
        String action = intent.getAction();
        String data = intent.getDataString();
        return Intent.ACTION_VIEW.equals(action) && data != null;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createAdapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bibliotheca, container, false);

        // Get total commands count
        Realm realm = Realm.getDefaultInstance();
        long commandsCount = realm.where(Command.class).count();
        realm.close();

        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText(String.format(getString(R.string.fragment_bibliotheca_commands), commandsCount)));
        tabLayout.addTab(tabLayout.newTab().setText(String.format(getString(R.string.fragment_bibliotheca_scripts), 30)));
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.tip)));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        // Init viewpager
        mPager = (ViewPager) view.findViewById(R.id.fragment_bibliotheca_pager);
        mPager.setAdapter(mAdapter);
        mPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        if (showTipsFragment(getActivity().getIntent())) {
            mPager.setCurrentItem(2);
        }

        return view;
    }

    private void createAdapter() {
        // Init viewpager mAdapter
        mAdapter = new ScreenSlidePagerAdapter(getChildFragmentManager());
    }

    /**
     * A simple pager mAdapter that represents the ScriptsFragment, CommandsFragment and TipsFragment
     */
    private class ScreenSlidePagerAdapter extends FragmentPagerAdapter {

        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new CommandsFragment();
                case 1:
                    return new ScriptsFragment();
                default:
                    return new TipFragment();
            }
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public int getItemPosition(Object object) {
            return PagerAdapter.POSITION_NONE;
        }
    }
}
