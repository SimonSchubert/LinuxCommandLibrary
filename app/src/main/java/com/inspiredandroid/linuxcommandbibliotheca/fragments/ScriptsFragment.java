package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.app.AlertDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ExpandableListView;
import android.widget.ImageButton;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.inspiredandroid.linuxcommandbibliotheca.AboutActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.adapter.ScriptsExpandableListAdapter;
import com.inspiredandroid.linuxcommandbibliotheca.asnytasks.FetchCommandlineFuCommandsAsyncTask;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs.ScriptDetailDialogFragment;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.FetchedCommandlineFuCommandsInterface;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandLineFuModel;
import com.inspiredandroid.linuxcommandbibliotheca.sql.CommandsDbHelper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simon Schubert
 */
public class ScriptsFragment extends SuperFragment implements View.OnClickListener, FetchedCommandlineFuCommandsInterface, AbsListView.OnScrollListener, ExpandableListView.OnChildClickListener {

    ExpandableListView list;
    ScriptsExpandableListAdapter adapter;

    ArrayList<ArrayList<CommandGroupModel>> childs = new ArrayList<>();
    ArrayList<String> group = new ArrayList<>();

    FetchCommandlineFuCommandsAsyncTask async;
    int fetchedCommandlineFuPages = 0;

    boolean isSearching = false;
    ArrayList mSelectedItems;

    public ScriptsFragment()
    {
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);

        adapter = createAdapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_scripts, container, false);

        // init listview
        list = (ExpandableListView) view.findViewById(R.id.fragment_scripts_elv);
        list.setAdapter(adapter);
        list.setOnChildClickListener(this);
        list.setOnScrollListener(this);

        // Hide ads if remote is already installed
        if (Utils.isAppInstalled(getActivity(), Utils.PACKAGE_LINUXREMOTE) || Utils.isAppInstalled(getActivity(), Utils.PACKAGE_LINUXREMOTE_PRO)) {
            view.findViewById(R.id.fragment_scipts_iv_ad).setVisibility(View.GONE);
        } else {
            view.findViewById(R.id.fragment_scipts_iv_ad).setOnClickListener(this);
        }

        ImageButton btnFilter = (ImageButton) view.findViewById(R.id.btnFilter);
        btnFilter.setVisibility(View.GONE);
        btnFilter.setOnClickListener(this);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        fetchCommandsFromCommandlineFu();
    }

    @Override
    public void onClick(View view)
    {
        if (view.getId() == R.id.btnFilter) {
            showFilterDialog();
        } else if (view.getId() == R.id.fragment_scipts_iv_ad) {
            handleAdClick();
        }
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == R.id.about) {
            startAboutActivity();
            return true;
        }
        return false;
    }

    @Override
    public void onScrollStateChanged(AbsListView absListView, int i)
    {

    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem,
                         int visibleItemCount, int totalItemCount)
    {
        // check if commandlineFu group is expanded AND user is currently not searching
        if (list.isGroupExpanded(ScriptsExpandableListAdapter.GROUP_COMMANDLINEFU) && !isSearching) {

            // check if is last item
            if (firstVisibleItem + visibleItemCount == totalItemCount) {
                fetchCommandsFromCommandlineFu();
            }
        }
    }

    private void startAboutActivity()
    {
        Intent intent = new Intent(getContext(), AboutActivity.class);
        startActivity(intent);
    }

    /**
     * Open native play store or alternatively the web browser
     */
    private void handleAdClick()
    {
        final String appPackageName = Utils.PACKAGE_LINUXREMOTE;
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
        } catch (android.content.ActivityNotFoundException anfe) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
        }
    }

    /**
     *
     * @return
     */
    private ScriptsExpandableListAdapter createAdapter()
    {
        // command categories
        group.add(getString(R.string.system_info));
        childs.add(new ArrayList<CommandGroupModel>());
        group.add(getString(R.string.system_control));
        childs.add(new ArrayList<CommandGroupModel>());
        group.add(getString(R.string.audio_video));
        childs.add(new ArrayList<CommandGroupModel>());
        group.add("http://www.commandlinefu.com/");
        childs.add(new ArrayList<CommandGroupModel>());

        // get raw commands file
        InputStream inputStream = getResources().openRawResource(R.raw.commands);

        // convert file to arraylist
        ArrayList<CommandGroupModel> commandsAll = new Gson().fromJson(Utils.readTextFile(inputStream), new TypeToken<List<CommandGroupModel>>() {
        }.getType());

        // sort commands by category
        for (CommandGroupModel command : commandsAll) {
            if (command.getCategory() == 0) {
                childs.get(ScriptsExpandableListAdapter.GROUP_INFO).add(command);
            } else if (command.getCategory() == 1) {
                childs.get(ScriptsExpandableListAdapter.GROUP_SYSTEM_CONTROL).add(command);
            } else if (command.getCategory() == 2) {
                childs.get(ScriptsExpandableListAdapter.GROUP_AUDIO_VIDEO).add(command);
            }
        }

        return new ScriptsExpandableListAdapter(getActivity(), group, childs);
    }

    /**
     * fetch next page(25 items)
     */
    private void fetchCommandsFromCommandlineFu()
    {
        // check if is not already fetching
        if (async == null
                || async.getStatus() == AsyncTask.Status.FINISHED) {
            adapter.setLoading();
            async = new FetchCommandlineFuCommandsAsyncTask(
                    getActivity(), this, fetchedCommandlineFuPages);
            asyncTasks.add(async);
            async.execute();
            fetchedCommandlineFuPages++;
        }
    }

    /**
     * TODO: do it
     */
    private void showFilterDialog()
    {
        String[] items = new String[]{"Gnome", "KDE"};

        mSelectedItems = new ArrayList();  // Where we track the selected items
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Set the dialog title
        builder.setTitle("Filter")
                // Specify the list array, the items to be selected by default (null for none),
                // and the listener through which to receive callbacks when items are selected
                .setMultiChoiceItems(items, null,
                        new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which,
                                                boolean isChecked)
                            {
                                if (isChecked) {
                                    // If the user checked the item, add it to the selected items
                                    mSelectedItems.add(which);
                                } else if (mSelectedItems.contains(which)) {
                                    // Else, if the item is already in the array, remove it
                                    mSelectedItems.remove(Integer.valueOf(which));
                                }
                            }
                        }
                )
                        // Set the action buttons
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id)
                    {
                        // User clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                    }
                })
                .setNegativeButton("Reset", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id)
                    {

                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    /**
     * reset adapter entries
     */
    private void resetSearchResults()
    {
        adapter.updateEntries("", group, childs);
        isSearching = false;
    }

    /**
     * search for query in all commands and update adapter
     *
     * @param query search query
     */
    private void search(String query)
    {
        ArrayList<ArrayList<CommandGroupModel>> entries = new ArrayList<>();
        // loop through all groups
        for (ArrayList<CommandGroupModel> childGroup : childs) {
            ArrayList<CommandGroupModel> newChildGroup = new ArrayList<>();
            for (CommandGroupModel child : childGroup) {
                // check if command OR description contains query
                if (child.getDesc(getActivity()).toLowerCase().contains(query.toLowerCase())) {
                    newChildGroup.add(child);
                }
            }
            entries.add(newChildGroup);
        }
        adapter.updateEntries(query, group, entries);

        isSearching = true;
    }

    /**
     * Split the sentence/script into single words/commands and check if the command exists in the
     * database
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
            CommandsDbHelper helper = new CommandsDbHelper(getContext());
            Cursor c = helper.getCommandFromName(word);
            if (c.getCount() > 0) {
                mans.add(word);
            }
        }
        return mans;
    }

    @Override
    public void onFetchedCommandlineFuCommands(ArrayList<CommandLineFuModel> commandLineFuModels)
    {
        if(!isAdded()) {
            return;
        }

        ArrayList<CommandGroupModel> commands = new ArrayList<>();
        // convert commandlinefu json models to linux command bibliotheca models
        for (CommandLineFuModel commandLineFuModel : commandLineFuModels) {
            commands.add(new CommandGroupModel(commandLineFuModel.getCommand(), commandLineFuModel.getSummary(), getManPages(commandLineFuModel.getCommand())));
        }
        adapter.addEntries(ScriptsExpandableListAdapter.GROUP_COMMANDLINEFU, commands);
        adapter.setLoadingFinished();
    }

    @Override
    public boolean onChildClick(ExpandableListView parent, View view, int groupPosition, int childPosition, long id)
    {
        CommandGroupModel commandGroupModel = (CommandGroupModel) view.getTag(R.id.ID);

        ScriptDetailDialogFragment fragment = ScriptDetailDialogFragment.getInstance(commandGroupModel);
        fragment.show(getChildFragmentManager(), ScriptDetailDialogFragment.class.getName());

        return true;
    }
}
