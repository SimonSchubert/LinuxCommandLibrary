package com.inspiredandroid.linuxcommandbibliotheca.fragments

import android.app.Activity
import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.SearchView
import android.view.*
import com.google.firebase.analytics.FirebaseAnalytics
import com.inspiredandroid.linuxcommandbibliotheca.AboutActivity
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.adapter.BasicCategoryAdapter
import com.inspiredandroid.linuxcommandbibliotheca.adapter.BasicGroupAdapter
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnListClickListener
import com.inspiredandroid.linuxcommandbibliotheca.misc.FragmentCoordinator
import com.inspiredandroid.linuxcommandbibliotheca.models.BasicGroupModel
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel
import io.realm.Case
import io.realm.Realm
import io.realm.kotlin.where
import kotlinx.android.synthetic.main.fragment_scriptgroups.*
import java.text.Normalizer

/**
 * Created by Simon Schubert
 */
class BasicCategoryFragment : BaseFragment(), OnListClickListener {

    lateinit var realm: Realm
    lateinit var adapter: BasicCategoryAdapter
    lateinit var searchAdapter: BasicGroupAdapter
    private var firebaseAnalytics: FirebaseAnalytics? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(true)

        activity?.title = getString(R.string.fragment_bibliotheca_basic)

        realm = Realm.getDefaultInstance()
        firebaseAnalytics = FirebaseAnalytics.getInstance(context ?: Activity())
        searchAdapter = BasicGroupAdapter(realm.where<CommandGroupModel>().findAll(), firebaseAnalytics)
        adapter = BasicCategoryAdapter(realm.where<BasicGroupModel>().sort("position").findAll(), false)
        adapter.setOnListClickListener(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_scriptgroups, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()

        realm.close()
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.main, menu)

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

    private fun search(query: String) {
        val words = query.split("[,\\s]+".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

        val realmQuery = realm.where(CommandGroupModel::class.java).beginGroup()

        for (word in words) {
            realmQuery.contains("desc", word, Case.INSENSITIVE)
        }

        val allGroups = realmQuery.endGroup().sort("votes").findAll()
        searchAdapter.updateSearchQuery(query)
        searchAdapter.updateData(allGroups)
        recyclerView.adapter = searchAdapter
    }

    private fun resetSearchResults() {
        recyclerView.adapter = adapter
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

    override fun onClick(id: Int) {
        FragmentCoordinator.startScriptCategoryActivity(activity, id)
    }
}
