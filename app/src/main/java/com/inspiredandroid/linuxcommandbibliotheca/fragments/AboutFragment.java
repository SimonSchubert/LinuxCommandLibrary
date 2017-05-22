package com.inspiredandroid.linuxcommandbibliotheca.fragments;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.dialogs.DonateDialogFragment;
import com.inspiredandroid.linuxcommandbibliotheca.misc.AppManager;
import com.inspiredandroid.linuxcommandbibliotheca.misc.Utils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Simon Schubert on 23.11.15.
 * Talk about the App, Licenses and other projects
 */
public class AboutFragment extends Fragment {

    @BindView(R.id.fragment_about_chb_hide_advertising)
    CheckBox cbHideAdvertising;

    public AboutFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        ButterKnife.bind(this, view);

        cbHideAdvertising.setChecked(AppManager.getHideAdvertising(getContext()));
        cbHideAdvertising.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                AppManager.setHideAdvertising(getContext(), isChecked);
                if (isChecked) {
                    DonateDialogFragment fragment = DonateDialogFragment.getInstance();
                    fragment.show(getChildFragmentManager(), fragment.getClass().getCanonicalName());
                }
            }
        });
        return view;
    }

    @OnClick(R.id.fragment_about_btn_paypal)
    public void startPaypal() {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paypal.me/SimonSchubert"));
            startActivity(intent);
        } catch (android.content.ActivityNotFoundException ignored) {
        }
    }

    @OnClick(R.id.fragment_about_btn_bitcoin)
    public void startBitcoin() {
        try {
            startShareActivity(getContext(), "1MRAvdsCfysCVT3ALykJkjwfQPxpUKrqUP");
        } catch (Exception ignored) {
        }
    }

    private void startShareActivity(Context context, String text) {
        ClipboardManager clipboard = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Wallet ID", text);
        clipboard.setPrimaryClip(clip);

        Toast.makeText(getContext(), "Copied wallet id to clipboard", Toast.LENGTH_SHORT).show();
        /*
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, text);
        context.startActivity(intent);
        */
    }

    @OnClick(R.id.fragment_about_btn_bimo)
    public void startBimo() {
        startAppMarketActivity(Utils.PACKAGE_BIMO);
    }

    @OnClick(R.id.fragment_about_btn_orcgenocide)
    public void startOrcGenocide() {
        startAppMarketActivity(Utils.PACKAGE_ORCGENOCIDE);
    }

    @OnClick(R.id.fragment_about_btn_meowdo)
    public void startMeadow() {
        startAppMarketActivity(Utils.PACKAGE_MEOWDO);
    }

    @OnClick(R.id.fragment_about_btn_remote)
    public void startRemote() {
        startAppMarketActivity(Utils.PACKAGE_LINUXREMOTE);
    }

    @OnClick(R.id.fragment_about_btn_burger)
    public void startBurger() {
        startAppMarketActivity(Utils.PACKAGE_BURGER);
    }

    @OnClick(R.id.fragment_about_btn_rate)
    public void startRateActivity() {
        startAppMarketActivity(Utils.PACKAGE_COMMANDLIBRARY);
    }

    /**
     * Show app in the Play Store. If Play Store is not installed, show it in the browser instead.
     *
     * @param appPackageName package mName
     */
    private void startAppMarketActivity(final String appPackageName) {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
        } catch (android.content.ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
        }
    }
}
