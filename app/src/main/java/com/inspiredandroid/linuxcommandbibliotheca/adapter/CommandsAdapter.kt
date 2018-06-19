package com.inspiredandroid.linuxcommandbibliotheca.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnListClickListener
import com.inspiredandroid.linuxcommandbibliotheca.misc.AppManager
import com.inspiredandroid.linuxcommandbibliotheca.misc.Constants
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils
import com.inspiredandroid.linuxcommandbibliotheca.models.Command
import io.realm.RealmResults
import kotlinx.android.synthetic.main.row_command.view.*
import java.util.*

class CommandsAdapter(context: Context?,
                      var realmResults: List<RealmResults<Command>>) : RecyclerView.Adapter<CommandsAdapter.ViewHolder>() {

    private var query = ""
    private var bookmarkIds = ArrayList<Long>()
    private var onListClickListener: OnListClickListener? = null

    init {
        updateBookmarkIds(context)
        setHasStableIds(true)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_command, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        getItem(position)?.let {
            holder.bind(it)
        }
    }

    fun setOnListClickListener(listener: OnListClickListener) {
        onListClickListener = listener
    }

    override fun getItemCount(): Int {
        var count = 0
        for (realmResult in realmResults) {
            count += realmResult.size
        }
        return count
    }

    fun getItem(i: Int): Command? {
        if (realmResults.isEmpty()) {
            return null
        }
        var count = 0
        for (realmResult in realmResults) {
            if (i < realmResult.size + count) {
                return realmResult[i - count]
            }
            count += realmResult.size
        }
        return null
    }

    fun updateRealmResults(queryResults: List<RealmResults<Command>>) {
        realmResults = queryResults
        notifyDataSetChanged()
    }

    fun setSearchQuery(searchQuery: String) {
        query = searchQuery
    }

    fun updateBookmarkIds(context: Context?) {
        context?.let {
            bookmarkIds = AppManager.getBookmarkIds(it)
        }
    }

    override fun getItemId(i: Int): Long {
        return getItem(i)?.id?.toLong() ?: 0
    }

    /**
     * Get section icon
     *
     * @param section
     * @return
     */
    private fun getSectionImageResource(section: Int): Int {
        when (section) {
            Constants.SECTION_GAMES -> return R.drawable.ic_videogame_asset_black_24dp
            Constants.SECTION_SYSTEMADMINANDDEAMON -> return R.drawable.ic_security_black_24dp
            Constants.SECTION_USERCOMMANDS -> return R.drawable.ic_keyboard_black_24dp
            Constants.SECTION_SYSTEMCALLS -> return R.drawable.ic_code_white_48dp
            Constants.SECTION_MISSCELANOUS -> return R.drawable.ic_keyboard_black_24dp
        }
        return R.drawable.ic_keyboard_black_24dp
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {

        init {
            view.setOnClickListener(this)
        }

        fun bind(command: Command) {
            itemView.title.text = Utils.highlightQueryInsideText(itemView.context, query, command.name!!)
            itemView.description.text = Utils.highlightQueryInsideText(itemView.context, query, command.desc!!.trim { it <= ' ' })

            if (bookmarkIds.contains(command.id.toLong())) {
                itemView.icon.setImageResource(R.drawable.ic_bookmark_black_24dp)
            } else {
                itemView.icon.setImageResource(getSectionImageResource(command.category))
            }
        }

        override fun onClick(view: View) {
            getItem(adapterPosition)?.let {
                onListClickListener?.onClick(it.id)
            }
        }
    }
}