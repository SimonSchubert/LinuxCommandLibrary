package com.inspiredandroid.linuxcommandbibliotheca

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
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
class CommandManActivity : AppCompatActivity() {

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

        val id = b?.getLong(CommandManActivity.EXTRA_COMMAND_ID, CommandManActivity.INVALID.toLong())
                ?: CommandManActivity.INVALID.toLong()

        val fragment = CommandManFragment()
        val bundle = Bundle()
        bundle.putLong(CommandManActivity.EXTRA_COMMAND_ID, id)
        fragment.arguments = bundle

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commitAllowingStateLoss()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {
        const val EXTRA_COMMAND_ID = "EXTRA_COMMAND_ID"

        internal const val INVALID = -1
    }
}
