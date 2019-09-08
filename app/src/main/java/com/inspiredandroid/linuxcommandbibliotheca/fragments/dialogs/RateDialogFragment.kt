package com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs

import android.app.Dialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v7.app.AlertDialog
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.misc.AppManager
import com.inspiredandroid.linuxcommandbibliotheca.misc.Constants

/* Copyright 2019 Simon Schubert
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
class RateDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
                .setTitle(R.string.dialog_rate_title)
                .setMessage(R.string.dialog_rate_message)
                .setPositiveButton(R.string.dialog_rate_rate_now) { _, _ -> startAppMarketActivity() }
                .setNeutralButton(R.string.dialog_rate_later, null)
                .setNegativeButton(R.string.dialog_rate_no_thanks) { _, _ -> AppManager.disableRateDialog(context) }.create()
    }

    private fun startAppMarketActivity() {
        val appPackageName = Constants.PACKAGE_COMMANDLIBRARY
        try {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?position=$appPackageName")))
        } catch (e: android.content.ActivityNotFoundException) {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?position=$appPackageName")))
        }
    }

    companion object {

        val instance: RateDialogFragment
            get() = RateDialogFragment()
    }
}
