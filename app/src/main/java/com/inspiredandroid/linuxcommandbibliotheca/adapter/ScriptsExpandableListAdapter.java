package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simon Schubert
 */
public class ScriptsExpandableListAdapter extends BaseExpandableListAdapter {

    public final static int GROUP_INFO = 0;
    public final static int GROUP_SYSTEM_CONTROL = 1;
    public final static int GROUP_AUDIO_VIDEO = 2;
    public final static int GROUP_COMMANDLINEFU = 3;
    private boolean isLoading = false;
    private String mQuery = "";
    private Activity mContext;
    private ArrayList<ArrayList<CommandGroupModel>> mChild;
    private ArrayList<String> mGroup;

    public ScriptsExpandableListAdapter(Activity context, ArrayList<String> group, ArrayList<ArrayList<CommandGroupModel>> child) {
        this.mContext = context;
        this.mChild = child;
        this.mGroup = group;
    }

    public CommandGroupModel getChild(int groupPosition, int childPosition) {
        return mChild.get(groupPosition).get(childPosition);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public int getChildTypeCount() {
        return 2;
    }

    @Override
    public int getChildType(int groupPosition, int childPosition) {
        return isLoading && groupPosition == GROUP_COMMANDLINEFU && childPosition == mChild.get(GROUP_COMMANDLINEFU).size() ? 1 : 0;
    }

    @Override
    public View getChildView(final int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {
        if (getChildType(groupPosition, childPosition) == 1) {

            // show the loading
            LayoutInflater inflater = mContext.getLayoutInflater();
            ProgressBar pbLoading = (ProgressBar) inflater.inflate(R.layout.row_script_loading_child, parent, false);
            pbLoading.setTag(null);
            return pbLoading;

        } else {

            CommandGroupModel command = getChild(groupPosition, childPosition);
            CommandViewHolder holder;

            if (convertView == null) {
                LayoutInflater inflater = mContext.getLayoutInflater();
                convertView = inflater.inflate(R.layout.row_script_child, parent, false);

                holder = new CommandViewHolder();
                holder.desc = (TextView) convertView.findViewById(R.id.row_script_child_tv_title);
                holder.icon = (ImageView) convertView.findViewById(R.id.row_script_child_iv_icon);

                convertView.setTag(holder);
            } else {
                holder = (CommandViewHolder) convertView.getTag();
            }

            holder.desc.setText(Utils.highlightQueryInsideText(mContext, mQuery, CommandGroupModel.getDescString(command, mContext)));
            holder.icon.setImageResource(getCommandIconResource(command));

            convertView.setTag(R.id.ID, command);

            return convertView;
        }
    }

    /**
     * Get icon, in case there is no icon set: return the default tux icon
     *
     * @param command
     * @return
     */
    private int getCommandIconResource(CommandGroupModel command) {
        return command.getIconResource() == null ? R.drawable.icon_linux : mContext.getResources().getIdentifier(command.getIconResource(), "drawable", mContext.getPackageName());
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        if (isLoading && groupPosition == GROUP_COMMANDLINEFU) {
            return mChild.get(groupPosition).size() + 1;
        }
        return mChild.get(groupPosition).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return mGroup.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return mGroup.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String title = (String) getGroup(groupPosition);
        CommandGroupViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = mContext.getLayoutInflater();
            convertView = inflater.inflate(R.layout.row_command_group, parent, false);

            holder = new CommandGroupViewHolder();
            holder.title = (TextView) convertView.findViewById(R.id.row_command_group_tv_title);
            holder.size = (TextView) convertView.findViewById(R.id.row_command_group_tv_size);

            convertView.setTag(holder);
        } else {
            holder = (CommandGroupViewHolder) convertView.getTag();
        }

        holder.title.setText(title);
        holder.size.setText(String.valueOf(mChild.get(groupPosition).size()));

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    public void updateEntries(String query, ArrayList<String> groups, ArrayList<ArrayList<CommandGroupModel>> child) {
        mQuery = query;
        mGroup = groups;
        mChild = child;
        notifyDataSetChanged();
    }

    public void updateEntries(int group, List<CommandGroupModel> commands) {
        mChild.get(group).clear();
        mChild.get(group).addAll(commands);
        notifyDataSetChanged();
    }

    /**
     * enable loading view
     */
    public void setLoading() {
        isLoading = true;
        notifyDataSetChanged();
    }

    /**
     * disable loading view
     */
    public void setLoadingFinished() {
        isLoading = false;
        notifyDataSetChanged();
    }

    public class CommandViewHolder {
        public TextView desc;
        public ImageView icon;
    }

    public class CommandGroupViewHolder {
        public TextView title;
        public TextView size;
    }
}