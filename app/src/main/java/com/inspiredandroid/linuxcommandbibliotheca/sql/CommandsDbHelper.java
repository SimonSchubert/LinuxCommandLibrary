package com.inspiredandroid.linuxcommandbibliotheca.sql;

import android.content.Context;
import android.database.Cursor;

import com.inspiredandroid.linuxcommandbibliotheca.models.CommandsDBTableModel;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;

/**
 * Created by Simon Schubert
 * TODO: replace with realm(?)
 */
public class CommandsDbHelper extends SQLiteAssetHelper {

    // Update database version after update/schema change
    public static final int DATABASE_VERSION = 3;
    public static final String DATABASE_NAME = "commands.db";

    public CommandsDbHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // needs to be set to recreate database after version change
        setForcedUpgrade();
    }

    /**
     * Get total counts of commands
     *
     * @return total count
     */
    public int getCommandsCount()
    {
        Cursor cursor = getReadableDatabase().rawQuery("SELECT * FROM " + CommandsDBTableModel.TABLE_COMMANDS, null);
        int count = cursor.getCount();
        cursor.close();

        return count;
    }

    /**
     * Get all available commands
     *
     * @return
     */
    public Cursor getAllCommands()
    {
        return getReadableDatabase().rawQuery("SELECT * FROM " + CommandsDBTableModel.TABLE_COMMANDS + " ORDER BY " + CommandsDBTableModel.COL_NAME + " COLLATE NOCASE ASC", null);
    }

    /**
     * Search commands and sort in a useful way. Example search for "man"
     * 1. man
     * 2. manpath
     * 3. xman
     *
     * @param query search
     * @return
     */
    public Cursor searchCommands(String query)
    {
        return getReadableDatabase().rawQuery("Select * from " + CommandsDBTableModel.TABLE_COMMANDS + " WHERE " + CommandsDBTableModel.COL_NAME + " LIKE '%" + query + "%' " +
                "ORDER BY " + CommandsDBTableModel.COL_NAME + " = '" + query + "' DESC," +
                CommandsDBTableModel.COL_NAME + " LIKE '" + query + "%' DESC", null);
    }

    /**
     * Fetch command from name
     *
     * @param name command
     * @return
     */
    public Cursor getCommandFromName(String name)
    {
        return getReadableDatabase().rawQuery("SELECT * FROM " + CommandsDBTableModel.TABLE_COMMANDS + " WHERE " + CommandsDBTableModel.COL_NAME + " LIKE '" + name + "'", null);
    }

    /**
     * Fetch command from unique id
     *
     * @param id unique id
     * @return
     */
    public Cursor getCommandFromId(long id)
    {
        return getReadableDatabase().rawQuery("SELECT * FROM " + CommandsDBTableModel.TABLE_COMMANDS + " WHERE " + CommandsDBTableModel.COL_ID + " = " + id, null);
    }

    /**
     * @param difficulty maximum difficulty
     * @param commands   list of commands which shouldn't be fetched because they were already used in the quiz session
     * @return
     */
    public Cursor getQuiz(int difficulty, ArrayList<String> commands)
    {
        String wherePart = CommandsDBTableModel.COL_NAME + " NOT LIKE ";
        String whereClause = " AND ";
        for (String command : commands) {
            whereClause += wherePart + "'" + command + "' AND ";
        }

        whereClause = whereClause.substring(0, whereClause.length() - 4);

        return getReadableDatabase().rawQuery("SELECT * FROM " + CommandsDBTableModel.TABLE_QUIZ + " WHERE " + CommandsDBTableModel.COL_DIFFICULTY + " <= '" + difficulty + "' " + whereClause, null);
    }

    /**
     * Fetch quiz model from name
     *
     * @param name command
     * @return
     */
    public Cursor getQuizCommandFromName(String name)
    {
        return getReadableDatabase().rawQuery("SELECT * FROM " + CommandsDBTableModel.TABLE_QUIZ + " WHERE " + CommandsDBTableModel.COL_NAME + " LIKE '" + name + "'", null);
    }
}