package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

import java.util.List;

import io.realm.RealmObject;
import io.realm.RealmResults;

public abstract class RealmMultiAdapter<T extends RealmObject> extends BaseAdapter {

    protected LayoutInflater inflater;
    protected List<RealmResults<T>> realmResults;
    protected Context context;

    public RealmMultiAdapter(Context context, List<RealmResults<T>> realmResults, boolean automaticUpdate) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        this.context = context;
        this.realmResults = realmResults;
        this.inflater = LayoutInflater.from(context);
    }

    /**
     * Returns how many items are in the data set.
     *
     * @return count of items.
     */
    @Override
    public int getCount() {
        if (realmResults == null) {
            return 0;
        }
        int count = 0;
        for (RealmResults<T> realmResult : realmResults) {
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
        if (realmResults == null || realmResults.size() == 0) {
            return null;
        }
        int count = 0;
        for (RealmResults<T> realmResult : realmResults) {
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

        this.realmResults = queryResults;
        notifyDataSetChanged();
    }
}