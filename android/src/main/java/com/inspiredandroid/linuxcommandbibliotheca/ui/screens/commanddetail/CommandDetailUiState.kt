package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commanddetail

import databases.CommandSection
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableMap

data class CommandDetailUiState(
    val sections: ImmutableList<CommandSection>,
    val expandedSectionsMap: ImmutableMap<Long, Boolean>,
    val isBookmarked: Boolean = false,
    val showBookmarkDialog: Boolean = false,
) {
    fun isAllExpanded(): Boolean = expandedSectionsMap.all { it.value }
}
