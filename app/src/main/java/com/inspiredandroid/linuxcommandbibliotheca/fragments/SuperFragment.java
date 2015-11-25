package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.os.AsyncTask;
import android.support.v4.app.Fragment;

import java.util.ArrayList;

/**
 * Created by Simon Schubert
 */
public class SuperFragment extends Fragment {

    ArrayList<AsyncTask> asyncTasks = new ArrayList<>();

    @Override
    public void onPause()
    {
        super.onPause();
        cancelAsyncTasks();
    }

    /**
     * cancel all asynctasks
     */
    public void cancelAsyncTasks()
    {
        for (AsyncTask task : asyncTasks) {
            if (task != null) {
                task.cancel(true);
            }
        }
    }
}