package com.inspiredandroid.linuxcommandbibliotheca.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.google.firebase.analytics.FirebaseAnalytics
import com.inspiredandroid.linuxcommandbibliotheca.BuildConfig
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.adapter.SearchAdapter.ItemViewHolder
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandChildModel
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel
import com.inspiredandroid.linuxcommandbibliotheca.view.TerminalTextView
import io.realm.OrderedRealmCollection
import io.realm.RealmRecyclerViewAdapter
import kotlinx.android.synthetic.main.row_scriptchild.view.*
import java.util.*

/**
 * Created by simon on 23/01/17.
 */
class SearchAdapter(data: OrderedRealmCollection<CommandGroupModel>?, autoUpdate: Boolean, private val mFirebaseAnalytics: FirebaseAnalytics) : RealmRecyclerViewAdapter<CommandGroupModel, ItemViewHolder>(data, autoUpdate) {

    private val expanded: HashMap<Int, Boolean>
    private var mQuery = ""

    init {
        expanded = HashMap()
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ItemViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_scriptchild, parent, false)
        return ItemViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ItemViewHolder, position: Int) {
        val item = data!![position]
        viewHolder.bind(item)
    }

    private fun trackSelectContent(id: String?) {
        if (BuildConfig.DEBUG) {
            return
        }
        val bundle = Bundle()
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id)
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Basic Group")
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle)
    }

    private fun isExpanded(position: Int): Boolean {
        return expanded.containsKey(position) && expanded[position]!!
    }

    fun setQuery(query: String) {
        mQuery = query
    }

    /**
     * let user share the command with any compatible app
     *
     * @param command
     */
    private fun startShareActivity(context: Context, command: CommandChildModel) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, command.command)

        try {
            context.startActivity(intent)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: CommandGroupModel) {
            itemView.row_scriptgroup_tv_title.text = Utils.highlightQueryInsideText(itemView.context, mQuery, item.desc)
            itemView.row_scriptgroup_iv_icon.setImageResource(item.imageResourceId)
            itemView.row_scriptgroup_ll_detail.removeAllViews()
            for (command in item.commands!!) {
                val v = LayoutInflater.from(itemView.context).inflate(R.layout.row_scriptchild_child, itemView.row_scriptgroup_ll_detail, false)

                val tv = v.findViewById<View>(R.id.row_scriptdescription_child_tv_description) as TerminalTextView
                tv.text = command.command
                tv.setCommands(CommandChildModel.getMans(command))

                val btn = v.findViewById<View>(R.id.row_scriptdescription_child_iv_share) as ImageButton
                btn.setOnClickListener { view -> startShareActivity(view.context, command) }

                itemView.row_scriptgroup_ll_detail.addView(v)
            }
            itemView.row_scriptgroup_ll_detail.visibility = if (isExpanded(position)) View.VISIBLE else View.GONE
            itemView.setOnClickListener { view ->
                expanded[position] = !isExpanded(position)
                notifyItemChanged(position)
                trackSelectContent(item.desc)
            }
        }
    }
}
