package com.inspiredandroid.linuxcommandbibliotheca.fragments

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.MenuItemCompat
import android.support.v7.widget.SearchView
import android.view.*
import com.inspiredandroid.linuxcommandbibliotheca.AboutActivity
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.adapter.CommandsAdapter
import com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs.NewsDialogFragment
import com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs.RateDialogFragment
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnListClickListener
import com.inspiredandroid.linuxcommandbibliotheca.misc.AppManager
import com.inspiredandroid.linuxcommandbibliotheca.misc.FragmentCoordinator
import com.inspiredandroid.linuxcommandbibliotheca.models.Command
import io.realm.Realm
import io.realm.RealmResults
import io.realm.kotlin.where
import kotlinx.android.synthetic.main.fragment_commands.*
import java.text.Normalizer
import java.util.*

/**
 * Created by Simon Schubert.
 */
class CommandsFragment : Fragment(), OnListClickListener {

    private var mAdapter: CommandsAdapter? = null
    private var realm: Realm? = null
    private var searchQuery = ""

    /**
     * Get list of all commands sorted by name
     *
     * @return
     */
    private val allCommands: List<RealmResults<Command>>
        get() {
            val results = ArrayList<RealmResults<Command>>()
            val ids = AppManager.getBookmarkIds(context!!)
            for (id in ids) {
                results.add(realm!!.where<Command>().equalTo(Command.ID, id).findAll())
            }
            results.add(realm!!.where<Command>().findAll().sort("name"))
            return results
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(true)

        realm = Realm.getDefaultInstance()
        mAdapter = CommandsAdapter(context!!, allCommands, false)
        mAdapter!!.setOnListClickListener(this)

        if (AppManager.shouldShowNewsDialog(context!!)) {
            val newDialogFragment = NewsDialogFragment.instance
            newDialogFragment.show(childFragmentManager, newDialogFragment.javaClass.canonicalName)
        } else if (AppManager.shouldShowRateDialog(context!!)) {
            val rateDialogFragment = RateDialogFragment.instance
            rateDialogFragment.show(childFragmentManager, RateDialogFragment::class.java.name)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_commands, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.adapter = mAdapter
        fastScroller.setRecyclerView(recyclerView)

        btnRequestCommand.setOnClickListener {
            sendCommandRequestEmail()
        }
    }

    override fun onClick(id: Int) {
        FragmentCoordinator.startCommandManActivity(activity!!, id.toLong())
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.main, menu)

        val item = menu?.findItem(R.id.search)
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
                searchQuery = query
                if (query.isNotEmpty()) {
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
        if (item?.itemId == R.id.about) {
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

        realm!!.close()
    }

    override fun onResume() {
        super.onResume()

        if (AppManager.hasBookmarkChanged(context!!)) {
            resetSearchResults()
        }
    }

    fun sendCommandRequestEmail() {
        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:" + "sschubert89@gmail.com")
        intent.putExtra(Intent.EXTRA_SUBJECT, "Command request")
        intent.putExtra(Intent.EXTRA_TEXT, "Command: $searchQuery")
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
        results.add(realm!!.where(Command::class.java).equalTo(Command.NAME, query).findAll())
        results.add(realm!!.where(Command::class.java).beginsWith(Command.NAME, query).notEqualTo(Command.NAME, query).findAll())
        results.add(realm!!.where(Command::class.java).contains(Command.NAME, query).not().beginsWith(Command.NAME, query).notEqualTo(Command.NAME, query).findAll())
        results.add(realm!!.where(Command::class.java).contains(Command.DESCRIPTION, query).not().contains(Command.NAME, query).findAll())

        mAdapter!!.updateRealmResults(results)
        mAdapter!!.setSearchQuery(query)

        updateViews()
    }

    private fun updateViews() {
        if (mAdapter!!.itemCount == 0) {
            fragment_commands_ll_nothingfound.visibility = View.VISIBLE
            recyclerView.visibility = View.GONE
        } else {
            fragment_commands_ll_nothingfound.visibility = View.GONE
            recyclerView.visibility = View.VISIBLE
        }
    }
}
