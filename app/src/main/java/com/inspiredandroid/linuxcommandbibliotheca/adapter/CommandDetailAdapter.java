package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;

import com.inspiredandroid.linuxcommandbibliotheca.CommandBibliothecaActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandChildModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;
import com.inspiredandroid.linuxcommandbibliotheca.view.CodeTextView;

/**
 * Created by simon on 23.11.15.
 */
public class CommandDetailAdapter extends BaseAdapter {

    private CommandGroupModel mCommandGroupModel;
    private Context mContext;

    public CommandDetailAdapter(Context context, CommandGroupModel commandGroupModel) {
        this.mContext = context;
        this.mCommandGroupModel = commandGroupModel;
    }

    @Override
    public int getCount() {
        return mCommandGroupModel.getCommands().size();
    }

    @Override
    public CommandChildModel getItem(int position) {
        return mCommandGroupModel.getCommands().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final CommandChildModel command = getItem(position);
        CommandViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row_scriptdescription_child, parent, false);

            holder = new CommandViewHolder();
            holder.command = (CodeTextView) convertView.findViewById(R.id.row_scriptdescription_child_tv_description);
            holder.share = (ImageButton) convertView.findViewById(R.id.row_scriptdescription_child_iv_share);

            convertView.setTag(holder);
        } else {
            holder = (CommandViewHolder) convertView.getTag();
        }

        holder.command.setText(command.getCommand());
        holder.command.setCommands(CommandChildModel.getMans(command));
        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleCommandClick(command);
            }
        });

        return convertView;
    }

    /**
     * decide how to handle share
     *
     * @param command
     */
    private void handleCommandClick(CommandChildModel command) {
        if (((Activity) mContext).getCallingActivity() != null) {
            returnResult(command);
        } else {
            shareCommand(command);
        }
    }

    /**
     * let user share the command with any compatible app
     *
     * @param command
     */
    private void shareCommand(CommandChildModel command) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(android.content.Intent.EXTRA_TEXT, command.getCommand());

        mContext.startActivity(i);
    }

    /**
     * return command to external calling activity
     *
     * @param command
     */
    private void returnResult(CommandChildModel command) {
        Intent data = new Intent();
        data.putExtra(CommandBibliothecaActivity.EXTRA_COMMAND, command.getCommand());
        data.putExtra(CommandBibliothecaActivity.EXTRA_ICON, mCommandGroupModel.getIconBase64());

        ((Activity) mContext).setResult(Activity.RESULT_OK, data);
        ((Activity) mContext).finish();
    }

    public class CommandViewHolder {
        public CodeTextView command;
        public ImageButton share;
    }
}
