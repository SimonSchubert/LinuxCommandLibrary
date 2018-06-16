package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.inspiredandroid.linuxcommandbibliotheca.AboutActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.adapter.ScriptGroupsAdapter;
import com.inspiredandroid.linuxcommandbibliotheca.adapter.SearchAdapter;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnListClickListener;
import com.inspiredandroid.linuxcommandbibliotheca.misc.FragmentCoordinator;
import com.inspiredandroid.linuxcommandbibliotheca.models.BasicGroupModel;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandGroupModel;

import java.text.Normalizer;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Case;
import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;
import io.realm.Sort;

/**
 * Created by Simon Schubert
 */
public class BasicGroupsFragment extends SuperFragment implements OnListClickListener {

    @BindView(R.id.fragment_scriptgroups_rv)
    RecyclerView mRecyclerView;
    private Realm mRealm;
    private ScriptGroupsAdapter mAdapter;
    private SearchAdapter mSearchAdapter;
    private FirebaseAnalytics mFirebaseAnalytics;

    public BasicGroupsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);

        mRealm = Realm.getDefaultInstance();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scriptgroups, container, false);

        ButterKnife.bind(this, view);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(getContext());

        mAdapter = new ScriptGroupsAdapter(mRealm.where(BasicGroupModel.class).sort("position").findAll(), false);
        mAdapter.setOnListClickListener(this);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        mSearchAdapter = new SearchAdapter(null, false, mFirebaseAnalytics);

        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        mRealm.close();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.tip, menu);


        MenuItem item = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(item);

        SearchManager searchManager = (SearchManager) getActivity().getSystemService(Context.SEARCH_SERVICE);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getActivity().getComponentName()));

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                if (!isAdded()) {
                    return true;
                }
                if (query.length() > 0) {
                    String normalizedText = Normalizer.normalize(query, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").toLowerCase();
                    search(normalizedText);
                } else {
                    resetSearchResults();
                }

                return true;
            }
        });
        MenuItemCompat.setOnActionExpandListener(item, new MenuItemCompat.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                return true;
            }

            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                resetSearchResults();
                return true;
            }
        });
    }

    private void search(String query) {
        String[] words = query.split("[,\\s]+");

        RealmQuery<CommandGroupModel> realmQuery = mRealm.where(CommandGroupModel.class).beginGroup();

        for (String word : words) {
            realmQuery.contains("desc", word, Case.INSENSITIVE);
        }

        RealmResults<CommandGroupModel> allGroups = realmQuery.endGroup().sort("votes").findAll();
        mSearchAdapter.setQuery(query);
        mSearchAdapter.updateData(allGroups);
        mRecyclerView.setAdapter(mSearchAdapter);
    }

    private void resetSearchResults() {
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.about) {
            startAboutActivity();
            return true;
        }
        return false;
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
