package com.inspiredandroid.linuxcommandbibliotheca

import android.app.Application

import com.inspiredandroid.linuxcommandbibliotheca.misc.Constants

import io.realm.Realm
import io.realm.RealmConfiguration

/* Copyright 2019 Simon Schubert
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        val config = RealmConfiguration.Builder().name(Constants.REALM_DATABASE).schemaVersion(25).build()
        Realm.setDefaultConfiguration(config)
    }
}
