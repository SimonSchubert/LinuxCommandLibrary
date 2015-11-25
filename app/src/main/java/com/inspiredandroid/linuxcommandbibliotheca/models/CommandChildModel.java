package com.inspiredandroid.linuxcommandbibliotheca.models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Simon Schubert
 */
public class CommandChildModel implements Serializable {

    private String command = "";
    private ArrayList<CommandCompatibilityModel> compatibility = new ArrayList<>();
    private ArrayList<CommandManModel> mans = new ArrayList<>();

    public CommandChildModel(String _command, ArrayList<String> _mans)
    {
        command = _command;
        for (String man : _mans) {
            mans.add(new CommandManModel(man));
        }
    }

    public ArrayList<CommandCompatibilityModel> getCompatibility()
    {
        if (compatibility == null) {
            return new ArrayList<>();
        }
        return compatibility;
    }

    public String[] getMans()
    {
        if (mans == null) {
            return new String[]{};
        }

        String[] data = new String[mans.size()];
        for (int i = 0; i < mans.size(); i++) {
            data[i] = mans.get(i).getMan();
        }
        return data;
    }

    public String getCommand()
    {
        return command;
    }
}
