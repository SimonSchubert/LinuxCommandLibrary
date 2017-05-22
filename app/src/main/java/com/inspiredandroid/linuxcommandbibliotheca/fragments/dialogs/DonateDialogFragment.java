package com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.misc.AppManager;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;

/**
 * Created by Simon Schubert
 */
public class DonateDialogFragment extends DialogFragment {

    public static DonateDialogFragment getInstance() {
        return new DonateDialogFragment();
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getContext())
                .setTitle("Advertising deactivated")
                .setMessage("Please consider donating via PayPal/Bitcoin or writing a review in the Play Store. Thanks.")
                .setPositiveButton("Ok", (dialog, which) -> {}).create();
    }

}
