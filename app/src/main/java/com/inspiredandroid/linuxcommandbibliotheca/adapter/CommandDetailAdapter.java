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

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by simon on 23.11.15.
 */
public class CommandDetailAdapter extends BaseAdapter {

    private CommandGroupModel mCommandGroupModel;
    private Context mContext;

    public CommandDetailAdapter(Context context, CommandGroupModel commandGroupModel) {
        mContext = context;
        mCommandGroupModel = commandGroupModel;
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
            holder = new CommandViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (CommandViewHolder) convertView.getTag();
        }

        holder.command.setText(String.format(mContext.getString(R.string.commandline), command.getCommand()));
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
            startShareActivity(command);
        }
    }

    /**
     * let user share the command with any compatible app
     *
     * @param command
     */
    private void startShareActivity(CommandChildModel command) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, command.getCommand());

        mContext.startActivity(intent);
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
        @BindView(R.id.row_scriptdescription_child_tv_description)
        public CodeTextView command;
        @BindView(R.id.row_scriptdescription_child_iv_share)
        public ImageButton share;

        public CommandViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
