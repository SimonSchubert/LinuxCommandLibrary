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
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils

/**
 * Created by Simon Schubert on 23.11.15.
 * Talk about the App, Licenses and other projects
 */
class AboutFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    // @OnClick(R.id.fragment_about_tv_icons8)
    fun startIcons8() {
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.icons8.com"))
            startActivity(intent)
        } catch (ignored: ActivityNotFoundException) {
        }
    }

    // @OnClick(R.id.fragment_about_btn_bimo)
    fun startBimo() {
        startAppMarketActivity(Utils.PACKAGE_BIMO)
    }

    // @OnClick(R.id.fragment_about_btn_orcgenocide)
    fun startOrcGenocide() {
        startAppMarketActivity(Utils.PACKAGE_ORCGENOCIDE)
    }

    // @OnClick(R.id.fragment_about_btn_quiz)
    fun startQuiz() {
        startAppMarketActivity(Utils.PACKAGE_QUIZ)
    }

    // @OnClick(R.id.fragment_about_btn_remote)
    fun startRemote() {
        startAppMarketActivity(Utils.PACKAGE_LINUXREMOTE)
    }

    // @OnClick(R.id.fragment_about_btn_burger)
    fun startBurger() {
        startAppMarketActivity(Utils.PACKAGE_BURGER)
    }

    // @OnClick(R.id.fragment_about_btn_rate)
    fun startRateActivity() {
        startAppMarketActivity(Utils.PACKAGE_COMMANDLIBRARY)
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
