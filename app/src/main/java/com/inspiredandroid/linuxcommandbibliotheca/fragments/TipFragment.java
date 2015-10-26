package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inspiredandroid.linuxcommandbibliotheca.QuizActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;

/**
 * Created by Simon Schubert
 */
public class TipFragment extends Fragment implements View.OnClickListener {

    public TipFragment()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_tips, container, false);

        view.findViewById(R.id.fragment_tips_btn_quiz).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.fragment_tips_btn_quiz) {
            startActivity(new Intent(getContext(), QuizActivity.class));
        }
    }
}
