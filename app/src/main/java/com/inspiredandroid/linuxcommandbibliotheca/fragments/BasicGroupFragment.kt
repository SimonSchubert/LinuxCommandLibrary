package com.inspiredandroid.linuxcommandbibliotheca.fragments

import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.support.v7.widget.SearchView
import android.view.*
import com.google.firebase.analytics.FirebaseAnalytics
import com.inspiredandroid.linuxcommandbibliotheca.BasicGroupActivity
import com.inspiredandroid.linuxcommandbibliotheca.BuildConfig
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.adapter.BasicGroupAdapter
import com.inspiredandroid.linuxcommandbibliotheca.models.BasicGroupModel
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel
import io.realm.Case
import io.realm.Realm
import io.realm.RealmResults
import io.realm.Sort
import io.realm.kotlin.where
import kotlinx.android.synthetic.main.fragment_basic_groups.*
import java.text.Normalizer

/**
 * Created by Simon Schubert
 */
class BasicGroupFragment : BaseFragment() {

    lateinit var realm: Realm
    private lateinit var searchAdapter: BasicGroupAdapter
    private lateinit var groups: RealmResults<CommandGroupModel>
    private var firebaseAnalytics: FirebaseAnalytics? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(true)

        realm = Realm.getDefaultInstance()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_basic_groups, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoryId = activity?.intent?.getIntExtra(BasicGroupActivity.EXTRA_CATEGORY_ID, 0)

        val basicGroupModel = realm.where<BasicGroupModel>().equalTo("id", categoryId).findFirst()
                ?: BasicGroupModel()
        groups = basicGroupModel.groups.sort("votes", Sort.DESCENDING)

        activity?.title = basicGroupModel.title

        context?.let {
            firebaseAnalytics = FirebaseAnalytics.getInstance(it)
        }

        searchAdapter = BasicGroupAdapter(groups, firebaseAnalytics)
        recyclerView.adapter = searchAdapter

        trackSelectContent(basicGroupModel.title)
    }

    override fun onDestroy() {
        super.onDestroy()

        realm.close()
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.search, menu)

        val item = menu?.findItem(R.id.search)
        val searchView = item?.actionView as SearchView

        activity?.let {
            val searchManager = it.getSystemService(Context.SEARCH_SERVICE) as SearchManager
            searchView.setSearchableInfo(searchManager.getSearchableInfo(it.componentName))

            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {

                override fun onQueryTextSubmit(s: String): Boolean {
                    return false
                }

                override fun onQueryTextChange(query: String): Boolean {
                    if (!isAdded) {
                        return true
                    }
                    if (query.isNotEmpty()) {
                        val normalizedText = Normalizer.normalize(query, Normalizer.Form.NFD).replace("\\p{InCombiningDiacriticalMarks}+".toRegex(), "").toLowerCase()
                        search(normalizedText)
                    } else {
                        resetSearchResults()
                    }

                    return true
                }
            })
            item.setOnActionExpandListener(object : MenuItem.OnActionExpandListener {
                override fun onMenuItemActionExpand(item: MenuItem): Boolean {
                    return true
                }

                override fun onMenuItemActionCollapse(item: MenuItem): Boolean {
                    resetSearchResults()
                    return true
                }
            })
        }
    }

    private fun trackSelectContent(id: String?) {
        if (BuildConfig.DEBUG) {
            return
        }
        val bundle = Bundle()
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id)
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Basic Category")
        firebaseAnalytics?.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle)
    }

    private fun search(query: String) {
        val words = query.split("[,\\s]+".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

        val realmQuery = realm.where<CommandGroupModel>().beginGroup()
        for (word in words) {
            realmQuery.contains("desc", word, Case.INSENSITIVE)
        }
        val allGroups = realmQuery.endGroup().sort("votes").findAll()

        searchAdapter.updateSearchQuery(query)
        searchAdapter.updateData(allGroups)
    }

    private fun resetSearchResults() {
        searchAdapter.updateSearchQuery("")
        searchAdapter.updateData(groups)
    }

}
