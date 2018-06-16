package com.inspiredandroid.linuxcommandbibliotheca.misc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;

import com.inspiredandroid.linuxcommandbibliotheca.CommandManActivity;
import com.inspiredandroid.linuxcommandbibliotheca.R;
import com.inspiredandroid.linuxcommandbibliotheca.ScriptChildrenActivity;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.BasicChildrenFragment;
import com.inspiredandroid.linuxcommandbibliotheca.fragments.CommandManFragment;
import com.inspiredandroid.linuxcommandbibliotheca.models.Command;

import io.realm.Realm;

/**
 * Created by simon on 25/01/17.
 */
public class FragmentCoordinator {

    public static void startScriptCategoryActivity(FragmentActivity activity, int category) {
        if (!isTabletLayout(activity)) {
            Intent intent = new Intent(activity, ScriptChildrenActivity.class);
            intent.putExtra(ScriptChildrenActivity.Companion.getEXTRA_CATEGORY_ID(), category);
            activity.startActivity(intent);
        } else {
            View container = activity.findViewById(R.id.fragment_container_secondary);
            ((ViewGroup) container).removeAllViews();

            activity.getIntent().putExtra(ScriptChildrenActivity.Companion.getEXTRA_CATEGORY_ID(), category);

            Fragment fragment = new BasicChildrenFragment();

            FragmentManager fragmentManager = activity.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.fragment_container_secondary, fragment);
            fragmentTransaction.commitAllowingStateLoss();
        }
    }

    public static void startCommandManActivity(FragmentActivity activity, long id) {
        if (!isTabletLayout(activity)) {
            Intent intent = new Intent(activity, CommandManActivity.class);
            intent.putExtra(CommandManActivity.Companion.getEXTRA_COMMAND_ID(), id);
            activity.startActivity(intent);
        } else {
            View container = activity.findViewById(R.id.fragment_container_secondary);
            ((ViewGroup) container).removeAllViews();

            Realm realm = Realm.getDefaultInstance();

            Command command = realm.where(Command.class).equalTo(Command.Companion.getID(), id).findFirst();
            String name = command.getName().toUpperCase();
            int category = command.getCategory();

            realm.close();

            showManFragmentInSecondaryFrame(activity, name, id, category);
        }
    }

    public static void startCommandManActivity(FragmentActivity activity, String name) {
        Realm realm = Realm.getDefaultInstance();
        Command command = realm.where(Command.class).equalTo(Command.Companion.getNAME(), name).findFirst();
        if(command == null) {
            realm.close();
            return;
        }
        long id = command.getId();
        int category = command.getCategory();
        realm.close();

        if (!isTabletLayout(activity)) {
            Intent intent = new Intent(activity, CommandManActivity.class);
            intent.putExtra(CommandManActivity.Companion.getEXTRA_COMMAND_ID(), id);
            activity.startActivity(intent);
        } else {
            View container = activity.findViewById(R.id.fragment_container_secondary);
            ((ViewGroup) container).removeAllViews();

            showManFragmentInSecondaryFrame(activity, name, id, category);
        }
    }

    /**
     * @param name     command name
     * @param id       unique command id
     * @param category command category
     */
    private static void showManFragmentInSecondaryFrame(FragmentActivity activity, String name, long id, int category) {
        Fragment fragment = new CommandManFragment();

        // Add unique command ID for fragment
        Bundle bundle = new Bundle();
        bundle.putLong(CommandManActivity.Companion.getEXTRA_COMMAND_ID(), id);
        bundle.putString(CommandManActivity.Companion.getEXTRA_COMMAND_NAME(), name);
        bundle.putInt(CommandManActivity.Companion.getEXTRA_COMMAND_CATEGORY(), category);
        fragment.setArguments(bundle);

        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragment_container_secondary, fragment);
        fragmentTransaction.commitAllowingStateLoss();
    }

    public static boolean isTabletLayout(Activity activity) {
        return activity.findViewById(R.id.fragment_container_secondary) != null;
    }
}
