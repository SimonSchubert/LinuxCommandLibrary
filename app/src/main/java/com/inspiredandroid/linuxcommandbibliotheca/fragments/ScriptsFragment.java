package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.app.AlertDialog;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
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

import com.inspiredandroid.linuxcommandbibliotheca.AboutActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.adapter.ScriptsExpandableListAdapter;
import com.inspiredandroid.linuxcommandbibliotheca.asnytasks.FetchCommandlineFuCommandsAsyncTask;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs.ScriptDetailDialogFragment;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.FetchedCommandlineFuCommandsInterface;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;
import io.realm.Sort;

/**
 * Created by Simon Schubert
 */
public class ScriptsFragment extends SuperFragment implements View.OnClickListener, FetchedCommandlineFuCommandsInterface, AbsListView.OnScrollListener, ExpandableListView.OnChildClickListener {

    private ArrayList<ArrayList<CommandGroupModel>> mChilds = new ArrayList<>();
    private ArrayList<String> mGroup = new ArrayList<>();
    private FetchCommandlineFuCommandsAsyncTask mAsync;
    private boolean mIsSearching = false;
    private ArrayList mSelectedItems;
    private int mFetchedCommandlineFuPages = 0;
    private Realm mRealm;
    private ExpandableListView mList;
    private ScriptsExpandableListAdapter mAdapter;

    public ScriptsFragment()
    {
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);

        mRealm = Realm.getInstance(getContext());

        mAdapter = createAdapter();

        mFetchedCommandlineFuPages = mRealm.where(CommandGroupModel.class).equalTo("category", ScriptsExpandableListAdapter.GROUP_COMMANDLINEFU).findAll().size()/25;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_scripts, container, false);

        // init listview
        mList = (ExpandableListView) view.findViewById(R.id.fragment_scripts_elv);
        mList.setAdapter(mAdapter);
        mList.setOnChildClickListener(this);
        mList.setOnScrollListener(this);

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
        // check if commandlineFu mGroup is expanded AND user is currently not searching
        if (mList.isGroupExpanded(ScriptsExpandableListAdapter.GROUP_COMMANDLINEFU) && !mIsSearching) {

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
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?mId=" + appPackageName)));
        } catch (android.content.ActivityNotFoundException anfe) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?mId=" + appPackageName)));
        }
    }

    /**
     * @return
     */
    private ScriptsExpandableListAdapter createAdapter()
    {
        // get raw commands file
        InputStream inputStream = getResources().openRawResource(R.raw.commands);

        // convert file to arraylist
        try {
            mRealm.beginTransaction();
            mRealm.createOrUpdateAllFromJson(CommandGroupModel.class, inputStream);
            mRealm.commitTransaction();
        } catch (IOException e) {
            e.printStackTrace();
        }

        RealmResults<CommandGroupModel> commandsAll = mRealm.where(CommandGroupModel.class).findAll();
        commandsAll.sort("votes", Sort.DESCENDING);

        // command categories
        mGroup.add(getString(R.string.system_info));
        mChilds.add(new ArrayList<CommandGroupModel>());
        mGroup.add(getString(R.string.system_control));
        mChilds.add(new ArrayList<CommandGroupModel>());
        mGroup.add(getString(R.string.audio_video));
        mChilds.add(new ArrayList<CommandGroupModel>());
        mGroup.add("http://www.commandlinefu.com/");
        mChilds.add(new ArrayList<CommandGroupModel>());

        // sort commands by mCategory
        for (CommandGroupModel command : commandsAll) {
            if (command.getCategory() == ScriptsExpandableListAdapter.GROUP_INFO) {
                mChilds.get(ScriptsExpandableListAdapter.GROUP_INFO).add(command);
            } else if (command.getCategory() == ScriptsExpandableListAdapter.GROUP_SYSTEM_CONTROL) {
                mChilds.get(ScriptsExpandableListAdapter.GROUP_SYSTEM_CONTROL).add(command);
            } else if (command.getCategory() == ScriptsExpandableListAdapter.GROUP_AUDIO_VIDEO) {
                mChilds.get(ScriptsExpandableListAdapter.GROUP_AUDIO_VIDEO).add(command);
            } else if (command.getCategory() == ScriptsExpandableListAdapter.GROUP_COMMANDLINEFU) {
                mChilds.get(ScriptsExpandableListAdapter.GROUP_COMMANDLINEFU).add(command);
            }
        }

        return new ScriptsExpandableListAdapter(getActivity(), mGroup, mChilds);
    }

    /**
     * fetch next page(25 items)
     */
    private void fetchCommandsFromCommandlineFu()
    {
        // check if is not already fetching
        if (mAsync == null
                || mAsync.getStatus() == AsyncTask.Status.FINISHED) {
            mAdapter.setLoading();
            mAsync = new FetchCommandlineFuCommandsAsyncTask(
                    getContext(), this, mFetchedCommandlineFuPages);
            addAsyncTask(mAsync);
            mAsync.execute();
            mFetchedCommandlineFuPages++;
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
                // Specify the mList array, the items to be selected by default (null for none),
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
     * reset mAdapter entries
     */
    private void resetSearchResults()
    {
        mAdapter.updateEntries("", mGroup, mChilds);
        mIsSearching = false;
    }

    /**
     * search for query in all commands and update mAdapter
     *
     * @param query search query
     */
    private void search(String query)
    {
        ArrayList<ArrayList<CommandGroupModel>> entries = new ArrayList<>();
        // loop through all groups
        for (ArrayList<CommandGroupModel> childGroup : mChilds) {
            ArrayList<CommandGroupModel> newChildGroup = new ArrayList<>();
            for (CommandGroupModel child : childGroup) {
                // check if command OR description contains query
                if (CommandGroupModel.getDescString(child, getActivity()).toLowerCase().contains(query.toLowerCase())) {
                    newChildGroup.add(child);
                }
            }
            entries.add(newChildGroup);
        }
        mAdapter.updateEntries(query, mGroup, entries);

        mIsSearching = true;
    }

    @Override
    public void onFetchedCommandlineFuCommands(ArrayList<CommandGroupModel> commands)
    {
        if (!isAdded()) {
            return;
        }

        RealmResults<CommandGroupModel> commandsAll = mRealm.where(CommandGroupModel.class).equalTo("category", ScriptsExpandableListAdapter.GROUP_COMMANDLINEFU).findAll();
        commandsAll.sort("votes", Sort.DESCENDING);

        mAdapter.updateEntries(ScriptsExpandableListAdapter.GROUP_COMMANDLINEFU, commandsAll);
        mAdapter.setLoadingFinished();
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
