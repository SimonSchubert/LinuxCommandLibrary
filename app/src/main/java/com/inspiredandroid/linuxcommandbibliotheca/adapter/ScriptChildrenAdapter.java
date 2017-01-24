package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.content.Context;
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
import io.realm.Realm;
import io.realm.RealmResults;
import io.realm.Sort;

/**
 * Created by simon on 23/01/17.
 */
public class ScriptChildrenAdapter extends RecyclerView.Adapter<ScriptChildrenAdapter.ViewHolder> {

    final private ArrayList<ScriptGroupItem> mGroups = new ArrayList<>();
    final private Context mContext;
    private com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnListClickListener mOnListClickListener;

    public ScriptChildrenAdapter(Context context, int category) {
        mContext = context;

        Realm realm = Realm.getDefaultInstance();
        RealmResults<CommandGroupModel> commandsAll = realm.where(CommandGroupModel.class).equalTo("category", category).findAll();
        commandsAll.sort("votes", Sort.DESCENDING);

        // sort commands by mCategory
        for (CommandGroupModel command : commandsAll) {
            mGroups.add(new ScriptGroupItem(command.getId(), CommandGroupModel.getDescResourceId(command), CommandGroupModel.getImageResourceId(command)));
        }

        realm.close();
    }

    public void setOnListClickListener(OnListClickListener listener) {
        mOnListClickListener = listener;
    }

    @Override
    public ScriptChildrenAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                               int viewType) {
        View v = LayoutInflater.from(mContext)
                .inflate(R.layout.row_scriptgroup, parent, false);
        return new ScriptChildrenAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ScriptChildrenAdapter.ViewHolder viewHolder, int position) {
        ScriptGroupItem item = mGroups.get(position);

        viewHolder.name.setText(item.getmTitle());
        viewHolder.icon.setImageResource(item.getmIconRes());
    }

    @Override
    public int getItemCount() {
        return mGroups.size();
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
                mOnListClickListener.onClick(mGroups.get(getAdapterPosition()).getId());
            }
        }
    }
}
