package com.inspiredandroid.linuxcommandbibliotheca.interfaces;

/**
 * Created by Simon Schubert
 */
public interface OnCraftDatabaseListener {

    /**
     * Successfully created the database
     */
    void onDatabaseCreateSuccess();

    /**
     * Failed to create database
     */
    void onDatabaseCreateFail();
}
