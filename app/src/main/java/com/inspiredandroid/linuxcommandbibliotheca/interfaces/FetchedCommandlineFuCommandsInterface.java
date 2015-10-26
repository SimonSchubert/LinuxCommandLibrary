package com.inspiredandroid.linuxcommandbibliotheca.interfaces;

import com.inspiredandroid.linuxcommandbibliotheca.models.CommandLineFuModel;

import java.util.ArrayList;

/**
 * Created by Simon Schubert
 */
public interface FetchedCommandlineFuCommandsInterface {
    /**
     * @param commandLineFuModels list of commands from commandlinefu
     */
    void onFetchedCommandlineFuCommands(ArrayList<CommandLineFuModel> commandLineFuModels);
}
