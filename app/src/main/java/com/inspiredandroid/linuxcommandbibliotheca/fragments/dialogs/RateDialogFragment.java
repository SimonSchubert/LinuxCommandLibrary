package com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;
import com.inspiredandroid.linuxcommandbibliotheca.misc.AppManager;

/**
 * Created by Simon Schubert
 */
public class RateDialogFragment extends DialogFragment {

    public static RateDialogFragment getInstance() {
        return new RateDialogFragment();
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getContext())
                .setTitle(R.string.rate_title)
                .setMessage(R.string.rate_message)
                .setPositiveButton(R.string.rate_rate_now, (dialogInterface, i) -> startAppMarketActivity())
                .setNeutralButton(R.string.rate_later, null)
                .setNegativeButton(R.string.rate_no_thanks, (dialogInterface, i) -> AppManager.disableRateDialog(getContext())).create();
    }

    private void startAppMarketActivity() {
        final String appPackageName = Utils.PACKAGE_COMMANDLIBRARY;
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
        } catch (android.content.ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
        }
    }
}
