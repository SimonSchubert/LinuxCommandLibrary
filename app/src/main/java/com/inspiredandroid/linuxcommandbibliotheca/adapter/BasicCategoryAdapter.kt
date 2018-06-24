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
import kotlinx.android.synthetic.main.row_basic_category.view.*

/**
 * Created by simon on 23.11.15.
 */
class BasicCategoryAdapter(data: OrderedRealmCollection<BasicGroupModel>, autoUpdate: Boolean) : RealmRecyclerViewAdapter<BasicGroupModel, BasicCategoryAdapter.ViewHolder>(data, autoUpdate) {

    private var onListClickListener: OnListClickListener? = null

    fun setOnListClickListener(listener: OnListClickListener) {
        onListClickListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_basic_category, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        getItem(position)?.let {
            viewHolder.bind(it)
        }
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {

        init {
            view.setOnClickListener(this)
        }

        fun bind(item: BasicGroupModel) {
            itemView.title.text = item.title
            itemView.title.setCompoundDrawablesWithIntrinsicBounds(item.iconResourceId, 0,0,0)
        }

        override fun onClick(view: View) {
            getItem(adapterPosition)?.let {
                onListClickListener?.onClick(it.id)
            }
        }
    }
}
