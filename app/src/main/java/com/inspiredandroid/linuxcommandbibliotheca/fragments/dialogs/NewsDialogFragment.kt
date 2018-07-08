package com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs

import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v7.app.AlertDialog
import com.inspiredandroid.linuxcommandbibliotheca.R

/**
 * Created by Simon Schubert
 */
class NewsDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
                .setTitle("Update")
                .setView(R.layout.fragment_new)
                .setPositiveButton(R.string.dialog_ok) { _, _ -> }.create()
    }

    companion object {

        val instance: NewsDialogFragment
            get() = NewsDialogFragment()
    }
}