package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.ScriptGroupItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Realm;
import io.realm.RealmResults;
import io.realm.Sort;

/**
 * Created by simon on 23/01/17.
 */
public class ScriptsCategoryAdapter extends BaseAdapter {

    private LayoutInflater mInflater;

    private ArrayList<ScriptGroupItem> mGroups = new ArrayList<>();

    public ScriptsCategoryAdapter(Context context, int category) {

        Realm realm = Realm.getDefaultInstance();
        RealmResults<CommandGroupModel> commandsAll = realm.where(CommandGroupModel.class).equalTo("category", category).findAll();
        commandsAll.sort("votes", Sort.DESCENDING);

        // sort commands by mCategory
        for (CommandGroupModel command : commandsAll) {
            mGroups.add(new ScriptGroupItem(command.getId(), CommandGroupModel.getDescString(command, context), getCommandIconResource(context, command)));
        }

        realm.close();

        mInflater = LayoutInflater.from(context);
    }

    /**
     * Get icon, in case there is no icon set: return the default tux icon
     *
     * @param command
     * @return
     */
    private int getCommandIconResource(Context context, CommandGroupModel command) {
        return command.getIconResource() == null ? R.drawable.icon_linux : context.getResources().getIdentifier(command.getIconResource(), "drawable", context.getPackageName());
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
