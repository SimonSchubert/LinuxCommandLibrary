package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.basicgroups

import androidx.compose.runtime.Stable
import databases.BasicCommand
import databases.BasicGroup
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableMap
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.persistentMapOf

@Stable
data class BasicGroupsUiState(
    val basicGroups: ImmutableList<BasicGroup> = persistentListOf(),
    val collapsedMap: ImmutableMap<Long, Boolean> = persistentMapOf(),
    val commandsByGroupId: ImmutableMap<Long, ImmutableList<BasicCommand>> = persistentMapOf(),
)
