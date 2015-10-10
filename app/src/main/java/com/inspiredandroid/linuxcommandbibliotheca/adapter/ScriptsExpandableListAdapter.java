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
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;

import java.util.ArrayList;

public class ScriptsExpandableListAdapter extends BaseExpandableListAdapter {

    public final static int GROUP_INFO = 0;
    public final static int GROUP_SYSTEM_CONTROL = 1;
    public final static int GROUP_AUDIO_VIDEO = 2;
    public final static int GROUP_COMMANDLINEFU = 3;
    boolean isLoading = false;
    String mQuery = "";
    private Activity mContext;
    private ArrayList<ArrayList<CommandGroupModel>> mChild;
    private ArrayList<String> mGroup;

    public ScriptsExpandableListAdapter(Activity context, ArrayList<String> group, ArrayList<ArrayList<CommandGroupModel>> child)
    {
        this.mContext = context;
        this.mChild = child;
        this.mGroup = group;
    }

    public CommandGroupModel getChild(int groupPosition, int childPosition)
    {
        return mChild.get(groupPosition).get(childPosition);
    }

    // enable loading view
    public void setLoading()
    {
        isLoading = true;
        notifyDataSetChanged();
    }

    // disable loading view
    public void setLoadingFinished()
    {
        isLoading = false;
        notifyDataSetChanged();
    }

    public long getChildId(int groupPosition, int childPosition)
    {
        return childPosition;
    }

    public View getChildView(final int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent)
    {
        // check if is loading
        if (isLoading && groupPosition == GROUP_COMMANDLINEFU && childPosition == mChild.get(GROUP_COMMANDLINEFU).size()) {
            ProgressBar pbLoading = new ProgressBar(mContext);
            pbLoading.setPadding(0, 10, 0, 10);
            pbLoading.setTag(null);
            return pbLoading;
        }

        CommandGroupModel command = getChild(groupPosition, childPosition);
        CommandViewHolder holder;

        if (convertView == null || convertView.getTag() == null) {
            LayoutInflater inflater = mContext.getLayoutInflater();
            convertView = inflater.inflate(R.layout.row_script_child, parent, false);

            holder = new CommandViewHolder();
            holder.desc = (TextView) convertView.findViewById(R.id.row_script_child_tv_title);
            holder.icon = (ImageView) convertView.findViewById(R.id.row_script_child_iv_icon);

            convertView.setTag(holder);
        } else {
            holder = (CommandViewHolder) convertView.getTag();
        }

        //holder.command.setText(command.getCommand());//

        holder.desc.setText(CommandsAdapter.highlight(mContext, mQuery, command.getDesc(mContext)));

//      holder.compatibility.removeAllViews();

        /*
        for(CommandCompatibilityModel mode : command.getCompatibility()) {
            ImageView ivIcon = new ImageView(mContext);
            ivIcon.setMaxWidth(30);
            ivIcon.setAdjustViewBounds(true);

            if(mode.getSystem() == 0) {
                ivIcon.setImageResource(R.drawable.icon_linux);
            } else if(mode.getSystem() == 1) {
                ivIcon.setImageResource(R.drawable.icon_gnome);
            } else if(mode.getSystem() == 2) {
                ivIcon.setImageResource(R.drawable.icon_kde);
            }

            holder.compatibility.addView(ivIcon);
        }
        */

        if (!"".equals(command.getIconResource())) {
            int drawableResourceId = mContext.getResources().getIdentifier(command.getIconResource(), "drawable", mContext.getPackageName());

            holder.icon.setImageResource(drawableResourceId);
        } else {
            holder.icon.setImageResource(R.drawable.icon_linux);
        }

        convertView.setTag(R.id.ID, command);

        return convertView;
    }

    public int getChildrenCount(int groupPosition)
    {
        if (isLoading && groupPosition == GROUP_COMMANDLINEFU) {
            return mChild.get(groupPosition).size() + 1;
        }
        return mChild.get(groupPosition).size();
    }

    public Object getGroup(int groupPosition)
    {
        return mGroup.get(groupPosition);
    }

    public int getGroupCount()
    {
        return mGroup.size();
    }

    public long getGroupId(int groupPosition)
    {
        return groupPosition;
    }

    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent)
    {
        String laptopName = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater inflater = mContext.getLayoutInflater();
            convertView = inflater.inflate(R.layout.row_command_group,
                    parent, false);
        }
        TextView tvTitle = (TextView) convertView.findViewById(R.id.row_command_group_tv_title);
        tvTitle.setText(laptopName);

        TextView tvSize = (TextView) convertView.findViewById(R.id.row_command_group_tv_size);
        tvSize.setText(String.valueOf(mChild.get(groupPosition).size()));

        return convertView;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public boolean isChildSelectable(int groupPosition, int childPosition)
    {
        return true;
    }

    public void updateEntries(String query, ArrayList<String> groups, ArrayList<ArrayList<CommandGroupModel>> child)
    {
        mQuery = query;
        mGroup = groups;
        mChild = child;
        notifyDataSetChanged();
    }

    public void addEntries(int group, ArrayList<CommandGroupModel> commands)
    {
        mChild.get(group).addAll(commands);
        notifyDataSetChanged();
    }

    public class CommandViewHolder {
        public TextView desc;
        public ImageView icon;
    }
}