package com.inspiredandroid.linuxcommandbibliotheca.fragments

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.MenuItemCompat
import android.support.v7.widget.SearchView
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView

import com.inspiredandroid.linuxcommandbibliotheca.AboutActivity
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.adapter.CommandsAdapter
import com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs.NewsDialogFragment
import com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs.RateDialogFragment
import com.inspiredandroid.linuxcommandbibliotheca.misc.AppManager
import com.inspiredandroid.linuxcommandbibliotheca.misc.FragmentCoordinator
import com.inspiredandroid.linuxcommandbibliotheca.models.Command

import java.text.Normalizer
import java.util.ArrayList

import butterknife.OnClick
import io.realm.Realm
import io.realm.RealmResults
import kotlinx.android.synthetic.main.fragment_commands.*

/**
 * Created by Simon Schubert.
 */
class CommandsFragment : Fragment(), AdapterView.OnItemClickListener {

    private var mAdapter: CommandsAdapter? = null
    private var mRealm: Realm? = null
    private var mQuery = ""

    /**
     * Get list of all commands sorted by name
     *
     * @return
     */
    private val allCommands: List<RealmResults<Command>>
        get() {
            val results = ArrayList<RealmResults<Command>>()
            val ids = AppManager.getBookmarkIds(context)
            for (id in ids) {
                results.add(mRealm!!.where(Command::class.java).equalTo(Command.ID, id).findAll())
            }
            results.add(mRealm!!.where(Command::class.java).findAll().sort("name"))
            return results
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(true)

        mRealm = Realm.getDefaultInstance()
        mAdapter = CommandsAdapter(context!!, allCommands, false)

        if (AppManager.shouldShowNewsDialog(context)) {
            val newDialogFragment = NewsDialogFragment.instance
            newDialogFragment.show(childFragmentManager, newDialogFragment.javaClass.canonicalName)
        } else if (AppManager.shouldShowRateDialog(context)) {
            val rateDialogFragment = RateDialogFragment.instance
            rateDialogFragment.show(childFragmentManager, RateDialogFragment::class.java.name)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_commands, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragment_commands_lv.adapter = mAdapter
        fragment_commands_lv.onItemClickListener = this
    }

    override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
        FragmentCoordinator.startCommandManActivity(activity, id)
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater!!.inflate(R.menu.main, menu)

        val item = menu!!.findItem(R.id.search)
        val searchView = MenuItemCompat.getActionView(item) as SearchView

        val searchManager = activity!!.getSystemService(Context.SEARCH_SERVICE) as SearchManager
        searchView.setSearchableInfo(searchManager.getSearchableInfo(activity!!.componentName))

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {

            override fun onQueryTextSubmit(s: String): Boolean {
                return false
            }

            override fun onQueryTextChange(query: String): Boolean {
                if (!isAdded) {
                    return true
                }
                mQuery = query
                if (query.length > 0) {
                    val normalizedText = Normalizer.normalize(query, Normalizer.Form.NFD).replace("\\p{InCombiningDiacriticalMarks}+".toRegex(), "").toLowerCase()
                    search(normalizedText)
                } else {
                    resetSearchResults()
                }

                return true
            }
        })
        MenuItemCompat.setOnActionExpandListener(item, object : MenuItemCompat.OnActionExpandListener {
            override fun onMenuItemActionExpand(item: MenuItem): Boolean {
                return true
            }

            override fun onMenuItemActionCollapse(item: MenuItem): Boolean {
                resetSearchResults()
                return true
            }
        })
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item!!.itemId == R.id.about) {
            startAboutActivity()
            return true
        }
        return false
    }

    private fun startAboutActivity() {
        val intent = Intent(context, AboutActivity::class.java)
        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()

        mRealm!!.close()
    }

    override fun onResume() {
        super.onResume()

        // mHandler.postDelayed(mSearchQueryCheck, 1000);

        if (AppManager.hasBookmarkChanged(context)) {
            resetSearchResults()
        }
    }

    @OnClick(R.id.fragment_commands_btn_send_request)
    fun sendCommandRequestEmail() {
        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:" + "sschubert89@gmail.com")
        intent.putExtra(Intent.EXTRA_SUBJECT, "Command request")
        intent.putExtra(Intent.EXTRA_TEXT, "Command: $mQuery")
        try {
            startActivity(Intent.createChooser(intent, "Send mail..."))
        } catch (ignored: android.content.ActivityNotFoundException) {
        }

    }

    /**
     * reset mAdapter entries
     */
    private fun resetSearchResults() {
        mAdapter!!.updateRealmResults(allCommands)
        mAdapter!!.setSearchQuery("")
        mAdapter!!.updateBookmarkIds()
        updateViews()
    }

    /**
     * search for query in all command names and short descriptions and update adapter
     *
     * @param query search query
     */
    private fun search(query: String) {
        val results = ArrayList<RealmResults<Command>>()
        results.add(mRealm!!.where(Command::class.java).equalTo(Command.NAME, query).findAll())
        results.add(mRealm!!.where(Command::class.java).beginsWith(Command.NAME, query).notEqualTo(Command.NAME, query).findAll())
        results.add(mRealm!!.where(Command::class.java).contains(Command.NAME, query).not().beginsWith(Command.NAME, query).notEqualTo(Command.NAME, query).findAll())
        results.add(mRealm!!.where(Command::class.java).contains(Command.DESCRIPTION, query).not().contains(Command.NAME, query).findAll())

        mAdapter!!.updateRealmResults(results)
        mAdapter!!.setSearchQuery(query)

        updateViews()
    }

    private fun updateViews() {
        if (mAdapter!!.count == 0) {
            fragment_commands_ll_nothingfound.visibility = View.VISIBLE
            fragment_commands_lv.visibility = View.GONE
        } else {
            fragment_commands_ll_nothingfound.visibility = View.GONE
            fragment_commands_lv.visibility = View.VISIBLE
        }
    }
}
