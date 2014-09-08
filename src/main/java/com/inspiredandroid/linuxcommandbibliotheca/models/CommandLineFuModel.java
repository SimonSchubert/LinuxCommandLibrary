package com.inspiredandroid.linuxcommandbibliotheca.models;

/**
 * Created by simon on 08.09.14.
 */
public class CommandLineFuModel {
    int id;
    String command;
    String summary;
    int votes;
    String url;

    public String getCommand() {
        return command;
    }

    public String getSummary() {
        return summary;
    }
}
