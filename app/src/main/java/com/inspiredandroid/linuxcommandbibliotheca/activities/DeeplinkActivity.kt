package com.inspiredandroid.linuxcommandbibliotheca.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.fragments.DatabaseLoadingFragment
import com.inspiredandroid.linuxcommandbibliotheca.misc.AppManager
import com.inspiredandroid.linuxcommandbibliotheca.models.Command
import io.realm.Realm
import io.realm.kotlin.where
import kotlinx.android.synthetic.main.toolbar.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

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
class DeeplinkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_deeplink)
        setSupportActionBar(toolbar)

        if (AppManager.isDatabaseMissing(this)) {
            showLoadingFragment()
            doAsync {

                AppManager.createDatabase(applicationContext)
                AppManager.setDatabaseVersionUpToDate(applicationContext)
                uiThread {
                    handleIntent()
                }
            }
        } else {
            handleIntent()
        }
    }

    private fun handleIntent() {
        var commandId: Long = -1
        val data = intent.dataString
        if (intent.action == Intent.ACTION_VIEW && data != null) {
            val urlFileName = data.substring(data.lastIndexOf("/") + 1)
            if (urlFileName.count() > 5) {
                val commandName = urlFileName.substring(0, urlFileName.length - 5)
                val realm = Realm.getDefaultInstance()
                val command = realm.where<Command>().equalTo(Command.NAME, commandName).findFirst()
                if (command != null) {
                    commandId = command.id.toLong()
                }
                realm.close()
            }
        }

        if (commandId != -1L) {
            val intent = Intent(this, CommandManActivity::class.java)
            intent.putExtra(CommandManActivity.EXTRA_COMMAND_ID, commandId)
            startActivity(intent)
        } else {
            Toast.makeText(this, R.string.fragment_datanase_loading_failed_craftin_database, Toast.LENGTH_SHORT).show()
        }
        finish()
    }

    /**
     *
     */
    private fun showLoadingFragment() {
        val fragment = DatabaseLoadingFragment()
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commitAllowingStateLoss()
    }
}
