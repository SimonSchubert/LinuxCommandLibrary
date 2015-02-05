package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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

/**
 * Created by Simon Schubert.
 */
public class CommandsFragment extends Fragment implements AdapterView.OnItemClickListener, LoaderManager.LoaderCallbacks<Cursor> {

    CommandsAdapter adapter;
    ListView list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_commands, container, false);

        initViews(view);

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        Intent intent = new Intent(getActivity(), CommandManActivity.class);
        Bundle b = new Bundle();
        b.putLong(CommandManActivity.EXTRA_COMMAND_ID, id);
        intent.putExtras(b);
        startActivity(intent);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater)
    {
        inflater.inflate(R.menu.main, menu);

        // Associate searchable configuration with the SearchView
        SearchManager searchManager = (SearchManager) getActivity().getSystemService(Context.SEARCH_SERVICE);
        MenuItem item = menu.findItem(R.id.search);
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
                    search(query);
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

    private void initViews(View view)
    {
        // Init Cursor
        CommandsDbHelper mDbHelper = new CommandsDbHelper(getActivity());
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM commands ORDER BY name COLLATE NOCASE ASC", null);

        // Init Adapter
        adapter = new CommandsAdapter(getActivity(), R.layout.cell_command_child, c, true);

        // Init list view
        list = (ListView) view.findViewById(R.id.fragment_commands_lv);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }

    /**
     * reset adapter entries
     */
    private void resetSearchResults()
    {
        // Init Cursor
        CommandsDbHelper mDbHelper = new CommandsDbHelper(getActivity());
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM commands ORDER BY name COLLATE NOCASE ASC", null);

        // Update adapter
        adapter.swapCursor(c);
    }

    /**
     * search for query in all commands and update adapter
     *
     * @param query
     */
    private void search(String query)
    {
        // Init Cursor
        CommandsDbHelper mDbHelper = new CommandsDbHelper(getActivity());
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM commands WHERE name LIKE '%" + query + "%' ORDER BY name COLLATE NOCASE ASC", null);

        // Update adapter
        adapter.swapCursor(c);
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args)
    {
        // Create a new CursorLoader with the following query parameters.
        return new CursorLoader(getActivity(), null, null, null, null, null) {
            @Override
            public Cursor loadInBackground()
            {
                CommandsDbHelper mDbHelper = new CommandsDbHelper(getActivity());
                SQLiteDatabase db = mDbHelper.getReadableDatabase();
                Cursor c = db.rawQuery("SELECT * FROM "+CommandsDBTableModel.TABLE_COMMANDS+" ORDER BY "+CommandsDBTableModel.COL_NAME+" COLLATE NOCASE ASC", null);
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
        adapter.swapCursor(data);
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader)
    {
        // For whatever reason, the Loader's data is now unavailable.
        // Remove any references to the old data by replacing it with
        // a null Cursor.
        adapter.swapCursor(null);
    }
}
