package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.ScriptCategoryActivity;
import com.inspiredandroid.linuxcommandbibliotheca.adapter.ScriptsCategoryAdapter;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs.ScriptDetailDialogFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Simon Schubert
 */
public class ScriptCategoryFragment extends SuperFragment implements AdapterView.OnItemClickListener {

    @BindView(R.id.fragment_scripts_lv)
    ListView mList;

    public ScriptCategoryFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scripts, container, false);

        ButterKnife.bind(this, view);

        ScriptsCategoryAdapter adapter = new ScriptsCategoryAdapter(getContext(), getActivity().getIntent().getIntExtra(ScriptCategoryActivity.EXTRA_CATEGORY_ID, 0));
        mList.setAdapter(adapter);
        mList.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        ScriptDetailDialogFragment fragment = ScriptDetailDialogFragment.getInstance((int) l);
        fragment.show(getChildFragmentManager(), ScriptDetailDialogFragment.class.getName());
    }
}
