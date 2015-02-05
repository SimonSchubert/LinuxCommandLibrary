package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

/**
 * Created by Simon Schubert
 */
public class BibliothecaFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bibliothec, container, false);

        initViews(view);

        return view;
    }

    private void initViews(View view)
    {
        // Get total commands count
        CommandsDbHelper mDbHelper = new CommandsDbHelper(getActivity());
        int commandsCount = mDbHelper.getCount();

        // Set PagerTitleStrip titles
        String[] titles = new String[]{String.format(getString(R.string.commands),commandsCount),
                String.format(getString(R.string.scripts),30)};

        // Init viewpager adapter
        ScreenSlidePagerAdapter mPagerAdapter = new ScreenSlidePagerAdapter(getChildFragmentManager(), titles);

        // Init viewpager
        ViewPager mPager = (ViewPager) view.findViewById(R.id.fragment_bibliotheca_pager);
        mPager.setAdapter(mPagerAdapter);
    }

    /**
     * A simple pager adapter that represents the ScriptFragment and CommandsFragment
     */
    private class ScreenSlidePagerAdapter extends FragmentPagerAdapter {

        // Titles for PagerTitleStrip
        private String[] titles;

        public ScreenSlidePagerAdapter(FragmentManager fm, String[] titles) {
            super(fm);
            this.titles = titles;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    return new CommandsFragment();
                default:
                    return new ScriptsFragment();
            }
        }

        @Override
        public int getCount() {
            return titles.length;
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            return titles[position];
        }
    }
}
