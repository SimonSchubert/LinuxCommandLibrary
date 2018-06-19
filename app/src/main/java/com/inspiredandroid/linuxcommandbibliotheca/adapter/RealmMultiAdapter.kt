package com.inspiredandroid.linuxcommandbibliotheca.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.widget.BaseAdapter

import io.realm.RealmObject
import io.realm.RealmResults

abstract class RealmMultiAdapter<T : RealmObject>(private var mRealmResults: List<RealmResults<T>>, automaticUpdate: Boolean) : RecyclerView.Adapter<CommandsAdapter.ViewHolder>() {

    /**
     * Returns how many items are in the data set.
     *
     * @return count of items.
     */
    override fun getItemCount(): Int {
        var count = 0
        for (realmResult in mRealmResults) {
            count += realmResult.size
        }
        return count
    }

    /**
     * Returns the item associated with the specified position.
     *
     * @param i index of item whose data we want.
     * @return the item at the specified position.
     */
    fun getItem(i: Int): T? {
        if (mRealmResults.isEmpty()) {
            return null
        }
        var count = 0
        for (realmResult in mRealmResults) {
            if (i < realmResult.size + count) {
                return realmResult[i - count]
            }
            count += realmResult.size
        }
        return null
    }

    /**
     * Updates the RealmResults associated to the Adapter. Useful when the query has been changed.
     * If the query does not change you might consider using the automaticUpdate feature.
     *
     * @param queryResults the new RealmResults coming from the new query.
     */
    fun updateRealmResults(queryResults: List<RealmResults<T>>) {
        mRealmResults = queryResults
        notifyDataSetChanged()
    }
}