package com.inspiredandroid.linuxcommandbibliotheca.fragments

import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.widget.SearchView
import android.text.Html
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.view.*
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.appindexing.Action
import com.inspiredandroid.linuxcommandbibliotheca.BuildConfig
import com.inspiredandroid.linuxcommandbibliotheca.CommandManActivity
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.adapter.ManAdapter
import com.inspiredandroid.linuxcommandbibliotheca.misc.AppManager
import com.inspiredandroid.linuxcommandbibliotheca.misc.FragmentCoordinator
import com.inspiredandroid.linuxcommandbibliotheca.misc.SearchIndex
import com.inspiredandroid.linuxcommandbibliotheca.misc.highlightQueryInsideText
import com.inspiredandroid.linuxcommandbibliotheca.models.Command
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandPage
import io.realm.Realm
import io.realm.kotlin.where
import kotlinx.android.synthetic.main.fragment_command_man.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.util.*

/**
 * Created by Simon Schubert
 */
class CommandManFragment : AppIndexFragment(), View.OnClickListener {

    private lateinit var adapter: ManAdapter
    private lateinit var realm: Realm
    private var firebaseAnalytics: FirebaseAnalytics? = null
    private var name: String = ""
    private var id: Long = 0
    private var currentIndexPosition: Int = 0
    var indexes = ArrayList<SearchIndex>()

    private fun fromHtml(html: String?): Spanned {
        return if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY)
        } else {
            Html.fromHtml(html)
        }
    }

    override fun getAppIndexingAction(): Action {
        return Action.Builder(Action.Builder.VIEW_ACTION)
                .setObject("$name Linux man page", "http://linuxcommandlibrary.com/man/$name.html")
                .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (!FragmentCoordinator.isTabletLayout(activity)) {
            setHasOptionsMenu(true)
        }

        id = arguments?.getLong(CommandManActivity.EXTRA_COMMAND_ID) ?: 0L

        realm = Realm.getDefaultInstance()

        adapter = createAdapter()

        context?.let {
            firebaseAnalytics = FirebaseAnalytics.getInstance(it)
        }

        val realm = Realm.getDefaultInstance()
        val command = realm.where<Command>().equalTo(Command.ID, id).findFirst()
        if (command != null) {
            trackSelectContent(command.name)
            name = command.name
            activity?.title = name
        }
        realm.close()
    }

    private fun trackSelectContent(name: String?) {
        if (BuildConfig.DEBUG) {
            return
        }
        val bundle = Bundle()
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, name)
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Manual Detail")
        firebaseAnalytics?.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_command_man, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.adapter = adapter
        fastScroller.setRecyclerView(recyclerView)

        btnUp.setOnClickListener(this)
        btnDown.setOnClickListener(this)
    }

    override fun onDestroy() {
        super.onDestroy()

        realm.close()
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.search_bookmark, menu)

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
                        search(query)
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

        val bookmarkItem = menu.findItem(R.id.bookmark)
        bookmarkItem.setIcon(if (AppManager.hasBookmark(context, id)) R.drawable.ic_bookmark_black_24dp else R.drawable.ic_bookmark_border_black_24dp)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.bookmark) {
            toggleBookmark()
            activity?.invalidateOptionsMenu()
            return true
        }
        return false
    }

    private fun createAdapter(): ManAdapter {
        val pages = realm.where<CommandPage>().equalTo(CommandPage.COMMANDID, id).findAll()

        val groups = ArrayList<String>()
        val child = ArrayList<ArrayList<CharSequence>>()
        for (page in pages) {

            // Split description by <p> elements to increase the recyclerview performance
            val pageSplit = ArrayList<CharSequence>()
            val tmp = page.page.toString().split("</p>".toRegex()).toTypedArray()
            for (tmpSplit in tmp) {
                val p = trim(fromHtml("$tmpSplit</p>"))
                if (p.isNotEmpty()) {
                    pageSplit.add(p)
                }
            }

            // If the parts are still to long split them Every 3000 characters
            val descriptions = ArrayList<CharSequence>()
            val size = 2000
            pageSplit.forEach {
                var index = 0
                while (index < it.length) {
                    var endIndex = index + size
                    if (endIndex >= it.length) {
                        endIndex = it.length - 1
                    }
                    descriptions.add(it.subSequence(index, endIndex))
                    index += size
                }
            }

            if (pageSplit.size > 0) {
                groups.add(page.title)
                child.add(descriptions)
            }
        }

        return ManAdapter(groups, child)
    }

    private fun trim(data: CharSequence): CharSequence {
        var text = data
        if (text.isEmpty()) {
            return text
        }
        while (text[text.length - 1] == '\n') {
            text = text.subSequence(0, text.length - 1)
        }
        while (text[0] == '\n') {
            text = text.subSequence(1, text.length)
        }
        return text
    }

    private fun toggleBookmark() {
        if (AppManager.hasBookmark(context, id)) {
            AppManager.removeBookmark(context, id)
        } else {
            AppManager.addBookmark(context, id)
        }
    }

    /**
     *
     */
    private fun resetSearchResults() {
        search("")
    }

    /**
     * Search the search_bookmark page for q occurs and highlight them and jump to first occur
     *
     * @param q
     */
    private fun search(q: String) {
        doAsync {
            indexes.clear()
            adapter.expandAll()
            var pos = 0
            adapter.parts.forEachIndexed { index, children ->
                pos++
                for (i in children.indices) {
                    val child = children[i]
                    val searchResult = child.toString().highlightQueryInsideText(context, q)
                    children[i] = searchResult.result
                    searchResult.indexes.forEach {
                        /*
                        if(indexes.count() == currentIndexPosition){
                            val ind = it
                            context?.let {
                                val span = SpannableString(children[i])
                                span.setSpan(ForegroundColorSpan(ContextCompat.getColor(it, R.color.accent_material_dark)), ind, ind+q.count(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
                                children[i] = span
                            }
                        }
                        */
                        indexes.add(SearchIndex(pos, it))
                    }
                    pos++
                }
            }
            uiThread {
                tvSearchCount.text =  "$currentIndexPosition/${indexes.count()}"
                adapter.notifyDataSetChanged()
            }
        }
        if(q.isNotEmpty()) {
            showButton()
        } else {
            hideButton()
        }
    }

    /**
     * Get line by index of occur and calculate position
     *
     * @param index
     */
    private fun scrollToPosition(index: SearchIndex) {
        /*
        int line = tvDescription.getLayout().getLineForOffset(index);
        int lineHeight = tvDescription.getLayout().getHeight() / tvDescription.getLayout().getLineCount();
        int position = line * lineHeight;
        scrollView.scrollTo(0, position)
        */
        recyclerView.layoutManager.scrollToPosition(index.pos)
        tvSearchCount.text =  "$currentIndexPosition/${indexes.count()}"
        /*
        var items = adapter.items[currentIndexPosition]
        adapter.parts[items.groupId]
        */
    }

    /**
     *
     */
    private fun hideButton() {
        btnUp.visibility = View.GONE
        btnDown.visibility = View.GONE
        tvSearchCount.visibility = View.GONE
        imageView7.visibility = View.GONE
    }

    /**
     *
     */
    private fun showButton() {
        btnUp.visibility = View.VISIBLE
        btnDown.visibility = View.VISIBLE
        tvSearchCount.visibility = View.VISIBLE
        imageView7.visibility = View.VISIBLE
    }

    /**
     * go to next, if last then go to first
     */
    private fun jumpToNextPosition() {
        currentIndexPosition--
        if (currentIndexPosition < 0) {
            currentIndexPosition = indexes.size - 1
        }
        scrollToPosition(indexes[currentIndexPosition])
    }

    /**
     * go to previous, if smaller 0 then go to last
     */
    private fun jumpToPreviousPosition() {
        currentIndexPosition++
        if (currentIndexPosition >= indexes.size) {
            currentIndexPosition = 0
        }
        scrollToPosition(indexes[currentIndexPosition])
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btnUp) {
            jumpToNextPosition()
        } else if (v.id == R.id.btnDown) {
            jumpToPreviousPosition()
        }
    }
}