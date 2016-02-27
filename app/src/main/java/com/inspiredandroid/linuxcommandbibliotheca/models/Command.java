package com.inspiredandroid.linuxcommandbibliotheca.models;

import io.realm.RealmObject;

/**
 * Created by simon on 24.01.16.
 */
public class Command extends RealmObject {
    public final static String ID = "id";
    public final static String NAME = "name";

    private int id;
    private int category;
    private String name;
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
