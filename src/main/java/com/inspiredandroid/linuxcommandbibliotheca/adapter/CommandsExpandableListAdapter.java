package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandCompatibilityModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandModel;
import com.inspiredandroid.linuxcommandbibliotheca.viewholder.CommandViewHolder;

import java.util.ArrayList;

public class CommandsExpandableListAdapter extends BaseExpandableListAdapter {
 
    private Activity mContext;
    private ArrayList<ArrayList<CommandModel>> mChild;
    private ArrayList<String> mGroup;
 
    public CommandsExpandableListAdapter(Activity context, ArrayList<String> group, ArrayList<ArrayList<CommandModel>> child) {
        this.mContext = context;
        this.mChild = child;
        this.mGroup = group;
    }
 
    public CommandModel getChild(int groupPosition, int childPosition) {
        return mChild.get(groupPosition).get(childPosition);
    }
 
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }
 
    public View getChildView(final int groupPosition, final int childPosition,
            boolean isLastChild, View convertView, ViewGroup parent) {

        CommandModel command =  getChild(groupPosition, childPosition);
        CommandViewHolder holder;
 
        if (convertView == null) {
            LayoutInflater inflater = mContext.getLayoutInflater();
            convertView = inflater.inflate(R.layout.cell_command_child, parent, false);

            holder = new CommandViewHolder();
            holder.command = (TextView) convertView.findViewById(R.id.laptop);
            holder.desc = (TextView) convertView.findViewById(R.id.desc);
            holder.icon = (ImageView) convertView.findViewById(R.id.ivIcon);
            holder.compatibility = (LinearLayout) convertView.findViewById(R.id.llCommandCompatibilityInfo);

            convertView.setTag(holder);
        } else {
            holder = (CommandViewHolder) convertView.getTag();
        }
 
        holder.command.setText(command.getCommand());
        holder.desc.setText(command.getDesc());

        holder.compatibility.removeAllViews();

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

        if(!"".equals(command.getIconResource())) {
            int drawableResourceId = mContext.getResources().getIdentifier(command.getIconResource(), "drawable", mContext.getPackageName());

            holder.icon.setImageResource(drawableResourceId);
        } else  {
            holder.icon.setImageResource(R.drawable.icon_linux);
        }

        convertView.setTag(R.id.ID, command);

        return convertView;
    }
 
    public int getChildrenCount(int groupPosition) {
        return mChild.get(groupPosition).size();
    }
 
    public Object getGroup(int groupPosition) {
        return mGroup.get(groupPosition);
    }
 
    public int getGroupCount() {
        return mGroup.size();
    }
 
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }
 
    public View getGroupView(int groupPosition, boolean isExpanded,
            View convertView, ViewGroup parent) {
        String laptopName = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater inflater = mContext.getLayoutInflater();
            convertView = inflater.inflate(R.layout.cell_command_group,
                    parent, false);
        }
        TextView tvTitle = (TextView) convertView.findViewById(R.id.tvGroupTitle);
        tvTitle.setText(laptopName);

        TextView tvSize = (TextView) convertView.findViewById(R.id.tvGroupSize);
        tvSize.setText(String.valueOf(mChild.get(groupPosition).size()));

        return convertView;
    }
 
    public boolean hasStableIds() {
        return true;
    }
 
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    public void updateEntries(ArrayList<String> groups, ArrayList<ArrayList<CommandModel>> child ) {
        mGroup = groups;
        mChild = child;
        notifyDataSetChanged();
    }
}