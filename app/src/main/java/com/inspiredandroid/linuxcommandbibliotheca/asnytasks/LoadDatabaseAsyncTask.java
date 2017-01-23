package com.inspiredandroid.linuxcommandbibliotheca.asnytasks;

import android.content.Context;
import android.os.AsyncTask;

import com.inspiredandroid.linuxcommandbibliotheca.Constants;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.CraftDatabaseInterface;
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
        if (oldDatabase.exists()) {
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

        applyPatch();

        return true;
    }

    private void applyPatch() {
        Realm realm = Realm.getDefaultInstance();
        if (realm.where(Command.class).equalTo("name", "pkill").findFirst() == null) {
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
        realm.close();
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