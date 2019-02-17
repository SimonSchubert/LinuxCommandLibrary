package com.inspiredandroid.linuxcommandbibliotheca.adapter

import android.support.graphics.drawable.VectorDrawableCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnClickListListener
import com.inspiredandroid.linuxcommandbibliotheca.models.BasicGroupModel
import io.realm.OrderedRealmCollection
import io.realm.RealmRecyclerViewAdapter
import kotlinx.android.synthetic.main.row_basic_category.view.*

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
class BasicCategoryAdapter(data: OrderedRealmCollection<BasicGroupModel>, autoUpdate: Boolean) : RealmRecyclerViewAdapter<BasicGroupModel, BasicCategoryAdapter.ViewHolder>(data, autoUpdate) {

    private var onListClickListener: OnClickListListener? = null

    fun setOnListClickListener(listener: OnClickListListener) {
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
            itemView.title.setCompoundDrawablesWithIntrinsicBounds(VectorDrawableCompat.create(itemView.context.resources, item.iconResourceId, null), null, null, null)
        }

        override fun onClick(view: View) {
            getItem(adapterPosition)?.let {
                onListClickListener?.onClickList(it.id)
            }
        }
    }
}
