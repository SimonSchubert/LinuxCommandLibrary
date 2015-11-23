package com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.adapter.CommandDetailAdapter;

import java.util.ArrayList;

/**
 * Created by Simon Schubert
 */
public class ScriptDetailDialogFragment extends DialogFragment {

    private final static String EXTRA_KEY_COMMANDS = "EXTRA_KEY_COMMANDS";
    private final static String EXTRA_KEY_DESCRIPTION = "EXTRA_KEY_DESCRIPTION";

    ArrayList<String> commands;
    String description;

    public static ScriptDetailDialogFragment getInstance(ArrayList<String> commands, String description)
    {
        ScriptDetailDialogFragment fragment = new ScriptDetailDialogFragment();

        Bundle arguments = new Bundle();
        arguments.putStringArrayList(EXTRA_KEY_COMMANDS, commands);
        arguments.putString(EXTRA_KEY_DESCRIPTION, description);
        fragment.setArguments(arguments);

        return fragment;
    }

    /**
     * The system calls this to get the DialogFragment's layout, regardless
     * of whether it's being displayed as a dialog or an embedded fragment.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_scriptdetail, container, false);

        commands = getArguments().getStringArrayList(EXTRA_KEY_COMMANDS);
        description = getArguments().getString(EXTRA_KEY_DESCRIPTION);

        CommandDetailAdapter adapter = new CommandDetailAdapter(getActivity(), commands);
        ListView listView = (ListView) view.findViewById(R.id.fragment_scriptdetail_lv_list);
        listView.setAdapter(adapter);

        TextView tvTitle = (TextView) view.findViewById(R.id.fragment_scriptdetail_tv_title);
        tvTitle.setText(description);

        return view;
    }

    /**
     * The system calls this only when creating the layout in a dialog.
     */
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        // The only reason you might override this method when using onCreateView() is
        // to modify any dialog characteristics. For example, the dialog includes a
        // title by default, but your custom layout might not need it. So here you can
        // remove the dialog title, but you must call the superclass to get the Dialog.
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        return dialog;
    }

}
