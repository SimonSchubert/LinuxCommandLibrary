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
open class CommandGroupModel : RealmObject() {

    @PrimaryKey
    var id: Int = 0
    var desc: String = ""
    var votes: Long = 0
    var commands: RealmList<CommandChildModel> = RealmList()

    val imageResourceId: Int
        get() {
            when (id) {
                0 -> return R.drawable.ic_electronics
                1 -> return R.drawable.ic_battery_90_black_24dp
                2 -> return R.drawable.ic_bluetooth_black_24dp
                3 -> return R.drawable.ic_bluetooth_black_24dp
                4 -> return R.drawable.ic_icons8_network_card
                5 -> return R.drawable.ic_memory_slot
                6 -> return R.drawable.ic_icons8_tv_off
                7 -> return R.drawable.ic_icons8_tv_on
                8 -> return R.drawable.ic_icons8_linux
                9 -> return R.drawable.ic_icons8_root_server
                10 -> return R.drawable.ic_usb_black_48dp
                11 -> return R.drawable.ic_icons8_flow_chart
                12 -> return R.drawable.ic_ip_address
                13 -> return R.drawable.ic_refresh_black_24dp
                14 -> return R.drawable.ic_power_settings_new_black_24dp
                15 -> return R.drawable.ic_power_settings_new_black_24dp
                17 -> return R.drawable.ic_timer_black_24dp
                18 -> return R.drawable.ic_icons8_hdd
                19 -> return R.drawable.ic_icons8_document
                20 -> return R.drawable.ic_desktop_windows_black_24dp
                21 -> return R.drawable.ic_webcam_white_48dp
                22 -> return R.drawable.ic_stop_bluetooth
                23 -> return R.drawable.ic_bluetooth_start
                24 -> return R.drawable.ic_stop_wifi
                25 -> return R.drawable.ic_wifi_start
                26 -> return R.drawable.ic_icons8_talk
                27 -> return R.drawable.ic_volume_up_black_24dp
                28 -> return R.drawable.ic_volume_up_black_24dp
                29 -> return R.drawable.ic_icons8_tv_off
                31 -> return R.drawable.ic_list_interfaces_white_48dp
                158 -> return R.drawable.ic_file_download_white
                191 -> return R.drawable.ic_vip_lookup_white_48dp
                201 -> return R.drawable.ic_icons8_ping_pong
                189 -> return R.drawable.ic_settings_black_24dp
                81 -> return R.drawable.ic_folder_path_white
                94 -> return R.drawable.ic_file_move_white
                245 -> return R.drawable.ic_file_copy_white_48dp
                69 -> return R.drawable.ic_change_folder_white
                237 -> return R.drawable.ic_file_content_white
                174 -> return R.drawable.ic_folder_list_white
                212 -> return R.drawable.ic_file_permission_white_48dp
                240 -> return R.drawable.ic_delete_folder_white_48dp
                167 -> return R.drawable.ic_create_new_folder_white
                127 -> return R.drawable.ic_delete_file_white
                70 -> return R.drawable.ic_create_file_white
                49 -> return R.drawable.ic_add_user_to_group_white_48dp
                110 -> return R.drawable.ic_remove_user_group
                117 -> return R.drawable.ic_icons8_add_user_group
                120 -> return R.drawable.ic_edit_group
                37 -> return R.drawable.ic_user_password
                71 -> return R.drawable.ic_icons8_remove_user_male
                122 -> return R.drawable.ic_icons8_add_user
                102 -> return R.drawable.ic_search_list_white_48dp
                90 -> return R.drawable.ic_search_list_white_48dp
                143 -> return R.drawable.ic_search_executeable_man_white_48dp
                87 -> return R.drawable.ic_search_source_man_white_48dp
                320 -> return R.drawable.ic_icons8_show_property
                138 -> return R.drawable.ic_fingerprint_black_24dp
                45 -> return R.drawable.ic_icons8_console
                106 -> return R.drawable.ic_dns_black_24dp
                116 -> return R.drawable.ic_ip_address
                221 -> return R.drawable.ic_list_sockets_white_48dp
                52 -> return R.drawable.ic_file_link_white_48dp
                113 -> return R.drawable.ic_search_in_file_white_48dp
                32 -> return R.drawable.ic_search_history_white_48dp
                208 -> return R.drawable.ic_remove_user_from_group_white_48dp
                157 -> return R.drawable.ic_add_user_to_group_white_48dp
                137 -> return R.drawable.ic_file_edit_white_48dp
                352 -> return R.drawable.ic_icons8_edit_user
                82 -> return R.drawable.ic_list_user_white_48dp
                164 -> return R.drawable.ic_list_groups_white_48dp
                428 -> return R.drawable.ic_volume_off_black_24dp
                48 -> return R.drawable.ic_switch_video_white_48dp
                39 -> return R.drawable.ic_switch_video_white_48dp
                427 -> return R.drawable.ic_switch_video_white_48dp
                107 -> return R.drawable.ic_switch_video_white_48dp
                185 -> return R.drawable.ic_switch_video_white_48dp
                234 -> return R.drawable.ic_switch_video_white_48dp
                97 -> return R.drawable.ic_switch_video_white_48dp
                430, 431, 432, 433, 434, 435, 436, 437, 438, 439, 440 -> return R.drawable.ic_videogame_asset_black_24dp
                443 -> return R.drawable.ic_vpn_key_black_24dp
                450 -> return R.drawable.ic_wifi_black_24dp
                446, 1495, 457, 1516, 1509 -> return R.drawable.ic_info_black_24dp
                451 -> return R.drawable.ic_report_black_24dp
                445 -> return R.drawable.ic_loupe_black_24dp
                444 -> return R.drawable.ic_fingerprint_black_24dp
                448 -> return R.drawable.ic_public_black_24dp
                447 -> return R.drawable.ic_healing_black_24dp
                441 -> return R.drawable.ic_flash_on_black_24dp
                449 -> return R.drawable.ic_storage_black_24dp
                452 -> return R.drawable.ic_icons8_moderator_male
                454 -> return R.drawable.ic_file
                456 -> return R.drawable.ic_search_black_24dp
                460 -> return R.drawable.ic_add_rule
                453 -> return R.drawable.ic_file_download_black_24dp
                458 -> return R.drawable.ic_available_updates
                459 -> return R.drawable.ic_arrow_upward_black_24dp
                455, 1519, 1511, 1528, 1529, 1530, 1531, 1532 -> return R.drawable.ic_delete_black_24dp
                461 -> return R.drawable.ic_icons8_show_property
                1492 -> return R.drawable.ic_icons8_home
                1493 -> return R.drawable.ic_icons8_mother
                1496 -> return R.drawable.ic_icons8_work
                1497 -> return R.drawable.ic_icons8_undo
                1494 -> return R.drawable.ic_icons8_calendar_1
                1503 -> return R.drawable.ic_vpn_key_black_24dp
                1487, 1488, 1489, 1490, 1491 -> return R.drawable.ic_file
                1498 -> return R.drawable.ic_icons8_cancel
                1499, 1500, 1501, 1502, 1504 -> return R.drawable.ic_icons8_connected
                1505 -> return R.drawable.ic_icons8_copy
                1515 -> return R.drawable.ic_icons8_new
                1506, 1525, 1512 -> return R.drawable.ic_icons8_save
                1517, 1510, 1523 -> return R.drawable.ic_icons8_plus
                1518 -> return R.drawable.ic_icons8_numbered_list
                1522 -> return R.drawable.ic_icons8_merge
                1520, 1521 -> return R.drawable.ic_icons8_arrow
                1524 -> return R.drawable.ic_icons8_synchronize
                1507, 1508 -> return R.drawable.ic_icons8_user_male_circle
                1513 -> return R.drawable.ic_icons8_redo
                1514 -> return R.drawable.ic_icons8_hide
                1527 -> return R.drawable.ic_icons8_visible
            }
            return R.drawable.ic_icons8_console
        }
}