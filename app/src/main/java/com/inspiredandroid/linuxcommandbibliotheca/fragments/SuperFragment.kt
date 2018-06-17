package com.inspiredandroid.linuxcommandbibliotheca.fragments

import android.os.AsyncTask
import android.support.v4.app.Fragment
import java.util.*

/**
 * Created by Simon Schubert
 */
open class SuperFragment : Fragment() {

    private val mAsyncTasks = ArrayList<AsyncTask<*, *, *>>()

    override fun onPause() {
        super.onPause()
        cancelAsyncTasks()
    }

    /**
     * cancel all asynctasks
     */
    private fun cancelAsyncTasks() {
        for (task in mAsyncTasks) {
            task.cancel(true)
        }
    }

    fun addAsyncTask(asyncTask: AsyncTask<*, *, *>) {
        mAsyncTasks.add(asyncTask)
    }
}