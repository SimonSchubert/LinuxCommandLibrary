package com.inspiredandroid.linuxcommandbibliotheca

import android.app.Application

import com.inspiredandroid.linuxcommandbibliotheca.misc.Constants

import io.realm.Realm
import io.realm.RealmConfiguration

/**
 * Created by simon on 27/02/16.
 */
class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        val config = RealmConfiguration.Builder().name(Constants.REALM_DATABASE).schemaVersion(21).build()
        Realm.setDefaultConfiguration(config)
    }
}
