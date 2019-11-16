package com.inspiredandroid.linuxcommandbibliotheca.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.misc.Constants
import com.inspiredandroid.linuxcommandbibliotheca.misc.highlightQueryInsideText
import com.inspiredandroid.linuxcommandbibliotheca.misc.showPlayStoreActivity
import com.inspiredandroid.linuxcommandbibliotheca.models.BasicCommand
import com.inspiredandroid.linuxcommandbibliotheca.models.BasicGroup
import io.realm.RealmResults
import kotlinx.android.synthetic.main.row_ad.view.*
import kotlinx.android.synthetic.main.row_basic_children.view.*
import kotlinx.android.synthetic.main.row_basic_group.view.*
import java.util.*
import kotlin.collections.ArrayList

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
class BasicGroupAdapter(private var groups: RealmResults<BasicGroup>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val PARENT = 0
        const val CHILDREN = 1
        const val AD = 2
    }

    private val expanded: HashMap<Int, Boolean> = HashMap()
    private var searchQuery = ""
    private var items = ArrayList<BasicItem>()

    class BasicItem(var groupId: Int = 0, var childId: Int = -1)

    init {
        updateItems()
    }

    override fun getItemViewType(position: Int): Int {
        val item = items[position]
        return if (item.childId == -1 && item.groupId == -1) {
            AD
        } else if (item.childId == -1) {
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
                val v = LayoutInflater.from(parent.context).inflate(R.layout.row_basic_group, parent, false)
                return GroupViewHolder(v)
            }
            CHILDREN -> {
                val v = LayoutInflater.from(parent.context).inflate(R.layout.row_basic_children, parent, false)
                return ChildViewHolder(v)
            }
            AD -> {
                val v = LayoutInflater.from(parent.context).inflate(R.layout.row_ad, parent, false)
                return AdViewHolder(v)
            }
        }
        throw RuntimeException("No viewType found")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        when (holder.itemViewType) {
            PARENT -> {
                groups[item.groupId]?.let {
                    val groupViewHolder = holder as GroupViewHolder
                    groupViewHolder.bind(it)
                }
            }
            CHILDREN -> {
                groups[item.groupId]?.commands?.get(item.childId)?.let {
                    val childViewHolder = holder as ChildViewHolder
                    childViewHolder.bind(it)
                }
            }
            AD -> {
                val childViewHolder = holder as AdViewHolder
                childViewHolder.bind()
            }
        }
    }

    fun updateItems() {
        items.clear()
        groups.forEachIndexed { index, commandGroupModel ->
            items.add(BasicItem(index))
            if (isExpanded(commandGroupModel.id)) {
                commandGroupModel.commands.forEachIndexed { index2, _ ->
                    items.add(BasicItem(index, index2))
                }
            }
        }
        items.add(BasicItem(-1, -1))
    }

    fun updateData(allGroups: RealmResults<BasicGroup>) {
        groups = allGroups
        updateItems()
        notifyDataSetChanged()
    }

    fun updateSearchQuery(query: String) {
        searchQuery = query
    }

    fun isExpanded(id: Int): Boolean {
        return expanded[id] == true
    }

    fun startShareActivity(context: Context, command: BasicCommand) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, command.command)
        try {
            context.startActivity(Intent.createChooser(intent, "Share command"))
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    inner class GroupViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: BasicGroup) {
            itemView.title.text = item.desc.highlightQueryInsideText(itemView.context, searchQuery).result
            itemView.title.setCompoundDrawablesWithIntrinsicBounds(VectorDrawableCompat.create(itemView.context.resources, item.imageResourceId, null), null, null, null)
            itemView.setOnClickListener {
                expanded[item.id] = !isExpanded(item.id)
                updateItems()
                notifyDataSetChanged()
            }
        }
    }

    inner class ChildViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(command: BasicCommand) {
            itemView.description.text = command.command
            itemView.description.setCommands(command.getMansAsStringArray())
            itemView.share.setOnClickListener { view -> startShareActivity(view.context, command) }
        }
    }

    inner class AdViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind() {
            itemView.tvQuiz.setOnClickListener {
                it.context.showPlayStoreActivity(Constants.PACKAGE_QUIZ)
            }
            itemView.tvRemote.setOnClickListener {
                it.context.showPlayStoreActivity(Constants.PACKAGE_LINUXREMOTE)
            }
        }
    }
}