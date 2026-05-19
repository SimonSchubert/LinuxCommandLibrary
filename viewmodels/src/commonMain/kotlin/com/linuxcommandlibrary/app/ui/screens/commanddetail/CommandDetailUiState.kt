package com.linuxcommandlibrary.app.ui.screens.commanddetail

import com.linuxcommandlibrary.app.data.CommandSectionInfo
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableMap
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.persistentMapOf

data class CommandDetailUiState(
    val sections: ImmutableList<CommandSectionInfo> = persistentListOf(),
    val expandedSectionsMap: ImmutableMap<Long, Boolean> = persistentMapOf(),
    val isBookmarked: Boolean = false,
    val seeAlsoCommands: ImmutableList<String> = persistentListOf(),
) {
    fun isAllExpanded(): Boolean = expandedSectionsMap.all { it.value }
}
