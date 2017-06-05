package com.inspiredandroid.linuxcommandbibliotheca.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by simon on 24.01.16.
 */
public class Command extends RealmObject {
    public final static String ID = "id";
    public final static String NAME = "name";
    public final static String DESCRIPTION = "desc";

    @PrimaryKey
    private int id;
    private int category;
    @Required
    private String name;
    @Required
    private String desc;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
