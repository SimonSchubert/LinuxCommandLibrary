package com.inspiredandroid.linuxcommandbibliotheca

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.inspiredandroid.linuxcommandbibliotheca.fragments.CommandManFragment
import kotlinx.android.synthetic.main.toolbar.*

/**
 * Created by Simon Schubert
 *
 *
 * This Activity tries to get a command based on different opening types and starts a
 * CommandManFragment if successfully fetched or finishes immediately
 */
class CommandManActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_command_man)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        showFragment()
    }

    fun showFragment() {
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
        val EXTRA_COMMAND_ID = "EXTRA_COMMAND_ID"

        internal val INVALID = -1
    }
}
