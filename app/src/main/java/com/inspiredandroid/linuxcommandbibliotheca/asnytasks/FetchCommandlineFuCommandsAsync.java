package com.inspiredandroid.linuxcommandbibliotheca.asnytasks;

import android.content.Context;
import android.os.AsyncTask;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.FetchedCommandlineFuCommandsInterface;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandLineFuModel;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by simon on 18.06.14.
 */
public class FetchCommandlineFuCommandsAsync extends AsyncTask<String, String, ArrayList<CommandLineFuModel>> {

    Context mContext;
    FetchedCommandlineFuCommandsInterface mCallback;
    int mPage;

    public FetchCommandlineFuCommandsAsync(Context _context, FetchedCommandlineFuCommandsInterface _callback, int _page)
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
            HttpClient httpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost("http://www.commandlinefu.com/commands/browse/sort-by-votes/json/" + mPage * 25); //NON-NLS
            HttpResponse response = httpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();

            if (entity != null) {
                commandLineFuModels = new Gson().fromJson(EntityUtils.toString(entity), new TypeToken<List<CommandLineFuModel>>() {
                }.getType());
            }

        } catch (IOException e) {
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
