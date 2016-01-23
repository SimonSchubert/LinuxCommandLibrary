package com.inspiredandroid.linuxcommandbibliotheca.models;

import io.realm.RealmObject;

/**
 * Created by Simon Schubert
 */
public class CommandManModel extends RealmObject {

    private String man;

    public CommandManModel()
    {

    }

    public CommandManModel(String man)
    {
        this.man = man;
    }

    public String getMan()
    {
        return man;
    }

    public void setMan(String man)
    {
        this.man = man;
    }
}
