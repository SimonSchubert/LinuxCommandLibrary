package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import com.linuxcommandlibrary.app.resources.Res
import com.linuxcommandlibrary.app.resources.ic_add_rule
import com.linuxcommandlibrary.app.resources.ic_add_user_to_group_white_48dp
import com.linuxcommandlibrary.app.resources.ic_agent
import com.linuxcommandlibrary.app.resources.ic_arrow_upward_black_24dp
import com.linuxcommandlibrary.app.resources.ic_available_updates
import com.linuxcommandlibrary.app.resources.ic_battery_90_black_24dp
import com.linuxcommandlibrary.app.resources.ic_bluetooth_black_24dp
import com.linuxcommandlibrary.app.resources.ic_bluetooth_start
import com.linuxcommandlibrary.app.resources.ic_bookmark_black_24dp
import com.linuxcommandlibrary.app.resources.ic_bookmark_border_black_24dp
import com.linuxcommandlibrary.app.resources.ic_change_folder_white
import com.linuxcommandlibrary.app.resources.ic_collapse_all
import com.linuxcommandlibrary.app.resources.ic_create_file_white
import com.linuxcommandlibrary.app.resources.ic_create_new_folder_white
import com.linuxcommandlibrary.app.resources.ic_delete_black_24dp
import com.linuxcommandlibrary.app.resources.ic_delete_file_white
import com.linuxcommandlibrary.app.resources.ic_delete_folder_white_48dp
import com.linuxcommandlibrary.app.resources.ic_desktop_windows_black_24dp
import com.linuxcommandlibrary.app.resources.ic_dns_black_24dp
import com.linuxcommandlibrary.app.resources.ic_edit_group
import com.linuxcommandlibrary.app.resources.ic_electronics
import com.linuxcommandlibrary.app.resources.ic_expand_all
import com.linuxcommandlibrary.app.resources.ic_file
import com.linuxcommandlibrary.app.resources.ic_file_content_white
import com.linuxcommandlibrary.app.resources.ic_file_copy_white_48dp
import com.linuxcommandlibrary.app.resources.ic_file_download_black_24dp
import com.linuxcommandlibrary.app.resources.ic_file_download_white
import com.linuxcommandlibrary.app.resources.ic_file_edit_white_48dp
import com.linuxcommandlibrary.app.resources.ic_file_link_white_48dp
import com.linuxcommandlibrary.app.resources.ic_file_move_white
import com.linuxcommandlibrary.app.resources.ic_file_permission_white_48dp
import com.linuxcommandlibrary.app.resources.ic_fingerprint_black_24dp
import com.linuxcommandlibrary.app.resources.ic_flash_on_black_24dp
import com.linuxcommandlibrary.app.resources.ic_folder_list_white
import com.linuxcommandlibrary.app.resources.ic_folder_path_white
import com.linuxcommandlibrary.app.resources.ic_healing_black_24dp
import com.linuxcommandlibrary.app.resources.ic_icon_bitcoin
import com.linuxcommandlibrary.app.resources.ic_icon_controller
import com.linuxcommandlibrary.app.resources.ic_icon_fun
import com.linuxcommandlibrary.app.resources.ic_icon_git
import com.linuxcommandlibrary.app.resources.ic_icon_json
import com.linuxcommandlibrary.app.resources.ic_icon_mouse
import com.linuxcommandlibrary.app.resources.ic_icon_skull
import com.linuxcommandlibrary.app.resources.ic_icon_system_task
import com.linuxcommandlibrary.app.resources.ic_icon_user
import com.linuxcommandlibrary.app.resources.ic_icons8_add_trash
import com.linuxcommandlibrary.app.resources.ic_icons8_add_user
import com.linuxcommandlibrary.app.resources.ic_icons8_add_user_group
import com.linuxcommandlibrary.app.resources.ic_icons8_arrow
import com.linuxcommandlibrary.app.resources.ic_icons8_bot
import com.linuxcommandlibrary.app.resources.ic_icons8_calendar_1
import com.linuxcommandlibrary.app.resources.ic_icons8_cancel
import com.linuxcommandlibrary.app.resources.ic_icons8_circled_pause
import com.linuxcommandlibrary.app.resources.ic_icons8_circled_play
import com.linuxcommandlibrary.app.resources.ic_icons8_clipboard
import com.linuxcommandlibrary.app.resources.ic_icons8_coin_wallet
import com.linuxcommandlibrary.app.resources.ic_icons8_compass
import com.linuxcommandlibrary.app.resources.ic_icons8_connected
import com.linuxcommandlibrary.app.resources.ic_icons8_console
import com.linuxcommandlibrary.app.resources.ic_icons8_copy
import com.linuxcommandlibrary.app.resources.ic_icons8_delete_trash
import com.linuxcommandlibrary.app.resources.ic_icons8_document
import com.linuxcommandlibrary.app.resources.ic_icons8_downloads_folder
import com.linuxcommandlibrary.app.resources.ic_icons8_edit_user
import com.linuxcommandlibrary.app.resources.ic_icons8_exe
import com.linuxcommandlibrary.app.resources.ic_icons8_file_preview
import com.linuxcommandlibrary.app.resources.ic_icons8_flow_chart
import com.linuxcommandlibrary.app.resources.ic_icons8_github
import com.linuxcommandlibrary.app.resources.ic_icons8_golden_fever
import com.linuxcommandlibrary.app.resources.ic_icons8_group_foreground_selected
import com.linuxcommandlibrary.app.resources.ic_icons8_hand_with_pen
import com.linuxcommandlibrary.app.resources.ic_icons8_keyboard
import com.linuxcommandlibrary.app.resources.ic_icons8_kitchen_scales
import com.linuxcommandlibrary.app.resources.ic_icons8_linux
import com.linuxcommandlibrary.app.resources.ic_icons8_merge
import com.linuxcommandlibrary.app.resources.ic_icons8_moderator_male
import com.linuxcommandlibrary.app.resources.ic_icons8_mother
import com.linuxcommandlibrary.app.resources.ic_icons8_network_card
import com.linuxcommandlibrary.app.resources.ic_icons8_new
import com.linuxcommandlibrary.app.resources.ic_icons8_numbered_list
import com.linuxcommandlibrary.app.resources.ic_icons8_ping_pong
import com.linuxcommandlibrary.app.resources.ic_icons8_plus
import com.linuxcommandlibrary.app.resources.ic_icons8_print
import com.linuxcommandlibrary.app.resources.ic_icons8_print_file
import com.linuxcommandlibrary.app.resources.ic_icons8_remove_user_male
import com.linuxcommandlibrary.app.resources.ic_icons8_restore_window
import com.linuxcommandlibrary.app.resources.ic_icons8_reuse
import com.linuxcommandlibrary.app.resources.ic_icons8_root_server
import com.linuxcommandlibrary.app.resources.ic_icons8_save
import com.linuxcommandlibrary.app.resources.ic_icons8_show_property
import com.linuxcommandlibrary.app.resources.ic_icons8_synchronize
import com.linuxcommandlibrary.app.resources.ic_icons8_talk
import com.linuxcommandlibrary.app.resources.ic_icons8_teacher_hiring
import com.linuxcommandlibrary.app.resources.ic_icons8_text
import com.linuxcommandlibrary.app.resources.ic_icons8_treatment
import com.linuxcommandlibrary.app.resources.ic_icons8_tv_off
import com.linuxcommandlibrary.app.resources.ic_icons8_tv_on
import com.linuxcommandlibrary.app.resources.ic_icons8_undo
import com.linuxcommandlibrary.app.resources.ic_icons8_user_folder
import com.linuxcommandlibrary.app.resources.ic_icons8_user_male_circle
import com.linuxcommandlibrary.app.resources.ic_icons8_visible
import com.linuxcommandlibrary.app.resources.ic_icons8_work
import com.linuxcommandlibrary.app.resources.ic_idea
import com.linuxcommandlibrary.app.resources.ic_info_40dp
import com.linuxcommandlibrary.app.resources.ic_ip_address
import com.linuxcommandlibrary.app.resources.ic_list_groups_white_48dp
import com.linuxcommandlibrary.app.resources.ic_list_interfaces_white_48dp
import com.linuxcommandlibrary.app.resources.ic_list_sockets_white_48dp
import com.linuxcommandlibrary.app.resources.ic_list_user_white_48dp
import com.linuxcommandlibrary.app.resources.ic_loupe_black_24dp
import com.linuxcommandlibrary.app.resources.ic_memory_slot
import com.linuxcommandlibrary.app.resources.ic_network_card_40dp
import com.linuxcommandlibrary.app.resources.ic_package_40
import com.linuxcommandlibrary.app.resources.ic_power_settings_new_black_24dp
import com.linuxcommandlibrary.app.resources.ic_public_black_24dp
import com.linuxcommandlibrary.app.resources.ic_puzzle
import com.linuxcommandlibrary.app.resources.ic_refresh_black_24dp
import com.linuxcommandlibrary.app.resources.ic_remove_user_from_group_white_48dp
import com.linuxcommandlibrary.app.resources.ic_remove_user_group
import com.linuxcommandlibrary.app.resources.ic_report_black_24dp
import com.linuxcommandlibrary.app.resources.ic_search_40dp
import com.linuxcommandlibrary.app.resources.ic_search_source_man_white_48dp
import com.linuxcommandlibrary.app.resources.ic_settings_black_40dp
import com.linuxcommandlibrary.app.resources.ic_share_black_24dp
import com.linuxcommandlibrary.app.resources.ic_stop_bluetooth
import com.linuxcommandlibrary.app.resources.ic_stop_wifi
import com.linuxcommandlibrary.app.resources.ic_storage_black_24dp
import com.linuxcommandlibrary.app.resources.ic_switch_video_white_48dp
import com.linuxcommandlibrary.app.resources.ic_timer_black_24dp
import com.linuxcommandlibrary.app.resources.ic_usb_black_48dp
import com.linuxcommandlibrary.app.resources.ic_user_password
import com.linuxcommandlibrary.app.resources.ic_video_trimming_40dp
import com.linuxcommandlibrary.app.resources.ic_vip_lookup_white_48dp
import com.linuxcommandlibrary.app.resources.ic_volume_off_black_24dp
import com.linuxcommandlibrary.app.resources.ic_volume_up_black_24dp
import com.linuxcommandlibrary.app.resources.ic_vpn_key_black_24dp
import com.linuxcommandlibrary.app.resources.ic_webcam_white_48dp
import com.linuxcommandlibrary.app.resources.ic_wifi_black_24dp
import com.linuxcommandlibrary.app.resources.ic_wifi_start
import org.jetbrains.compose.resources.painterResource

/**
 * Load icon painter from Compose Multiplatform resources.
 * Icons are shared across all platforms.
 */
@Composable
fun rememberIconPainter(icon: AppIcon): Painter {
    val resource = when (icon) {
        AppIcon.SEARCH -> Res.drawable.ic_search_40dp
        AppIcon.PUZZLE -> Res.drawable.ic_puzzle
        AppIcon.IDEA -> Res.drawable.ic_idea
        AppIcon.BOOKMARK -> Res.drawable.ic_bookmark_black_24dp
        AppIcon.BOOKMARK_BORDER -> Res.drawable.ic_bookmark_border_black_24dp
        AppIcon.ARROW_BACK -> Res.drawable.ic_arrow_upward_black_24dp
        AppIcon.EXPAND_ALL -> Res.drawable.ic_expand_all
        AppIcon.COLLAPSE_ALL -> Res.drawable.ic_collapse_all
        AppIcon.INFO -> Res.drawable.ic_info_40dp
        AppIcon.SHARE -> Res.drawable.ic_share_black_24dp
        AppIcon.GITHUB -> Res.drawable.ic_icons8_github
        AppIcon.SYSTEM_TASK -> Res.drawable.ic_icon_system_task
        AppIcon.SETTINGS -> Res.drawable.ic_settings_black_40dp
        AppIcon.USER -> Res.drawable.ic_icon_user
        AppIcon.FILE -> Res.drawable.ic_file
        AppIcon.PRINT -> Res.drawable.ic_icons8_print
        AppIcon.PRINT_ICON -> Res.drawable.ic_icons8_print
        AppIcon.NETWORK_CARD -> Res.drawable.ic_network_card_40dp
        AppIcon.GIT -> Res.drawable.ic_icon_git
        AppIcon.CONSOLE -> Res.drawable.ic_icons8_console
        AppIcon.VIDEO -> Res.drawable.ic_video_trimming_40dp
        AppIcon.PACKAGE -> Res.drawable.ic_package_40
        AppIcon.SKULL -> Res.drawable.ic_icon_skull
        AppIcon.CONTROLLER -> Res.drawable.ic_icon_controller
        AppIcon.TEXT -> Res.drawable.ic_icons8_text
        AppIcon.BITCOIN -> Res.drawable.ic_icon_bitcoin
        AppIcon.MOUSE -> Res.drawable.ic_icon_mouse
        AppIcon.JSON -> Res.drawable.ic_icon_json
        AppIcon.FUN -> Res.drawable.ic_icon_fun
        AppIcon.AGENT -> Res.drawable.ic_agent
        AppIcon.HAND_WITH_PEN -> Res.drawable.ic_icons8_hand_with_pen
        AppIcon.DEFAULT_GROUP -> Res.drawable.ic_icons8_console
        AppIcon.ADD_RULE -> Res.drawable.ic_add_rule
        AppIcon.ADD_USER_TO_GROUP -> Res.drawable.ic_add_user_to_group_white_48dp
        AppIcon.ARROW_UPWARD -> Res.drawable.ic_arrow_upward_black_24dp
        AppIcon.AVAILABLE_UPDATES -> Res.drawable.ic_available_updates
        AppIcon.BATTERY -> Res.drawable.ic_battery_90_black_24dp
        AppIcon.BLUETOOTH -> Res.drawable.ic_bluetooth_black_24dp
        AppIcon.BLUETOOTH_START -> Res.drawable.ic_bluetooth_start
        AppIcon.CHANGE_FOLDER -> Res.drawable.ic_change_folder_white
        AppIcon.CREATE_FILE -> Res.drawable.ic_create_file_white
        AppIcon.CREATE_FOLDER -> Res.drawable.ic_create_new_folder_white
        AppIcon.DELETE -> Res.drawable.ic_delete_black_24dp
        AppIcon.DELETE_FILE -> Res.drawable.ic_delete_file_white
        AppIcon.DELETE_FOLDER -> Res.drawable.ic_delete_folder_white_48dp
        AppIcon.DESKTOP -> Res.drawable.ic_desktop_windows_black_24dp
        AppIcon.DNS -> Res.drawable.ic_dns_black_24dp
        AppIcon.EDIT_GROUP -> Res.drawable.ic_edit_group
        AppIcon.ELECTRONICS -> Res.drawable.ic_electronics
        AppIcon.FILE_CONTENT -> Res.drawable.ic_file_content_white
        AppIcon.FILE_COPY -> Res.drawable.ic_file_copy_white_48dp
        AppIcon.FILE_DOWNLOAD -> Res.drawable.ic_file_download_black_24dp
        AppIcon.FILE_DOWNLOAD_WHITE -> Res.drawable.ic_file_download_white
        AppIcon.FILE_EDIT -> Res.drawable.ic_file_edit_white_48dp
        AppIcon.FILE_LINK -> Res.drawable.ic_file_link_white_48dp
        AppIcon.FILE_MOVE -> Res.drawable.ic_file_move_white
        AppIcon.FILE_PERMISSION -> Res.drawable.ic_file_permission_white_48dp
        AppIcon.FINGERPRINT -> Res.drawable.ic_fingerprint_black_24dp
        AppIcon.FLASH -> Res.drawable.ic_flash_on_black_24dp
        AppIcon.FOLDER_LIST -> Res.drawable.ic_folder_list_white
        AppIcon.FOLDER_PATH -> Res.drawable.ic_folder_path_white
        AppIcon.HEALING -> Res.drawable.ic_healing_black_24dp
        AppIcon.TRASH_ADD -> Res.drawable.ic_icons8_add_trash
        AppIcon.ADD_USER -> Res.drawable.ic_icons8_add_user
        AppIcon.ADD_USER_GROUP -> Res.drawable.ic_icons8_add_user_group
        AppIcon.ARROW_CHECKOUT -> Res.drawable.ic_icons8_arrow
        AppIcon.BOT -> Res.drawable.ic_icons8_bot
        AppIcon.CALENDAR -> Res.drawable.ic_icons8_calendar_1
        AppIcon.CANCEL -> Res.drawable.ic_icons8_cancel
        AppIcon.PAUSE -> Res.drawable.ic_icons8_circled_pause
        AppIcon.PLAY -> Res.drawable.ic_icons8_circled_play
        AppIcon.CLIPBOARD -> Res.drawable.ic_icons8_clipboard
        AppIcon.WALLET -> Res.drawable.ic_icons8_coin_wallet
        AppIcon.COMPASS -> Res.drawable.ic_icons8_compass
        AppIcon.CONNECTED -> Res.drawable.ic_icons8_connected
        AppIcon.COPY -> Res.drawable.ic_icons8_copy
        AppIcon.DELETE_TRASH -> Res.drawable.ic_icons8_delete_trash
        AppIcon.DOCUMENT -> Res.drawable.ic_icons8_document
        AppIcon.DOWNLOADS_FOLDER -> Res.drawable.ic_icons8_downloads_folder
        AppIcon.EDIT_USER -> Res.drawable.ic_icons8_edit_user
        AppIcon.EXE -> Res.drawable.ic_icons8_exe
        AppIcon.FILE_PREVIEW -> Res.drawable.ic_icons8_file_preview
        AppIcon.FLOW_CHART -> Res.drawable.ic_icons8_flow_chart
        AppIcon.GOLDEN_FEVER -> Res.drawable.ic_icons8_golden_fever
        AppIcon.GROUP_SELECTED -> Res.drawable.ic_icons8_group_foreground_selected
        AppIcon.KEYBOARD -> Res.drawable.ic_icons8_keyboard
        AppIcon.KITCHEN_SCALES -> Res.drawable.ic_icons8_kitchen_scales
        AppIcon.LINUX -> Res.drawable.ic_icons8_linux
        AppIcon.MERGE -> Res.drawable.ic_icons8_merge
        AppIcon.MODERATOR -> Res.drawable.ic_icons8_moderator_male
        AppIcon.MOTHER -> Res.drawable.ic_icons8_mother
        AppIcon.NETWORK -> Res.drawable.ic_icons8_network_card
        AppIcon.NEW -> Res.drawable.ic_icons8_new
        AppIcon.NUMBERED_LIST -> Res.drawable.ic_icons8_numbered_list
        AppIcon.PING_PONG -> Res.drawable.ic_icons8_ping_pong
        AppIcon.PLUS -> Res.drawable.ic_icons8_plus
        AppIcon.PRINT_FILE -> Res.drawable.ic_icons8_print_file
        AppIcon.REMOVE_USER -> Res.drawable.ic_icons8_remove_user_male
        AppIcon.RESTORE_WINDOW -> Res.drawable.ic_icons8_restore_window
        AppIcon.REUSE -> Res.drawable.ic_icons8_reuse
        AppIcon.ROOT_SERVER -> Res.drawable.ic_icons8_root_server
        AppIcon.SAVE -> Res.drawable.ic_icons8_save
        AppIcon.SHOW_PROPERTY -> Res.drawable.ic_icons8_show_property
        AppIcon.SYNCHRONIZE -> Res.drawable.ic_icons8_synchronize
        AppIcon.TALK -> Res.drawable.ic_icons8_talk
        AppIcon.TEACHER -> Res.drawable.ic_icons8_teacher_hiring
        AppIcon.TREATMENT -> Res.drawable.ic_icons8_treatment
        AppIcon.TV_OFF -> Res.drawable.ic_icons8_tv_off
        AppIcon.TV_ON -> Res.drawable.ic_icons8_tv_on
        AppIcon.UNDO -> Res.drawable.ic_icons8_undo
        AppIcon.USER_FOLDER -> Res.drawable.ic_icons8_user_folder
        AppIcon.USER_CIRCLE -> Res.drawable.ic_icons8_user_male_circle
        AppIcon.VISIBLE -> Res.drawable.ic_icons8_visible
        AppIcon.WORK -> Res.drawable.ic_icons8_work
        AppIcon.INFO_SMALL -> Res.drawable.ic_info_40dp
        AppIcon.IP_ADDRESS -> Res.drawable.ic_ip_address
        AppIcon.LIST_GROUPS -> Res.drawable.ic_list_groups_white_48dp
        AppIcon.LIST_INTERFACES -> Res.drawable.ic_list_interfaces_white_48dp
        AppIcon.LIST_SOCKETS -> Res.drawable.ic_list_sockets_white_48dp
        AppIcon.LIST_USER -> Res.drawable.ic_list_user_white_48dp
        AppIcon.LOUPE -> Res.drawable.ic_loupe_black_24dp
        AppIcon.MEMORY_SLOT -> Res.drawable.ic_memory_slot
        AppIcon.POWER -> Res.drawable.ic_power_settings_new_black_24dp
        AppIcon.PUBLIC -> Res.drawable.ic_public_black_24dp
        AppIcon.REFRESH -> Res.drawable.ic_refresh_black_24dp
        AppIcon.REMOVE_USER_FROM_GROUP -> Res.drawable.ic_remove_user_from_group_white_48dp
        AppIcon.REMOVE_GROUP -> Res.drawable.ic_remove_user_group
        AppIcon.REPORT -> Res.drawable.ic_report_black_24dp
        AppIcon.SEARCH_SOURCE -> Res.drawable.ic_search_source_man_white_48dp
        AppIcon.STOP_BLUETOOTH -> Res.drawable.ic_stop_bluetooth
        AppIcon.STOP_WIFI -> Res.drawable.ic_stop_wifi
        AppIcon.STORAGE -> Res.drawable.ic_storage_black_24dp
        AppIcon.SWITCH_VIDEO -> Res.drawable.ic_switch_video_white_48dp
        AppIcon.TIMER -> Res.drawable.ic_timer_black_24dp
        AppIcon.USB -> Res.drawable.ic_usb_black_48dp
        AppIcon.USER_PASSWORD -> Res.drawable.ic_user_password
        AppIcon.VIP_LOOKUP -> Res.drawable.ic_vip_lookup_white_48dp
        AppIcon.VOLUME_OFF -> Res.drawable.ic_volume_off_black_24dp
        AppIcon.VOLUME_UP -> Res.drawable.ic_volume_up_black_24dp
        AppIcon.VPN_KEY -> Res.drawable.ic_vpn_key_black_24dp
        AppIcon.WEBCAM -> Res.drawable.ic_webcam_white_48dp
        AppIcon.WIFI -> Res.drawable.ic_wifi_black_24dp
        AppIcon.WIFI_START -> Res.drawable.ic_wifi_start
    }
    return painterResource(resource)
}
