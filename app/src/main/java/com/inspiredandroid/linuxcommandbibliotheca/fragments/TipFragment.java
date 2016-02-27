package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.inspiredandroid.linuxcommandbibliotheca.AboutActivity;
import com.inspiredandroid.linuxcommandbibliotheca.QuizActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.ClickInterface;
import com.inspiredandroid.linuxcommandbibliotheca.view.ClickableTextView;

/**
 * Created by Simon Schubert
 */
public class TipFragment extends AppIndexFragment implements View.OnClickListener {

    private ScrollView mView;
    private TextView mTvRedirection;

    public TipFragment() {
    }

    @Override
    public String getAppIndexingTitle() {
        return "Linux tips";
    }

    @Override
    public Action getAppIndexingAction() {
        final Uri APP_URI = Uri.parse("android-app://com.inspiredandroid.linuxcommandbibliotheca/http/linux.schubert-simon.de/tips");
        final Uri WEB_URL = Uri.parse("http://linux.schubert-simon.de/tips/");
        return Action.newAction(Action.TYPE_VIEW, getAppIndexingTitle(), WEB_URL, APP_URI);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = (ScrollView) inflater.inflate(R.layout.fragment_tips, container, false);

        mView.findViewById(R.id.fragment_tips_btn_quiz).setOnClickListener(this);
        mTvRedirection = (TextView) mView.findViewById(R.id.fragment_tips_tv_redirection);

        ClickableTextView tvLinkToRedirection = (ClickableTextView) mView.findViewById(R.id.fragment_tips_tv_link_to_redirection);
        tvLinkToRedirection.setClickInterface(new ClickInterface() {
            @Override
            public void onClick() {
                scrollToRedirectionView();
            }
        });
        tvLinkToRedirection.setClickableWord("below");

        return mView;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.fragment_tips_btn_quiz) {
            startActivity(new Intent(getContext(), QuizActivity.class));
        }
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
        }
        return false;
    }

    private void startAboutActivity() {
        Intent intent = new Intent(getContext(), AboutActivity.class);
        startActivity(intent);
    }

    private void scrollToRedirectionView() {
        mView.post(new Runnable() {
            @Override
            public void run() {
                mView.scrollTo(0, mTvRedirection.getBottom());
            }
        });
    }
}
