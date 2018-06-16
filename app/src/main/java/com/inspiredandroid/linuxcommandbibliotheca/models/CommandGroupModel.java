package com.inspiredandroid.linuxcommandbibliotheca.models;

import com.inspiredandroid.linuxcommandbibliotheca.R;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Simon Schubert
 */
public class CommandGroupModel extends RealmObject {

    public final static String COLUMN_ID = "id";
    public final static String COLUMN_CATEGORY = "category";

    @PrimaryKey
    private int id;
    private String desc;
    private long votes;
    private RealmList<CommandChildModel> commands;

    public CommandGroupModel() {

    }

    public int getImageResourceId() {
        switch (getId()) {
            case 0:
                return R.drawable.ic_electronics;
            case 1:
                return R.drawable.ic_battery_90_black_24dp;
            case 2:
                return R.drawable.ic_bluetooth_black_24dp;
            case 3:
                return R.drawable.ic_bluetooth_black_24dp;
            case 4:
                return R.drawable.ic_icons8_network_card;
            case 5:
                return R.drawable.ic_memory_slot;
            case 6:
                return R.drawable.ic_icons8_tv_off;
            case 7:
                return R.drawable.ic_icons8_tv_on;
            case 8:
                return R.drawable.ic_icons8_linux;
            case 9:
                return R.drawable.ic_icons8_root_server;
            case 10:
                return R.drawable.ic_usb_black_48dp;
            case 11:
                return R.drawable.ic_icons8_flow_chart;
            case 12:
                return R.drawable.ic_ip_address;
            case 13:
                return R.drawable.ic_refresh_black_24dp;
            case 14:
                return R.drawable.ic_power_settings_new_black_24dp;
            case 15:
                return R.drawable.ic_power_settings_new_black_24dp;
            case 17:
                return R.drawable.ic_timer_black_24dp;
            case 18:
                return R.drawable.ic_icons8_hdd;
            case 19:
                return R.drawable.ic_icons8_document;
            case 20:
                return R.drawable.ic_desktop_windows_black_24dp;
            case 21:
                return R.drawable.ic_webcam_white_48dp;
            case 22:
                return R.drawable.ic_stop_bluetooth;
            case 23:
                return R.drawable.ic_bluetooth_start;
            case 24:
                return R.drawable.ic_stop_wifi;
            case 25:
                return R.drawable.ic_wifi_start;
            case 26:
                return R.drawable.ic_icons8_talk;
            case 27:
                return R.drawable.ic_volume_up_black_24dp;
            case 28:
                return R.drawable.ic_volume_up_black_24dp;
            case 29:
                return R.drawable.ic_icons8_tv_off;
            case 31:
                return R.drawable.ic_list_interfaces_white_48dp;
            case 158:
                return R.drawable.ic_file_download_white;
            case 191:
                return R.drawable.ic_vip_lookup_white_48dp;
            case 201:
                return R.drawable.ic_icons8_ping_pong;
            case 189:
                return R.drawable.ic_settings_black_24dp;
            case 81:
                return R.drawable.ic_folder_path_white;
            case 94:
                return R.drawable.ic_file_move_white;
            case 245:
                return R.drawable.ic_file_copy_white_48dp;
            case 69:
                return R.drawable.ic_change_folder_white;
            case 237:
                return R.drawable.ic_file_content_white;
            case 174:
                return R.drawable.ic_folder_list_white;
            case 212:
                return R.drawable.ic_file_permission_white_48dp;
            case 240:
                return R.drawable.ic_delete_folder_white_48dp;
            case 167:
                return R.drawable.ic_create_new_folder_white;
            case 127:
                return R.drawable.ic_delete_file_white;
            case 70:
                return R.drawable.ic_create_file_white;
            case 49:
                return R.drawable.ic_add_user_to_group_white_48dp;
            case 110:
                return R.drawable.ic_remove_user_group;
            case 117:
                return R.drawable.ic_icons8_add_user_group;
            case 120:
                return R.drawable.ic_edit_group;
            case 37:
                return R.drawable.ic_user_password;
            case 71:
                return R.drawable.ic_icons8_remove_user_male;
            case 122:
                return R.drawable.ic_icons8_add_user;
            case 102:
                return R.drawable.ic_search_list_white_48dp;
            case 90:
                return R.drawable.ic_search_list_white_48dp;
            case 143:
                return R.drawable.ic_search_executeable_man_white_48dp;
            case 87:
                return R.drawable.ic_search_source_man_white_48dp;
            case 320:
                return R.drawable.ic_icons8_show_property;
            case 138:
                return R.drawable.ic_fingerprint_black_24dp;
            case 45:
                return R.drawable.ic_icons8_console;
            case 106:
                return R.drawable.ic_dns_black_24dp;
            case 116:
                return R.drawable.ic_ip_address;
            case 221:
                return R.drawable.ic_list_sockets_white_48dp;
            case 52:
                return R.drawable.ic_file_link_white_48dp;
            case 113:
                return R.drawable.ic_search_in_file_white_48dp;
            case 32:
                return R.drawable.ic_search_history_white_48dp;
            case 208:
                return R.drawable.ic_remove_user_from_group_white_48dp;
            case 157:
                return R.drawable.ic_add_user_to_group_white_48dp;
            case 137:
                return R.drawable.ic_file_edit_white_48dp;
            case 352:
                return R.drawable.ic_icons8_edit_user;
            case 82:
                return R.drawable.ic_list_user_white_48dp;
            case 164:
                return R.drawable.ic_list_groups_white_48dp;
            case 428:
                return R.drawable.ic_volume_off_black_24dp;
            case 48:
                return R.drawable.ic_switch_video_white_48dp;
            case 39:
                return R.drawable.ic_switch_video_white_48dp;
            case 427:
                return R.drawable.ic_switch_video_white_48dp;
            case 107:
                return R.drawable.ic_switch_video_white_48dp;
            case 185:
                return R.drawable.ic_switch_video_white_48dp;
            case 234:
                return R.drawable.ic_switch_video_white_48dp;
            case 97:
                return R.drawable.ic_switch_video_white_48dp;
            case 430:
            case 431:
            case 432:
            case 433:
            case 434:
            case 435:
            case 436:
            case 437:
            case 438:
            case 439:
            case 440:
                return R.drawable.ic_videogame_asset_black_24dp;
            case 443:
                return R.drawable.ic_vpn_key_black_24dp;
            case 450:
                return R.drawable.ic_wifi_black_24dp;
            case 446:
                return R.drawable.ic_info_black_24dp;
            case 451:
                return R.drawable.ic_report_black_24dp;
            case 445:
                return R.drawable.ic_loupe_black_24dp;
            case 444:
                return R.drawable.ic_fingerprint_black_24dp;
            case 448:
                return R.drawable.ic_public_black_24dp;
            case 447:
                return R.drawable.ic_healing_black_24dp;
            case 441:
                return R.drawable.ic_flash_on_black_24dp;
            case 449:
                return R.drawable.ic_storage_black_24dp;
            case 452:
                return R.drawable.ic_icons8_moderator_male;
            case 454:
                return R.drawable.ic_file;
            case 456:
                return R.drawable.ic_search_black_24dp;
            case 457:
                return R.drawable.ic_info_black_24dp;
            case 460:
                return R.drawable.ic_add_rule;
            case 453:
                return R.drawable.ic_file_download_black_24dp;
            case 458:
                return R.drawable.ic_available_updates;
            case 459:
                return R.drawable.ic_arrow_upward_black_24dp;
            case 455:
                return R.drawable.ic_delete_black_24dp;
            case 461:
                return R.drawable.ic_icons8_show_property;
            case 1492:
                return R.drawable.ic_icons8_home;
            case 1493:
                return R.drawable.ic_icons8_mother;
            case 1496:
                return R.drawable.ic_icons8_work;
            case 1497:
                return R.drawable.ic_icons8_undo;
            case 1495:
                return R.drawable.ic_icons8_info;
            case 1494:
                return R.drawable.ic_icons8_calendar_1;
            case 1503:
                return R.drawable.ic_vpn_key_black_24dp;
            case 1487:
            case 1488:
            case 1489:
            case 1490:
            case 1491:
                return R.drawable.ic_file;
            case 1498:
                return R.drawable.ic_icons8_cancel;
            case 1499:
            case 1500:
            case 1501:
            case 1502:
            case 1504:
                return R.drawable.ic_icons8_connected;
        }
        return R.drawable.ic_icons8_console;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getVotes() {
        return votes;
    }

    public void setVotes(long votes) {
        this.votes = votes;
    }

    public RealmList<CommandChildModel> getCommands() {
        return commands;
    }

    public void setCommands(RealmList<CommandChildModel> commands) {
        this.commands = commands;
    }
}