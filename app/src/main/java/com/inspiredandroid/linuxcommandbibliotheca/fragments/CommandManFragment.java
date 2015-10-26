package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.inspiredandroid.linuxcommandbibliotheca.CommandManActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.asnytasks.GrepManAsHtmlAsyncTask;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.ConvertManFromHtmlToSpannableInterface;

/**
 * Created by Simon Schubert
 */
public class CommandManFragment extends SuperFragment implements ConvertManFromHtmlToSpannableInterface {

    TextView tvDescription;
    GrepManAsHtmlAsyncTask asyncTask;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Get unique command id
        Bundle b = getArguments();
        long id = b.getLong(CommandManActivity.EXTRA_COMMAND_ID);

        // load async
        asyncTask = new GrepManAsHtmlAsyncTask(getActivity(), id, this);
        asyncTasks.add(asyncTask);
        asyncTask.execute();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_command_man, container, false);

        tvDescription = (TextView) view.findViewById(R.id.fragment_command_man_tv);

        return view;
    }

    @Override
    public void onConvertedHtmlToSpannable(Spanned spannable)
    {
        tvDescription.setText(spannable);
    }
}
