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
class AboutActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        assert(supportActionBar != null)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> this.finish()
        }

        return super.onOptionsItemSelected(item)
    }
}
