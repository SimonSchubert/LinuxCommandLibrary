package com.inspiredandroid.linuxcommandbibliotheca.asnytasks;

import android.content.Context;
import android.os.AsyncTask;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.CraftDatabaseInterface;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import io.realm.Realm;

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
        /*
        CommandsDbHelper helper = new CommandsDbHelper(mContext);
        try {
            helper.getReadableDatabase();
        } catch (Exception e) {
            e.printStackTrace();
            success = false;
        }
        helper.close();
        */

        File file = new File(mContext.getFilesDir() + "/" + Realm.DEFAULT_REALM_NAME);
        if (!file.exists()) {
            try {
                copyBundledRealmFile(mContext.getResources().openRawResource(R.raw.realm), "default.realm");
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }


        return true;
    }


    private String copyBundledRealmFile(InputStream inputStream, String outFileName) throws IOException {
        try {
            File file = new File(mContext.getFilesDir(), outFileName);
            FileOutputStream outputStream = new FileOutputStream(file);
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buf)) > 0) {
                outputStream.write(buf, 0, bytesRead);
            }
            outputStream.close();
            return file.getAbsolutePath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
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