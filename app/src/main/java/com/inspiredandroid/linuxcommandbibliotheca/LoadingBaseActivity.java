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

    LoadDatabaseAsyncTask asyncTask;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        asyncTask = new LoadDatabaseAsyncTask(this, this);
        asyncTask.execute();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();

        if (isTaskRunning()) {
            asyncTask.cancel(true);
        }
    }

    /**
     *
     * @return true if asynctask is not null and already running
     */
    private boolean isTaskRunning()
    {
        return (asyncTask != null) && (asyncTask.getStatus() == AsyncTask.Status.RUNNING);
    }

    @Override
    public void onSuccessCraftingDatabase()
    {

    }

    @Override
    public void onFailedCraftingDatabase()
    {

    }
}
