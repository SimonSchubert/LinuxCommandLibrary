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

    public CommandGroupModel(String command, String desc, ArrayList<String> mans) {
        this.descStr = desc;
        this.iconResource = "icon_linux";  //NON-NLS
        commands.add(new CommandChildModel(command, mans));
    }

    public static String getDescString(CommandGroupModel model, Context context) {
        int resId = getDescResourceId(model);
        if (resId != -1) {
            return context.getResources().getString(resId);
        } else {
            return model.getDescStr();
        }
    }

    public static int getDescResourceId(CommandGroupModel model) {
        switch (model.getDesc()) {
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
            case 30:
                return R.string.desc_get_cpu_usage;
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