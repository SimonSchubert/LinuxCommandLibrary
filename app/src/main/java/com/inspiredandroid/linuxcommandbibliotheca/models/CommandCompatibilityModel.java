package com.inspiredandroid.linuxcommandbibliotheca.models;

import io.realm.RealmObject;

/**
 * Created by Simon Schubert
 */
public class CommandCompatibilityModel extends RealmObject {

    private int system = 0;
    private int version = 0;

    public CommandCompatibilityModel()
    {

    }

    public int getSystem()
    {
        return system;
    }

    public void setSystem(int system)
    {
        this.system = system;
    }

    public int getVersion()
    {
        return version;
    }

    public void setVersion(int version)
    {
        this.version = version;
    }
}
