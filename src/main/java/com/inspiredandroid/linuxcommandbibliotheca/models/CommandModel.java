package com.inspiredandroid.linuxcommandbibliotheca.models;

import java.io.Serializable;
import java.util.ArrayList;

public class CommandModel implements Serializable{

    private int category = 0;
    private String command = "";
    private String desc = "";
    private String iconResource = "";
    private String iconBase64 = "";
    private ArrayList<CommandCompatibilityModel> compatibility = new ArrayList<CommandCompatibilityModel>();

    public CommandModel(String command, String desc) {
        this.desc = desc;
        this.command = command;
        this.iconResource = "icon_linux";
        compatibility = new ArrayList<CommandCompatibilityModel>();
    }

    public int getCategory() {
        return category;
    }

    public String getDesc() {
        return desc;
    }

    public String getCommand() {
        return command;
    }

    public String getIconBase64() {
        return iconBase64;
    }

    public void setIconBase64(String value) {
        iconBase64 = value;
    }

    public ArrayList<CommandCompatibilityModel> getCompatibility() {
        if(compatibility == null) {
            return new ArrayList<CommandCompatibilityModel>();
        }
        return compatibility;
    }

    public String getIconResource() {
        return iconResource;
    }
}