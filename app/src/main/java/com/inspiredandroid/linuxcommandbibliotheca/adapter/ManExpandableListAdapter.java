package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.app.Activity;
import android.text.Html;
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

/**
 * Created by Simon Schubert
 */
public class ManExpandableListAdapter extends BaseExpandableListAdapter {

    private Activity mContext;
    private ArrayList<String> mChild;
    private ArrayList<String> mGroup;

    public ManExpandableListAdapter(Activity context, ArrayList<String> group, ArrayList<String> child)
    {
        this.mContext = context;
        this.mChild = child;
        this.mGroup = group;
    }

    public String getChild(int groupPosition, int childPosition)
    {
        return mChild.get(groupPosition);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition)
    {
        return childPosition;
    }

    @Override
    public View getChildView(final int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent)
    {
        String description = getChild(groupPosition, childPosition);
        CommandViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = mContext.getLayoutInflater();
            convertView = inflater.inflate(R.layout.row_man_child, parent, false);

            holder = new CommandViewHolder();
            holder.desc = (TextView) convertView.findViewById(R.id.row_man_child_tv_description);

            convertView.setTag(holder);
        } else {
            holder = (CommandViewHolder) convertView.getTag();
        }

        holder.desc.setText(Html.fromHtml(description));

        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition)
    {
        return 1;
    }

    @Override
    public Object getGroup(int groupPosition)
    {
        return mGroup.get(groupPosition);
    }

    @Override
    public int getGroupCount()
    {
        return mGroup.size();
    }

    @Override
    public long getGroupId(int groupPosition)
    {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent)
    {
        String title = (String) getGroup(groupPosition);
        CommandGroupViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = mContext.getLayoutInflater();
            convertView = inflater.inflate(R.layout.row_man_group, parent, false);

            holder = new CommandGroupViewHolder();
            holder.title = (TextView) convertView.findViewById(R.id.row_man_group_tv_title);

            convertView.setTag(holder);
        } else {
            holder = (CommandGroupViewHolder) convertView.getTag();
        }

        holder.title.setText(title.toUpperCase());

        return convertView;
    }

    @Override
    public boolean hasStableIds()
    {
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition)
    {
        return true;
    }

    public class CommandViewHolder {
        public TextView desc;
    }

    public class CommandGroupViewHolder {
        public TextView title;
    }
}