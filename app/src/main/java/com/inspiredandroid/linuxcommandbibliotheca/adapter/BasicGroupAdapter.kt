package com.inspiredandroid.linuxcommandbibliotheca.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.analytics.FirebaseAnalytics
import com.inspiredandroid.linuxcommandbibliotheca.BuildConfig
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandChildModel
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel
import io.realm.RealmResults
import kotlinx.android.synthetic.main.row_basicgroup.view.*
import kotlinx.android.synthetic.main.row_basicchildren.view.*
import java.util.*
import kotlin.collections.ArrayList

class BasicGroupAdapter(private var groups: RealmResults<CommandGroupModel>, private val firebaseAnalytics: FirebaseAnalytics?) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val PARENT = 0
        const val CHILDREN = 1
    }

    private val expanded: HashMap<Int, Boolean> = HashMap()
    private var searchQuery = ""
    private var items = ArrayList<BasicItem>()

    class BasicItem(var groupId: Int = 0, var childId: Int = -1)

    init {
        updateItems()
    }

    override fun getItemViewType(position: Int): Int {
        return if(items.get(position).childId == -1) { PARENT } else { CHILDREN }
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            PARENT -> {
                val v = LayoutInflater.from(parent.context).inflate(R.layout.row_basicgroup, parent, false)
                return GroupViewHolder(v)
            }
            CHILDREN -> {
                val v = LayoutInflater.from(parent.context).inflate(R.layout.row_basicchildren, parent, false)
                return ChildViewHolder(v)
            }
        }
        throw RuntimeException("No viewType found")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items.get(position)
        when (holder.itemViewType) {
            PARENT -> {
                groups[item.groupId]?.let {
                    val groupViewHolder = holder as GroupViewHolder
                    groupViewHolder.bind(it)
                }
            }
            CHILDREN -> {
                groups[item.groupId]?.commands!![item.childId]?.let {
                    val childViewHolder = holder as ChildViewHolder
                    childViewHolder.bind(it)
                }
            }
        }
    }

    fun updateItems() {
        items.clear()
        groups.forEachIndexed { index, commandGroupModel ->
            items.add(BasicItem(index))
            if(isExpanded(commandGroupModel.id)) {
                commandGroupModel.commands?.forEachIndexed { index2, commandChildModel ->
                    items.add(BasicItem(index, index2))
                }
            }
        }
    }

    fun updateData(allGroups: RealmResults<CommandGroupModel>) {
        groups = allGroups
        updateItems()
        notifyDataSetChanged()
    }

    fun updateSearchQuery(query: String) {
        searchQuery = query
    }

    fun isExpanded(id: Int): Boolean {
        return expanded.containsKey(id) && expanded[id]!!
    }

    fun trackSelectContent(id: String?) {
        if (BuildConfig.DEBUG) {
            return
        }
        val bundle = Bundle()
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id)
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Basic Group")
        firebaseAnalytics?.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle)
    }

    fun startShareActivity(context: Context, command: CommandChildModel) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, command.command)

        try {
            context.startActivity(intent)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    inner class GroupViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: CommandGroupModel) {
            itemView.title.text = Utils.highlightQueryInsideText(itemView.context, searchQuery, item.desc!!)
            itemView.icon.setImageResource(item.imageResourceId)
            itemView.setOnClickListener { _ ->
                expanded[item.id] = !isExpanded(item.id)
                updateItems()
                notifyDataSetChanged()
                trackSelectContent(item.desc)
            }
        }
    }

    inner class ChildViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(command: CommandChildModel) {
            itemView.description.text = command.command
            itemView.description.setCommands(command.getMansAsStringArray())
            itemView.share.setOnClickListener { view -> startShareActivity(view.context, command) }
        }
    }

}