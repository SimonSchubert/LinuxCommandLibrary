package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
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
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.ScriptChildrenActivity;
import com.inspiredandroid.linuxcommandbibliotheca.adapter.ScriptChildrenAdapter;
import com.inspiredandroid.linuxcommandbibliotheca.adapter.SearchAdapter;
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
public class BasicChildrenFragment extends SuperFragment {

    @BindView(R.id.fragment_scriptchildren_rv)
    RecyclerView mRecyclerView;
    private Realm mRealm;
    private String mQuery = "";
    private ScriptChildrenAdapter mAdapter;
    private SearchAdapter mSearchAdapter;
    private FirebaseAnalytics mFirebaseAnalytics;

    public BasicChildrenFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);

        mRealm = Realm.getDefaultInstance();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scriptchildren, container, false);

        ButterKnife.bind(this, view);

        int categoryId = getActivity().getIntent().getIntExtra(ScriptChildrenActivity.EXTRA_CATEGORY_ID, 0);

        BasicGroupModel basicGroupModel = mRealm.where(BasicGroupModel.class).equalTo("id", categoryId).findFirst();
        RealmResults<CommandGroupModel> groups = basicGroupModel.getGroups().sort("votes", Sort.DESCENDING);

        getActivity().setTitle(basicGroupModel.getTitle());


        mFirebaseAnalytics = FirebaseAnalytics.getInstance(getContext());

        mAdapter = new ScriptChildrenAdapter(groups, false, mFirebaseAnalytics);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        mSearchAdapter = new SearchAdapter(null, false, mFirebaseAnalytics);

        trackSelectContent(categoryId + "");

        return view;
    }

    private void trackSelectContent(String id) {
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id);
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Basic Category");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        mRealm.close();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.basic, menu);

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
                mQuery = query;
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

        RealmResults<CommandGroupModel> allGroups = realmQuery.endGroup().findAllSorted("votes", Sort.ASCENDING);
        mSearchAdapter.setQuery(query);
        mSearchAdapter.updateData(allGroups);
        mRecyclerView.setAdapter(mSearchAdapter);
    }

    private void resetSearchResults() {
        mRecyclerView.setAdapter(mAdapter);
    }

}
