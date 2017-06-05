package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.inspiredandroid.linuxcommandbibliotheca.BuildConfig;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Simon Schubert on 23.11.15.
 * Talk about the App, Licenses and other projects
 */
public class AboutFragment extends Fragment {

    private FirebaseAnalytics mFirebaseAnalytics;

    public AboutFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        ButterKnife.bind(this, view);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(getContext());
        trackContent();

        return view;
    }


    private void trackContent() {
        if(BuildConfig.DEBUG) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "About");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }

    @OnClick(R.id.fragment_about_tv_icons8)
    public void startIcons8() {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.icons8.com"));
            startActivity(intent);
        } catch (ActivityNotFoundException ignored) {
        }
    }

    @OnClick(R.id.fragment_about_btn_bimo)
    public void startBimo() {
        startAppMarketActivity(Utils.PACKAGE_BIMO);
    }

    @OnClick(R.id.fragment_about_btn_orcgenocide)
    public void startOrcGenocide() {
        startAppMarketActivity(Utils.PACKAGE_ORCGENOCIDE);
    }

    @OnClick(R.id.fragment_about_btn_meowdo)
    public void startMeadow() {
        startAppMarketActivity(Utils.PACKAGE_MEOWDO);
    }

    @OnClick(R.id.fragment_about_btn_remote)
    public void startRemote() {
        startAppMarketActivity(Utils.PACKAGE_LINUXREMOTE);
    }

    @OnClick(R.id.fragment_about_btn_burger)
    public void startBurger() {
        startAppMarketActivity(Utils.PACKAGE_BURGER);
    }

    @OnClick(R.id.fragment_about_btn_rate)
    public void startRateActivity() {
        startAppMarketActivity(Utils.PACKAGE_COMMANDLIBRARY);
    }

    /**
     * Show app in the Play Store. If Play Store is not installed, show it in the browser instead.
     *
     * @param appPackageName package mName
     */
    private void startAppMarketActivity(final String appPackageName) {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
        } catch (android.content.ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
        }
    }
}
