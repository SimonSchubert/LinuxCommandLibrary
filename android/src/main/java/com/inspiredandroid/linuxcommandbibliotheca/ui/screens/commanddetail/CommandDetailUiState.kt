package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commanddetail

import androidx.compose.runtime.Stable
import databases.CommandSection
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableMap
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.persistentMapOf

@Stable
data class CommandDetailUiState(
    val sections: ImmutableList<CommandSection> = persistentListOf(),
    val expandedSectionsMap: ImmutableMap<Long, Boolean> = persistentMapOf(),
    val isBookmarked: Boolean = false,
    val showBookmarkDialog: Boolean = false,
    val seeAlsoCommands: ImmutableList<String> = persistentListOf(),
) {
    fun isAllExpanded(): Boolean = expandedSectionsMap.all { it.value }
}
