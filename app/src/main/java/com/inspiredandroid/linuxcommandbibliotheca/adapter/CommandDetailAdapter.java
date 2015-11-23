package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.CommandBibliothecaActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;

import java.util.ArrayList;

/**
 * Created by simon on 23.11.15.
 */
public class CommandDetailAdapter extends BaseAdapter {

    ArrayList<String> commands;
    Activity context;

    public CommandDetailAdapter(Activity context, ArrayList<String> commands)
    {
        this.context = context;
        this.commands = commands;
    }

    @Override
    public int getCount()
    {
        return commands.size();
    }

    @Override
    public String getItem(int position)
    {
        return commands.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        final String command = getItem(position);
        CommandViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row_scriptdescription_child, parent, false);

            holder = new CommandViewHolder();
            holder.command = (TextView) convertView.findViewById(R.id.row_scriptdescription_child_tv_description);
            holder.share = (ImageButton) convertView.findViewById(R.id.row_scriptdescription_child_iv_share);

            convertView.setTag(holder);
        } else {
            holder = (CommandViewHolder) convertView.getTag();
        }

        holder.command.setText(command);
        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
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
    private void handleCommandClick(String command)
    {
        if (context.getCallingActivity() != null) {
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
    private void shareCommand(String command)
    {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(android.content.Intent.EXTRA_TEXT, command);

        context.startActivity(i);
    }

    /**
     * return command to extern calling activity
     */
    private void returnResult(String command)
    {
        Intent data = new Intent();
        data.putExtra(CommandBibliothecaActivity.EXTRA_COMMAND, command);
        // data.putExtra(CommandBibliothecaActivity.EXTRA_ICON, commandGroupModel.getIconBase64());

        context.setResult(Activity.RESULT_OK, data);
        context.finish();
    }

    public class CommandViewHolder {
        public TextView command;
        public ImageButton share;
    }
}
