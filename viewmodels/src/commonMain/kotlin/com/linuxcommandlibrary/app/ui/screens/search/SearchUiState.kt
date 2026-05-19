package com.linuxcommandlibrary.app.ui.screens.search

import com.linuxcommandlibrary.app.data.BasicGroupMatch
import com.linuxcommandlibrary.app.data.CommandInfo
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

data class SearchUiState(
    val filteredCommands: ImmutableList<CommandInfo> = persistentListOf(),
    val filteredBasicGroups: ImmutableList<BasicGroupMatch> = persistentListOf(),
)
