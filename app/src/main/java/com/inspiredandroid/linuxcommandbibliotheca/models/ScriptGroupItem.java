package com.inspiredandroid.linuxcommandbibliotheca.models;

/**
 * Created by simon on 23/01/17.
 */
public class ScriptGroupItem {

    public final static int GROUP_INFO = 0;
    public final static int GROUP_SYSTEM_CONTROL = 1;
    public final static int GROUP_AUDIO_VIDEO = 2;
    public final static int GROUP_USER_GROUP = 4;
    public final static int GROUP_FILE_FOLDER = 5;
    public final static int GROUP_NETWORK = 6;
    public final static int GROUP_SEARCH = 7;

    private int mTitleRes;
    private int mIconRes;
    private int mId;

    public ScriptGroupItem(int id, int titleRes, int iconRes) {
        mTitleRes = titleRes;
        mIconRes = iconRes;
        mId = id;
    }

    public int getId() {
        return mId;
    }

    public int getmTitle() {
        return mTitleRes;
    }

    public int getmIconRes() {
        return mIconRes;
    }
}
