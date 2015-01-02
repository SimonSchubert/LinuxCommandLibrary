package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageButton;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.inspiredandroid.linuxcommandbibliotheca.CommandBibliothecaActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.adapter.CommandsExpandableListAdapter;
import com.inspiredandroid.linuxcommandbibliotheca.asnytasks.FetchCommandlineFuCommandsAsync;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.FetchedCommandlineFuCommands;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandChildModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandLineFuModel;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by simon on 13.06.14.
 */
public class BibliothecaFragment extends Fragment implements View.OnClickListener, FetchedCommandlineFuCommands, AbsListView.OnScrollListener {

    EditText etSearch;
    ExpandableListView list;
    CommandsExpandableListAdapter adapter;

    ArrayList<ArrayList<CommandGroupModel>> childs = new ArrayList<ArrayList<CommandGroupModel>>();
    ArrayList<String> group = new ArrayList<String>();

    FetchCommandlineFuCommandsAsync async;
    int fetchedCommandlineFuPages = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bibliotheca, container, false);

        initAdapter();

        initViews(view);

        fetchCommandsFromCommandlineFu();

        return view;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnFilter) {
            showFilterDialog();
        } else if(view.getId() == R.id.ivAdd) {
            handleAddClick();
        }
    }

    private void handleAddClick() {
        final String appPackageName = "com.inspiredandroid.linuxcontrolcenter";
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
        } catch (android.content.ActivityNotFoundException anfe) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
        }
    }

    @Override
    public void onScrollStateChanged(AbsListView absListView, int i) {

    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem,
                         int visibleItemCount, int totalItemCount) {

        // check if commandlineFu group is expanded AND user is currently not searching
        if (list.isGroupExpanded(CommandsExpandableListAdapter.GROUP_COMMANDLINEFU) && "".equals(etSearch.getText().toString())) {

            // check if is last item
            if (firstVisibleItem + visibleItemCount == totalItemCount) {
                fetchCommandsFromCommandlineFu();
            }
        }
    }

    private void initAdapter() {
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
                childs.get(CommandsExpandableListAdapter.GROUP_INFO).add(command);
            } else if (command.getCategory() == 1) {
                childs.get(CommandsExpandableListAdapter.GROUP_SYSTEM_CONTROL).add(command);
            } else if (command.getCategory() == 2) {
                childs.get(CommandsExpandableListAdapter.GROUP_AUDIO_VIDEO).add(command);
            }
        }

        // init list adapter
        adapter = new CommandsExpandableListAdapter(getActivity(), group, childs);
    }

    /**
     * @param view
     */
    private void initViews(View view) {

        list = (ExpandableListView) view.findViewById(R.id.expandableListView);
        list.setAdapter(adapter);
        list.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long l) {

                final CommandGroupModel commandGroupModel = (CommandGroupModel) view.getTag(R.id.ID);
                Context context = view.getContext();

                String iconBase64 = Utils.getBase64StringByResourceName(context, commandGroupModel.getIconResource());
                commandGroupModel.setIconBase64(iconBase64);

                int size = commandGroupModel.getCommands().size();
                if(size > 1) {
                    // returnResult(data);
                    CharSequence[] commands = new CharSequence[size];
                    for (int x = 0; x < size; x++) {
                        CommandChildModel child = commandGroupModel.getCommands().get(x);
                        commands[x] = child.getCommand();
                    }

                    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    builder.setTitle("Choose command")
                            .setItems(commands, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {

                                    handleCommandClick(commandGroupModel, which);
                                }
                            });
                    Dialog dialog = builder.create();
                    dialog.show();
                } else {
                    handleCommandClick(commandGroupModel, 0);
                }

                return true;
            }
        });
        list.setOnScrollListener(this);

        view.findViewById(R.id.ivAdd).setOnClickListener(this);

        etSearch = (EditText) view.findViewById(R.id.etSearch);
        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String query = editable.toString();
                if (query.length() > 0) {
                    search(query);
                } else {
                    resetSearchResults();
                }
            }
        });

        ImageButton btnFilter = (ImageButton) view.findViewById(R.id.btnFilter);
        btnFilter.setVisibility(View.GONE);
        btnFilter.setOnClickListener(this);
    }

    private void handleCommandClick(CommandGroupModel commandGroupModel, int position) {
        /*
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, commandGroupModel.getCommands().get(position).getCommand());
        startActivity(Intent.createChooser(sharingIntent, getResources().getString(R.string.send_command)));
        */
        Intent data = new Intent();
        data.putExtra(CommandBibliothecaActivity.EXTRA_COMMAND, commandGroupModel.getCommands().get(position).getCommand());
        data.putExtra(CommandBibliothecaActivity.EXTRA_ICON, commandGroupModel.getIconBase64());

        returnResult(data);
    }

    /**
     * fetch next page(25 items)
     */
    private void fetchCommandsFromCommandlineFu() {
        // check if is not already fetching
        if (async == null
                || async.getStatus() == AsyncTask.Status.FINISHED) {
            adapter.setLoading();
            async = new FetchCommandlineFuCommandsAsync(
                    getActivity(), this, fetchedCommandlineFuPages);
            async.execute();
            fetchedCommandlineFuPages++;
        }
    }


    ArrayList mSelectedItems;
    private void showFilterDialog() {

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
                                                boolean isChecked) {
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
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                    }
                })
                .setNegativeButton("Reset", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    /**
     * reset adapter entries
     */
    private void resetSearchResults() {
        adapter.updateEntries(group, childs);
    }

    /**
     * search for query in all commands and update adapter
     *
     * @param query
     */
    private void search(String query) {
        ArrayList<ArrayList<CommandGroupModel>> entries = new ArrayList<ArrayList<CommandGroupModel>>();
        // loop through all groups
        for (ArrayList<CommandGroupModel> childGroup : childs) {
            ArrayList<CommandGroupModel> newChildGroup = new ArrayList<CommandGroupModel>();
            for (CommandGroupModel child : childGroup) {
                // check if command OR description contains query
                if (child.getDesc(getActivity()).toLowerCase().contains(query.toLowerCase())) {
                    newChildGroup.add(child);
                }
            }
            entries.add(newChildGroup);
        }
        adapter.updateEntries(group, entries);
    }

    /**
     *
     */
    private void returnResult(Intent data) {
        Activity activity = getActivity();
        if (activity != null) {
            activity.setResult(Activity.RESULT_OK, data);
            activity.finish();
        }
    }

    @Override
    public void onFetchedCommandlineFuCommands(ArrayList<CommandLineFuModel> commandLineFuModels) {
        ArrayList<CommandGroupModel> commands = new ArrayList<CommandGroupModel>();
        // convert commandlinefu json models to linux command bibliotheca
        for (CommandLineFuModel command : commandLineFuModels) {
            commands.add(new CommandGroupModel(command.getCommand(), command.getSummary()));
        }
        adapter.addEntries(CommandsExpandableListAdapter.GROUP_COMMANDLINEFU, commands);
        adapter.setLoadingFinished();
    }
}
