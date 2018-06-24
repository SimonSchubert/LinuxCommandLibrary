package com.inspiredandroid.linuxcommandbibliotheca.fragments

import android.os.Bundle

import com.google.android.gms.appindexing.Action
import com.google.android.gms.appindexing.AppIndex
import com.google.android.gms.common.api.GoogleApiClient

/**
 * Created by simon on 20.11.15.
 */
abstract class AppIndexFragment : BaseFragment() {

    private var client: GoogleApiClient? = null

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

        context?.let {
            client = GoogleApiClient.Builder(it).addApi(AppIndex.API).build()
        }
    }

    override fun onStart() {
        super.onStart()

        client?.connect()
        AppIndex.AppIndexApi.start(client, getAppIndexingAction())
    }

    override fun onStop() {
        AppIndex.AppIndexApi.end(client, getAppIndexingAction())
        client?.disconnect()

        super.onStop()
    }

}
