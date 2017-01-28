package com.inspiredandroid.linuxcommandbibliotheca.models;

import android.content.Context;

import com.inspiredandroid.linuxcommandbibliotheca.R;

import java.util.ArrayList;

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

    private int category;
    private int desc;
    private String iconResource;
    private String iconBase64;
    private String descStr;
    private int votes;
    private RealmList<CommandChildModel> commands;

    public CommandGroupModel() {

    }

    public static String getDescString(CommandGroupModel model, Context context) {
        int resId = getDescResourceId(model);
        if (resId != -1) {
            return context.getResources().getString(resId);
        } else {
            return "";
        }
    }

    public static int getImageResourceId(CommandGroupModel model) {
        switch (model.getId()) {
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
                return R.drawable.ic_device_hub_white_48dp;
            case 158:
                return R.drawable.ic_file_download_white_48dp;
            case 191:
                return R.drawable.ic_device_hub_white_48dp;
            case 201:
                return R.drawable.ic_device_hub_white_48dp;
            case 189:
                return R.drawable.ic_device_hub_white_48dp;
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
                return R.drawable.ic_search_white_48dp;
            case 90:
                return R.drawable.ic_search_white_48dp;
            case 143:
                return R.drawable.ic_search_white_48dp;
            case 87:
                return R.drawable.ic_search_white_48dp;
            case 320:
                return R.drawable.ic_device_hub_white_48dp;
            case 138:
                return R.drawable.ic_device_hub_white_48dp;
            case 45:
                return R.drawable.ic_device_hub_white_48dp;
            case 106:
                return R.drawable.ic_device_hub_white_48dp;
            case 116:
                return R.drawable.ic_device_hub_white_48dp;
            case 221:
                return R.drawable.ic_file_permission_white_48dp;
            case 52:
                return R.drawable.ic_file_link_white_48dp;
            case 113:
                return R.drawable.ic_search_white_48dp;
            case 32:
                return R.drawable.ic_search_white_48dp;
            case 208:
                return R.drawable.ic_remove_user_from_group_white_48dp;
            case 157:
                return R.drawable.ic_add_user_to_group_white_48dp;
            case 137:
                return R.drawable.ic_file_edit_white_48dp;
        }
        return -1;
    }

    public static int getDescResourceId(CommandGroupModel model) {
        switch (model.getId()) {
            case 0:
                return R.string.desc_get_cpu_usage;
            case 1:
                return R.string.desc_battery_usage;
            case 2:
                return R.string.desc_bluetooth_mac;
            case 3:
                return R.string.desc_bluetooth_name;
            case 4:
                return R.string.desc_print_network_interfaces;
            case 5:
                return R.string.desc_print_memory_info;
            case 6:
                return R.string.desc_lock_screen;
            case 7:
                return R.string.desc_unlock_screen;
            case 8:
                return R.string.desc_print_system_info;
            case 9:
                return R.string.desc_print_pci_devices;
            case 10:
                return R.string.desc_print_usb_devices;
            case 11:
                return R.string.desc_print_block_devices;
            case 12:
                return R.string.desc_print_external_ip;
            case 13:
                return R.string.desc_reboot_system;
            case 14:
                return R.string.desc_shutdown_system;
            case 15:
                return R.string.desc_shutdown_system_at_time;
            case 16:
                return R.string.desc_print_ssh_version;
            case 17:
                return R.string.desc_print_uptime;
            case 18:
                return R.string.desc_print_deisk_info;
            case 19:
                return R.string.desc_print_bootlog_info;
            case 20:
                return R.string.desc_take_screenshot;
            case 21:
                return R.string.desc_take_webcame_photo;
            case 22:
                return R.string.desc_stop_bluetooth;
            case 23:
                return R.string.desc_start_bluetooth;
            case 24:
                return R.string.desc_stop_wifi;
            case 25:
                return R.string.desc_start_wifi;
            case 26:
                return R.string.desc_play_text_by_computer_voice;
            case 27:
                return R.string.desc_play_audio_file;
            case 28:
                return R.string.desc_play_beep;
            case 29:
                return R.string.desc_turn_off_monitor;
            case 31:
                return R.string.desc_get_network_card;
            case 158:
                return R.string.download_file;
            case 191:
                return R.string.get_domain_info;
            case 201:
                return R.string.ping_info;
            case 189:
                return R.string.configure_network_interface;
            case 81:
                return R.string.shw_current_directory;
            case 94:
                return R.string.move_rename_file;
            case 245:
                return R.string.copy_file_or_directory;
            case 69:
                return R.string.change_directory;
            case 237:
                return R.string.display_file_content;
            case 174:
                return R.string.list_directory;
            case 212:
                return R.string.set_file_permission;
            case 240:
                return R.string.delete_folder;
            case 167:
                return R.string.create_folder;
            case 127:
                return R.string.delete_file;
            case 70:
                return R.string.create_file;
            case 49:
                return R.string.add_user_to_group;
            case 110:
                return R.string.delete_group;
            case 117:
                return R.string.create_group;
            case 37:
                return R.string.set_user_passord;
            case 71:
                return R.string.delete_user;
            case 122:
                return R.string.create_user;
            case 102:
                return R.string.find_file_by_name;
            case 90:
                return R.string.list_of_path;
            case 143:
                return R.string.executable_path;
            case 87:
                return R.string.whereis;
            case 320:
                return R.string.print_hostname_of_box;
            case 138:
                return R.string.print_traeroute_to_host;
            case 45:
                return R.string.telnet;
            case 106:
                return R.string.dns_lookup;
            case 116:
                return R.string.release_ip_dhcp;
            case 221:
                return R.string.open_sockets;
            case 52:
                return R.string.create_physical_link;
            case 113:
                return R.string.find_phrase_inside_file;
            case 32:
                return R.string.search_command_in_history;
            case 208:
                return R.string.delete_user_from_group;
            case 157:
                return R.string.add_new_user_to_group;
            case 137:
                return R.string.edit_text_file;
        }
        return -1;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getDesc() {
        return desc;
    }

    public void setDesc(int desc) {
        this.desc = desc;
    }

    public String getDescStr() {
        return descStr;
    }

    public void setDescStr(String descStr) {
        this.descStr = descStr;
    }

    public String getIconBase64() {
        return iconBase64;
    }

    public void setIconBase64(String value) {
        iconBase64 = value;
    }

    public String getIconResource() {
        return iconResource;
    }

    public void setIconResource(String iconResource) {
        this.iconResource = iconResource;
    }

    public RealmList<CommandChildModel> getCommands() {
        return commands;
    }

    public void setCommands(RealmList<CommandChildModel> commands) {
        this.commands = commands;
    }
}