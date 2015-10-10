package com.inspiredandroid.linuxcommandbibliotheca.interfaces;

import com.inspiredandroid.linuxcommandbibliotheca.models.CommandLineFuModel;

import java.util.ArrayList;

/**
 * Created by simon on 08.09.14.
 */
public interface FetchedCommandlineFuCommandsInterface {
    /**
     * @param commandLineFuModels
     */
    void onFetchedCommandlineFuCommands(ArrayList<CommandLineFuModel> commandLineFuModels);
}
