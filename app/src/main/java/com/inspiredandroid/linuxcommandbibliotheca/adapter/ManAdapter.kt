package com.inspiredandroid.linuxcommandbibliotheca.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.models.Command
import io.realm.Realm
import io.realm.kotlin.where
import kotlinx.android.synthetic.main.row_man_description.view.*
import kotlinx.android.synthetic.main.row_man_title.view.*
import java.util.*
import java.util.regex.Pattern
import kotlin.collections.ArrayList

class ManAdapter(private var pages: ArrayList<String>, var parts: ArrayList<ArrayList<CharSequence>>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val PARENT = 0
        const val CHILDREN = 1
    }

    private val expanded: HashMap<Int, Boolean> = HashMap()
    var items = ArrayList<BasicItem>()

    class BasicItem(var groupId: Int = 0, var childId: Int = -1)

    init {
        updateItems()
    }

    override fun getItemViewType(position: Int): Int {
        return if (items[position].childId == -1) {
            PARENT
        } else {
            CHILDREN
        }
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            PARENT -> {
                val v = LayoutInflater.from(parent.context).inflate(R.layout.row_man_title, parent, false)
                return GroupViewHolder(v)
            }
            CHILDREN -> {
                val v = LayoutInflater.from(parent.context).inflate(R.layout.row_man_description, parent, false)
                return ChildViewHolder(v)
            }
        }
        throw RuntimeException("No viewType found")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        when (holder.itemViewType) {
            PARENT -> {
                val groupViewHolder = holder as GroupViewHolder
                groupViewHolder.bind(item.groupId, pages[item.groupId])
            }
            CHILDREN -> {
                val childViewHolder = holder as ChildViewHolder
                childViewHolder.bind(pages[item.groupId], parts[item.groupId][item.childId])
            }
        }
    }

    fun updateItems() {
        items.clear()
        pages.forEachIndexed { index, _ ->
            items.add(BasicItem(index))
            if (isExpanded(index)) {
                parts[index].forEachIndexed { index2, _ ->
                    items.add(BasicItem(index, index2))
                }
            }
        }
    }

    fun expandAll() {
        pages.forEachIndexed { index, _ ->
            expanded[index] = true
        }
        updateItems()
    }

    fun isExpanded(id: Int): Boolean {
        return expanded[id] == true
    }

    inner class GroupViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(index: Int, page: String) {
            itemView.title.text = page.toUpperCase()
            itemView.setOnClickListener {
                expanded[index] = !isExpanded(index)
                updateItems()
                notifyDataSetChanged()
            }
        }
    }

    inner class ChildViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(title: String, description: CharSequence) {
            itemView.description.text = description
            if (title.toUpperCase() == "SEE ALSO") {
                itemView.description.setCommands(extractCommandsFromDescription(description.toString()))
            }
        }
    }

    /**
     * Search for commands and return list of commands that exist in database
     *
     * @param description
     * @return
     */
    private fun extractCommandsFromDescription(description: String): Array<String> {
        val realm = Realm.getDefaultInstance()

        // match "command(category)" e.g: gzip(1)
        val p = Pattern.compile("[[:graph:]]+\\s?\\(\\w\\)")
        val m = p.matcher(description)

        // loop results and add if command exists in db
        val tmp = arrayListOf<String>()
        while (m.find()) {
            val extractedCommand = m.group(0).substring(0, m.group(0).length - 3).trim { it <= ' ' }
            val command = realm.where<Command>().equalTo(Command.NAME, extractedCommand).findFirst()
            if (command != null) {
                tmp.add(extractedCommand)
            }
        }

        realm.close()

        return tmp.toTypedArray()
    }

}