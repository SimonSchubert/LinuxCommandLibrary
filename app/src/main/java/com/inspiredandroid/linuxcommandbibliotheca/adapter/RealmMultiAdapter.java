package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

import java.util.List;

import io.realm.RealmObject;
import io.realm.RealmResults;

public abstract class RealmMultiAdapter<T extends RealmObject> extends BaseAdapter {

    protected LayoutInflater mInflater;
    protected List<RealmResults<T>> mRealmResults;
    protected Context mContext;

    public RealmMultiAdapter(Context context, List<RealmResults<T>> realmResults, boolean automaticUpdate) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        mContext = context;
        mRealmResults = realmResults;
        mInflater = LayoutInflater.from(context);
    }

    /**
     * Returns how many items are in the data set.
     *
     * @return count of items.
     */
    @Override
    public int getCount() {
        if (mRealmResults == null) {
            return 0;
        }
        int count = 0;
        for (RealmResults<T> realmResult : mRealmResults) {
            count += realmResult.size();
        }
        return count;
    }

    /**
     * Returns the item associated with the specified position.
     *
     * @param i index of item whose data we want.
     * @return the item at the specified position.
     */
    @Override
    public T getItem(int i) {
        if (mRealmResults == null || mRealmResults.size() == 0) {
            return null;
        }
        int count = 0;
        for (RealmResults<T> realmResult : mRealmResults) {
            if (i < realmResult.size() + count) {
                return realmResult.get(i - count);
            }
            count += realmResult.size();
        }
        return null;
    }

    /**
     * Returns the current ID for an item. Note that item IDs are not stable so you cannot rely on the item ID being the
     * same after {@link #notifyDataSetChanged()} or {@link #updateRealmResults(List<RealmResults<T>>)} has been called.
     *
     * @param i index of item in the adapter.
     * @return current item ID.
     */
    @Override
    public long getItemId(int i) {
        // TODO: find better solution once we have unique IDs
        return i;
    }

    /**
     * Updates the RealmResults associated to the Adapter. Useful when the query has been changed.
     * If the query does not change you might consider using the automaticUpdate feature.
     *
     * @param queryResults the new RealmResults coming from the new query.
     */
    public void updateRealmResults(List<RealmResults<T>> queryResults) {
        mRealmResults = queryResults;
        notifyDataSetChanged();
    }
}