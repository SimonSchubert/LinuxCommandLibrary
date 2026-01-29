package com.linuxcommandlibrary.app.ui.screens.basicgroups

import androidx.compose.runtime.Stable
import com.linuxcommandlibrary.app.data.BasicCommand
import com.linuxcommandlibrary.app.data.BasicGroup
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
