package com.inspiredandroid.linuxcommandbibliotheca.models;

import java.io.Serializable;

/**
 * Created by Simon Schubert
 */
public class CommandManModel implements Serializable {

    private String man;

    public CommandManModel(String man)
    {
        this.man = man;
    }

    public String getMan()
    {
        return man;
    }
}
