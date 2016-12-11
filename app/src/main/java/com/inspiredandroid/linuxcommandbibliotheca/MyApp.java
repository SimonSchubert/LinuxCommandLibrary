package com.inspiredandroid.linuxcommandbibliotheca;

import android.app.Application;
import android.util.Log;

import com.inspiredandroid.linuxcommandbibliotheca.models.Command;
import com.inspiredandroid.linuxcommandbibliotheca.models.CommandPage;

import java.io.IOException;

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
        RealmConfiguration config = new RealmConfiguration.Builder().name(Constants.REALM_DATABASE).build();
        Realm.setDefaultConfiguration(config);
    }
}
