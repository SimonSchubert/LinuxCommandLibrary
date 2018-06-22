package com.inspiredandroid.linuxcommandbibliotheca

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.toolbar.*

/**
 * Created by Simon Schubert
 *
 *
 * This Activity just holds the AboutFragment
 */
class BasicGroupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_scriptchildren)

        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // int categoryId = getIntent().getIntExtra(EXTRA_CATEGORY_ID, ScriptGroupItem.GROUP_USER_GROUP);
        // setTitle(getDescriptionForCategory(categoryId));
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }

        return super.onOptionsItemSelected(item)
    }

    companion object {

        val EXTRA_CATEGORY_ID = "EXTRA_CATEGORY_ID"
    }

}
