package com.inspiredandroid.linuxcommandbibliotheca.fragments

import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.support.v4.view.MenuItemCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.SearchView
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup

import com.google.firebase.analytics.FirebaseAnalytics
import com.inspiredandroid.linuxcommandbibliotheca.BuildConfig
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.ScriptChildrenActivity
import com.inspiredandroid.linuxcommandbibliotheca.adapter.ScriptChildrenAdapter
import com.inspiredandroid.linuxcommandbibliotheca.adapter.SearchAdapter
import com.inspiredandroid.linuxcommandbibliotheca.models.BasicGroupModel
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel

import java.text.Normalizer

import butterknife.BindView
import io.realm.Case
import io.realm.Realm
import io.realm.Sort
import kotlinx.android.synthetic.main.fragment_scriptchildren.*

/**
 * Created by Simon Schubert
 */
class BasicChildrenFragment : SuperFragment() {

    private var mRealm: Realm? = null
    private var mAdapter: ScriptChildrenAdapter? = null
    private var mSearchAdapter: SearchAdapter? = null
    private var mFirebaseAnalytics: FirebaseAnalytics? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(true)

        mRealm = Realm.getDefaultInstance()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_scriptchildren, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoryId = activity!!.intent.getIntExtra(ScriptChildrenActivity.EXTRA_CATEGORY_ID, 0)

        val basicGroupModel = mRealm!!.where(BasicGroupModel::class.java).equalTo("id", categoryId).findFirst()
        val groups = basicGroupModel!!.groups!!.sort("votes", Sort.DESCENDING)

        activity!!.title = basicGroupModel.title


        mFirebaseAnalytics = FirebaseAnalytics.getInstance(context!!)

        mAdapter = ScriptChildrenAdapter(groups, false, mFirebaseAnalytics!!)
        fragment_scriptchildren_rv.adapter = mAdapter
        fragment_scriptchildren_rv.layoutManager = LinearLayoutManager(context)

        mSearchAdapter = SearchAdapter(null, false, mFirebaseAnalytics!!)

        trackSelectContent(basicGroupModel.title)
    }

    override fun onDestroy() {
        super.onDestroy()

        mRealm!!.close()
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater!!.inflate(R.menu.basic, menu)

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

    private fun trackSelectContent(id: String?) {
        if (BuildConfig.DEBUG) {
            return
        }
        val bundle = Bundle()
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id)
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Basic Category")
        mFirebaseAnalytics!!.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle)
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
        fragment_scriptchildren_rv.adapter = mSearchAdapter
    }

    private fun resetSearchResults() {
        fragment_scriptchildren_rv.adapter = mAdapter
    }

}
