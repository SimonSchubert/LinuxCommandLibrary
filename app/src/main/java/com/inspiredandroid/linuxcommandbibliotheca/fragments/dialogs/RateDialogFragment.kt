package com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs

import android.app.Dialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v7.app.AlertDialog

import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.misc.AppManager
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils

/**
 * Created by Simon Schubert
 */
class RateDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        context?.let {
            return AlertDialog.Builder(it)
                    .setTitle(R.string.dialog_rate_title)
                    .setMessage(R.string.dialog_rate_message)
                    .setPositiveButton(R.string.dialog_rate_rate_now) { _, _ -> startAppMarketActivity() }
                    .setNeutralButton(R.string.dialog_rate_later, null)
                    .setNegativeButton(R.string.dialog_rate_no_thanks) { _, _ -> AppManager.disableRateDialog(context) }.create()
        }
        return super.onCreateDialog(savedInstanceState)
    }

    private fun startAppMarketActivity() {
        val appPackageName = Utils.PACKAGE_COMMANDLIBRARY
        try {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$appPackageName")))
        } catch (e: android.content.ActivityNotFoundException) {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=$appPackageName")))
        }
    }

    companion object {

        val instance: RateDialogFragment
            get() = RateDialogFragment()
    }
}
