package com.inspiredandroid.linuxcommandbibliotheca.models;

/**
 * Created by Simon Schubert
 */
public class CommandsDBTableModel {

    public final static String TABLE_COMMANDS = "commands"; //NON-NLS
    public final static String TABLE_QUIZ = "quiz"; //NON-NLS

    public final static String COL_ID = "_id"; //NON-NLS
    public final static String COL_NAME = "name"; //NON-NLS
    public final static String COL_DIFFICULTY = "difficulty"; //NON-NLS
    public final static String COL_DESCRIPTION = "description"; //NON-NLS
    public final static String COL_MANPAGE = "manpage"; //NON-NLS
    public static final String COL_CATEGORY = "category"; //NON-NLS

    public static final int SCTION_USERCOMMANDS = 1;
    public static final int SCTION_SYSTEMCALLS = 2;
    public static final int SCTION_CLIBFUNCTIONS = 3;
    public static final int SCTION_DEVICESANDSPECIAL = 4;
    public static final int SCTION_FILEFORMATANDCONVENTION = 5;
    public static final int SCTION_GAMES = 6;
    public static final int SCTION_MISSCELANOUS = 7;
    public static final int SCTION_SYSTEMADMINANDDEAMON = 8;
}
