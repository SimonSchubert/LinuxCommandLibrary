package com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs

import android.app.Dialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import com.inspiredandroid.linuxcommandbibliotheca.R

/**
 * Created by Simon Schubert
 */
class NewsDialogFragment : DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_new, container, false)
    }

    /**
     * The system calls this only when creating the layout in a dialog.
     */
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        return dialog
    }

    // @OnClick(R.id.fragment_news_btn_ok)
    fun close() {
        try {
            dismissAllowingStateLoss()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    // @OnClick(R.id.fragment_news_btn_share)
    fun share() {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "https://itunes.apple.com/us/app/linux-command-library/id1219649976")
        try {
            startActivity(intent)
        } catch (ignored: ActivityNotFoundException) {
        }
    }

    companion object {

        val instance: NewsDialogFragment
            get() = NewsDialogFragment()
    }
}