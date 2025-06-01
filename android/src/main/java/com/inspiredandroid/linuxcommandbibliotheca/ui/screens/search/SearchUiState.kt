package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.search

import databases.BasicGroup
import databases.Command
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableMap
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.persistentMapOf

data class SearchUiState(
    val filteredCommands: ImmutableList<Command> = persistentListOf(),
    val filteredBasicGroups: ImmutableList<BasicGroup> = persistentListOf(),
    val collapsedMap: ImmutableMap<Long, Boolean> = persistentMapOf(),
)
