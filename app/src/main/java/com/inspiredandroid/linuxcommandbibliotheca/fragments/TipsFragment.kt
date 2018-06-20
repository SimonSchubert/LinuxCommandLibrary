package com.inspiredandroid.linuxcommandbibliotheca.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.*
import com.google.android.gms.appindexing.Action
import com.inspiredandroid.linuxcommandbibliotheca.AboutActivity
import com.inspiredandroid.linuxcommandbibliotheca.BuildConfig
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.OnLinkClickListener
import kotlinx.android.synthetic.main.fragment_tips.*

/**
 * Created by Simon Schubert
 * General Linux/CMD Tips
 */
class TipsFragment : AppIndexFragment() {

    override fun getAppIndexingTitle(): String {
        return "Linux tips"
    }

    override fun getAppIndexingAction(): Action {
        val APP_URI = Uri.parse("android-app://" + BuildConfig.APPLICATION_ID + "/http/linux.schubert-simon.de/tips")
        val WEB_URL = Uri.parse("http://linux.schubert-simon.de/tips/")
        return Action.newAction(Action.TYPE_VIEW, getAppIndexingTitle(), WEB_URL, APP_URI)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(true)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tips, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvSeeBelow.setClickInterface(object : OnLinkClickListener {
            override fun onLinkClick() {
                scrollToRedirectionView()
            }
        })
        tvSeeBelow.setClickableWord("below")
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.tip, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.about) {
            startAboutActivity()
            return true
        }
        return false
    }

    private fun startAboutActivity() {
        val intent = Intent(context, AboutActivity::class.java)
        startActivity(intent)
    }

    private fun scrollToRedirectionView() {
        scrollView.post { scrollView.scrollTo(0, tvRedirection.bottom) }
    }
}
