package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;
import com.inspiredandroid.linuxcommandbibliotheca.models.Command;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;
import com.inspiredandroid.linuxcommandbibliotheca.sql.BookmarkManager;

import java.util.ArrayList;
import java.util.List;

import io.realm.RealmResults;

public class CommandsAdapter extends RealmMultiAdapter<Command> implements ListAdapter {

    private String mQuery = "";
    private ArrayList<Long> mIds;

    public CommandsAdapter(Context context,
                           List<RealmResults<Command>> realmResults,
                           boolean automaticUpdate) {
        super(context, realmResults, automaticUpdate);
        updateBookmarkIds();
    }

    public void setSearchQuery(String searchQuery) {
        mQuery = searchQuery;
    }

    public void updateBookmarkIds() {
        mIds = BookmarkManager.getBookmarkIds(mContext);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.row_command_child,
                    parent, false);
            viewHolder = new ViewHolder();
            viewHolder.name = (TextView) convertView.findViewById(R.id.row_command_child_tv_title);
            viewHolder.description = (TextView) convertView.findViewById(R.id.row_command_child_tv_desc);
            viewHolder.icon = (ImageView) convertView.findViewById(R.id.row_command_child_iv_icon);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Command item = getItem(position);
        viewHolder.name.setText(Utils.highlightQueryInsideText(mContext, mQuery, item.getName()));
        viewHolder.description.setText(item.getDescription().trim());
        viewHolder.icon.setImageResource(getSectionImageResource(item.getCategory()));
        if(mIds.contains((long)item.getId()) ) {
            viewHolder.icon.setColorFilter(ContextCompat.getColor(mContext, R.color.ab_primary));
        } else {
            viewHolder.icon.setColorFilter(null);
        }

        return convertView;
    }

    @Override
    public long getItemId(int i) {
        return getItem(i).getId();
    }

    /**
     * Get section icon
     *
     * @param section
     * @return
     */
    private int getSectionImageResource(int section) {
        switch (section) {
            case CommandsDBTableModel.SCTION_GAMES:
                return R.drawable.icon_section_game;
            case CommandsDBTableModel.SCTION_SYSTEMADMINANDDEAMON:
                return R.drawable.icon_section_usercommands;
            case CommandsDBTableModel.SCTION_USERCOMMANDS:
                return R.drawable.icon_section_usercommands;
            case CommandsDBTableModel.SCTION_SYSTEMCALLS:
                return R.drawable.icon_section_code;
            case CommandsDBTableModel.SCTION_MISSCELANOUS:
                return R.drawable.icon_section_usercommands;
        }
        return R.drawable.icon_linux;
    }

    private static class ViewHolder {
        TextView name;
        TextView description;
        ImageView icon;
    }
}