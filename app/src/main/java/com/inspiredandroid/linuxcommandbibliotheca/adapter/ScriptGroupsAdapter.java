package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnListClickListener;
import com.inspiredandroid.linuxcommandbibliotheca.models.BasicGroupModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandChildModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.ScriptGroupItem;
import com.inspiredandroid.linuxcommandbibliotheca.view.TerminalTextView;

import java.util.ArrayList;
import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.OrderedRealmCollection;
import io.realm.RealmRecyclerViewAdapter;

/**
 * Created by simon on 23.11.15.
 */
public class ScriptGroupsAdapter extends RealmRecyclerViewAdapter<BasicGroupModel, ScriptGroupsAdapter.ViewHolder> {

    public ScriptGroupsAdapter(@Nullable OrderedRealmCollection<BasicGroupModel> data, boolean autoUpdate) {
        super(data, autoUpdate);
    }

    private OnListClickListener mOnListClickListener;

    public void setOnListClickListener(OnListClickListener listener) {
        mOnListClickListener = listener;
    }

    @Override
    public ScriptGroupsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_scriptgroup, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        BasicGroupModel item = getData().get(position);

        viewHolder.name.setText(item.getTitle());
        viewHolder.icon.setImageResource(item.getIconResourceId());
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.row_scriptgroup_tv_title)
        TextView name;
        @BindView(R.id.row_scriptgroup_iv_icon)
        ImageView icon;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mOnListClickListener != null) {
                mOnListClickListener.onClick(getData().get(getAdapterPosition()).getId());
            }
        }
    }
}
