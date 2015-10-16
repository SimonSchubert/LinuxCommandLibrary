package com.inspiredandroid.linuxcommandbibliotheca;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import com.inspiredandroid.linuxcommandbibliotheca.interfaces.CraftDatabaseInterface;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

public class LoadDatabaseTask extends AsyncTask<Boolean, Void, Boolean> {
    Context mContext;
    CraftDatabaseInterface mCallback;

    LoadDatabaseTask(Context context, CraftDatabaseInterface callback)
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
        try {
            new CommandsDbHelper(mContext).getReadableDatabase();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
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