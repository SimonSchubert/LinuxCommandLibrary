package com.inspiredandroid.linuxcommandbibliotheca.asnytasks;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnCraftDatabaseListener;
import com.inspiredandroid.linuxcommandbibliotheca.misc.AppManager;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Constants;
import com.inspiredandroid.linuxcommandbibliotheca.models.Command;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandPage;

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
    private OnCraftDatabaseListener mCallback;

    public LoadDatabaseAsyncTask(Context context, OnCraftDatabaseListener callback) {
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

        // applyPatch();

        return true;
    }

    private void applyPatch() {
        Realm realm = Realm.getDefaultInstance();
        if (realm.where(Command.class).equalTo(Command.NAME, "lsof").findFirst() == null) {
            realm.beginTransaction();
            try {
                realm.createAllFromJson(Command.class, mContext.getResources().openRawResource(R.raw.commands_patch_0));
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                realm.createAllFromJson(CommandPage.class, mContext.getResources().openRawResource(R.raw.commands_page_patch_0));
            } catch (IOException e) {
                e.printStackTrace();
            }
            realm.commitTransaction();
        }

        Log.e("TAG", "cid: " + realm.where(Command.class).max(Command.ID) + ", pid: " + realm.where(CommandPage.class).max("id"));
        realm.close();
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