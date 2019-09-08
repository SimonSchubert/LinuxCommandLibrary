package com.inspiredandroid.linuxcommandbibliotheca.models

import com.inspiredandroid.linuxcommandbibliotheca.R
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

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
open class BasicCategory : RealmObject() {

    @PrimaryKey
    var id: Int = 0
    var position: Int = 0
    var title: String = ""
    var groups: RealmList<BasicGroup> = RealmList()

    val iconResourceId: Int
        get() {
            when (id) {
                247 -> return R.drawable.ic_user_male_circle_40dp
                37 -> return R.drawable.ic_folder_black_40dp
                246 -> return R.drawable.ic_info_40dp
                21 -> return R.drawable.ic_settings_black_40dp
                43 -> return R.drawable.ic_video_trimming_40dp
                243 -> return R.drawable.ic_network_card_40dp
                179 -> return R.drawable.ic_search_40dp
                248 -> return R.drawable.ic_skull_40dp
                249 -> return R.drawable.ic_package_40
                29 -> return R.drawable.ic_videogame_asset_black_40dp
                250 -> return R.drawable.ic_icons8_hand_with_pen
                251 -> return R.drawable.ic_vpn_key_black_24dp
                252 -> return R.drawable.ic_icons8_github
            }
            return R.drawable.ic_user_male_circle_40dp
        }
}
