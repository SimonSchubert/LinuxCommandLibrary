package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commanddetail

import databases.CommandSection

data class CommandDetailUiState(
    val sections: List<CommandSection>,
    val expandedSectionsMap: Map<Long, Boolean>,
    val isBookmarked: Boolean = false,
    val showBookmarkDialog: Boolean = false,
) {
    fun isAllExpanded(): Boolean = expandedSectionsMap.all { it.value }
}
