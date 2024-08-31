package com.inspiredandroid.linuxcommandbibliotheca

import databases.BasicCategory
import databases.BasicGroup

fun BasicGroup.getIconResource(): Int {
    return when (id.toInt()) {
        1205 -> R.drawable.ic_info_40dp
        1206 -> R.drawable.ic_icons8_restore_window
        1207 -> R.drawable.ic_icons8_compass
        1208 -> R.drawable.ic_icons8_console
        1212 -> R.drawable.ic_icons8_hand_with_pen
        1209 -> R.drawable.ic_info_40dp
        1211 -> R.drawable.ic_icons8_keyboard
        1210 -> R.drawable.ic_icons8_compass
        1214 -> R.drawable.ic_info_40dp
        1215 -> R.drawable.ic_icons8_keyboard
        1213 -> R.drawable.ic_icons8_compass
        1199 -> R.drawable.ic_file
        1200 -> R.drawable.ic_icons8_compass
        1201 -> R.drawable.ic_icons8_copy
        1202 -> R.drawable.ic_icons8_hand_with_pen
        1203 -> R.drawable.ic_search_40dp
        1204 -> R.drawable.ic_icons8_restore_window
        1165 -> R.drawable.ic_icons8_copy
        1166 -> R.drawable.ic_icons8_new
        1167 -> R.drawable.ic_icons8_save
        1168 -> R.drawable.ic_info_40dp
        1169 -> R.drawable.ic_icons8_plus
        1170 -> R.drawable.ic_icons8_numbered_list
        1171 -> R.drawable.ic_delete_black_24dp
        1172 -> R.drawable.ic_icons8_merge
        1173 -> R.drawable.ic_icons8_arrow
        1174 -> R.drawable.ic_icons8_arrow
        1175 -> R.drawable.ic_icons8_plus
        1176 -> R.drawable.ic_delete_black_24dp
        1177 -> R.drawable.ic_icons8_save
        1178 -> R.drawable.ic_available_updates
        1179 -> R.drawable.ic_icons8_plus
        1180 -> R.drawable.ic_icons8_user_male_circle
        1181 -> R.drawable.ic_icons8_user_male_circle
        1182 -> R.drawable.ic_info_40dp
        1183 -> R.drawable.ic_icons8_undo
        1184 -> R.drawable.ic_icons8_hide
        1185 -> R.drawable.ic_icons8_save
        1186 -> R.drawable.ic_icons8_save
        1187 -> R.drawable.ic_icons8_visible
        1188 -> R.drawable.ic_delete_black_24dp
        1189 -> R.drawable.ic_delete_black_24dp
        1190 -> R.drawable.ic_delete_black_24dp
        1191 -> R.drawable.ic_delete_black_24dp
        1192 -> R.drawable.ic_delete_black_24dp
        125 -> R.drawable.ic_file_download_black_24dp
        126 -> R.drawable.ic_file
        127 -> R.drawable.ic_delete_black_24dp
        128 -> R.drawable.ic_search_40dp
        129 -> R.drawable.ic_info_40dp
        130 -> R.drawable.ic_icons8_synchronize
        131 -> R.drawable.ic_arrow_upward_black_24dp
        132 -> R.drawable.ic_add_rule
        7, 5, 1236, 1248, 1235, 1247, 1246, 1238, 8, 6, 10, 1241, 1245, 9, 1244, 1243, 1, 4, 1242, 2, 3, 0, 1237 -> R.drawable.ic_icon_controller
        1163 -> R.drawable.ic_vpn_key_black_24dp
        1164, 1162, 1161, 1160, 1159 -> R.drawable.ic_icons8_connected
        1231, 1232 -> R.drawable.ic_file
        1158 -> R.drawable.ic_icons8_circled_pause
        26, 91, 92, 93, 94, 95 -> R.drawable.ic_search_40dp
        96, 97, 98, 100, 2399, 99 -> R.drawable.ic_file
        41 -> R.drawable.ic_electronics
        42 -> R.drawable.ic_battery_90_black_24dp
        43, 44 -> R.drawable.ic_bluetooth_black_24dp
        45 -> R.drawable.ic_icons8_network_card
        46 -> R.drawable.ic_memory_slot
        56, 65 -> R.drawable.ic_icons8_tv_off
        57 -> R.drawable.ic_icons8_tv_on
        47 -> R.drawable.ic_icons8_linux
        48 -> R.drawable.ic_icons8_root_server
        49 -> R.drawable.ic_usb_black_48dp
        50 -> R.drawable.ic_icons8_flow_chart
        51 -> R.drawable.ic_ip_address
        58 -> R.drawable.ic_refresh_black_24dp
        59 -> R.drawable.ic_power_settings_new_black_24dp
        55 -> R.drawable.ic_icons8_calendar_1
        52, 60 -> R.drawable.ic_timer_black_24dp
        53 -> R.drawable.ic_icons8_hdd
        61 -> R.drawable.ic_stop_bluetooth
        62 -> R.drawable.ic_bluetooth_start
        63 -> R.drawable.ic_stop_wifi
        64 -> R.drawable.ic_wifi_start
        28 -> R.drawable.ic_icons8_work
        29 -> R.drawable.ic_icons8_undo
        31 -> R.drawable.ic_icons8_kitchen_scales
        81 -> R.drawable.ic_file_download_white
        191 -> R.drawable.ic_vip_lookup_white_48dp
        83 -> R.drawable.ic_icons8_ping_pong
        189 -> R.drawable.ic_settings_black_24dp
        27, 32 -> R.drawable.ic_icons8_show_property
        16 -> R.drawable.ic_file_move_white
        15 -> R.drawable.ic_file_copy_white_48dp
        20 -> R.drawable.ic_change_folder_white
        13 -> R.drawable.ic_file_content_white
        19 -> R.drawable.ic_folder_list_white
        18 -> R.drawable.ic_delete_folder_white_48dp
        17 -> R.drawable.ic_create_new_folder_white
        12 -> R.drawable.ic_delete_file_white
        11 -> R.drawable.ic_create_file_white
        14 -> R.drawable.ic_file_edit_white_48dp
        21 -> R.drawable.ic_icons8_home
        22 -> R.drawable.ic_icons8_mother
        23 -> R.drawable.ic_icons8_downloads_folder
        25 -> R.drawable.ic_file_link_white_48dp
        30 -> R.drawable.ic_icons8_exe
        102 -> R.drawable.ic_remove_user_group
        101 -> R.drawable.ic_icons8_add_user_group
        103 -> R.drawable.ic_edit_group
        107 -> R.drawable.ic_user_password
        104 -> R.drawable.ic_icons8_add_user
        105 -> R.drawable.ic_icons8_remove_user_male
        108 -> R.drawable.ic_icons8_moderator_male
        106 -> R.drawable.ic_icons8_edit_user
        110 -> R.drawable.ic_add_user_to_group_white_48dp
        111 -> R.drawable.ic_add_user_to_group_white_48dp
        112 -> R.drawable.ic_remove_user_from_group_white_48dp
        114 -> R.drawable.ic_list_user_white_48dp
        33 -> R.drawable.ic_icons8_reuse
        34 -> R.drawable.ic_icons8_delete_trash
        35 -> R.drawable.ic_icons8_add_trash
        36 -> R.drawable.ic_icons8_file_preview
        37 -> R.drawable.ic_file_permission_white_48dp
        38 -> R.drawable.ic_icons8_user_folder
        24 -> R.drawable.ic_folder_path_white
        39 -> R.drawable.ic_icons8_user_male_circle
        40 -> R.drawable.ic_icons8_group_foreground_selected
        113 -> R.drawable.ic_list_groups_white_48dp
        109 -> R.drawable.ic_info_40dp
        1193 -> R.drawable.ic_icons8_print_file
        1194 -> R.drawable.ic_icons8_visible
        1195 -> R.drawable.ic_icons8_cancel
        1196 -> R.drawable.ic_info_40dp
        1197 -> R.drawable.ic_icons8_circled_play
        1198 -> R.drawable.ic_icons8_circled_pause
        1230 -> R.drawable.ic_icons8_plus
        1229 -> R.drawable.ic_delete_black_24dp
        1228 -> R.drawable.ic_icons8_plus
        1227 -> R.drawable.ic_icons8_plus
        1226 -> R.drawable.ic_icons8_print
        80 -> R.drawable.ic_list_interfaces_white_48dp
        82 -> R.drawable.ic_vip_lookup_white_48dp
        84 -> R.drawable.ic_settings_black_24dp
        85 -> R.drawable.ic_icons8_visible
        86 -> R.drawable.ic_fingerprint_black_24dp
        88 -> R.drawable.ic_dns_black_24dp
        89 -> R.drawable.ic_ip_address
        90 -> R.drawable.ic_list_sockets_white_48dp
        143 -> R.drawable.ic_search_executeable_man_white_48dp
        87 -> R.drawable.ic_search_source_man_white_48dp
        320 -> R.drawable.ic_icons8_show_property
        138 -> R.drawable.ic_fingerprint_black_24dp
        116 -> R.drawable.ic_vpn_key_black_24dp
        221 -> R.drawable.ic_list_sockets_white_48dp
        137 -> R.drawable.ic_file_edit_white_48dp
        71 -> R.drawable.ic_volume_off_black_24dp
        67 -> R.drawable.ic_webcam_white_48dp
        66 -> R.drawable.ic_desktop_windows_black_24dp
        68 -> R.drawable.ic_icons8_talk
        69, 70 -> R.drawable.ic_volume_up_black_24dp
        72, 73, 75, 76, 77, 78, 1239, 1240, 74 -> R.drawable.ic_switch_video_white_48dp
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
        247 -> R.drawable.ic_icons8_visible
        169 -> R.drawable.ic_icons8_cancel
        3731 -> R.drawable.ic_info_black_24dp
        186 -> R.drawable.ic_icons8_circled_play
        187 -> R.drawable.ic_icons8_circled_pause
        226 -> R.drawable.ic_icons8_file_preview
        231 -> R.drawable.ic_file_permission_white_48dp
        1217 -> R.drawable.ic_icons8_coin_wallet
        1218 -> R.drawable.ic_icons8_bot
        1216 -> R.drawable.ic_icons8_golden_fever
        1233 -> R.drawable.ic_icons8_teacher_hiring
        117 -> R.drawable.ic_fingerprint_black_24dp
        115 -> R.drawable.ic_flash_on_black_24dp
        118 -> R.drawable.ic_loupe_black_24dp
        119 -> R.drawable.ic_info_40dp
        120 -> R.drawable.ic_healing_black_24dp
        121 -> R.drawable.ic_public_black_24dp
        122 -> R.drawable.ic_storage_black_24dp
        123 -> R.drawable.ic_wifi_black_24dp
        124 -> R.drawable.ic_report_black_24dp
        79 -> R.drawable.ic_vpn_key_black_24dp
        54 -> R.drawable.ic_icons8_document
        1222, 1221, 1223 -> R.drawable.ic_icon_mouse
        1220 -> R.drawable.ic_icons8_clipboard
        1219 -> R.drawable.ic_icons8_treatment
        1225, 1224 -> R.drawable.ic_icons8_keyboard
        2403 -> R.drawable.ic_icon_mouse
        2400 -> R.drawable.ic_icons8_keyboard
        2402 -> R.drawable.ic_file
        else -> R.drawable.ic_icons8_console
    }
}

fun BasicCategory.getIconResource(): Int {
    return when (title) {
        "One-liners" -> R.drawable.ic_icons8_hand_with_pen
        "System information" -> R.drawable.ic_icon_system_task
        "System control" -> R.drawable.ic_settings_black_40dp
        "Users & Groups" -> R.drawable.ic_icon_user
        "Files & Folders" -> R.drawable.ic_file
        "Printing" -> R.drawable.ic_icons8_print
        "Network" -> R.drawable.ic_network_card_40dp
        "Search & Find" -> R.drawable.ic_search_40dp
        "GIT" -> R.drawable.ic_icon_git
        "SSH" -> R.drawable.ic_icons8_console
        "Video & Audio" -> R.drawable.ic_video_trimming_40dp
        "Package manager" -> R.drawable.ic_package_40
        "Hacking tools" -> R.drawable.ic_icon_skull
        "Terminal games" -> R.drawable.ic_icon_controller
        "VIM Texteditor", "Emacs Texteditor", "Nano Texteditor", "Pico Texteditor", "Micro Texteditor" -> R.drawable.ic_icons8_text
        "Crypto currencies" -> R.drawable.ic_icon_bitcoin
        "Input" -> R.drawable.ic_icon_mouse
        "JSON" -> R.drawable.ic_icon_json
        "Fun" -> R.drawable.ic_icon_fun
        else -> R.drawable.ic_icon_mouse
    }
}
