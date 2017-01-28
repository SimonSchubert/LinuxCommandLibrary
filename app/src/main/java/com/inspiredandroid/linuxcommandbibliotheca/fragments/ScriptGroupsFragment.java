package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.inspiredandroid.linuxcommandbibliotheca.AboutActivity;
import com.inspiredandroid.linuxcommandbibliotheca.QuizActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.adapter.ScriptGroupsAdapter;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnListClickListener;
import com.inspiredandroid.linuxcommandbibliotheca.misc.FragmentCoordinator;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Simon Schubert
 */
public class ScriptGroupsFragment extends SuperFragment implements OnListClickListener {

    @BindView(R.id.fragment_scriptgroups_rv)
    RecyclerView mList;

    public ScriptGroupsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scriptgroups, container, false);

        ButterKnife.bind(this, view);

        ScriptGroupsAdapter adapter = new ScriptGroupsAdapter(getContext());
        adapter.setOnListClickListener(this);
        mList.setAdapter(adapter);
        mList.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.tip, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.about) {
            startAboutActivity();
            return true;
        } else if (item.getItemId() == R.id.quiz) {
            startQuizActivity();
            return true;
        }
        return false;
    }

    private void startQuizActivity() {
        Intent intent = new Intent(getContext(), QuizActivity.class);
        startActivity(intent);
    }

    private void startAboutActivity() {
        Intent intent = new Intent(getContext(), AboutActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(int id) {
        FragmentCoordinator.startScriptCategoryActivity(getActivity(), id);
    }
}
