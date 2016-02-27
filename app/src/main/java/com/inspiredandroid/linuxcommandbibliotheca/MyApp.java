package com.inspiredandroid.linuxcommandbibliotheca;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by simon on 27/02/16.
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.setDefaultConfiguration(new RealmConfiguration.Builder(this).name(Constants.REALM_DATABASE).build());
    }
}
