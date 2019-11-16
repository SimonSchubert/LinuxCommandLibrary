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
open class BasicGroup : RealmObject() {

    @PrimaryKey
    var id: Int = 0
    var desc: String = ""
    var position: Long = 0
    var commands: RealmList<BasicCommand> = RealmList()

    val imageResourceId: Int
        get() {
            return when (id) {
                0 -> R.drawable.ic_electronics
                1 -> R.drawable.ic_battery_90_black_24dp
                2 -> R.drawable.ic_bluetooth_black_24dp
                3 -> R.drawable.ic_bluetooth_black_24dp
                4 -> R.drawable.ic_icons8_network_card
                5 -> R.drawable.ic_memory_slot
                6 -> R.drawable.ic_icons8_tv_off
                7 -> R.drawable.ic_icons8_tv_on
                8 -> R.drawable.ic_icons8_linux
                9 -> R.drawable.ic_icons8_root_server
                10 -> R.drawable.ic_usb_black_48dp
                11 -> R.drawable.ic_icons8_flow_chart
                12 -> R.drawable.ic_ip_address
                13 -> R.drawable.ic_refresh_black_24dp
                14 -> R.drawable.ic_power_settings_new_black_24dp
                15 -> R.drawable.ic_power_settings_new_black_24dp
                17 -> R.drawable.ic_timer_black_24dp
                18 -> R.drawable.ic_icons8_hdd
                19 -> R.drawable.ic_icons8_document
                20 -> R.drawable.ic_desktop_windows_black_24dp
                21 -> R.drawable.ic_webcam_white_48dp
                22 -> R.drawable.ic_stop_bluetooth
                23 -> R.drawable.ic_bluetooth_start
                24 -> R.drawable.ic_stop_wifi
                25 -> R.drawable.ic_wifi_start
                26 -> R.drawable.ic_icons8_talk
                27 -> R.drawable.ic_volume_up_black_24dp
                28 -> R.drawable.ic_volume_up_black_24dp
                29 -> R.drawable.ic_icons8_tv_off
                31 -> R.drawable.ic_list_interfaces_white_48dp
                158 -> R.drawable.ic_file_download_white
                191 -> R.drawable.ic_vip_lookup_white_48dp
                201 -> R.drawable.ic_icons8_ping_pong
                189 -> R.drawable.ic_settings_black_24dp
                81 -> R.drawable.ic_folder_path_white
                94 -> R.drawable.ic_file_move_white
                245 -> R.drawable.ic_file_copy_white_48dp
                69 -> R.drawable.ic_change_folder_white
                237 -> R.drawable.ic_file_content_white
                174 -> R.drawable.ic_folder_list_white
                212 -> R.drawable.ic_file_permission_white_48dp
                240 -> R.drawable.ic_delete_folder_white_48dp
                167 -> R.drawable.ic_create_new_folder_white
                127 -> R.drawable.ic_delete_file_white
                70 -> R.drawable.ic_create_file_white
                49 -> R.drawable.ic_add_user_to_group_white_48dp
                110 -> R.drawable.ic_remove_user_group
                117 -> R.drawable.ic_icons8_add_user_group
                120 -> R.drawable.ic_edit_group
                37 -> R.drawable.ic_user_password
                71 -> R.drawable.ic_icons8_remove_user_male
                122 -> R.drawable.ic_icons8_add_user
                102 -> R.drawable.ic_search_list_white_48dp
                90 -> R.drawable.ic_search_list_white_48dp
                143 -> R.drawable.ic_search_executeable_man_white_48dp
                87 -> R.drawable.ic_search_source_man_white_48dp
                320 -> R.drawable.ic_icons8_show_property
                138 -> R.drawable.ic_fingerprint_black_24dp
                45 -> R.drawable.ic_icons8_console
                106 -> R.drawable.ic_dns_black_24dp
                116 -> R.drawable.ic_ip_address
                221 -> R.drawable.ic_list_sockets_white_48dp
                52 -> R.drawable.ic_file_link_white_48dp
                113 -> R.drawable.ic_search_in_file_white_48dp
                32 -> R.drawable.ic_search_history_white_48dp
                208 -> R.drawable.ic_remove_user_from_group_white_48dp
                157 -> R.drawable.ic_add_user_to_group_white_48dp
                137 -> R.drawable.ic_file_edit_white_48dp
                352 -> R.drawable.ic_icons8_edit_user
                82 -> R.drawable.ic_list_user_white_48dp
                164 -> R.drawable.ic_list_groups_white_48dp
                428 -> R.drawable.ic_volume_off_black_24dp
                48 -> R.drawable.ic_switch_video_white_48dp
                39 -> R.drawable.ic_switch_video_white_48dp
                427 -> R.drawable.ic_switch_video_white_48dp
                107 -> R.drawable.ic_switch_video_white_48dp
                185 -> R.drawable.ic_switch_video_white_48dp
                234 -> R.drawable.ic_switch_video_white_48dp
                97 -> R.drawable.ic_switch_video_white_48dp
                430, 431, 432, 433, 434, 435, 436, 437, 438, 439, 440 -> R.drawable.ic_videogame_asset_black_24dp
                443 -> R.drawable.ic_vpn_key_black_24dp
                450 -> R.drawable.ic_wifi_black_24dp
                446, 1495, 457, 1516, 1509 -> R.drawable.ic_info_black_24dp
                451 -> R.drawable.ic_report_black_24dp
                445 -> R.drawable.ic_loupe_black_24dp
                444 -> R.drawable.ic_fingerprint_black_24dp
                448 -> R.drawable.ic_public_black_24dp
                447 -> R.drawable.ic_healing_black_24dp
                441 -> R.drawable.ic_flash_on_black_24dp
                449 -> R.drawable.ic_storage_black_24dp
                452 -> R.drawable.ic_icons8_moderator_male
                454 -> R.drawable.ic_file
                456 -> R.drawable.ic_search_black_24dp
                460 -> R.drawable.ic_add_rule
                453 -> R.drawable.ic_file_download_black_24dp
                458 -> R.drawable.ic_available_updates
                459 -> R.drawable.ic_arrow_upward_black_24dp
                455, 1519, 1511, 1528, 1529, 1530, 1531, 1532 -> R.drawable.ic_delete_black_24dp
                461 -> R.drawable.ic_icons8_show_property
                1492 -> R.drawable.ic_icons8_home
                1493 -> R.drawable.ic_icons8_mother
                1496 -> R.drawable.ic_icons8_work
                1497 -> R.drawable.ic_icons8_undo
                1494 -> R.drawable.ic_icons8_calendar_1
                1503 -> R.drawable.ic_vpn_key_black_24dp
                1487, 1488, 1489, 1490, 1491 -> R.drawable.ic_file
                1498 -> R.drawable.ic_icons8_cancel
                1499, 1500, 1501, 1502, 1504 -> R.drawable.ic_icons8_connected
                1505 -> R.drawable.ic_icons8_copy
                1515 -> R.drawable.ic_icons8_new
                1506, 1525, 1512 -> R.drawable.ic_icons8_save
                1517, 1510, 1523 -> R.drawable.ic_icons8_plus
                1518 -> R.drawable.ic_icons8_numbered_list
                1522 -> R.drawable.ic_icons8_merge
                1520, 1521 -> R.drawable.ic_icons8_arrow
                1524 -> R.drawable.ic_icons8_synchronize
                1507, 1508 -> R.drawable.ic_icons8_user_male_circle
                1513 -> R.drawable.ic_icons8_redo
                1514 -> R.drawable.ic_icons8_hide
                1527 -> R.drawable.ic_icons8_visible
                178 -> R.drawable.ic_icons8_show_property
                154 -> R.drawable.ic_icons8_exe
                141 -> R.drawable.ic_icons8_reuse
                144 -> R.drawable.ic_icons8_delete_trash
                411 -> R.drawable.ic_icons8_add_trash
                114 -> R.drawable.ic_icons8_downloads_folder
                61 -> R.drawable.ic_icons8_kitchen_scales
                98 -> R.drawable.ic_icons8_print_file
                247 -> R.drawable.ic_icons8_visible
                169 -> R.drawable.ic_icons8_cancel
                3731 -> R.drawable.ic_info_black_24dp
                186 -> R.drawable.ic_icons8_circled_play
                187 -> R.drawable.ic_icons8_circled_pause
                226 -> R.drawable.ic_icons8_file_preview
                231 -> R.drawable.ic_file_permission_white_48dp
                99 -> R.drawable.ic_icons8_user_folder
                103 -> R.drawable.ic_icons8_user_male_circle
                66 -> R.drawable.ic_icons8_group_foreground_selected
                else -> R.drawable.ic_icons8_console
            }
        }
}