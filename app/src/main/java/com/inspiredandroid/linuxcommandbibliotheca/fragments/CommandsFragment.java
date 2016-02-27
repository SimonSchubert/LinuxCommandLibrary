package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.inspiredandroid.linuxcommandbibliotheca.AboutActivity;
import com.inspiredandroid.linuxcommandbibliotheca.CommandManActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.adapter.CommandsAdapter;
import com.inspiredandroid.linuxcommandbibliotheca.models.Command;
import com.inspiredandroid.linuxcommandbibliotheca.sql.BookmarkManager;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by Simon Schubert.
 */
public class CommandsFragment extends Fragment implements AdapterView.OnItemClickListener {

    private CommandsAdapter mAdapter;
    private Realm mRealm;

    public CommandsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);

        mRealm = Realm.getDefaultInstance();

        createAdapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_commands, container, false);

        // Init mList view
        ListView mList = (ListView) view.findViewById(R.id.fragment_commands_lv);
        mList.setAdapter(mAdapter);
        mList.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        startCommandManActivity(id);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.main, menu);

        // Associate searchable configuration with the SearchView
        SearchManager searchManager = (SearchManager) getActivity().getSystemService(Context.SEARCH_SERVICE);
        MenuItem item = menu.findItem(R.id.search);
        if (Build.VERSION.SDK_INT >= 11) {
            SearchView searchView = (SearchView) item.getActionView();
            searchView.setSearchableInfo(searchManager.getSearchableInfo(getActivity().getComponentName()));

            // Associate searchable configuration with the SearchView
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

                @Override
                public boolean onQueryTextSubmit(String s) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String query) {
                    if (query.length() > 0) {
                        String normalizedText = Normalizer.normalize(query, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").toLowerCase();
                        search(normalizedText);
                    } else {
                        resetSearchResults();
                    }
                    return true;
                }
            });
            MenuItemCompat.setOnActionExpandListener(item, new MenuItemCompat.OnActionExpandListener() {
                @Override
                public boolean onMenuItemActionExpand(MenuItem item) {
                    return true;
                }

                @Override
                public boolean onMenuItemActionCollapse(MenuItem item) {
                    resetSearchResults();
                    return true;
                }
            });
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.about) {
            startAboutFragment();
            return true;
        }
        return false;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        mRealm.close();
    }

    @Override
    public void onResume() {
        super.onResume();

        if (BookmarkManager.hasBookmarkChanged(getContext())) {
            resetSearchResults();
        }
    }

    private void startCommandManActivity(long id) {
        Intent intent = new Intent(getContext(), CommandManActivity.class);
        Bundle b = new Bundle();
        b.putLong(CommandManActivity.EXTRA_COMMAND_ID, id);
        intent.putExtras(b);
        startActivity(intent);
    }

    private void startAboutFragment() {
        Intent intent = new Intent(getContext(), AboutActivity.class);
        startActivity(intent);
    }

    private void createAdapter() {
        /*
        mRealm.beginTransaction();
        mRealm.clear(Command.class);

        Cursor c = mDbHelper.getAllCommands("");

        while (c.moveToNext()) {
            Command command = mRealm.createObject(Command.class);
            command.setId(c.getInt(c.getColumnIndex(CommandsDBTableModel.COL_ID)));
            command.setCategory(c.getInt(c.getColumnIndex(CommandsDBTableModel.COL_CATEGORY)));
            command.setDescription(c.getString(c.getColumnIndex(CommandsDBTableModel.COL_DESCRIPTION)));
            command.setName(c.getString(c.getColumnIndex(CommandsDBTableModel.COL_NAME)));
            mRealm.copyToRealm(command);
        }

        Cursor c2 = mDbHelper.getAllCommandPages();

        while (c2.moveToNext()) {
            CommandPage command = mRealm.createObject(CommandPage.class);
            command.setId(c2.getInt(c2.getColumnIndex("id")));
            command.setCommandid(c2.getInt(c2.getColumnIndex("commandid")));
            command.setPage(c2.getString(c2.getColumnIndex("page")));
            command.setTitle(c2.getString(c2.getColumnIndex("title")));
            mRealm.copyToRealm(command);
        }

        Cursor c3 = mDbHelper.getAllQuiz();

        while (c3.moveToNext()) {
            Quiz command = mRealm.createObject(Quiz.class);
            command.setId(c3.getInt(c3.getColumnIndex("_id")));
            command.setName(c3.getString(c3.getColumnIndex("name")));
            command.setDifficulty(c3.getInt(c3.getColumnIndex("difficulty")));
            command.setDescription(c3.getString(c3.getColumnIndex("description")));
            command.setType(c3.getInt(c3.getColumnIndex("type")));
            command.setExtra(c3.getString(c3.getColumnIndex("extra")));
            mRealm.copyToRealm(command);
        }

        mRealm.commitTransaction();
        */

        List<RealmResults<Command>> results = new ArrayList<>();
        results.add(mRealm.where(Command.class).findAll());
        mAdapter = new CommandsAdapter(getContext(), results, false);

        // mAdapter = new CommandsAdapter(getActivity(), R.layout.row_command_child, mDbHelper.getAllCommands(BookmarkManager.getBookmarkIdsChain(getContext())), true);
    }

    /**
     * reset mAdapter entries
     */
    private void resetSearchResults() {
        List<RealmResults<Command>> results = new ArrayList<>();
        results.add(mRealm.where(Command.class).findAll());
        mAdapter.updateRealmResults(results);
        mAdapter.setSearchQuery("");
    }

    /**
     * search for query in all commands and update mAdapter
     *
     * @param query
     */
    private void search(String query) {
        List<RealmResults<Command>> results = new ArrayList<>();
        results.add(mRealm.where(Command.class).equalTo("name", query).findAll());
        results.add(mRealm.where(Command.class).beginsWith("name", query).notEqualTo("name", query).findAll());
        results.add(mRealm.where(Command.class).contains("name", query).not().beginsWith("name", query).notEqualTo("name", query).findAll());

        mAdapter.updateRealmResults(results);
        mAdapter.setSearchQuery(query);
    }

}
