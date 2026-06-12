package com.linuxcommandlibrary.app.ui.screens.basicgroups

import com.linuxcommandlibrary.app.data.BasicGroup
import com.linuxcommandlibrary.shared.TipSectionElement
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableMap
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.persistentMapOf

data class BasicGroupsUiState(
    val basicGroups: ImmutableList<BasicGroup> = persistentListOf(),
    val collapsedMap: ImmutableMap<Long, Boolean> = persistentMapOf(),
    val sectionsByGroupId: ImmutableMap<Long, ImmutableList<TipSectionElement>> = persistentMapOf(),
)
