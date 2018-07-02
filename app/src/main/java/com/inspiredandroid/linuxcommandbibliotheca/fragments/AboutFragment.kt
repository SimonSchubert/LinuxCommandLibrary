package com.inspiredandroid.linuxcommandbibliotheca.fragments

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.misc.Constants
import kotlinx.android.synthetic.main.fragment_about.*

/**
 * Created by Simon Schubert on 23.11.15.
 * Talk about the App, Licenses and other projects
 */
class AboutFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnBimo.setOnClickListener { startAppMarketActivity(Constants.PACKAGE_BIMO) }
        btnOrcgenocide.setOnClickListener { startAppMarketActivity(Constants.PACKAGE_ORCGENOCIDE) }
        btnQuiz.setOnClickListener { startAppMarketActivity(Constants.PACKAGE_QUIZ) }
        btnRemote.setOnClickListener { startAppMarketActivity(Constants.PACKAGE_LINUXREMOTE) }
        btnRate.setOnClickListener { startAppMarketActivity(Constants.PACKAGE_COMMANDLIBRARY) }
        btnIcons8.setOnClickListener { openIcons8Website() }
    }

    private fun openIcons8Website() {
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.icons8.com"))
            startActivity(intent)
        } catch (ignored: ActivityNotFoundException) {
        }
    }

    /**
     * Show app in the Play Store. If Play Store is not installed, show it in the browser instead.
     *
     * @param appPackageName package mName
     */
    private fun startAppMarketActivity(appPackageName: String) {
        try {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$appPackageName")))
        } catch (e: android.content.ActivityNotFoundException) {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=$appPackageName")))
        }
    }
}
