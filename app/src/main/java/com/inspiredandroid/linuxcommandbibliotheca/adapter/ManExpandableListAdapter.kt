package com.inspiredandroid.linuxcommandbibliotheca.adapter

import android.app.Activity
import android.support.v4.app.FragmentActivity
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.models.Command
import io.realm.Realm
import kotlinx.android.synthetic.main.row_man_child.view.*
import kotlinx.android.synthetic.main.row_man_group.view.*
import java.util.*
import java.util.regex.Pattern

/**
 * Created by Simon Schubert
 */
class ManExpandableListAdapter(private val mContext: FragmentActivity, private val mGroup: ArrayList<String>, var mChild: ArrayList<ArrayList<CharSequence>>) : BaseExpandableListAdapter() {

    override fun getChild(groupPosition: Int, childPosition: Int): CharSequence {
        return mChild[groupPosition][childPosition]
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun getChildView(groupPosition: Int, childPosition: Int,
                              isLastChild: Boolean, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val description = getChild(groupPosition, childPosition)
        val holder: CommandViewHolder

        if (convertView == null) {
            val inflater = mContext.layoutInflater
            convertView = inflater.inflate(R.layout.row_man_child, parent, false)
            holder = CommandViewHolder(convertView)
            convertView!!.tag = holder
        } else {
            holder = convertView.tag as CommandViewHolder
        }

        holder.bind(description, groupPosition)

        return convertView
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return mChild[groupPosition].size
    }

    override fun getGroup(groupPosition: Int): Any {
        return mGroup[groupPosition]
    }

    override fun getGroupCount(): Int {
        return mGroup.size
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getGroupView(groupPosition: Int, isExpanded: Boolean,
                              convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val title = getGroup(groupPosition) as String
        val holder: CommandGroupViewHolder

        if (convertView == null) {
            val inflater = mContext.layoutInflater
            convertView = inflater.inflate(R.layout.row_man_group, parent, false)
            holder = CommandGroupViewHolder(convertView)
            convertView!!.tag = holder
        } else {
            holder = convertView.tag as CommandGroupViewHolder
        }

        holder.bind(title)

        return convertView
    }

    override fun hasStableIds(): Boolean {
        return true
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    override fun areAllItemsEnabled(): Boolean {
        return false
    }

    /**
     * Search for commands and return list of commands which exist in database
     *
     * @param description
     * @return
     */
    private fun extractCommandsFromDescription(description: String): Array<String> {
        val realm = Realm.getDefaultInstance()

        // match "command(category)" e.g: gzip(1)
        val p = Pattern.compile("[[:graph:]]+\\s?\\(\\w\\)")
        val m = p.matcher(description)

        // loop results and ad if command exists in db
        val tmp = ArrayList<String>()
        while (m.find()) {
            val extractedCommand = m.group(0).substring(0, m.group(0).length - 3).trim { it <= ' ' }
            val command = realm.where(Command::class.java).equalTo(Command.NAME, extractedCommand).findFirst()
            if (command != null) {
                tmp.add(extractedCommand)
            }
        }

        realm.close()

        return tmp.toTypedArray()
    }

    internal inner class CommandViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(description: CharSequence, groupPosition: Int) {
            itemView.row_man_child_tv_description.text = description
            if (getGroup(groupPosition).toString().toUpperCase() == "SEE ALSO") {
                itemView.row_man_child_tv_description.setCommands(extractCommandsFromDescription(description.toString()))
            }
        }
    }

    internal inner class CommandGroupViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(title: String) {
            itemView.row_man_group_tv_title.text = title.toUpperCase()
        }
    }
}