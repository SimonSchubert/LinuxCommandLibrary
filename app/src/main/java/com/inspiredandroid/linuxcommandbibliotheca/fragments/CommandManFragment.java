package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.app.SearchManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageButton;

import com.google.android.gms.appindexing.Action;
import com.inspiredandroid.linuxcommandbibliotheca.CommandManActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.adapter.ManExpandableListAdapter;
import com.inspiredandroid.linuxcommandbibliotheca.asnytasks.SearchManAsyncTask;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnConvertFromHtmlToSpannableListener;
import com.inspiredandroid.linuxcommandbibliotheca.misc.AppManager;
import com.inspiredandroid.linuxcommandbibliotheca.misc.FragmentCoordinator;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandPage;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by Simon Schubert
 */
public class CommandManFragment extends AppIndexFragment implements OnConvertFromHtmlToSpannableListener, View.OnClickListener {

    @BindView(R.id.fragment_command_man_btn_up)
    ImageButton btnUp;
    @BindView(R.id.fragment_command_man_btn_down)
    ImageButton btnDown;
    @BindView(R.id.fraggment_commandman_elv)
    ExpandableListView mList;
    private ManExpandableListAdapter mAdapter;
    private Realm mRealm;
    private String mName;
    private long mId;
    private int mCategory;
    private int mIndexesPosition;
    private String query;
    private ArrayList<Integer> indexes = new ArrayList<>();

    /**
     * Split String every partitionSize character
     *
     * @param string
     * @param partitionSize
     * @return
     */
    private static ArrayList<String> getParts(String string, int partitionSize) {
        ArrayList<String> parts = new ArrayList<>();
        int len = string.length();
        for (int i = 0; i < len; i += partitionSize) {
            parts.add(string.substring(i, Math.min(len, i + partitionSize)));
        }
        return parts;
    }

    @SuppressWarnings("deprecation")
    public static CharSequence fromHtml(String html) {
        CharSequence result;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(html);
        }
        return result;
    }

    @Override
    public String getAppIndexingTitle() {
        return mName + "(" + mCategory + ") man page";
    }

    @Override
    public Action getAppIndexingAction() {
        final Uri APP_URI = Uri.parse("android-app://com.inspiredandroid.linuxcommandbibliotheca/http/linux.schubert-simon.de/mans");
        final Uri WEB_URL = Uri.parse("http://linux.schubert-simon.de/mans/");
        return Action.newAction(Action.TYPE_VIEW, getAppIndexingTitle(), WEB_URL, APP_URI);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (!FragmentCoordinator.isTabletLayout(getActivity())) {
            setHasOptionsMenu(true);
        }

        // Get unique command mId
        Bundle b = getArguments();
        mId = b.getLong(CommandManActivity.EXTRA_COMMAND_ID);
        mName = b.getString(CommandManActivity.EXTRA_COMMAND_NAME);
        mCategory = b.getInt(CommandManActivity.EXTRA_COMMAND_CATEGORY);

        mRealm = Realm.getDefaultInstance();

        mAdapter = createAdapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_command_man, container, false);

        ButterKnife.bind(this, view);

        mList.setAdapter(mAdapter);

        btnUp.setOnClickListener(this);
        btnDown.setOnClickListener(this);

        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        mRealm.close();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.man, menu);

        // Associate searchable configuration with the SearchView
        SearchManager searchManager = (SearchManager) getActivity().getSystemService(Context.SEARCH_SERVICE);
        MenuItem item = menu.findItem(R.id.search);
        if (Build.VERSION.SDK_INT >= 11) {
            SearchView searchView = (SearchView) item.getActionView();
            searchView.setSearchableInfo(searchManager.getSearchableInfo(getActivity().getComponentName()));

            // Associate searchable configuration with the SearchView
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

                @Override
                public boolean onQueryTextSubmit(String s) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String query) {
                    if (query.length() > 0) {
                        search(query);
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

        MenuItem bookmarkItem = menu.findItem(R.id.bookmark);
        bookmarkItem.setIcon(AppManager.hasBookmark(getContext(), mId) ? R.drawable.ic_bookmark_white_24dp : R.drawable.ic_bookmark_border_white_24dp);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.bookmark) {
            toogleBookmarkState();
            getActivity().supportInvalidateOptionsMenu();
            return true;
        }
        return false;
    }

    /**
     * Split long page text into child mList views
     *
     * @return
     */
    private ManExpandableListAdapter createAdapter() {

        RealmResults<CommandPage> pages = mRealm.where(CommandPage.class).equalTo(CommandPage.COMMANDID, mId).findAll();

        ArrayList<String> groups = new ArrayList<>();
        ArrayList<ArrayList<CharSequence>> child = new ArrayList<>();
        for (CommandPage page : pages) {

            groups.add(page.getTitle());

            CharSequence chars = fromHtml(page.getPage());

            ArrayList<CharSequence> pageSplit = new ArrayList<>();
            String[] tmp = chars.toString().split("\\r?\\n");
            for (String tmpSplit : tmp) {
                if (tmpSplit.length() < 600) {
                    if (!tmpSplit.isEmpty()) {
                        pageSplit.add(tmpSplit);
                    }
                } else {
                    pageSplit.addAll(getParts(tmpSplit, 600));
                }
            }
            child.add(pageSplit);
        }

        return new ManExpandableListAdapter(getActivity(), groups, child);
    }

    private void toogleBookmarkState() {
        if (AppManager.hasBookmark(getContext(), mId)) {
            AppManager.removeBookmark(getContext(), mId);
        } else {
            AppManager.addBookmark(getContext(), mId);
        }
    }

    /**
     *
     */
    private void resetSearchResults() {
        SearchManAsyncTask async = new SearchManAsyncTask(getContext(), "", mAdapter.mChild, this);
        addAsyncTask(async);
        async.execute();

        hideButton();
    }

    /**
     * Search the man page for q occurs and highlight them and jump to first occur
     *
     * @param q
     */
    private void search(String q) {
        SearchManAsyncTask async = new SearchManAsyncTask(getContext(), q, mAdapter.mChild, this);
        addAsyncTask(async);
        async.execute();
    }

    /**
     * Get line by index of occur and calculate position
     *
     * @param index
     */
    private void scrollToPosition(int index) {
        /*
        int line = tvDescription.getLayout().getLineForOffset(index);
        int lineHeight = tvDescription.getLayout().getHeight() / tvDescription.getLayout().getLineCount();
        int position = line * lineHeight;
        scrollView.scrollTo(0, position);
        */
    }

    /**
     *
     */
    private void hideButton() {
        btnUp.setVisibility(View.GONE);
        btnDown.setVisibility(View.GONE);
    }

    /**
     *
     */
    private void showButton() {
        btnUp.setVisibility(View.VISIBLE);
        btnDown.setVisibility(View.VISIBLE);
    }

    /**
     * go to next, if last then go to first
     */
    private void jumpToNextPosition() {
        mIndexesPosition--;
        if (mIndexesPosition < 0) {
            mIndexesPosition = indexes.size() - 1;
        }
        scrollToPosition(indexes.get(mIndexesPosition));
    }

    /**
     * go to previous, if smaller 0 then go to last
     */
    private void jumpToPreviousPosition() {
        mIndexesPosition++;
        if (mIndexesPosition >= indexes.size()) {
            mIndexesPosition = 0;
        }
        scrollToPosition(indexes.get(mIndexesPosition));
    }

    @Override
    public void onConvertHtmlToSpannable(ArrayList<ArrayList<CharSequence>> spannable) {
        mAdapter.mChild = spannable;
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.fragment_command_man_btn_up) {
            jumpToNextPosition();
        } else if (v.getId() == R.id.fragment_command_man_btn_down) {
            jumpToPreviousPosition();
        }
    }
}
