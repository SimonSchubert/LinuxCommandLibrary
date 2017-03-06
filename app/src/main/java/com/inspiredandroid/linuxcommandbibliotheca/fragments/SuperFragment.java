package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.os.AsyncTask;
import android.support.v4.app.Fragment;

import java.util.ArrayList;

/**
 * Created by Simon Schubert
 */
public class SuperFragment extends Fragment {

    private ArrayList<AsyncTask> mAsyncTasks = new ArrayList<>();

    @Override
    public void onPause() {
        super.onPause();
        cancelAsyncTasks();
    }

    /**
     * cancel all asynctasks
     */
    private void cancelAsyncTasks() {
        for (AsyncTask task : mAsyncTasks) {
            if (task != null) {
                task.cancel(true);
            }
        }
    }

    public void addAsyncTask(AsyncTask asyncTask) {
        mAsyncTasks.add(asyncTask);
    }
}