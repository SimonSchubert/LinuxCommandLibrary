package com.inspiredandroid.linuxcommandbibliotheca

import android.os.AsyncTask
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import com.inspiredandroid.linuxcommandbibliotheca.asnytasks.LoadDatabaseAsyncTask
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnCraftDatabaseListener

/**
 * Created by Simon Schubert.
 */
abstract class LoadingBaseActivity : AppCompatActivity(), OnCraftDatabaseListener {

    protected var mAsyncTask: LoadDatabaseAsyncTask? = null

    /**
     * @return true if asynctask is not null and already running
     */
    private val isTaskRunning: Boolean
        get() = mAsyncTask != null && mAsyncTask!!.status == AsyncTask.Status.RUNNING

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            mAsyncTask = LoadDatabaseAsyncTask(this, this)
            mAsyncTask!!.execute()
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        if (isTaskRunning) {
            mAsyncTask!!.cancel(true)
        }
    }

    override fun onDatabaseCreateSuccess() {

    }

    override fun onDatabaseCreateFail() {

    }
}
