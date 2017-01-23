package com.inspiredandroid.linuxcommandbibliotheca.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;

/**
 * Created by simon on 23/01/17.
 */
public class AdView extends ImageView {

    public AdView(Context context) {
        super(context);
        init();
    }

    public AdView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public AdView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        // Hide ads if remote is already installed
        if (Utils.isAppInstalled(getContext(), Utils.PACKAGE_LINUXREMOTE) || Utils.isAppInstalled(getContext(), Utils.PACKAGE_LINUXREMOTE_PRO)) {
            setVisibility(View.GONE);
        } else {
            setOnClickListener(view -> startRemoteControl());
        }
    }

    public void startRemoteControl() {
        final String appPackageName = Utils.PACKAGE_LINUXREMOTE;
        try {
            getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
        } catch (android.content.ActivityNotFoundException anfe) {
            getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
        }
    }
}
