package com.inspiredandroid.linuxcommandbibliotheca.fragments

import android.os.Bundle

import com.google.android.gms.appindexing.Action
import com.google.android.gms.appindexing.AppIndex
import com.google.android.gms.common.api.GoogleApiClient

/**
 * Created by simon on 20.11.15.
 */
abstract class AppIndexFragment : SuperFragment() {

    private var mClient: GoogleApiClient? = null

    /**
     * Title for current page, shown in autocompletion UI
     *
     * @return
     */
    abstract fun getAppIndexingTitle(): String

    /**
     * Construct the Action performed by the user
     *
     * @return
     */
    abstract fun getAppIndexingAction(): Action

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mClient = GoogleApiClient.Builder(context!!).addApi(AppIndex.API).build()
    }

    override fun onStart() {
        super.onStart()

        mClient!!.connect()
        AppIndex.AppIndexApi.start(mClient, getAppIndexingAction())
    }

    override fun onStop() {
        AppIndex.AppIndexApi.end(mClient, getAppIndexingAction())
        mClient!!.disconnect()

        super.onStop()
    }

}
