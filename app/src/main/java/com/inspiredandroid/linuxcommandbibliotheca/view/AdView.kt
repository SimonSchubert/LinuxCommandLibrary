package com.inspiredandroid.linuxcommandbibliotheca.view

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet
import android.view.View
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils

/**
 * Created by simon on 23/01/17.
 */
class AdView : AppCompatImageView {

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    private fun init() {
        // Hide ads if remote is already installed
        if (Utils.isAppInstalled(context, Utils.PACKAGE_LINUXREMOTE) || Utils.isAppInstalled(context, Utils.PACKAGE_LINUXREMOTE_PRO)) {
            visibility = View.GONE
        } else {
            setOnClickListener { view -> startRemoteControl() }
        }
    }

    private fun startRemoteControl() {
        val appPackageName = Utils.PACKAGE_LINUXREMOTE
        try {
            context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$appPackageName")))
        } catch (anfe: android.content.ActivityNotFoundException) {
            context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=$appPackageName")))
        }

    }
}
