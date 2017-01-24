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
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.ScriptGroupItem;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Realm;

/**
 * Created by Simon Schubert
 */
public class BibliothecaFragment extends Fragment {

    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.fragment_bibliotheca_pager)
    ViewPager mPager;

    private ScreenSlidePagerAdapter mAdapter;

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

        mAdapter = new ScreenSlidePagerAdapter(getChildFragmentManager());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bibliotheca, container, false);

        ButterKnife.bind(this, view);

        // Get total commands count
        Realm realm = Realm.getDefaultInstance();
        long commandsCount = realm.where(Command.class).count();
        long commandsGroupCount = realm.where(CommandGroupModel.class).notEqualTo("category", ScriptGroupItem.GROUP_COMMANDLINEFU).count();
        realm.close();

        tabLayout.addTab(tabLayout.newTab().setText(String.format(getString(R.string.fragment_bibliotheca_commands), commandsCount)));
        tabLayout.addTab(tabLayout.newTab().setText(String.format(getString(R.string.fragment_bibliotheca_scripts), commandsGroupCount)));
        tabLayout.addTab(tabLayout.newTab().setText(getString(R.string.tip)));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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

        // Init viewpager
        mPager.setAdapter(mAdapter);
        mPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        if (showTipsFragment(getActivity().getIntent())) {
            mPager.setCurrentItem(ScreenSlidePagerAdapter.POS_TIPS);
        }

        return view;
    }

    /**
     * A simple pager mAdapter that represents the ScriptGroupsFragment, CommandsFragment and TipsFragment
     */
    private class ScreenSlidePagerAdapter extends FragmentPagerAdapter {

        static final int POS_COMMANDS = 0;
        static final int POS_SCRIPTS = 1;
        static final int POS_TIPS = 2;

        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case POS_COMMANDS:
                    return new CommandsFragment();
                case POS_SCRIPTS:
                    return new ScriptGroupsFragment();
                case POS_TIPS:
                    return new TipsFragment();
            }
            return null;
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
