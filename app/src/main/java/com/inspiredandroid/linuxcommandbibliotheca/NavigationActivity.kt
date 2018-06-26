package com.inspiredandroid.linuxcommandbibliotheca

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.inspiredandroid.linuxcommandbibliotheca.fragments.BasicCategoryFragment
import com.inspiredandroid.linuxcommandbibliotheca.fragments.CommandsFragment
import com.inspiredandroid.linuxcommandbibliotheca.fragments.DatabaseLoadingFragment
import com.inspiredandroid.linuxcommandbibliotheca.fragments.TipsFragment
import com.inspiredandroid.linuxcommandbibliotheca.misc.AppManager
import kotlinx.android.synthetic.main.activity_navigation.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

/**
 * Created by Simon Schubert
 *
 *
 * This Activity just holds the NavigationFragmentFragment
 */
class NavigationActivity : AppCompatActivity() {

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener() {
        when (it.itemId) {
            R.id.navigation_commands -> {
                showFragment(COMMANDS)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_basics -> {
                showFragment(BASIC)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_tips -> {
                showFragment(TIPS)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        setSupportActionBar(toolbar)

        if (savedInstanceState == null) {
            if (AppManager.missingDatabase(this)) {
                showLoadingFragment()
                doAsync {
                    AppManager.createDatabase(applicationContext)
                    AppManager.setDatabaseVersionUpToDate(applicationContext)
                    uiThread {
                        showFragment(COMMANDS)
                        navigation.visibility = View.VISIBLE
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

        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment).commitAllowingStateLoss()
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
        val COMMANDS = 0
        val BASIC = 1
        val TIPS = 2
    }
}
