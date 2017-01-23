package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.inspiredandroid.linuxcommandbibliotheca.AboutActivity;
import com.inspiredandroid.linuxcommandbibliotheca.QuizActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.ScriptCategoryActivity;
import com.inspiredandroid.linuxcommandbibliotheca.adapter.ScriptsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Simon Schubert
 */
public class ScriptsFragment extends SuperFragment implements AdapterView.OnItemClickListener {

    @BindView(R.id.fragment_scripts_lv)
    ListView mList;

    public ScriptsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scripts, container, false);

        ButterKnife.bind(this, view);

        ScriptsAdapter adapter = new ScriptsAdapter(getContext());
        mList.setAdapter(adapter);
        mList.setOnItemClickListener(this);

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

    private void startScriptCategoryActivity(int i) {
        Intent intent = new Intent(getContext(), ScriptCategoryActivity.class);
        intent.putExtra(ScriptCategoryActivity.EXTRA_CATEGORY_ID, i);
        startActivity(intent);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
        startScriptCategoryActivity((int) id);
    }
}
