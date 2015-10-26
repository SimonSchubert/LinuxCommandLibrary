package com.inspiredandroid.linuxcommandbibliotheca.models;

import android.content.Context;

import com.inspiredandroid.linuxcommandbibliotheca.R;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Simon Schubert
 */
public class CommandGroupModel implements Serializable {

    private int category = 0;
    private int desc = -1;
    private String iconResource = "";
    private String iconBase64 = "";
    private String descStr;
    private ArrayList<CommandChildModel> commands = new ArrayList<>();

    public CommandGroupModel(String command, String desc)
    {
        this.descStr = desc;
        this.iconResource = "icon_linux";  //NON-NLS
        commands.add(new CommandChildModel(command));
    }

    public int getCategory()
    {
        return category;
    }

    public String getDesc(Context context)
    {
        int resId = getDescResourceId();
        if (resId != -1) {
            return context.getResources().getString(resId);
        } else {
            return descStr;
        }
    }

    public int getDescResourceId()
    {
        switch (desc) {
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
        }
        return -1;
    }

    public String getIconBase64()
    {
        return iconBase64;
    }

    public void setIconBase64(String value)
    {
        iconBase64 = value;
    }

    public String getIconResource()
    {
        return iconResource;
    }

    public void addCommand(CommandChildModel childModel)
    {
        commands.add(childModel);
    }

    public ArrayList<CommandChildModel> getCommands()
    {
        return commands;
    }
}