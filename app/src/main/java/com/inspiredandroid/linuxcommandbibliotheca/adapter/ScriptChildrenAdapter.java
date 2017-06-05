package com.inspiredandroid.linuxcommandbibliotheca.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.inspiredandroid.linuxcommandbibliotheca.BuildConfig;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandChildModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;
import com.inspiredandroid.linuxcommandbibliotheca.view.TerminalTextView;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.OrderedRealmCollection;
import io.realm.RealmRecyclerViewAdapter;

/**
 * Created by simon on 23/01/17.
 */
public class ScriptChildrenAdapter extends RealmRecyclerViewAdapter<CommandGroupModel, ScriptChildrenAdapter.ViewHolder> {

    private HashMap<Integer, Boolean> expanded;
    private FirebaseAnalytics mFirebaseAnalytics;

    public ScriptChildrenAdapter(@Nullable OrderedRealmCollection<CommandGroupModel> data, boolean autoUpdate, FirebaseAnalytics firebaseAnalytics) {
        super(data, autoUpdate);
        expanded = new HashMap<>();
        mFirebaseAnalytics = firebaseAnalytics;
    }

    @Override
    public ScriptChildrenAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                               int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_scriptchild, parent, false);
        return new ScriptChildrenAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ScriptChildrenAdapter.ViewHolder viewHolder, int position) {
        CommandGroupModel item = getData().get(position);

        viewHolder.name.setText(item.getDesc());
        viewHolder.icon.setImageResource(item.getImageResourceId());
        viewHolder.details.removeAllViews();
        for (CommandChildModel command : item.getCommands()) {
            View v = LayoutInflater.from(viewHolder.itemView.getContext()).inflate(R.layout.row_scriptchild_child, viewHolder.details, false);

            TerminalTextView tv = ((TerminalTextView) v.findViewById(R.id.row_scriptdescription_child_tv_description));
            tv.setText(command.getCommand());
            tv.setCommands(CommandChildModel.getMans(command));

            ImageButton btn = (ImageButton) v.findViewById(R.id.row_scriptdescription_child_iv_share);
            btn.setOnClickListener(view -> startShareActivity(view.getContext(), command));

            viewHolder.details.addView(v);
        }
        viewHolder.details.setVisibility(isExpanded(position) ? View.VISIBLE : View.GONE);
        viewHolder.itemView.setOnClickListener(view -> {
            expanded.put(position, !isExpanded(position));
            notifyItemChanged(position);
            trackSelectContent(item.getId() + "");
        });
    }

    private void trackSelectContent(String id) {
        if (BuildConfig.DEBUG) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id);
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Basic Group");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }

    private boolean isExpanded(int position) {
        return expanded.containsKey(position) && expanded.get(position);
    }

    /**
     * let user share the command with any compatible app
     *
     * @param command
     */
    private void startShareActivity(Context context, CommandChildModel command) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, command.getCommand());
        try {
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.row_scriptgroup_tv_title)
        TextView name;
        @BindView(R.id.row_scriptgroup_iv_icon)
        ImageView icon;
        @BindView(R.id.row_scriptgroup_ll_detail)
        LinearLayout details;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
