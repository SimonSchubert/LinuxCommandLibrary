package com.inspiredandroid.linuxcommandbibliotheca.sql;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class CommandsDbHelper extends SQLiteAssetHelper {

    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 2;
    public static final String DATABASE_NAME = "commands.db";

    public CommandsDbHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        setForcedUpgrade();
    }

    /**
     * Get total counts of commands
     *
     * @return total count
     */
    public int getCommandsCount()
    {
        SQLiteDatabase db = getReadableDatabase();

        return db.rawQuery("SELECT * FROM " + CommandsDBTableModel.TABLE_COMMANDS, null).getCount();
    }

    public Cursor getCommandFromName(String name)
    {
        return getReadableDatabase().rawQuery("SELECT * FROM " + CommandsDBTableModel.TABLE_COMMANDS + " WHERE " + CommandsDBTableModel.COL_NAME + " LIKE '" + name + "'", null);
    }

    public Cursor getCommandFromId(long id)
    {
        return getReadableDatabase().rawQuery("SELECT * FROM " + CommandsDBTableModel.TABLE_COMMANDS + " WHERE " + CommandsDBTableModel.COL_ID + " = " + id, null);
    }

    public Cursor getQuiz(int difficulty, ArrayList<String> commands)
    {
        String wherePart = CommandsDBTableModel.COL_NAME + " NOT LIKE ";
        String whereClause = " AND ";
        for(String command : commands) {
            whereClause += wherePart + "'" + command + "' AND ";
        }

        whereClause = whereClause.substring(0, whereClause.length()-4);

        Log.e("TAG", "whereClause: " + whereClause);

        return getReadableDatabase().rawQuery("SELECT * FROM " + CommandsDBTableModel.TABLE_QUIZ + " WHERE " + CommandsDBTableModel.COL_DIFFICULTY + " <= '" + difficulty + "' " + whereClause, null);
    }

    public Cursor getQuizCommandFromName(String name)
    {
        return getReadableDatabase().rawQuery("SELECT * FROM " + CommandsDBTableModel.TABLE_QUIZ + " WHERE " + CommandsDBTableModel.COL_NAME + " LIKE '" + name + "'", null);
    }
}