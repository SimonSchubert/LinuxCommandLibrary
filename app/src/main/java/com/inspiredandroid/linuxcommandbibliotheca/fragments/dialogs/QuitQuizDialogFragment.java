package com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

import com.inspiredandroid.linuxcommandbibliotheca.R;

/**
 * Created by Simon Schubert
 */
public class QuitQuizDialogFragment extends DialogFragment {

    public static QuitQuizDialogFragment getInstance() {
        return new QuitQuizDialogFragment();
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getContext()).setMessage(R.string.fragment_quiz_quit_dialog_text)
                .setPositiveButton(R.string.yes, (dialog, id) -> getActivity().finish())
                .setNegativeButton(R.string.no, null).create();
    }
}
