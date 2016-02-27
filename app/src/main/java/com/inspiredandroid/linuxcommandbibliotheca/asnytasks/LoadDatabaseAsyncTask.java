package com.inspiredandroid.linuxcommandbibliotheca.asnytasks;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.inspiredandroid.linuxcommandbibliotheca.Constants;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.CraftDatabaseInterface;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Simon Schubert
 */
public class LoadDatabaseAsyncTask extends AsyncTask<Boolean, Void, Boolean> {

    private Context mContext;
    private CraftDatabaseInterface mCallback;

    public LoadDatabaseAsyncTask(Context context, CraftDatabaseInterface callback) {
        super();
        mContext = context;
        mCallback = callback;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Boolean doInBackground(Boolean... contexts) {


        File oldDatabase = mContext.getDatabasePath("commands.db");
        Log.e("TAG", "old db exists: " + oldDatabase.exists());
        if(oldDatabase.exists()) {
            oldDatabase.delete();
        }

        File file = new File(mContext.getFilesDir() + "/" + Constants.REALM_DATABASE);
        if (!file.exists()) {
            try {
                copyBundledRealmFile(mContext.getResources().openRawResource(R.raw.realm), Constants.REALM_DATABASE);
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        return true;
    }


    private String copyBundledRealmFile(InputStream inputStream, String outFileName) throws IOException {

        File file = new File(mContext.getFilesDir(), outFileName);
        FileOutputStream outputStream = new FileOutputStream(file);
        byte[] buf = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buf)) > 0) {
            outputStream.write(buf, 0, bytesRead);
        }
        outputStream.close();
        return file.getAbsolutePath();
    }

    @Override
    protected void onPostExecute(Boolean success) {
        super.onPostExecute(success);
        if (success) {
            mCallback.onSuccessCraftingDatabase();
        } else {
            mCallback.onFailedCraftingDatabase();
        }
    }

}