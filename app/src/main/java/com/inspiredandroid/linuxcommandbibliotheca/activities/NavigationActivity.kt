package com.inspiredandroid.linuxcommandbibliotheca.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.fragments.BasicCategoryFragment
import com.inspiredandroid.linuxcommandbibliotheca.fragments.CommandsFragment
import com.inspiredandroid.linuxcommandbibliotheca.fragments.DatabaseLoadingFragment
import com.inspiredandroid.linuxcommandbibliotheca.fragments.TipsFragment
import com.inspiredandroid.linuxcommandbibliotheca.misc.AppManager
import kotlinx.android.synthetic.main.activity_navigation.*
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
class NavigationActivity : AppCompatActivity() {

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {
        when (it.itemId) {
            R.id.navigation_commands -> {
                showFragment(COMMANDS)
                true
            }
            R.id.navigation_basics -> {
                showFragment(BASIC)
                true
            }
            R.id.navigation_tips -> {
                showFragment(TIPS)
                true
            }
            else -> false
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_navigation)
        setSupportActionBar(toolbar)

        if (savedInstanceState == null) {
            if (AppManager.isDatabaseMissing(this) || !AppManager.isDatabaseVersionUpToDate(this)) {
                showLoadingFragment()
                doAsync {
                    AppManager.createDatabase(applicationContext)
                    AppManager.setDatabaseVersionUpToDate(applicationContext)
                    uiThread {
                        showFragment(COMMANDS)
                        navigation?.visibility = View.VISIBLE
                    }
                }
            } else {
                if (intent.action == Intent.ACTION_VIEW && intent.dataString != null) {
                    showFragment(TIPS)
                    navigation.selectedItemId = R.id.navigation_tips
                } else {
                    showFragment(COMMANDS)
                }
            }
        }

        navigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }

    private fun showFragment(id: Int) {
        var fragment: Fragment? = null
        when (id) {
            COMMANDS -> {
                fragment = CommandsFragment()
            }
            BASIC -> {
                fragment = BasicCategoryFragment()
            }
            TIPS -> {
                fragment = TipsFragment()
            }
        }

        fragment?.let {
            val fragmentManager = supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment).commitAllowingStateLoss()
        }
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
        navigation.visibility = View.GONE
    }

    companion object {
        const val COMMANDS = 0
        const val BASIC = 1
        const val TIPS = 2
    }
}
