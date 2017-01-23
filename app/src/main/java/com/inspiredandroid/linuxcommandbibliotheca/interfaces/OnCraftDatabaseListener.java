package com.inspiredandroid.linuxcommandbibliotheca.interfaces;

import android.widget.DatePicker;
import android.widget.SearchView;

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
