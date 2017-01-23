package com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.adapter.CommandDetailAdapter;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Realm;

/**
 * Created by Simon Schubert
 */
public class ScriptDetailDialogFragment extends DialogFragment {

    private final static String EXTRA_KEY_ID = "EXTRA_KEY_ID";

    @BindView(R.id.fragment_scriptdetail_tv_title)
    TextView tvTitle;
    @BindView(R.id.fragment_scriptdetail_lv_list)
    ListView listView;

    private Realm mRealm;

    public static ScriptDetailDialogFragment getInstance(int id) {
        ScriptDetailDialogFragment fragment = new ScriptDetailDialogFragment();

        Bundle arguments = new Bundle();
        arguments.putInt(EXTRA_KEY_ID, id);
        fragment.setArguments(arguments);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mRealm = Realm.getDefaultInstance();
    }

    /**
     * The system calls this to get the DialogFragment's layout, regardless
     * of whether it's being displayed as a dialog or an embedded fragment.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scriptdetail, container, false);

        ButterKnife.bind(this, view);

        int id = getArguments().getInt(EXTRA_KEY_ID, -1);

        CommandGroupModel commandGroupModel = mRealm.where(CommandGroupModel.class).equalTo(CommandGroupModel.COLUMN_ID, id).findFirst();
        String description = CommandGroupModel.getDescString(commandGroupModel, getContext());

        CommandDetailAdapter adapter = new CommandDetailAdapter(getActivity(), commandGroupModel);
        listView.setAdapter(adapter);

        tvTitle.setText(description);

        return view;
    }

    /**
     * The system calls this only when creating the layout in a dialog.
     */
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        return dialog;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        mRealm.close();
    }
}
