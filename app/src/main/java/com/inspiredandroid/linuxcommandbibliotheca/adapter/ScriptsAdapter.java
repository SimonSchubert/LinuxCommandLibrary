package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.models.ScriptGroupItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by simon on 23.11.15.
 */
public class ScriptsAdapter extends BaseAdapter {

    private LayoutInflater mInflater;

    private ArrayList<ScriptGroupItem> mGroups = new ArrayList<>();

    public ScriptsAdapter(Context context) {
        mGroups.add(new ScriptGroupItem(ScriptGroupItem.GROUP_USER_GROUP, context.getString(R.string.user_groups), R.drawable.ic_account_circle_white_36dp));
        mGroups.add(new ScriptGroupItem(ScriptGroupItem.GROUP_FILE_FOLDER, context.getString(R.string.files_folders), R.drawable.ic_folder_white_48dp));
        mGroups.add(new ScriptGroupItem(ScriptGroupItem.GROUP_INFO, context.getString(R.string.system_info), R.drawable.ic_info_white_48dp));
        mGroups.add(new ScriptGroupItem(ScriptGroupItem.GROUP_SYSTEM_CONTROL, context.getString(R.string.system_control), R.drawable.ic_settings_white_48dp));
        mGroups.add(new ScriptGroupItem(ScriptGroupItem.GROUP_AUDIO_VIDEO, context.getString(R.string.audio_video), R.drawable.ic_ondemand_video_white_48dp));

        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mGroups.size();
    }

    @Override
    public ScriptGroupItem getItem(int position) {
        return mGroups.get(position);
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.row_script_group,
                    parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        final ScriptGroupItem command = getItem(position);
        viewHolder.name.setText(command.getmTitle());
        viewHolder.icon.setImageResource(command.getmIconRes());

        return convertView;
    }

    class ViewHolder {
        @BindView(R.id.row_script_group_tv_title)
        TextView name;
        @BindView(R.id.row_script_group_iv_icon)
        ImageView icon;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
