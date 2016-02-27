package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;

/**
 * Created by simon on 23.11.15.
 */
public class AboutFragment extends Fragment implements View.OnClickListener {

    public AboutFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        view.findViewById(R.id.fragment_about_btn_orcgenocide).setOnClickListener(this);
        view.findViewById(R.id.fragment_about_btn_remote).setOnClickListener(this);
        view.findViewById(R.id.fragment_about_btn_burger).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.fragment_about_btn_orcgenocide) {
            final String appPackageName = Utils.PACKAGE_ORCGENOCIDE;
            showAppInMarket(appPackageName);
        } else if (v.getId() == R.id.fragment_about_btn_remote) {
            final String appPackageName = Utils.PACKAGE_LINUXREMOTE;
            showAppInMarket(appPackageName);
        } else if (v.getId() == R.id.fragment_about_btn_burger) {
            final String appPackageName = Utils.PACKAGE_BURGER;
            showAppInMarket(appPackageName);
        }
    }

    /**
     * Show app in the Play Store. If Play Store is not installed, show it in the browser instead.
     *
     * @param appPackageName package mName
     */
    private void showAppInMarket(final String appPackageName) {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
        } catch (android.content.ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
        }
    }
}
