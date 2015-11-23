package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inspiredandroid.linuxcommandbibliotheca.R;

/**
 * Created by simon on 23.11.15.
 */
public class AboutFragment extends Fragment {


    public AboutFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_about, container, false);
    }

}
