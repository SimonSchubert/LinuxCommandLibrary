package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.CommandManActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.asnytasks.GrepManAsHtml;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.ConvertManFromHtmlToSpannableInterface;

/**
 * Created by Simon Schubert
 */
public class CommandManFragment extends Fragment implements ConvertManFromHtmlToSpannableInterface {

    TextView tvDescription;
    GrepManAsHtml asyncTask;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_command_man, container, false);

        tvDescription = (TextView) view.findViewById(R.id.fragment_command_man_tv);

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Get unique command id
        Bundle b = getArguments();
        long id = b.getLong(CommandManActivity.EXTRA_COMMAND_ID);

        // load async
        asyncTask = new GrepManAsHtml(getActivity(), id, this);
        asyncTask.execute();
    }

    @Override
    public void onPause()
    {
        super.onPause();

        asyncTask.cancel(true);
    }

    @Override
    public void onHtmlGraped(Spanned spannable)
    {
        tvDescription.setText(spannable);
    }
}
