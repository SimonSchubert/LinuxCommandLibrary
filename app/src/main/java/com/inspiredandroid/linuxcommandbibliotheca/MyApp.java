package com.inspiredandroid.linuxcommandbibliotheca;

import android.app.Application;

import com.inspiredandroid.linuxcommandbibliotheca.misc.Constants;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by simon on 27/02/16.
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder().name(Constants.REALM_DATABASE).schemaVersion(12).build();
        Realm.setDefaultConfiguration(config);
    }

}
