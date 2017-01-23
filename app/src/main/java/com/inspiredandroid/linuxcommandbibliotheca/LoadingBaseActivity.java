package com.inspiredandroid.linuxcommandbibliotheca;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.inspiredandroid.linuxcommandbibliotheca.asnytasks.LoadDatabaseAsyncTask;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnCraftDatabaseListener;

/**
 * Created by Simon Schubert.
 */
public abstract class LoadingBaseActivity extends AppCompatActivity implements OnCraftDatabaseListener {

    protected LoadDatabaseAsyncTask mAsyncTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAsyncTask = new LoadDatabaseAsyncTask(this, this);
        mAsyncTask.execute();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (isTaskRunning()) {
            mAsyncTask.cancel(true);
        }
    }

    /**
     * @return true if asynctask is not null and already running
     */
    private boolean isTaskRunning() {
        return (mAsyncTask != null) && (mAsyncTask.getStatus() == AsyncTask.Status.RUNNING);
    }

    @Override
    public void onDatabaseCreateSuccess() {

    }

    @Override
    public void onDatabaseCreateFail() {

    }
}
