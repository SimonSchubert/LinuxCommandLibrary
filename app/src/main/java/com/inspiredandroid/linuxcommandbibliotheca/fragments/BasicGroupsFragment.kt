package com.inspiredandroid.linuxcommandbibliotheca.fragments

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.view.MenuItemCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.SearchView
import android.view.*
import com.google.firebase.analytics.FirebaseAnalytics
import com.inspiredandroid.linuxcommandbibliotheca.AboutActivity
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.adapter.ScriptGroupsAdapter
import com.inspiredandroid.linuxcommandbibliotheca.adapter.SearchAdapter
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnListClickListener
import com.inspiredandroid.linuxcommandbibliotheca.misc.FragmentCoordinator
import com.inspiredandroid.linuxcommandbibliotheca.models.BasicGroupModel
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel
import io.realm.Case
import io.realm.Realm
import kotlinx.android.synthetic.main.fragment_scriptgroups.*
import java.text.Normalizer

/**
 * Created by Simon Schubert
 */
class BasicGroupsFragment : SuperFragment(), OnListClickListener {

    private var mRealm: Realm? = null
    private var mAdapter: ScriptGroupsAdapter? = null
    private var mSearchAdapter: SearchAdapter? = null
    private var mFirebaseAnalytics: FirebaseAnalytics? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(true)

        mRealm = Realm.getDefaultInstance()
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(context!!)
        mSearchAdapter = SearchAdapter(null, false, mFirebaseAnalytics!!)
        mAdapter = ScriptGroupsAdapter(mRealm!!.where(BasicGroupModel::class.java).sort("position").findAll(), false)
        mAdapter!!.setOnListClickListener(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_scriptgroups, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragment_scriptgroups_rv!!.adapter = mAdapter
        fragment_scriptgroups_rv!!.layoutManager = LinearLayoutManager(context)
    }

    override fun onDestroy() {
        super.onDestroy()

        mRealm!!.close()
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater!!.inflate(R.menu.tip, menu)


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

    private fun search(query: String) {
        val words = query.split("[,\\s]+".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

        val realmQuery = mRealm!!.where(CommandGroupModel::class.java).beginGroup()

        for (word in words) {
            realmQuery.contains("desc", word, Case.INSENSITIVE)
        }

        val allGroups = realmQuery.endGroup().sort("votes").findAll()
        mSearchAdapter!!.setQuery(query)
        mSearchAdapter!!.updateData(allGroups)
        fragment_scriptgroups_rv!!.adapter = mSearchAdapter
    }

    private fun resetSearchResults() {
        fragment_scriptgroups_rv!!.adapter = mAdapter
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

    override fun onClick(id: Int) {
        FragmentCoordinator.startScriptCategoryActivity(activity, id)
    }
}
