package com.inspiredandroid.linuxcommandbibliotheca.adapter

import android.content.Context
import android.view.LayoutInflater
import android.widget.BaseAdapter

import io.realm.RealmObject
import io.realm.RealmResults

abstract class RealmMultiAdapter<T : RealmObject>(protected var mContext: Context?, protected var mRealmResults: List<RealmResults<T>>?, automaticUpdate: Boolean) : BaseAdapter() {

    protected var mInflater: LayoutInflater

    init {
        if (mContext == null) {
            throw IllegalArgumentException("Context cannot be null")
        }
        mInflater = LayoutInflater.from(mContext)
    }

    /**
     * Returns how many items are in the data set.
     *
     * @return count of items.
     */
    override fun getCount(): Int {
        if (mRealmResults == null) {
            return 0
        }
        var count = 0
        for (realmResult in mRealmResults!!) {
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
    override fun getItem(i: Int): T? {
        if (mRealmResults == null || mRealmResults!!.size == 0) {
            return null
        }
        var count = 0
        for (realmResult in mRealmResults!!) {
            if (i < realmResult.size + count) {
                return realmResult[i - count]
            }
            count += realmResult.size
        }
        return null
    }

    /**
     * Returns the current ID for an item. Note that item IDs are not stable so you cannot rely on the item ID being the
     * same after [.notifyDataSetChanged] or [&lt;][.updateRealmResults] has been called.
     *
     * @param i index of item in the adapter.
     * @return current item ID.
     */
    override fun getItemId(i: Int): Long {
        // TODO: find better solution once we have unique IDs
        return i.toLong()
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