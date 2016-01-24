package com.inspiredandroid.linuxcommandbibliotheca.asnytasks;

import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.inspiredandroid.linuxcommandbibliotheca.adapter.ScriptsExpandableListAdapter;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.FetchedCommandlineFuCommandsInterface;
import com.inspiredandroid.linuxcommandbibliotheca.models.Command;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandChildModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandLineFuModel;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;

/**
 * Created by Simon Schubert
 */
public class FetchCommandlineFuCommandsAsyncTask extends AsyncTask<String, String, ArrayList<CommandGroupModel>> {

    private Context mContext;
    private FetchedCommandlineFuCommandsInterface mCallback;
    private int mPage;

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

        Realm realm = Realm.getInstance(mContext);

        realm.beginTransaction();

        // convert commandlinefu json models to linux command bibliotheca models
        for (CommandLineFuModel commandLineFuModel : commandLineFuModels) {

            JSONObject json = new JSONObject();
            try {
                json.put("id", commandLineFuModel.getId()+10000);
                json.put("category", ScriptsExpandableListAdapter.GROUP_COMMANDLINEFU);
                json.put("descStr", commandLineFuModel.getSummary());
                json.put("votes", commandLineFuModel.getVotes());

                JSONObject json2 = new JSONObject();
                json2.put("command", commandLineFuModel.getCommand());

                JSONArray jsonMans = new JSONArray();
                ArrayList<String> mans = getManPages(realm, commandLineFuModel.getCommand());
                for(String man : mans) {
                    JSONObject jsonMan = new JSONObject();
                    jsonMan.put("man", man);
                    jsonMans.put(jsonMan);
                }
                json2.put("mans", jsonMans);

                JSONArray jsonCommands = new JSONArray();
                jsonCommands.put(json2);

                json.put("commands", jsonCommands);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            realm.createOrUpdateObjectFromJson(CommandGroupModel.class, json);
        }
        realm.commitTransaction();

        realm.close();

        return null;
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
    private ArrayList<String> getManPages(Realm realm, String sentence)
    {
        String[] words = sentence.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        ArrayList<String> mans = new ArrayList<>();
        for (String word : words) {
            Command command = realm.where(Command.class).equalTo("name", word).findFirst();
            if (command != null) {
                mans.add(word);
            }
        }
        return mans;
    }
}
