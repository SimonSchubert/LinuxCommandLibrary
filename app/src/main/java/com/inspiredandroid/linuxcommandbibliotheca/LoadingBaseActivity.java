package com.inspiredandroid.linuxcommandbibliotheca;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.inspiredandroid.linuxcommandbibliotheca.asnytasks.LoadDatabaseAsyncTask;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.CraftDatabaseInterface;

/**
 * Created by Simon Schubert.
 */
public abstract class LoadingBaseActivity extends AppCompatActivity implements CraftDatabaseInterface {

    protected LoadDatabaseAsyncTask mAsyncTask;

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
    public void onSuccessCraftingDatabase() {

    }

    @Override
    public void onFailedCraftingDatabase() {

    }
}
