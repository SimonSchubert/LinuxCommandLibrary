package com.inspiredandroid.linuxcommandbibliotheca.asnytasks;

import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.FetchedCommandlineFuCommandsInterface;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandLineFuModel;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

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
public class FetchCommandlineFuCommandsAsyncTask extends AsyncTask<String, String, ArrayList<CommandGroupModel>> {

    Context mContext;
    FetchedCommandlineFuCommandsInterface mCallback;
    int mPage;
    CommandsDbHelper helper;

    public FetchCommandlineFuCommandsAsyncTask(Context _context, FetchedCommandlineFuCommandsInterface _callback, int _page)
    {
        mContext = _context;
        mCallback = _callback;
        mPage = _page;
    }

    @Override
    protected ArrayList<CommandGroupModel> doInBackground(String... strings)
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

        helper = new CommandsDbHelper(mContext);
        ArrayList<CommandGroupModel> commands = new ArrayList<>();
        // convert commandlinefu json models to linux command bibliotheca models
        for (CommandLineFuModel commandLineFuModel : commandLineFuModels) {
            commands.add(new CommandGroupModel(commandLineFuModel.getCommand(), commandLineFuModel.getSummary(), getManPages(commandLineFuModel.getCommand())));
        }
        helper.close();

        return commands;
    }

    @Override
    protected void onPostExecute(ArrayList<CommandGroupModel> commandLineFuModels)
    {
        super.onPostExecute(commandLineFuModels);

        mCallback.onFetchedCommandlineFuCommands(commandLineFuModels);
    }

    /**
     * Split the sentence/script into single words/commands and check if the command exists in the
     * database
     *
     * @param sentence the scripts
     * @return list of commands which exists in the database
     */
    private ArrayList<String> getManPages(String sentence)
    {
        String[] words = sentence.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        ArrayList<String> mans = new ArrayList<>();
        for (String word : words) {
            Cursor c = helper.getCommandFromName(word);
            if (c.getCount() > 0) {
                mans.add(word);
            }
            c.close();
        }
        return mans;
    }
}
