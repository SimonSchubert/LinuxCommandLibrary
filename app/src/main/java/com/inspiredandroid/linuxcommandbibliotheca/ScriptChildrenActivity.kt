package com.inspiredandroid.linuxcommandbibliotheca

import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.view.View

/**
 * Created by Simon Schubert
 *
 *
 * This Activity just holds the AboutFragment
 */
class ScriptChildrenActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scriptchildren)

        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        assert(supportActionBar != null)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        // int categoryId = getIntent().getIntExtra(EXTRA_CATEGORY_ID, ScriptGroupItem.GROUP_USER_GROUP);
        // setTitle(getDescriptionForCategory(categoryId));
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> this.finish()
        }

        return super.onOptionsItemSelected(item)
    }

    companion object {

        val EXTRA_CATEGORY_ID = "EXTRA_CATEGORY_ID"
    }

}
