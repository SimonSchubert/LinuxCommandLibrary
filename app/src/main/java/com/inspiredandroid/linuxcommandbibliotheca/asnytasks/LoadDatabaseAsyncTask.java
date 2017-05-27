package com.inspiredandroid.linuxcommandbibliotheca.asnytasks;

import android.content.Context;
import android.os.AsyncTask;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnCraftDatabaseListener;
import com.inspiredandroid.linuxcommandbibliotheca.misc.AppManager;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Constants;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Simon Schubert
 */
public class LoadDatabaseAsyncTask extends AsyncTask<Boolean, Void, Boolean> {

    private Context mContext;
    private OnCraftDatabaseListener mCallback;

    public LoadDatabaseAsyncTask(Context context, OnCraftDatabaseListener callback) {
        super();
        mContext = context;
        mCallback = callback;
    }

    @Override
    protected Boolean doInBackground(Boolean... contexts) {
        File oldDatabase = mContext.getDatabasePath("commands.db");
        if (oldDatabase.exists()) {
            oldDatabase.delete();
        }

        File file = new File(mContext.getFilesDir() + "/" + Constants.REALM_DATABASE);
        if (!file.exists() || !AppManager.isDatabaseVersionUpToDate(mContext)) {
            try {
                copyBundledRealmFile(mContext.getResources().openRawResource(R.raw.database));
                AppManager.setDatabaseVersionUpToDate(mContext);
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        return true;
    }

    private void copyBundledRealmFile(InputStream inputStream) throws IOException {
        File file = new File(mContext.getFilesDir(), Constants.REALM_DATABASE);
        file.delete();
        FileOutputStream outputStream = new FileOutputStream(file);
        byte[] buf = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buf)) > 0) {
            outputStream.write(buf, 0, bytesRead);
        }
        outputStream.close();
    }

    @Override
    protected void onPostExecute(Boolean success) {
        super.onPostExecute(success);
        if (success) {
            mCallback.onDatabaseCreateSuccess();
        } else {
            mCallback.onDatabaseCreateFail();
        }
    }
}