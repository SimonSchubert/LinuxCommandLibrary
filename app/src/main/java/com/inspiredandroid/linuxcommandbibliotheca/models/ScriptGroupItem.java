package com.inspiredandroid.linuxcommandbibliotheca.models;

/**
 * Created by simon on 23/01/17.
 */
public class ScriptGroupItem {

    public final static int GROUP_INFO = 0;
    public final static int GROUP_SYSTEM_CONTROL = 1;
    public final static int GROUP_AUDIO_VIDEO = 2;
    public final static int GROUP_COMMANDLINEFU = 3;
    public final static int GROUP_USER_GROUP = 4;
    public final static int GROUP_FILE_FOLDER = 5;

    private String mTitle;
    private int mIconRes;
    private int mId;

    public ScriptGroupItem(int id, String title, int iconRes) {
        mTitle = title;
        mIconRes = iconRes;
        mId = id;
    }

    public int getId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public int getmIconRes() {
        return mIconRes;
    }
}
