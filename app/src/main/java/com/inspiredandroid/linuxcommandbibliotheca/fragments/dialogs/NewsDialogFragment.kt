package com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs

import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import com.inspiredandroid.linuxcommandbibliotheca.R
import kotlinx.android.synthetic.main.fragment_new.*

/**
 * Created by Simon Schubert
 */
class NewsDialogFragment : DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_new, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragment_news_btn_ok.setOnClickListener {
            try {
                dismissAllowingStateLoss()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    /**
     * The system calls this only when creating the layout in a dialog.
     */
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        return dialog
    }

    companion object {

        val instance: NewsDialogFragment
            get() = NewsDialogFragment()
    }
}