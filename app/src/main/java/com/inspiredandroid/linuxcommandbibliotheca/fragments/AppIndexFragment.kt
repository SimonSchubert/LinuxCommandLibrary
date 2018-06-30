package com.inspiredandroid.linuxcommandbibliotheca.fragments

import com.google.firebase.appindexing.Action
import com.google.firebase.appindexing.FirebaseUserActions

/**
 * Created by simon on 20.11.15.
 */
abstract class AppIndexFragment : BaseFragment() {

    /**
     * Construct the Action performed by the user
     *
     * @return
     */
    abstract fun getAppIndexingAction(): Action

    override fun onStart() {
        super.onStart()
        FirebaseUserActions.getInstance().start(getAppIndexingAction())
    }

    override fun onStop() {
        FirebaseUserActions.getInstance().end(getAppIndexingAction())
        super.onStop()
    }

}
