package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandChildModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;
import com.inspiredandroid.linuxcommandbibliotheca.view.TerminalTextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by simon on 23.11.15.
 */
public class CommandDetailAdapter extends RecyclerView.Adapter<CommandDetailAdapter.ViewHolder> {

    private CommandGroupModel mCommandGroupModel;
    private Context mContext;

    public CommandDetailAdapter(Context context, CommandGroupModel commandGroupModel) {
        mContext = context;
        mCommandGroupModel = commandGroupModel;
    }

    @Override
    public int getItemCount() {
        return mCommandGroupModel.getCommands().size();
    }

    @Override
    public CommandDetailAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                              int viewType) {
        View v = LayoutInflater.from(mContext)
                .inflate(R.layout.row_scriptchild_child, parent, false);
        return new CommandDetailAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CommandDetailAdapter.ViewHolder viewHolder, int position) {
        CommandChildModel item = mCommandGroupModel.getCommands().get(position);

        viewHolder.command.setText(item.getCommand());
        viewHolder.command.setCommands(CommandChildModel.getMans(item));
        viewHolder.share.setOnClickListener(v -> startShareActivity(item));
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

        try {
            mContext.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.row_scriptdescription_child_tv_description)
        TerminalTextView command;
        @BindView(R.id.row_scriptdescription_child_iv_share)
        ImageButton share;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
