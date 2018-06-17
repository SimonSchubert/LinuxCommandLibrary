package com.inspiredandroid.linuxcommandbibliotheca.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.misc.AppManager
import com.inspiredandroid.linuxcommandbibliotheca.misc.Constants
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils
import com.inspiredandroid.linuxcommandbibliotheca.models.Command
import io.realm.RealmResults
import kotlinx.android.synthetic.main.row_command_child.view.*
import java.util.*

class CommandsAdapter(context: Context,
                      realmResults: List<RealmResults<Command>>,
                      automaticUpdate: Boolean) : RealmMultiAdapter<Command>(context, realmResults, automaticUpdate), ListAdapter {

    private var query = ""
    private var bookmarkIds = ArrayList<Long>()

    init {
        updateBookmarkIds()
    }

    fun setSearchQuery(searchQuery: String) {
        query = searchQuery
    }

    fun updateBookmarkIds() {
        bookmarkIds = AppManager.getBookmarkIds(mContext!!)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val viewHolder: ViewHolder
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.row_command_child,
                    parent, false)
            viewHolder = ViewHolder(convertView)
            convertView!!.tag = viewHolder
        } else {
            viewHolder = convertView.tag as ViewHolder
        }

        viewHolder.bind(getItem(position)!!)

        return convertView
    }

    override fun getItemId(i: Int): Long {
        return getItem(i)!!.id.toLong()
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

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(command: Command) {
            itemView.title.text = Utils.highlightQueryInsideText(itemView.context, query, command.name!!)
            itemView.description.text = Utils.highlightQueryInsideText(itemView.context, query, command.desc!!.trim { it <= ' ' })

            if (bookmarkIds.contains(command.id.toLong())) {
                itemView.icon.setImageResource(R.drawable.ic_bookmark_black_24dp)
            } else {
                itemView.icon.setImageResource(getSectionImageResource(command.category))
            }
        }
    }
}