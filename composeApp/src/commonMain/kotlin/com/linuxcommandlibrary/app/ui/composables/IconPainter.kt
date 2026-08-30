package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.painter.Painter
import com.linuxcommandlibrary.app.resources.Res
import com.linuxcommandlibrary.app.resources.ic_account_circle
import com.linuxcommandlibrary.app.resources.ic_account_tree
import com.linuxcommandlibrary.app.resources.ic_add_circle
import com.linuxcommandlibrary.app.resources.ic_add_rule
import com.linuxcommandlibrary.app.resources.ic_add_user_to_group_white_48dp
import com.linuxcommandlibrary.app.resources.ic_admin_panel
import com.linuxcommandlibrary.app.resources.ic_agent
import com.linuxcommandlibrary.app.resources.ic_anchor
import com.linuxcommandlibrary.app.resources.ic_archive
import com.linuxcommandlibrary.app.resources.ic_arrow_forward
import com.linuxcommandlibrary.app.resources.ic_arrow_upward_black_24dp
import com.linuxcommandlibrary.app.resources.ic_available_updates
import com.linuxcommandlibrary.app.resources.ic_background_task
import com.linuxcommandlibrary.app.resources.ic_battery_90_black_24dp
import com.linuxcommandlibrary.app.resources.ic_bluetooth_black_24dp
import com.linuxcommandlibrary.app.resources.ic_bluetooth_start
import com.linuxcommandlibrary.app.resources.ic_bookmark_black_24dp
import com.linuxcommandlibrary.app.resources.ic_bookmark_border_black_24dp
import com.linuxcommandlibrary.app.resources.ic_bug
import com.linuxcommandlibrary.app.resources.ic_calculate
import com.linuxcommandlibrary.app.resources.ic_calendar_today
import com.linuxcommandlibrary.app.resources.ic_cancel
import com.linuxcommandlibrary.app.resources.ic_change_folder_white
import com.linuxcommandlibrary.app.resources.ic_chat
import com.linuxcommandlibrary.app.resources.ic_check_black_24dp
import com.linuxcommandlibrary.app.resources.ic_click
import com.linuxcommandlibrary.app.resources.ic_cloud
import com.linuxcommandlibrary.app.resources.ic_code_white_48dp
import com.linuxcommandlibrary.app.resources.ic_collapse_all
import com.linuxcommandlibrary.app.resources.ic_columns
import com.linuxcommandlibrary.app.resources.ic_compress
import com.linuxcommandlibrary.app.resources.ic_content_copy
import com.linuxcommandlibrary.app.resources.ic_content_cut
import com.linuxcommandlibrary.app.resources.ic_content_paste
import com.linuxcommandlibrary.app.resources.ic_create_file_white
import com.linuxcommandlibrary.app.resources.ic_create_new_folder_white
import com.linuxcommandlibrary.app.resources.ic_cron
import com.linuxcommandlibrary.app.resources.ic_database
import com.linuxcommandlibrary.app.resources.ic_delete
import com.linuxcommandlibrary.app.resources.ic_delete_black_24dp
import com.linuxcommandlibrary.app.resources.ic_delete_file_white
import com.linuxcommandlibrary.app.resources.ic_delete_folder_white_48dp
import com.linuxcommandlibrary.app.resources.ic_description
import com.linuxcommandlibrary.app.resources.ic_desktop_windows_black_24dp
import com.linuxcommandlibrary.app.resources.ic_difference
import com.linuxcommandlibrary.app.resources.ic_dns
import com.linuxcommandlibrary.app.resources.ic_dns_black_24dp
import com.linuxcommandlibrary.app.resources.ic_download
import com.linuxcommandlibrary.app.resources.ic_draw
import com.linuxcommandlibrary.app.resources.ic_edit_group
import com.linuxcommandlibrary.app.resources.ic_electronics
import com.linuxcommandlibrary.app.resources.ic_escalator_warning
import com.linuxcommandlibrary.app.resources.ic_expand_all
import com.linuxcommandlibrary.app.resources.ic_explore
import com.linuxcommandlibrary.app.resources.ic_fiber_new
import com.linuxcommandlibrary.app.resources.ic_file
import com.linuxcommandlibrary.app.resources.ic_file_content_white
import com.linuxcommandlibrary.app.resources.ic_file_copy_white_48dp
import com.linuxcommandlibrary.app.resources.ic_file_download_black_24dp
import com.linuxcommandlibrary.app.resources.ic_file_download_white
import com.linuxcommandlibrary.app.resources.ic_file_edit_white_48dp
import com.linuxcommandlibrary.app.resources.ic_file_link_white_48dp
import com.linuxcommandlibrary.app.resources.ic_file_move_white
import com.linuxcommandlibrary.app.resources.ic_file_permission_white_48dp
import com.linuxcommandlibrary.app.resources.ic_filter
import com.linuxcommandlibrary.app.resources.ic_find_in_page
import com.linuxcommandlibrary.app.resources.ic_find_replace
import com.linuxcommandlibrary.app.resources.ic_fingerprint_black_24dp
import com.linuxcommandlibrary.app.resources.ic_flash_on_black_24dp
import com.linuxcommandlibrary.app.resources.ic_folder_black_40dp
import com.linuxcommandlibrary.app.resources.ic_folder_list_white
import com.linuxcommandlibrary.app.resources.ic_folder_path_white
import com.linuxcommandlibrary.app.resources.ic_folder_shared
import com.linuxcommandlibrary.app.resources.ic_folder_zip
import com.linuxcommandlibrary.app.resources.ic_format_list_numbered
import com.linuxcommandlibrary.app.resources.ic_fuzzy
import com.linuxcommandlibrary.app.resources.ic_gif
import com.linuxcommandlibrary.app.resources.ic_github
import com.linuxcommandlibrary.app.resources.ic_group_add
import com.linuxcommandlibrary.app.resources.ic_group_work
import com.linuxcommandlibrary.app.resources.ic_handyman
import com.linuxcommandlibrary.app.resources.ic_hard_drive
import com.linuxcommandlibrary.app.resources.ic_healing
import com.linuxcommandlibrary.app.resources.ic_healing_black_24dp
import com.linuxcommandlibrary.app.resources.ic_hibernate
import com.linuxcommandlibrary.app.resources.ic_history
import com.linuxcommandlibrary.app.resources.ic_home
import com.linuxcommandlibrary.app.resources.ic_hourglass
import com.linuxcommandlibrary.app.resources.ic_http
import com.linuxcommandlibrary.app.resources.ic_icon_bitcoin
import com.linuxcommandlibrary.app.resources.ic_icon_controller
import com.linuxcommandlibrary.app.resources.ic_icon_fun
import com.linuxcommandlibrary.app.resources.ic_icon_git
import com.linuxcommandlibrary.app.resources.ic_icon_json
import com.linuxcommandlibrary.app.resources.ic_icon_mouse
import com.linuxcommandlibrary.app.resources.ic_icon_skull
import com.linuxcommandlibrary.app.resources.ic_icon_system_task
import com.linuxcommandlibrary.app.resources.ic_icon_user
import com.linuxcommandlibrary.app.resources.ic_idea
import com.linuxcommandlibrary.app.resources.ic_image
import com.linuxcommandlibrary.app.resources.ic_info_40dp
import com.linuxcommandlibrary.app.resources.ic_inventory
import com.linuxcommandlibrary.app.resources.ic_ip_address
import com.linuxcommandlibrary.app.resources.ic_keyboard
import com.linuxcommandlibrary.app.resources.ic_keyboard_black_24dp
import com.linuxcommandlibrary.app.resources.ic_link
import com.linuxcommandlibrary.app.resources.ic_link_off
import com.linuxcommandlibrary.app.resources.ic_linux
import com.linuxcommandlibrary.app.resources.ic_list_alt
import com.linuxcommandlibrary.app.resources.ic_list_groups_white_48dp
import com.linuxcommandlibrary.app.resources.ic_list_interfaces_white_48dp
import com.linuxcommandlibrary.app.resources.ic_list_sockets_white_48dp
import com.linuxcommandlibrary.app.resources.ic_list_user_white_48dp
import com.linuxcommandlibrary.app.resources.ic_lock
import com.linuxcommandlibrary.app.resources.ic_lock_open
import com.linuxcommandlibrary.app.resources.ic_loupe_black_24dp
import com.linuxcommandlibrary.app.resources.ic_manage_accounts
import com.linuxcommandlibrary.app.resources.ic_manage_search
import com.linuxcommandlibrary.app.resources.ic_memory_slot
import com.linuxcommandlibrary.app.resources.ic_merge_type
import com.linuxcommandlibrary.app.resources.ic_mic
import com.linuxcommandlibrary.app.resources.ic_network_card_40dp
import com.linuxcommandlibrary.app.resources.ic_network_check
import com.linuxcommandlibrary.app.resources.ic_numbers
import com.linuxcommandlibrary.app.resources.ic_package_40
import com.linuxcommandlibrary.app.resources.ic_pause_circle
import com.linuxcommandlibrary.app.resources.ic_pdf
import com.linuxcommandlibrary.app.resources.ic_person_add
import com.linuxcommandlibrary.app.resources.ic_person_remove
import com.linuxcommandlibrary.app.resources.ic_pickaxe
import com.linuxcommandlibrary.app.resources.ic_play_circle
import com.linuxcommandlibrary.app.resources.ic_power_settings_new_black_24dp
import com.linuxcommandlibrary.app.resources.ic_print
import com.linuxcommandlibrary.app.resources.ic_public_black_24dp
import com.linuxcommandlibrary.app.resources.ic_puzzle
import com.linuxcommandlibrary.app.resources.ic_qr_code
import com.linuxcommandlibrary.app.resources.ic_quote
import com.linuxcommandlibrary.app.resources.ic_receipt_long
import com.linuxcommandlibrary.app.resources.ic_record
import com.linuxcommandlibrary.app.resources.ic_redo
import com.linuxcommandlibrary.app.resources.ic_refresh_black_24dp
import com.linuxcommandlibrary.app.resources.ic_regex
import com.linuxcommandlibrary.app.resources.ic_remote
import com.linuxcommandlibrary.app.resources.ic_remove_user_from_group_white_48dp
import com.linuxcommandlibrary.app.resources.ic_remove_user_group
import com.linuxcommandlibrary.app.resources.ic_report_black_24dp
import com.linuxcommandlibrary.app.resources.ic_resize
import com.linuxcommandlibrary.app.resources.ic_save
import com.linuxcommandlibrary.app.resources.ic_schedule
import com.linuxcommandlibrary.app.resources.ic_school
import com.linuxcommandlibrary.app.resources.ic_screenshot
import com.linuxcommandlibrary.app.resources.ic_search_40dp
import com.linuxcommandlibrary.app.resources.ic_search_history_white_48dp
import com.linuxcommandlibrary.app.resources.ic_search_in_file_white_48dp
import com.linuxcommandlibrary.app.resources.ic_search_source_man_white_48dp
import com.linuxcommandlibrary.app.resources.ic_security_black_24dp
import com.linuxcommandlibrary.app.resources.ic_settings_applications
import com.linuxcommandlibrary.app.resources.ic_settings_black_40dp
import com.linuxcommandlibrary.app.resources.ic_settings_ethernet
import com.linuxcommandlibrary.app.resources.ic_share_black_24dp
import com.linuxcommandlibrary.app.resources.ic_shuffle
import com.linuxcommandlibrary.app.resources.ic_smart_display
import com.linuxcommandlibrary.app.resources.ic_smart_toy
import com.linuxcommandlibrary.app.resources.ic_sort
import com.linuxcommandlibrary.app.resources.ic_sound_wave
import com.linuxcommandlibrary.app.resources.ic_speed
import com.linuxcommandlibrary.app.resources.ic_split
import com.linuxcommandlibrary.app.resources.ic_splitscreen
import com.linuxcommandlibrary.app.resources.ic_stop_bluetooth
import com.linuxcommandlibrary.app.resources.ic_stop_wifi
import com.linuxcommandlibrary.app.resources.ic_storage
import com.linuxcommandlibrary.app.resources.ic_storage_black_24dp
import com.linuxcommandlibrary.app.resources.ic_swap_horiz
import com.linuxcommandlibrary.app.resources.ic_switch_account
import com.linuxcommandlibrary.app.resources.ic_switch_video_white_48dp
import com.linuxcommandlibrary.app.resources.ic_sync
import com.linuxcommandlibrary.app.resources.ic_tag
import com.linuxcommandlibrary.app.resources.ic_terminal
import com.linuxcommandlibrary.app.resources.ic_text_fields
import com.linuxcommandlibrary.app.resources.ic_thermostat
import com.linuxcommandlibrary.app.resources.ic_timer_black_24dp
import com.linuxcommandlibrary.app.resources.ic_toggle_on
import com.linuxcommandlibrary.app.resources.ic_train
import com.linuxcommandlibrary.app.resources.ic_trash_add
import com.linuxcommandlibrary.app.resources.ic_trending_up
import com.linuxcommandlibrary.app.resources.ic_tv
import com.linuxcommandlibrary.app.resources.ic_tv_off
import com.linuxcommandlibrary.app.resources.ic_unarchive
import com.linuxcommandlibrary.app.resources.ic_undo
import com.linuxcommandlibrary.app.resources.ic_usb_black_48dp
import com.linuxcommandlibrary.app.resources.ic_user_password
import com.linuxcommandlibrary.app.resources.ic_video_trimming_40dp
import com.linuxcommandlibrary.app.resources.ic_visibility
import com.linuxcommandlibrary.app.resources.ic_volume_off_black_24dp
import com.linuxcommandlibrary.app.resources.ic_volume_up_black_24dp
import com.linuxcommandlibrary.app.resources.ic_vpn_key_black_24dp
import com.linuxcommandlibrary.app.resources.ic_wallet
import com.linuxcommandlibrary.app.resources.ic_webcam_white_48dp
import com.linuxcommandlibrary.app.resources.ic_wifi_black_24dp
import com.linuxcommandlibrary.app.resources.ic_wifi_start
import com.linuxcommandlibrary.app.resources.ic_window
import org.jetbrains.compose.resources.painterResource

/**
 * Load icon painter from Compose Multiplatform resources.
 * Icons are shared across all platforms.
 */
@Composable
fun rememberIconPainter(icon: AppIcon): Painter {
    val resource = remember(icon) {
        when (icon) {
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
            AppIcon.GITHUB -> Res.drawable.ic_github
            AppIcon.SYSTEM_TASK -> Res.drawable.ic_icon_system_task
            AppIcon.SETTINGS -> Res.drawable.ic_settings_black_40dp
            AppIcon.USER -> Res.drawable.ic_icon_user
            AppIcon.FILE -> Res.drawable.ic_file
            AppIcon.PRINT -> Res.drawable.ic_print
            AppIcon.NETWORK_CARD -> Res.drawable.ic_network_card_40dp
            AppIcon.GIT -> Res.drawable.ic_icon_git
            AppIcon.CONSOLE -> Res.drawable.ic_terminal
            AppIcon.VIDEO -> Res.drawable.ic_video_trimming_40dp
            AppIcon.PACKAGE -> Res.drawable.ic_package_40
            AppIcon.SKULL -> Res.drawable.ic_icon_skull
            AppIcon.CONTROLLER -> Res.drawable.ic_icon_controller
            AppIcon.TEXT -> Res.drawable.ic_text_fields
            AppIcon.BITCOIN -> Res.drawable.ic_icon_bitcoin
            AppIcon.MOUSE -> Res.drawable.ic_icon_mouse
            AppIcon.JSON -> Res.drawable.ic_icon_json
            AppIcon.FUN -> Res.drawable.ic_icon_fun
            AppIcon.AGENT -> Res.drawable.ic_agent
            AppIcon.HAND_WITH_PEN -> Res.drawable.ic_draw
            AppIcon.IMAGE -> Res.drawable.ic_image
            AppIcon.DEFAULT_GROUP -> Res.drawable.ic_terminal
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
            AppIcon.FOLDER_BLACK -> Res.drawable.ic_folder_black_40dp
            AppIcon.FOLDER_LIST -> Res.drawable.ic_folder_list_white
            AppIcon.FOLDER_PATH -> Res.drawable.ic_folder_path_white
            AppIcon.HEALING -> Res.drawable.ic_healing_black_24dp
            AppIcon.HDD -> Res.drawable.ic_storage
            AppIcon.HOME -> Res.drawable.ic_home
            AppIcon.TRASH_ADD -> Res.drawable.ic_trash_add
            AppIcon.ADD_USER -> Res.drawable.ic_person_add
            AppIcon.ADD_USER_GROUP -> Res.drawable.ic_group_add
            AppIcon.ARROW_CHECKOUT -> Res.drawable.ic_arrow_forward
            AppIcon.BOT -> Res.drawable.ic_smart_toy
            AppIcon.CALENDAR -> Res.drawable.ic_calendar_today
            AppIcon.CANCEL -> Res.drawable.ic_cancel
            AppIcon.CHECK -> Res.drawable.ic_check_black_24dp
            AppIcon.CODE -> Res.drawable.ic_code_white_48dp
            AppIcon.PAUSE -> Res.drawable.ic_pause_circle
            AppIcon.PLAY -> Res.drawable.ic_play_circle
            AppIcon.CLIPBOARD -> Res.drawable.ic_content_paste
            AppIcon.WALLET -> Res.drawable.ic_wallet
            AppIcon.COMPASS -> Res.drawable.ic_explore
            AppIcon.CONNECTED -> Res.drawable.ic_link
            AppIcon.COPY -> Res.drawable.ic_content_copy
            AppIcon.DELETE_TRASH -> Res.drawable.ic_delete
            AppIcon.DOCUMENT -> Res.drawable.ic_description
            AppIcon.DOWNLOADS_FOLDER -> Res.drawable.ic_download
            AppIcon.EDIT_USER -> Res.drawable.ic_manage_accounts
            AppIcon.EXE -> Res.drawable.ic_settings_applications
            AppIcon.FILE_PREVIEW -> Res.drawable.ic_find_in_page
            AppIcon.FLOW_CHART -> Res.drawable.ic_account_tree
            AppIcon.GOLDEN_FEVER -> Res.drawable.ic_pickaxe
            AppIcon.GROUP_SELECTED -> Res.drawable.ic_group_work
            AppIcon.KEYBOARD -> Res.drawable.ic_keyboard
            AppIcon.KEYBOARD_ALT -> Res.drawable.ic_keyboard_black_24dp
            AppIcon.KITCHEN_SCALES -> Res.drawable.ic_compress
            AppIcon.LINUX -> Res.drawable.ic_linux
            AppIcon.MERGE -> Res.drawable.ic_merge_type
            AppIcon.MODERATOR -> Res.drawable.ic_admin_panel
            AppIcon.MOTHER -> Res.drawable.ic_escalator_warning
            AppIcon.NETWORK -> Res.drawable.ic_settings_ethernet
            AppIcon.NEW -> Res.drawable.ic_fiber_new
            AppIcon.NUMBERED_LIST -> Res.drawable.ic_format_list_numbered
            AppIcon.PING_PONG -> Res.drawable.ic_network_check
            AppIcon.PLUS -> Res.drawable.ic_add_circle
            AppIcon.PRINT_FILE -> Res.drawable.ic_print
            AppIcon.REMOVE_USER -> Res.drawable.ic_person_remove
            AppIcon.RESTORE_WINDOW -> Res.drawable.ic_window
            AppIcon.REUSE -> Res.drawable.ic_unarchive
            AppIcon.ROOT_SERVER -> Res.drawable.ic_dns
            AppIcon.SAVE -> Res.drawable.ic_save
            AppIcon.SHOW_PROPERTY -> Res.drawable.ic_list_alt
            AppIcon.SYNCHRONIZE -> Res.drawable.ic_sync
            AppIcon.TALK -> Res.drawable.ic_chat
            AppIcon.TEACHER -> Res.drawable.ic_school
            AppIcon.TREATMENT -> Res.drawable.ic_healing
            AppIcon.TV_OFF -> Res.drawable.ic_tv_off
            AppIcon.TV_ON -> Res.drawable.ic_tv
            AppIcon.UNDO -> Res.drawable.ic_undo
            AppIcon.USER_FOLDER -> Res.drawable.ic_folder_shared
            AppIcon.USER_CIRCLE -> Res.drawable.ic_account_circle
            AppIcon.VISIBLE -> Res.drawable.ic_visibility
            AppIcon.WORK -> Res.drawable.ic_handyman
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
            AppIcon.REDO -> Res.drawable.ic_redo
            AppIcon.REFRESH -> Res.drawable.ic_refresh_black_24dp
            AppIcon.REMOTE -> Res.drawable.ic_remote
            AppIcon.REMOVE_USER_FROM_GROUP -> Res.drawable.ic_remove_user_from_group_white_48dp
            AppIcon.REMOVE_GROUP -> Res.drawable.ic_remove_user_group
            AppIcon.REPORT -> Res.drawable.ic_report_black_24dp
            AppIcon.SEARCH_HISTORY -> Res.drawable.ic_search_history_white_48dp
            AppIcon.SEARCH_IN_FILE -> Res.drawable.ic_search_in_file_white_48dp
            AppIcon.SEARCH_SOURCE -> Res.drawable.ic_search_source_man_white_48dp
            AppIcon.SECURITY -> Res.drawable.ic_security_black_24dp
            AppIcon.STOP_BLUETOOTH -> Res.drawable.ic_stop_bluetooth
            AppIcon.STOP_WIFI -> Res.drawable.ic_stop_wifi
            AppIcon.STORAGE -> Res.drawable.ic_storage_black_24dp
            AppIcon.SWITCH_VIDEO -> Res.drawable.ic_switch_video_white_48dp
            AppIcon.TIMER -> Res.drawable.ic_timer_black_24dp
            AppIcon.USB -> Res.drawable.ic_usb_black_48dp
            AppIcon.USER_PASSWORD -> Res.drawable.ic_user_password
            AppIcon.VOLUME_OFF -> Res.drawable.ic_volume_off_black_24dp
            AppIcon.VOLUME_UP -> Res.drawable.ic_volume_up_black_24dp
            AppIcon.VPN_KEY -> Res.drawable.ic_vpn_key_black_24dp
            AppIcon.WEBCAM -> Res.drawable.ic_webcam_white_48dp
            AppIcon.WIFI -> Res.drawable.ic_wifi_black_24dp
            AppIcon.WIFI_START -> Res.drawable.ic_wifi_start
            AppIcon.NUMBERS -> Res.drawable.ic_numbers
            AppIcon.CALCULATE -> Res.drawable.ic_calculate
            AppIcon.SWAP_HORIZ -> Res.drawable.ic_swap_horiz
            AppIcon.FIND_REPLACE -> Res.drawable.ic_find_replace
            AppIcon.TRENDING_UP -> Res.drawable.ic_trending_up
            AppIcon.SCHEDULE -> Res.drawable.ic_schedule
            AppIcon.HISTORY -> Res.drawable.ic_history
            AppIcon.QR_CODE -> Res.drawable.ic_qr_code
            AppIcon.HARD_DRIVE -> Res.drawable.ic_hard_drive
            AppIcon.DIFFERENCE -> Res.drawable.ic_difference
            AppIcon.RECORD -> Res.drawable.ic_record
            AppIcon.RECEIPT_LONG -> Res.drawable.ic_receipt_long
            AppIcon.CLOUD -> Res.drawable.ic_cloud
            AppIcon.ACCOUNT_TREE -> Res.drawable.ic_account_tree
            AppIcon.INVENTORY -> Res.drawable.ic_inventory
            AppIcon.CONTENT_CUT -> Res.drawable.ic_content_cut
            AppIcon.MIC -> Res.drawable.ic_mic
            AppIcon.SOUND_WAVE -> Res.drawable.ic_sound_wave
            AppIcon.LOCK -> Res.drawable.ic_lock
            AppIcon.LOCK_OPEN -> Res.drawable.ic_lock_open
            AppIcon.HIBERNATE -> Res.drawable.ic_hibernate
            AppIcon.FILTER -> Res.drawable.ic_filter
            AppIcon.MANAGE_SEARCH -> Res.drawable.ic_manage_search
            AppIcon.FUZZY -> Res.drawable.ic_fuzzy
            AppIcon.TAG -> Res.drawable.ic_tag
            AppIcon.CLICK -> Res.drawable.ic_click
            AppIcon.COLUMNS -> Res.drawable.ic_columns
            AppIcon.SHUFFLE -> Res.drawable.ic_shuffle
            AppIcon.SORT -> Res.drawable.ic_sort
            AppIcon.QUOTE -> Res.drawable.ic_quote
            AppIcon.BUG -> Res.drawable.ic_bug
            AppIcon.DATABASE -> Res.drawable.ic_database
            AppIcon.FOLDER_ZIP -> Res.drawable.ic_folder_zip
            AppIcon.ARCHIVE -> Res.drawable.ic_archive
            AppIcon.LINK_OFF -> Res.drawable.ic_link_off
            AppIcon.SPLIT -> Res.drawable.ic_split
            AppIcon.SCREENSHOT -> Res.drawable.ic_screenshot
            AppIcon.TOGGLE_ON -> Res.drawable.ic_toggle_on
            AppIcon.SPEED -> Res.drawable.ic_speed
            AppIcon.HTTP -> Res.drawable.ic_http
            AppIcon.PDF -> Res.drawable.ic_pdf
            AppIcon.CRON -> Res.drawable.ic_cron
            AppIcon.HOURGLASS -> Res.drawable.ic_hourglass
            AppIcon.THERMOSTAT -> Res.drawable.ic_thermostat
            AppIcon.GIF -> Res.drawable.ic_gif
            AppIcon.SMART_DISPLAY -> Res.drawable.ic_smart_display
            AppIcon.BACKGROUND_TASK -> Res.drawable.ic_background_task
            AppIcon.TRAIN -> Res.drawable.ic_train
            AppIcon.SWITCH_ACCOUNT -> Res.drawable.ic_switch_account
            AppIcon.SPLITSCREEN -> Res.drawable.ic_splitscreen
            AppIcon.RESIZE -> Res.drawable.ic_resize
            AppIcon.ANCHOR -> Res.drawable.ic_anchor
            AppIcon.REGEX -> Res.drawable.ic_regex
        }
    }
    return painterResource(resource)
}
