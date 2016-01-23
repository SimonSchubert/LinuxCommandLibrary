package com.inspiredandroid.linuxcommandbibliotheca.models;

import java.util.ArrayList;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by Simon Schubert
 */
public class CommandChildModel extends RealmObject {

    private String command;
    private RealmList<CommandCompatibilityModel> compatibility;
    private RealmList<CommandManModel> mans;

    public CommandChildModel()
    {

    }

    public CommandChildModel(String _command, ArrayList<String> _mans)
    {
        command = _command;
        for (String man : _mans) {
            mans.add(new CommandManModel(man));
        }
    }

    public static String[] getMans(CommandChildModel model)
    {
        if (model.getMans() == null) {
            return new String[]{};
        }

        String[] data = new String[model.getMans().size()];
        for (int i = 0; i < model.getMans().size(); i++) {
            data[i] = model.getMans().get(i).getMan();
        }
        return data;
    }

    public RealmList<CommandCompatibilityModel> getCompatibility()
    {
        return compatibility;
    }

    public void setCompatibility(RealmList<CommandCompatibilityModel> compatibility)
    {
        this.compatibility = compatibility;
    }

    public RealmList<CommandManModel> getMans()
    {
        return mans;
    }

    public void setMans(RealmList<CommandManModel> mans)
    {
        this.mans = mans;
    }

    public String getCommand()
    {
        return command;
    }

    public void setCommand(String command)
    {
        this.command = command;
    }
}
