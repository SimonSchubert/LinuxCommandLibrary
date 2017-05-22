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
                return R.drawable.icon_info_interface;
            case 1:
                return R.drawable.icon_info_interface;
            case 2:
                return R.drawable.icon_info_interface;
            case 3:
                return R.drawable.icon_info_interface;
            case 4:
                return R.drawable.icon_info_interface;
            case 5:
                return R.drawable.icon_info_memory;
            case 6:
                return R.drawable.icon_lock_screen;
            case 7:
                return R.drawable.icon_unlock_screen;
            case 8:
                return R.drawable.icon_info_linux;
            case 9:
                return R.drawable.icon_info_devices;
            case 10:
                return R.drawable.icon_info_usb;
            case 11:
                return R.drawable.icon_info_devices;
            case 12:
                return R.drawable.icon_info_ip;
            case 13:
                return R.drawable.icon_restart;
            case 14:
                return R.drawable.icon_shutdown;
            case 15:
                return R.drawable.icon_shutdown;
            case 16:
                return R.drawable.icon_info_ssh;
            case 17:
                return R.drawable.icon_info_uptime;
            case 18:
                return R.drawable.icon_info_storage;
            case 19:
                return R.drawable.icon_info_bootlog;
            case 20:
                return R.drawable.icon_desktop;
            case 21:
                return R.drawable.icon_webcam;
            case 22:
                return R.drawable.icon_stop_bluetooth;
            case 23:
                return R.drawable.icon_start_bluetooth;
            case 24:
                return R.drawable.icon_stop_wifi;
            case 25:
                return R.drawable.icon_start_wifi;
            case 26:
                return R.drawable.icon_bullhorn;
            case 27:
                return R.drawable.icon_music;
            case 28:
                return R.drawable.icon_music;
            case 29:
                return R.drawable.icon_lock_screen;
            case 31:
                return R.drawable.ic_list_interfaces_white_48dp;
            case 158:
                return R.drawable.ic_file_download_white_48dp;
            case 191:
                return R.drawable.ic_vip_lookup_white_48dp;
            case 201:
                return R.drawable.ic_ping_out_white_48dp;
            case 189:
                return R.drawable.ic_configure_network_white_48dp;
            case 81:
                return R.drawable.ic_folder_path_white_48dp;
            case 94:
                return R.drawable.ic_file_move_white_48dp;
            case 245:
                return R.drawable.ic_file_copy_white_48dp;
            case 69:
                return R.drawable.ic_change_folder_white_48dp;
            case 237:
                return R.drawable.ic_file_content_white_48dp;
            case 174:
                return R.drawable.ic_folder_list_white_48dp;
            case 212:
                return R.drawable.ic_file_permission_white_48dp;
            case 240:
                return R.drawable.ic_delete_folder_white_48dp;
            case 167:
                return R.drawable.ic_create_new_folder_white_48dp;
            case 127:
                return R.drawable.ic_delete_file_white_48dp;
            case 70:
                return R.drawable.ic_create_file_white_48dp;
            case 49:
                return R.drawable.ic_add_user_to_group_white_48dp;
            case 110:
                return R.drawable.ic_delete_group_white_48dp;
            case 117:
                return R.drawable.ic_create_group_white_48dp;
            case 37:
                return R.drawable.ic_user_password_white_48dp;
            case 71:
                return R.drawable.ic_delete_user_white_48dp;
            case 122:
                return R.drawable.ic_create_user_white_48dp;
            case 102:
                return R.drawable.ic_search_list_white_48dp;
            case 90:
                return R.drawable.ic_search_list_white_48dp;
            case 143:
                return R.drawable.ic_search_executeable_man_white_48dp;
            case 87:
                return R.drawable.ic_search_source_man_white_48dp;
            case 320:
                return R.drawable.ic_hostname_white_48dp;
            case 138:
                return R.drawable.ic_traceroute_white_48dp;
            case 45:
                return R.drawable.ic_telnet_white_48dp;
            case 106:
                return R.drawable.ic_dns_white_48dp;
            case 116:
                return R.drawable.ic_refresh_ip_white_48dp;
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
                return R.drawable.ic_edit_user_white_48dp;
            case 82:
                return R.drawable.ic_list_user_white_48dp;
            case 164:
                return R.drawable.ic_list_groups_white_48dp;
            case 120:
                return R.drawable.ic_edit_group_white_48dp;
            case 428:
                return R.drawable.ic_volume_off_white_48dp;
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
                return R.drawable.ic_videogame_asset_white_48dp;
            case 443:
                return R.drawable.ic_vpn_key_white_48dp;
            case 450:
                return R.drawable.ic_wifi_white_48dp;
            case 446:
                return R.drawable.ic_info_white_48dp;
            case 451:
                return R.drawable.ic_report_white_48dp;
            case 445:
                return R.drawable.ic_loupe_white_48dp;
            case 444:
                return R.drawable.ic_fingerprint_white_48dp;
            case 448:
                return R.drawable.ic_public_white_48dp;
            case 447:
                return R.drawable.ic_healing_white_48dp;
            case 441:
                return R.drawable.ic_flash_on_white_48dp;
            case 449:
                return R.drawable.ic_storage_white_48dp;
            case 452:
                return R.drawable.ic_user_sudo_white_48dp;

        }
        return R.drawable.ic_switch_video_white_48dp;
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