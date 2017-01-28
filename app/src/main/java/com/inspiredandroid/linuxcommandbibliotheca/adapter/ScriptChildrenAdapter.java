package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnListClickListener;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.ScriptGroupItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.OrderedRealmCollection;
import io.realm.Realm;
import io.realm.RealmRecyclerViewAdapter;
import io.realm.RealmResults;
import io.realm.Sort;

/**
 * Created by simon on 23/01/17.
 */
public class ScriptChildrenAdapter extends RealmRecyclerViewAdapter<CommandGroupModel, ScriptChildrenAdapter.ViewHolder> {

    private OnListClickListener mOnListClickListener;

    public ScriptChildrenAdapter(@NonNull Context context, @Nullable OrderedRealmCollection<CommandGroupModel> data, boolean autoUpdate) {
        super(context, data, autoUpdate);
    }

    public void setOnListClickListener(OnListClickListener listener) {
        mOnListClickListener = listener;
    }

    @Override
    public ScriptChildrenAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                               int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_scriptgroup, parent, false);
        return new ScriptChildrenAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ScriptChildrenAdapter.ViewHolder viewHolder, int position) {
        CommandGroupModel item = getData().get(position);

        viewHolder.name.setText(CommandGroupModel.getDescResourceId(item));
        viewHolder.icon.setImageResource(CommandGroupModel.getImageResourceId(item));
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
