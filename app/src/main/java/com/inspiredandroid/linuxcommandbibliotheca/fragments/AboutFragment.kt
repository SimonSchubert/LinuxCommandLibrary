package com.inspiredandroid.linuxcommandbibliotheca.fragments

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.misc.Constants
import com.inspiredandroid.linuxcommandbibliotheca.misc.showPlayStoreActivity
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

        btnBraincup.setOnClickListener { context?.showPlayStoreActivity(Constants.PACKAGE_BRAINCUP) }
        btnOrcgenocide.setOnClickListener { context?.showPlayStoreActivity(Constants.PACKAGE_ORCGENOCIDE) }
        btnAncientGenocide.setOnClickListener { context?.showPlayStoreActivity(Constants.PACKAGE_ANCIENTGENOCIDE) }
        btnQuiz.setOnClickListener { context?.showPlayStoreActivity(Constants.PACKAGE_QUIZ) }
        btnRemote.setOnClickListener { context?.showPlayStoreActivity(Constants.PACKAGE_LINUXREMOTE) }
        btnRate.setOnClickListener { context?.showPlayStoreActivity(Constants.PACKAGE_COMMANDLIBRARY) }
        btnIcons8.setOnClickListener { showIcons8Website() }
    }

    private fun showIcons8Website() {
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.icons8.com"))
            startActivity(intent)
        } catch (ignored: ActivityNotFoundException) {
        }
    }
}
