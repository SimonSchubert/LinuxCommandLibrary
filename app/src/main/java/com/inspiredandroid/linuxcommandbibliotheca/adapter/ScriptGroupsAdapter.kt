package com.inspiredandroid.linuxcommandbibliotheca.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnListClickListener
import com.inspiredandroid.linuxcommandbibliotheca.models.BasicGroupModel
import io.realm.OrderedRealmCollection
import io.realm.RealmRecyclerViewAdapter
import kotlinx.android.synthetic.main.row_scriptgroup.view.*

/**
 * Created by simon on 23.11.15.
 */
class ScriptGroupsAdapter(data: OrderedRealmCollection<BasicGroupModel>?, autoUpdate: Boolean) : RealmRecyclerViewAdapter<BasicGroupModel, ScriptGroupsAdapter.ScriptViewHolder>(data, autoUpdate) {

    private var mOnListClickListener: OnListClickListener? = null

    fun setOnListClickListener(listener: OnListClickListener) {
        mOnListClickListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ScriptViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_scriptgroup, parent, false)
        return ScriptViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ScriptViewHolder, position: Int) {
        val item = data!![position]

        viewHolder.bind(item)
    }

    inner class ScriptViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {

        init {
            view.setOnClickListener(this)
        }

        fun bind(item: BasicGroupModel) {
            itemView.row_scriptgroup_tv_title.text = item.title
            itemView.row_scriptgroup_iv_icon.setImageResource(item.iconResourceId)
        }

        override fun onClick(view: View) {
            if (mOnListClickListener != null) {
                mOnListClickListener!!.onClick(data!![adapterPosition].id)
            }
        }
    }
}
