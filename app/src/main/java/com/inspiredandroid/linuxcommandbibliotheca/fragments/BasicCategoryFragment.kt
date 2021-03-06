package com.inspiredandroid.linuxcommandbibliotheca.fragments

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.activities.AboutActivity
import com.inspiredandroid.linuxcommandbibliotheca.adapter.BasicCategoryAdapter
import com.inspiredandroid.linuxcommandbibliotheca.adapter.BasicGroupAdapter
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnClickListListener
import com.inspiredandroid.linuxcommandbibliotheca.misc.FragmentCoordinator
import com.inspiredandroid.linuxcommandbibliotheca.models.BasicCategory
import com.inspiredandroid.linuxcommandbibliotheca.models.BasicGroup
import io.realm.Case
import io.realm.kotlin.where
import kotlinx.android.synthetic.main.fragment_basic_category.*
import java.text.Normalizer

/* Copyright 2019 Simon Schubert
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
class BasicCategoryFragment : BaseFragment(), OnClickListListener {

    private lateinit var adapter: BasicCategoryAdapter
    private lateinit var searchAdapter: BasicGroupAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(true)

        activity?.title = getString(R.string.fragment_bibliotheca_basic)

        searchAdapter = BasicGroupAdapter(realm.where<BasicGroup>().findAll())
        adapter = BasicCategoryAdapter(realm.where<BasicCategory>().sort("position").findAll(), false)
        adapter.setOnListClickListener(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_basic_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.search_about, menu)

        val item = menu.findItem(R.id.search)
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

        val realmQuery = realm.where(BasicGroup::class.java).beginGroup()

        for (word in words) {
            realmQuery.contains("desc", word, Case.INSENSITIVE)
        }

        val allGroups = realmQuery.endGroup().sort("position").findAll()
        searchAdapter.updateSearchQuery(query)
        searchAdapter.updateData(allGroups)
        recyclerView.adapter = searchAdapter
    }

    private fun resetSearchResults() {
        recyclerView.adapter = adapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.about) {
            startAboutActivity()
            return true
        }
        return false
    }

    private fun startAboutActivity() {
        val intent = Intent(context, AboutActivity::class.java)
        startActivity(intent)
    }

    override fun onClickList(id: Int) {
        FragmentCoordinator.startScriptCategoryActivity(activity, id)
    }
}
