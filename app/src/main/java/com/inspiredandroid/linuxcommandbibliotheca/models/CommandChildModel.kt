package com.inspiredandroid.linuxcommandbibliotheca.models

import io.realm.RealmList
import io.realm.RealmObject

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
open class CommandChildModel : RealmObject() {

    var command: String = ""
    private var mans: RealmList<CommandManModel> = RealmList()

    fun getMansAsStringArray(): Array<String> {
        return mans.map { it.man }.toTypedArray()
    }
}
