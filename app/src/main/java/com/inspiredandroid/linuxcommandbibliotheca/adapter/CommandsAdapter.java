package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.ResourceCursorAdapter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;

import java.text.Normalizer;

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
        tvName.setText(highlight(mContext, query, name));

        String description = cursor.getString(cursor.getColumnIndex(CommandsDBTableModel.COL_DESCRIPTION));
        TextView tvDescription = (TextView) view.findViewById(R.id.row_command_child_tv_desc);
        tvDescription.setText(description.trim());

        int section = cursor.getInt(cursor.getColumnIndex(CommandsDBTableModel.COL_CATEGORY));
        ImageView ivIcon = (ImageView) view.findViewById(R.id.row_command_child_iv_icon);
        ivIcon.setImageResource(getSectionImageResource(section));
    }

    public static CharSequence highlight(Context context, String search, String originalText)
    {
        if (search.isEmpty() || originalText.isEmpty()) {
            return originalText;
        }

        // ignore case and accents
        // the same thing should have been done for the search text
        String normalizedText = Normalizer.normalize(originalText, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").toLowerCase();

        int start = normalizedText.indexOf(search);
        if (start < 0) {
            // not found, nothing to to
            return originalText;
        } else {
            // highlight each appearance in the original text
            // while searching in normalized text
            Spannable highlighted = new SpannableString(originalText);
            while (start >= 0) {
                int spanStart = Math.min(start, originalText.length());
                int spanEnd = Math.min(start + search.length(), originalText.length());

                highlighted.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.primary_dark)), spanStart, spanEnd, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                start = normalizedText.indexOf(search, spanEnd);
            }

            return highlighted;
        }
    }

    /**
     * Get section icon
     * @param section
     * @return
     */
    private int getSectionImageResource(int section)
    {
        switch(section) {
            case CommandsDBTableModel.SCTION_GAMES:
                return R.drawable.icon_section_game;
            case CommandsDBTableModel.SCTION_SYSTEMADMINANDDEAMON:
                return R.drawable.icon_section_systemadmin;
            case CommandsDBTableModel.SCTION_USERCOMMANDS:
                return R.drawable.icon_section_usercommands;
            case CommandsDBTableModel.SCTION_SYSTEMCALLS:
                return R.drawable.icon_section_code;
            case CommandsDBTableModel.SCTION_MISSCELANOUS:
                return R.drawable.icon_section_misc;
        }
        return R.drawable.icon_linux;
    }

    /**
     * Swaps cursor and save query for search result highlighting
     * @param c
     * @param query
     */
    public void updateCursor(Cursor c, String query)
    {
        this.swapCursor(c);
        this.query = query;
    }
}
