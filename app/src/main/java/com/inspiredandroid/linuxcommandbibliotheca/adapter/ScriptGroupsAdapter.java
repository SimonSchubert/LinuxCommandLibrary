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
import com.inspiredandroid.linuxcommandbibliotheca.models.ScriptGroupItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by simon on 23.11.15.
 */
public class ScriptGroupsAdapter extends RecyclerView.Adapter<ScriptGroupsAdapter.ViewHolder> {

    final private ArrayList<ScriptGroupItem> mGroups = new ArrayList<>();
    final private Context mContext;
    private OnListClickListener mOnListClickListener;

    public ScriptGroupsAdapter(Context context) {
        mContext = context;
        mGroups.add(new ScriptGroupItem(ScriptGroupItem.GROUP_USER_GROUP, R.string.desc_category_user_groups, R.drawable.ic_account_circle_white_36dp));
        mGroups.add(new ScriptGroupItem(ScriptGroupItem.GROUP_FILE_FOLDER, R.string.desc_category_files_folders, R.drawable.ic_folder_white_48dp));
        mGroups.add(new ScriptGroupItem(ScriptGroupItem.GROUP_INFO, R.string.category_system_info, R.drawable.ic_info_white_48dp));
        mGroups.add(new ScriptGroupItem(ScriptGroupItem.GROUP_SYSTEM_CONTROL, R.string.category_system_control, R.drawable.ic_settings_white_48dp));
        mGroups.add(new ScriptGroupItem(ScriptGroupItem.GROUP_AUDIO_VIDEO, R.string.category_audio_video, R.drawable.ic_ondemand_video_white_48dp));
        mGroups.add(new ScriptGroupItem(ScriptGroupItem.GROUP_NETWORK, R.string.category_network, R.drawable.ic_device_hub_white_48dp));
        mGroups.add(new ScriptGroupItem(ScriptGroupItem.GROUP_SEARCH, R.string.category_search, R.drawable.ic_search_white_48dp));
    }

    public void setOnListClickListener(OnListClickListener listener) {
        mOnListClickListener = listener;
    }

    @Override
    public ScriptGroupsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {
        View v = LayoutInflater.from(mContext)
                .inflate(R.layout.row_scriptgroup, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
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
