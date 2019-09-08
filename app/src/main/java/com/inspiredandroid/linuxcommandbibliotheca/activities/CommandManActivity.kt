package com.inspiredandroid.linuxcommandbibliotheca.activities

import android.os.Bundle
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.fragments.CommandManFragment
import kotlinx.android.synthetic.main.toolbar.*

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
class CommandManActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_command_man)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        showFragment()
    }

    private fun showFragment() {
        val intent = intent
        val b = intent.extras

        val id = b?.getLong(EXTRA_COMMAND_ID, INVALID.toLong())
                ?: INVALID.toLong()

        val fragment = CommandManFragment()
        val bundle = Bundle()
        bundle.putLong(EXTRA_COMMAND_ID, id)
        fragment.arguments = bundle

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commitAllowingStateLoss()
    }

    companion object {
        const val EXTRA_COMMAND_ID = "EXTRA_COMMAND_ID"

        internal const val INVALID = -1
    }
}
