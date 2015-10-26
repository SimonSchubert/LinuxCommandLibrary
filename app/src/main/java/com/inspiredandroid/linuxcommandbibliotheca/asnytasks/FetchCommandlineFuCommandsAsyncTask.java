package com.inspiredandroid.linuxcommandbibliotheca.asnytasks;

import android.content.Context;
import android.os.AsyncTask;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.FetchedCommandlineFuCommandsInterface;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandLineFuModel;

import org.apache.commons.io.IOUtils;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simon Schubert
 */
public class FetchCommandlineFuCommandsAsyncTask extends AsyncTask<String, String, ArrayList<CommandLineFuModel>> {

    Context mContext;
    FetchedCommandlineFuCommandsInterface mCallback;
    int mPage;

    public FetchCommandlineFuCommandsAsyncTask(Context _context, FetchedCommandlineFuCommandsInterface _callback, int _page)
    {
        mContext = _context;
        mCallback = _callback;
        mPage = _page;
    }

    @Override
    protected ArrayList<CommandLineFuModel> doInBackground(String... strings)
    {
        ArrayList<CommandLineFuModel> commandLineFuModels = null;

        try {
            URL url = new URL("http://www.commandlinefu.com/commands/browse/sort-by-votes/json/" + mPage * 25);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");

            InputStream in = new BufferedInputStream(conn.getInputStream());
            String response = IOUtils.toString(in, "UTF-8");

            commandLineFuModels = new Gson().fromJson(response, new TypeToken<List<CommandLineFuModel>>() {
            }.getType());

        } catch (IOException | JsonSyntaxException e) {
            e.printStackTrace();
        }
        if (commandLineFuModels == null) {
            commandLineFuModels = new ArrayList<>();
        }

        return commandLineFuModels;
    }

    @Override
    protected void onPostExecute(ArrayList<CommandLineFuModel> commandLineFuModels)
    {
        super.onPostExecute(commandLineFuModels);

        mCallback.onFetchedCommandlineFuCommands(commandLineFuModels);
    }
}
