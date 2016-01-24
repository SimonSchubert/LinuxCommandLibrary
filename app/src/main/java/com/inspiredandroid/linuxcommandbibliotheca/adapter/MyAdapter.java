package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;
import com.inspiredandroid.linuxcommandbibliotheca.models.Command;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;

import java.io.IOException;

import io.realm.RealmBaseAdapter;
import io.realm.RealmResults;

public class MyAdapter extends RealmBaseAdapter<Command> implements ListAdapter {

    private String query = "";

    public void setSearchQuery(String searchQuery)
    {
        this.query = searchQuery;
    }

    private static class MyViewHolder {
        TextView name;
        TextView description;
        ImageView icon;
    }

    public MyAdapter(Context context,
                     RealmResults<Command> realmResults,
                     boolean automaticUpdate) {
        super(context, realmResults, automaticUpdate);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.row_command_child,
                                           parent, false);
            viewHolder = new MyViewHolder();
            viewHolder.name =  (TextView) convertView.findViewById(R.id.row_command_child_tv_title);
            viewHolder.description = (TextView) convertView.findViewById(R.id.row_command_child_tv_desc);
            viewHolder.icon = (ImageView) convertView.findViewById(R.id.row_command_child_iv_icon);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (MyViewHolder) convertView.getTag();
        }

        Command item = realmResults.get(position);
        viewHolder.name.setText(Utils.highlightQueryInsideText(context, query, item.getName()));
        viewHolder.description.setText(item.getDescription().trim());
        viewHolder.icon.setImageResource(getSectionImageResource(item.getCategory()));

        return convertView;
    }

    @Override
    public long getItemId(int i)
    {
        return realmResults.get(i).getId();
    }

    /**
     * Get section icon
     *
     * @param section
     * @return
     */
    private int getSectionImageResource(int section)
    {
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
}