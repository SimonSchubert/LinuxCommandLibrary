package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.app.SearchManager;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.text.Spanned;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.inspiredandroid.linuxcommandbibliotheca.CommandManActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.adapter.ManExpandableListAdapter;
import com.inspiredandroid.linuxcommandbibliotheca.asnytasks.GrepManAsHtmlAsyncTask;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.ConvertManFromHtmlToSpannableInterface;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

import java.text.Normalizer;
import java.util.ArrayList;

/**
 * Created by Simon Schubert
 */
public class CommandManFragment extends AppIndexFragment implements ConvertManFromHtmlToSpannableInterface, View.OnClickListener {

    ExpandableListView lv;
    String name;
    long id;
    int category;
    int indexesPosition;
    String query;
    ImageButton btnUp;
    ImageButton btnDown;

    ArrayList<Integer> indexes = new ArrayList<>();

    @Override
    public String getAppIndexingTitle()
    {
        return name + "(" + category + ") man page";
    }

    @Override
    public Action getAppIndexingAction()
    {
        final Uri APP_URI = Uri.parse("android-app://com.inspiredandroid.linuxcommandbibliotheca/http/linux.schubert-simon.de/mans");
        final Uri WEB_URL = Uri.parse("http://linux.schubert-simon.de/mans/");
        return Action.newAction(Action.TYPE_VIEW, getAppIndexingTitle(), WEB_URL, APP_URI);
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);

        // Get unique command id
        Bundle b = getArguments();
        id = b.getLong(CommandManActivity.EXTRA_COMMAND_ID);
        name = b.getString(CommandManActivity.EXTRA_COMMAND_NAME);
        category = b.getInt(CommandManActivity.EXTRA_COMMAND_CATEGORY);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_command_man, container, false);

        lv = (ExpandableListView) view.findViewById(R.id.fraggment_commandman_elv);

        CommandsDbHelper helper = new CommandsDbHelper(getContext());

        Cursor c = helper.getCommandPagesFromId(id);

        ArrayList<String> groups = new ArrayList<>();
        ArrayList<String> child = new ArrayList<>();
        while(c.moveToNext()) {
            String title = c.getString(c.getColumnIndex("title"));
            String page = c.getString(c.getColumnIndex("page"));
            groups.add(title);
            child.add(page);
        }

        ManExpandableListAdapter adapter = new ManExpandableListAdapter(getActivity(), groups, child);
        lv.setAdapter(adapter);

        btnUp = (ImageButton) view.findViewById(R.id.fragment_command_man_btn_up);
        btnUp.setOnClickListener(this);
        btnDown = (ImageButton) view.findViewById(R.id.fragment_command_man_btn_down);
        btnDown.setOnClickListener(this);

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater)
    {
        inflater.inflate(R.menu.man, menu);

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
    }

    /**
     *
     */
    private void resetSearchResults()
    {
        // String text = tvDescription.getText().toString();
        // tvDescription.setText(text);

        hideButton();
    }

    /**
     * Search the man page for q occurs and highlight them and jump to first occur
     *
     * @param q
     */
    private void search(String q)
    {
        /*
        String normalizedText = Normalizer.normalize(tvDescription.getText().toString(), Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").toLowerCase();

        // (re)init global variables
        indexes.clear();
        indexesPosition = 0;
        query = q;
        int indexStart = 0;

        // find all indexes
        while (normalizedText.indexOf(q, indexStart) != -1) {

            indexStart = normalizedText.indexOf(q, indexStart);
            indexes.add(indexStart);
            indexStart++;
        }

        // jump to first occur
        if (indexes.size() > 0) {
            showButton();
            scrollToPosition(indexes.get(indexesPosition));
        } else {
            hideButton();
        }

        // highlight occurs
        // tvDescription.setText(Utils.highlightQueryInsideText(getContext(), query, tvDescription.getText().toString()));
        */
    }

    /**
     * Get line by index of occur and calculate position
     *
     * @param index
     */
    private void scrollToPosition(int index)
    {
        /*
        int line = tvDescription.getLayout().getLineForOffset(index);
        int lineHeight = tvDescription.getLayout().getHeight() / tvDescription.getLayout().getLineCount();
        int position = line * lineHeight;
        scrollView.scrollTo(0, position);
        */
    }

    /**
     *
     */
    private void hideButton()
    {
        btnUp.setVisibility(View.GONE);
        btnDown.setVisibility(View.GONE);
    }

    /**
     *
     */
    private void showButton()
    {
        btnUp.setVisibility(View.VISIBLE);
        btnDown.setVisibility(View.VISIBLE);
    }

    /**
     * go to next, if last then go to first
     */
    private void jumpToNextPosition()
    {
        indexesPosition--;
        if (indexesPosition < 0) {
            indexesPosition = indexes.size() - 1;
        }
        scrollToPosition(indexes.get(indexesPosition));
    }

    /**
     * go to previous, if smaller 0 then go to last
     */
    private void jumpToPreviousPosition()
    {
        indexesPosition++;
        if (indexesPosition >= indexes.size()) {
            indexesPosition = 0;
        }
        scrollToPosition(indexes.get(indexesPosition));
    }

    @Override
    public void onConvertedHtmlToSpannable(Spanned spannable)
    {

    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.fragment_command_man_btn_up) {
            jumpToNextPosition();
        } else if (v.getId() == R.id.fragment_command_man_btn_down) {
            jumpToPreviousPosition();
        }
    }
}
