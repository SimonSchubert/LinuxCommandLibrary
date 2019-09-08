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
class AboutFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnBimo.setOnClickListener { startAppMarketActivity(Constants.PACKAGE_BIMO) }
        btnOrcgenocide.setOnClickListener { startAppMarketActivity(Constants.PACKAGE_ORCGENOCIDE) }
        btnAncientGenocide.setOnClickListener { startAppMarketActivity(Constants.PACKAGE_ANCIENTGENOCIDE) }
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
        } catch (e: ActivityNotFoundException) {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=$appPackageName")))
        }
    }
}
