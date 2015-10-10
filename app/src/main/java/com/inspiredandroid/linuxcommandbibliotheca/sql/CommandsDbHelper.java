package com.inspiredandroid.linuxcommandbibliotheca.sql;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class CommandsDbHelper extends SQLiteAssetHelper {

    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "commands.db";

    public CommandsDbHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * Get total counts of commands
     *
     * @return total count
     */
    public int getCount()
    {
        SQLiteDatabase db = getReadableDatabase();

        return db.rawQuery("SELECT * FROM " + CommandsDBTableModel.TABLE_COMMANDS, null).getCount();
    }
}