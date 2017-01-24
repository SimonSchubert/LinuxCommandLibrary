package com.inspiredandroid.linuxcommandbibliotheca;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.fragments.QuizFragment;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs.QuitQuizDialogFragment;

/**
 * Created by Simon Schubert
 * <p/>
 * This Activity just holds the CommandManFragment
 */
public class QuizActivity extends BaseActivity {

    private TextView mTvCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mTvCounter = (TextView) findViewById(R.id.activity_quiz_tv_counter);

        assert getSupportActionBar() != null;

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (savedInstanceState == null) {
            Fragment fragment = new QuizFragment();

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        }
    }

    @Override
    public void onBackPressed() {
        showQuitDialog();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                showQuitDialog();
        }

        return (super.onOptionsItemSelected(item));
    }

    /**
     * Ask user if he/she wants to quit
     */
    private void showQuitDialog() {
        QuitQuizDialogFragment quitQuizDialogFragment = QuitQuizDialogFragment.getInstance();
        quitQuizDialogFragment.show(getSupportFragmentManager(), quitQuizDialogFragment.getClass().getName());
    }

    public void setCounterText(String format) {
        mTvCounter.setText(format);
    }
}
