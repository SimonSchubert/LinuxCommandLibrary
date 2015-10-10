package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
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

import com.inspiredandroid.linuxcommandbibliotheca.CommandManActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.adapter.CommandsAdapter;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

import java.text.Normalizer;

/**
 * Created by Simon Schubert.
 */
public class CommandsFragment extends Fragment implements AdapterView.OnItemClickListener, LoaderManager.LoaderCallbacks<Cursor> {

    CommandsAdapter adapter;
    ListView list;
    SQLiteDatabase db;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);

        CommandsDbHelper mDbHelper = new CommandsDbHelper(getActivity());
        db = mDbHelper.getReadableDatabase();

        createAdapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_commands, container, false);

        // Init list view
        list = (ListView) view.findViewById(R.id.fragment_commands_lv);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        startCommandManActivity(id);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater)
    {
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
                public boolean onQueryTextSubmit(String s)
                {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String query)
                {
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
                public boolean onMenuItemActionExpand(MenuItem item)
                {
                    return true;
                }

                @Override
                public boolean onMenuItemActionCollapse(MenuItem item)
                {
                    resetSearchResults();
                    return true;
                }
            });
        }
    }

    private void startCommandManActivity(long id)
    {
        Intent intent = new Intent(getActivity(), CommandManActivity.class);
        Bundle b = new Bundle();
        b.putLong(CommandManActivity.EXTRA_COMMAND_ID, id);
        intent.putExtras(b);
        startActivity(intent);
    }

    private void createAdapter()
    {
        // Init Cursor
        Cursor c = db.rawQuery("SELECT * FROM " + CommandsDBTableModel.TABLE_COMMANDS + " ORDER BY "+ CommandsDBTableModel.COL_NAME +" COLLATE NOCASE ASC", null);

        // Init Adapter
        adapter = new CommandsAdapter(getActivity(), R.layout.row_command_child, c, true);
    }

    /**
     * reset adapter entries
     */
    private void resetSearchResults()
    {
        // Init Cursor
        Cursor c = db.rawQuery("SELECT * FROM " + CommandsDBTableModel.TABLE_COMMANDS + " ORDER BY "+ CommandsDBTableModel.COL_NAME +" COLLATE NOCASE ASC", null);

        // Update adapter
        adapter.updateCursor(c, "");
    }

    /**
     * search for query in all commands and update adapter
     *
     * @param query
     */
    private void search(String query)
    {
        // Init Cursor
        Cursor c = db.rawQuery("Select * from " + CommandsDBTableModel.TABLE_COMMANDS + " WHERE " + CommandsDBTableModel.COL_NAME + " LIKE '%" + query + "%' "+
                "ORDER BY " + CommandsDBTableModel.COL_NAME + " = '" + query + "' DESC,"+
                CommandsDBTableModel.COL_NAME + " LIKE '" + query + "%' DESC", null);

        // Update adapter
        adapter.updateCursor(c, query);
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args)
    {
        // Create a new CursorLoader with the following query parameters.
        return new CursorLoader(getActivity(), null, null, null, null, null) {
            @Override
            public Cursor loadInBackground()
            {
                Cursor c = db.rawQuery("SELECT * FROM " + CommandsDBTableModel.TABLE_COMMANDS + " ORDER BY " + CommandsDBTableModel.COL_NAME + " COLLATE NOCASE ASC", null);
                // You can use any query that returns a cursor.
                return c;
            }
        };
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data)
    {
        // The asynchronous load is complete and the data
        // is now available for use. Only now can we associate
        // the queried Cursor with the SimpleCursorAdapter.
        adapter.updateCursor(data, "");
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader)
    {
        // For whatever reason, the Loader's data is now unavailable.
        // Remove any references to the old data by replacing it with
        // a null Cursor.
        adapter.updateCursor(null, "");
    }
}
