package com.inspiredandroid.linuxcommandbibliotheca.interfaces

/**
 * Created by Simon Schubert
 */
interface OnCraftDatabaseListener {

    /**
     * Successfully created the database
     */
    fun onDatabaseCreateSuccess()

    /**
     * Failed to create database
     */
    fun onDatabaseCreateFail()
}
