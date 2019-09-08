package com.inspiredandroid.linuxcommandbibliotheca.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import io.realm.Realm

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
abstract class BaseFragment : Fragment() {

    lateinit var realm: Realm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        realm = Realm.getDefaultInstance()
    }

    override fun onDestroy() {
        super.onDestroy()

        realm.close()
    }

}
