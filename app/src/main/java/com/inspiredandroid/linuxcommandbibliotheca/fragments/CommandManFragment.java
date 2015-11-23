package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.inspiredandroid.linuxcommandbibliotheca.CommandManActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.asnytasks.GrepManAsHtmlAsyncTask;
import com.inspiredandroid.linuxcommandbibliotheca.interfaces.ConvertManFromHtmlToSpannableInterface;

/**
 * Created by Simon Schubert
 */
public class CommandManFragment extends AppIndexFragment implements ConvertManFromHtmlToSpannableInterface {

    TextView tvDescription;
    GrepManAsHtmlAsyncTask asyncTask;
    String name;
    int category;

    @Override
    public String getAppIndexingTitle()
    {
        return name + "(" + category + ") man page";
    }

    @Override
    public Action getAppIndexingAction()
    {
        final Uri APP_URI = Uri.parse("android-app://com.inspiredandroid.linuxcommandbibliotheca/http/linux.schubert-simon.de/mans");
        final Uri WEB_URL = Uri.parse("http://linux.schubert-simon.de/mans/");
        return Action.newAction(Action.TYPE_VIEW, getAppIndexingTitle(), WEB_URL, APP_URI);
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Get unique command id
        Bundle b = getArguments();
        long id = b.getLong(CommandManActivity.EXTRA_COMMAND_ID);
        name = b.getString(CommandManActivity.EXTRA_COMMAND_NAME);
        category = b.getInt(CommandManActivity.EXTRA_COMMAND_CATEGORY);

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
