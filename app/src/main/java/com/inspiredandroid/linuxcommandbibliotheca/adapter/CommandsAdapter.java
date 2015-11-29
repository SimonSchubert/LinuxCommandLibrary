package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.ResourceCursorAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;
import com.inspiredandroid.linuxcommandbibliotheca.sql.BookmarkManager;

/**
 * Created by Simon Schubert
 */
public class CommandsAdapter extends ResourceCursorAdapter {

    String query = "";

    public CommandsAdapter(Context context, int layout, Cursor c, boolean autoRequery)
    {
        super(context, layout, c, autoRequery);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor)
    {
        String name = cursor.getString(cursor.getColumnIndex(CommandsDBTableModel.COL_NAME));
        TextView tvName = (TextView) view.findViewById(R.id.row_command_child_tv_title);
        tvName.setText(Utils.highlightQueryInsideText(mContext, query, name));

        String description = cursor.getString(cursor.getColumnIndex(CommandsDBTableModel.COL_DESCRIPTION));
        TextView tvDescription = (TextView) view.findViewById(R.id.row_command_child_tv_desc);
        tvDescription.setText(description.trim());

        int section = cursor.getInt(cursor.getColumnIndex(CommandsDBTableModel.COL_CATEGORY));
        ImageView ivIcon = (ImageView) view.findViewById(R.id.row_command_child_iv_icon);
        ivIcon.setImageResource(getSectionImageResource(section));

        // mark bookmark
        long id = cursor.getLong(cursor.getColumnIndex(CommandsDBTableModel.COL_ID));
        if(BookmarkManager.hasBookmark(mContext, id)) {
            ivIcon.setColorFilter(ContextCompat.getColor(context, R.color.ab_primary));
        } else {
            ivIcon.clearColorFilter();
        }
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

    /**
     * Swaps cursor and save query for search result highlighting
     *
     * @param c
     * @param query
     */
    public void updateCursor(Cursor c, String query)
    {
        this.swapCursor(c);
        this.query = query;
    }
}
