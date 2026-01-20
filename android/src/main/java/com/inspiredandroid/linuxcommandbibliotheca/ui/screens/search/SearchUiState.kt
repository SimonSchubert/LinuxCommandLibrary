package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.search

import androidx.compose.runtime.Stable
import com.inspiredandroid.linuxcommandbibliotheca.data.CommandInfo
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

@Stable
data class SearchUiState(
    val filteredCommands: ImmutableList<CommandInfo> = persistentListOf(),
)
