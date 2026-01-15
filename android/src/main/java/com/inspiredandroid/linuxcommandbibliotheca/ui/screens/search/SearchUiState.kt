package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.search

import databases.BasicCommand
import databases.BasicGroup
import databases.Command
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableMap
import kotlinx.collections.immutable.ImmutableSet
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.persistentMapOf
import kotlinx.collections.immutable.persistentSetOf

data class SearchUiState(
    val filteredCommands: ImmutableList<Command> = persistentListOf(),
    val filteredBasicGroups: ImmutableList<BasicGroup> = persistentListOf(),
    val collapsedMap: ImmutableMap<Long, Boolean> = persistentMapOf(),
    val matchingBasicCommandIds: ImmutableSet<Long> = persistentSetOf(),
    val groupsMatchedByCommand: ImmutableSet<Long> = persistentSetOf(),
    val commandsByGroupId: ImmutableMap<Long, ImmutableList<BasicCommand>> = persistentMapOf(),
)
