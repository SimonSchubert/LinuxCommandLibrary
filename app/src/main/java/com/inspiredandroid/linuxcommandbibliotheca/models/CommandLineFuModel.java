package com.inspiredandroid.linuxcommandbibliotheca.models;

/**
 * Created by Simon Schubert
 */
public class CommandLineFuModel {
    private int id;
    private String command;
    private String summary;
    private int votes;
    private String url;

    public String getCommand() {
        return command;
    }

    public String getSummary() {
        return summary;
    }

    public int getId() {
        return id;
    }

    public int getVotes() {
        return votes;
    }
}
