package com.inspiredandroid.linuxcommandbibliotheca.models

import com.inspiredandroid.linuxcommandbibliotheca.R

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.Required

/**
 * Created by simon on 19.04.17.
 */

open class BasicGroupModel : RealmObject() {

    @PrimaryKey
    var id: Int = 0
    var position: Int = 0
    @Required
    var title: String? = null
    var groups: RealmList<CommandGroupModel>? = null

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
