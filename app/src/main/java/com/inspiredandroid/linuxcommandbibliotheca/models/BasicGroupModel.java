package com.inspiredandroid.linuxcommandbibliotheca.models;

import com.inspiredandroid.linuxcommandbibliotheca.R;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by simon on 19.04.17.
 */

public class BasicGroupModel extends RealmObject {

    @PrimaryKey
    private int id;
    private int position;
    private String title;
    private RealmList<CommandGroupModel> groups;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public RealmList<CommandGroupModel> getGroups() {
        return groups;
    }

    public void setGroups(RealmList<CommandGroupModel> groups) {
        this.groups = groups;
    }

    public int getIconResourceId() {
        switch (id) {
            case 247:
                return R.drawable.ic_user_male_circle_40dp;
            case 37:
                return R.drawable.ic_folder_black_40dp;
            case 246:
                return R.drawable.ic_info_40dp;
            case 21:
                return R.drawable.ic_settings_black_40dp;
            case 43:
                return R.drawable.ic_video_trimming_40dp;
            case 243:
                return R.drawable.ic_network_card_40dp;
            case 179:
                return R.drawable.ic_search_40dp;
            case 248:
                return R.drawable.ic_skull_40dp;
            case 249:
                return R.drawable.ic_package_40;
            case 29:
                return R.drawable.ic_videogame_asset_black_40dp;
            case 250:
                return R.drawable.ic_1_circle_40dp;
        }
        return R.drawable.ic_user_male_circle_40dp;
    }
}
