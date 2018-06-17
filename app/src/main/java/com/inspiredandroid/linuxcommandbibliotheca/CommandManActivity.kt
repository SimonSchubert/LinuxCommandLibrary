package com.inspiredandroid.linuxcommandbibliotheca

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.inspiredandroid.linuxcommandbibliotheca.fragments.CommandManFragment
import com.inspiredandroid.linuxcommandbibliotheca.fragments.DatabaseLoadingFragment
import com.inspiredandroid.linuxcommandbibliotheca.models.Command
import io.realm.Realm

/**
 * Created by Simon Schubert
 *
 *
 * This Activity tries to get a command based on different opening types and starts a
 * CommandManFragment if successfully fetched or finishes immediately
 */
class CommandManActivity : LoadingBaseActivity() {
    private var mId = INVALID.toLong()
    private var mName = ""
    private var mCategory = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_command_man)

        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        assert(supportActionBar != null)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        if (savedInstanceState == null) {
            showLoadingFragment()
        } else {
            val title = savedInstanceState.getCharSequence("title")
            setTitle(title)
        }

        handleIntent()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> this.finish()
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putCharSequence("title", title)
        super.onSaveInstanceState(outState)
    }

    /**
     * Start man fragment based on the intent data
     */
    private fun handleIntent() {
        val intent = intent
        val b = intent.extras

        mId = b?.getLong(EXTRA_COMMAND_ID, INVALID.toLong()) ?: INVALID.toLong()
        mName = if (b != null) b.getString(EXTRA_COMMAND_NAME, "") else ""

        val action = intent.action
        val data = intent.dataString
        if (Intent.ACTION_VIEW == action && data != null) {
            val commandId = data.substring(data.lastIndexOf("/") + 1)
            mName = commandId.substring(6, commandId.length - 5)
        }

        val realm = Realm.getDefaultInstance()
        if (mId != INVALID.toLong()) {
            val command = realm.where(Command::class.java).equalTo(Command.ID, mId).findFirst()
            if (command != null) {
                mCategory = command.category
                mName = command.name!!.toUpperCase()
            }
        } else {
            val command = realm.where(Command::class.java).equalTo(Command.NAME, mName).findFirst()
            if (command != null) {
                mCategory = command.category
                mId = command.id.toLong()
            }
        }
        realm.close()
    }


    /**
     * Find command name and category by id. If id is INVALID then stop and finish activity
     *
     * @param id unique id of command
     */
    private fun showManFragmentById(id: Long) {
        if (id == INVALID.toLong()) {
            finish()
            return
        }

        title = mName

        val fragment = CommandManFragment()

        // Add unique command ID for fragment
        val bundle = Bundle()
        bundle.putLong(EXTRA_COMMAND_ID, id)
        bundle.putString(EXTRA_COMMAND_NAME, mName)
        bundle.putInt(EXTRA_COMMAND_CATEGORY, mCategory)
        fragment.arguments = bundle

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commitAllowingStateLoss()
    }

    /**
     *
     */
    private fun showLoadingFragment() {
        setTitle(R.string.app_lcl_name)

        val fragment = DatabaseLoadingFragment()
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commitAllowingStateLoss()
    }

    override fun onDatabaseCreateSuccess() {
        showManFragmentById(mId)
    }

    override fun onDatabaseCreateFail() {
        Toast.makeText(baseContext, R.string.fragment_datanase_loading_failed_craftin_database, Toast.LENGTH_LONG).show()
    }

    companion object {

        val EXTRA_COMMAND_ID = "EXTRA_COMMAND_ID" //NON-NLS
        val EXTRA_COMMAND_NAME = "EXTRA_COMMAND_NAME" //NON-NLS
        val EXTRA_COMMAND_CATEGORY = "EXTRA_COMMAND_CATEGORY" //NON-NLS

        internal val INVALID = -1
    }
}
