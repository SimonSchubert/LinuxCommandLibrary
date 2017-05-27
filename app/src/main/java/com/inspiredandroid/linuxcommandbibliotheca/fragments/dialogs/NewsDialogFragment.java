package com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.inspiredandroid.linuxcommandbibliotheca.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Simon Schubert
 */
public class NewsDialogFragment extends DialogFragment {

    public static NewsDialogFragment getInstance() {
        return new NewsDialogFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new, container, false);

        ButterKnife.bind(this, view);

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

    @OnClick(R.id.fragment_news_btn_ok)
    public void close() {
        try {
            dismissAllowingStateLoss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @OnClick(R.id.fragment_news_btn_share)
    public void share() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "https://itunes.apple.com/us/app/linux-command-library/id1219649976");
        startActivity(intent);
    }
}