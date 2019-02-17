package com.inspiredandroid.linuxcommandbibliotheca.fragments

import android.support.v4.app.Fragment
import com.google.firebase.appindexing.Action
import com.google.firebase.appindexing.FirebaseUserActions

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
abstract class AppIndexFragment : Fragment() {

    /**
     * Construct the Action performed by the user
     *
     * @return
     */
    abstract fun getAppIndexingAction(): Action

    override fun onStart() {
        super.onStart()
        FirebaseUserActions.getInstance().start(getAppIndexingAction())
    }

    override fun onStop() {
        FirebaseUserActions.getInstance().end(getAppIndexingAction())
        super.onStop()
    }

}
