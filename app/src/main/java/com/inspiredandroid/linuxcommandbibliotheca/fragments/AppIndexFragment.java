package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.os.Bundle;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by simon on 20.11.15.
 */
public abstract class AppIndexFragment extends SuperFragment {

    private GoogleApiClient mClient;

    /**
     * Title for current page, shown in autocompletion UI
     *
     * @return
     */
    public abstract String getAppIndexingTitle();

    /**
     * Construct the Action performed by the user
     *
     * @return
     */
    public abstract Action getAppIndexingAction();

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        mClient = new GoogleApiClient.Builder(getContext()).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart()
    {
        super.onStart();

        mClient.connect();
        AppIndex.AppIndexApi.start(mClient, getAppIndexingAction());
    }

    @Override
    public void onStop()
    {

        AppIndex.AppIndexApi.end(mClient, getAppIndexingAction());
        mClient.disconnect();

        super.onStop();
    }

}
