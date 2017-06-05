package com.inspiredandroid.linuxcommandbibliotheca.models;

import io.realm.RealmObject;
import io.realm.annotations.Required;

/**
 * Created by simon on 24.01.16.
 */
public class CommandPage extends RealmObject {
    public static final String COMMANDID = "commandid";

    private int id;
    private int commandid;
    @Required
    private String page;
    @Required
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCommandid() {
        return commandid;
    }

    public void setCommandid(int commandid) {
        this.commandid = commandid;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
