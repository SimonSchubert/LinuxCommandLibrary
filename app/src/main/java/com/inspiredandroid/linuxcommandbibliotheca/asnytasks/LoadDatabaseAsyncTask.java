package com.inspiredandroid.linuxcommandbibliotheca.asnytasks;

import android.content.Context;
import android.os.AsyncTask;

import com.inspiredandroid.linuxcommandbibliotheca.interfaces.CraftDatabaseInterface;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

/**
 * Created by Simon Schubert
 */
public class LoadDatabaseAsyncTask extends AsyncTask<Boolean, Void, Boolean> {
    Context mContext;
    CraftDatabaseInterface mCallback;

    public LoadDatabaseAsyncTask(Context context, CraftDatabaseInterface callback)
    {
        super();
        mContext = context;
        mCallback = callback;
    }

    @Override
    protected void onPreExecute()
    {
        super.onPreExecute();
    }

    @Override
    protected Boolean doInBackground(Boolean... contexts)
    {
        boolean success = true;

        CommandsDbHelper helper = new CommandsDbHelper(mContext);
        try {
            helper.getReadableDatabase();
        } catch (Exception e) {
            e.printStackTrace();
            success = false;
        }
        helper.close();

        return success;
    }

    @Override
    protected void onPostExecute(Boolean success)
    {
        super.onPostExecute(success);
        if (success) {
            mCallback.onSuccessCraftingDatabase();
        } else {
            mCallback.onFailedCraftingDatabase();
        }
    }

}