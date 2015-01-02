package com.inspiredandroid.linuxcommandbibliotheca.models;

import java.util.ArrayList;

/**
 * Created by simon on 1/2/15.
 */
public class CommandChildModel {

    private String command = "";
    public CommandChildModel(String _command) {
        command = _command;
    }

    private ArrayList<CommandCompatibilityModel> compatibility = new ArrayList<CommandCompatibilityModel>();

    public ArrayList<CommandCompatibilityModel> getCompatibility() {
        if(compatibility == null) {
            return new ArrayList<CommandCompatibilityModel>();
        }
        return compatibility;
    }

    public String getCommand() {
        return command;
    }
}
