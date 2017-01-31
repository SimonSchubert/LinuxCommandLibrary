package com.inspiredandroid.linuxcommandbibliotheca;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.inspiredandroid.linuxcommandbibliotheca.models.ScriptGroupItem;

/**
 * Created by Simon Schubert
 * <p/>
 * This Activity just holds the AboutFragment
 */
public class ScriptChildrenActivity extends BaseActivity {

    public final static String EXTRA_CATEGORY_ID = "EXTRA_CATEGORY_ID";

    public static int getDescriptionForCategory(int category) {
        switch (category) {
            case ScriptGroupItem.GROUP_USER_GROUP:
                return R.string.desc_category_user_groups;
            case ScriptGroupItem.GROUP_FILE_FOLDER:
                return R.string.desc_category_files_folders;
            case ScriptGroupItem.GROUP_INFO:
                return R.string.category_system_info;
            case ScriptGroupItem.GROUP_SYSTEM_CONTROL:
                return R.string.category_system_control;
            case ScriptGroupItem.GROUP_AUDIO_VIDEO:
                return R.string.category_audio_video;
            case ScriptGroupItem.GROUP_NETWORK:
                return R.string.category_network;
            case ScriptGroupItem.GROUP_SEARCH:
                return R.string.category_search;
        }
        return 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scriptchildren);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        assert getSupportActionBar() != null;

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int categoryId = getIntent().getIntExtra(EXTRA_CATEGORY_ID, ScriptGroupItem.GROUP_USER_GROUP);
        setTitle(getDescriptionForCategory(categoryId));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
        }

        return (super.onOptionsItemSelected(item));
    }

}
