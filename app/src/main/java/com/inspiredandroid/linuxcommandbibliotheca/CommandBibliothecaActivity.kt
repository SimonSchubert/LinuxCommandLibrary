package com.inspiredandroid.linuxcommandbibliotheca

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Toast
import com.inspiredandroid.linuxcommandbibliotheca.fragments.BasicGroupsFragment
import com.inspiredandroid.linuxcommandbibliotheca.fragments.CommandsFragment
import com.inspiredandroid.linuxcommandbibliotheca.fragments.DatabaseLoadingFragment
import com.inspiredandroid.linuxcommandbibliotheca.fragments.TipsFragment
import kotlinx.android.synthetic.main.activity_commandbibliotheca.*

/**
 * Created by Simon Schubert
 *
 *
 * This Activity just holds the NavigationFragmentFragment
 */
class CommandBibliothecaActivity : LoadingBaseActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener() {
        when (it.itemId) {
            R.id.navigation_commands -> {
                startFragment(COMMANDS)
            }
            R.id.navigation_basics -> {
                startFragment(BASIC)
            }
            R.id.navigation_tips -> {
                startFragment(TIPS)
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_commandbibliotheca)

        setSupportActionBar(toolbar)

        if (savedInstanceState == null) {
            showLoadingFragment()
        } else {
            val title = savedInstanceState.getCharSequence("title")
            setTitle(title)
        }

        activity_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putCharSequence("title", title)
        super.onSaveInstanceState(outState)
    }

    private fun startFragment(id: Int) {
        var fragment: Fragment? = null
        when (id) {
            COMMANDS -> {
                fragment = CommandsFragment()
                setTitle(R.string.fragment_bibliotheca_commands)
            }
            BASIC -> {
                fragment = BasicGroupsFragment()
                setTitle(R.string.fragment_bibliotheca_basic)
            }
            TIPS -> {
                fragment = TipsFragment()
                setTitle(R.string.tip)
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
        activity_navigation.visibility = View.GONE
    }

    override fun onDatabaseCreateSuccess() {
        if (isFinishing) {
            return
        }
        startFragment(COMMANDS)
        activity_navigation.visibility = View.VISIBLE
    }

    override fun onDatabaseCreateFail() {
        Toast.makeText(baseContext, R.string.fragment_datanase_loading_failed_craftin_database, Toast.LENGTH_LONG).show()
    }

    companion object {
        val COMMANDS = 0
        val BASIC = 1
        val TIPS = 2
    }
}
