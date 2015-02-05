package com.inspiredandroid.linuxcommandbibliotheca.interfaces;

import com.inspiredandroid.linuxcommandbibliotheca.models.CommandLineFuModel;

import java.util.ArrayList;

/**
 * Created by simon on 08.09.14.
 */
public interface FetchedCommandlineFuCommands {
    /**
     * If zero commands got fetched the list is empty but never null
     * @param commandLineFuModels
     */
    public abstract void onFetchedCommandlineFuCommands(ArrayList<CommandLineFuModel> commandLineFuModels);
}
