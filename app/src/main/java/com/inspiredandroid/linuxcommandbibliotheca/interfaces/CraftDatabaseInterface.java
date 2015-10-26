package com.inspiredandroid.linuxcommandbibliotheca.interfaces;

/**
 * Created by Simon Schubert
 */
public interface CraftDatabaseInterface {

    /**
     * Successfully created the database
     */
    void onSuccessCraftingDatabase();

    /**
     * Failed to create database
     */
    void onFailedCraftingDatabase();
}
