@file:OptIn(ExperimentalMaterialApi::class)

package com.linuxcommandlibrary.app.ui.screens.basicgroups

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.ListItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.data.BasicCommand
import com.linuxcommandlibrary.app.data.BasicGroup
import com.linuxcommandlibrary.app.ui.composables.CommandView
import com.linuxcommandlibrary.app.ui.composables.HighlightedText
import com.linuxcommandlibrary.app.ui.composables.getIconId
import com.linuxcommandlibrary.app.ui.composables.rememberIconPainter
import com.linuxcommandlibrary.shared.getCommandList
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableSet
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.persistentSetOf
import kotlinx.collections.immutable.toImmutableList

@Composable
fun BasicGroupsScreen(
    viewModel: BasicGroupsViewModel,
    onNavigate: (String) -> Unit = {},
) {
    val uiState by viewModel.uiState.collectAsState()

    LazyColumn(Modifier.fillMaxSize()) {
        items(
            items = uiState.basicGroups,
            key = { it.id },
            contentType = { "basic_group_item" },
        ) { basicGroup ->
            BasicGroupColumn(
                basicGroup = basicGroup,
                commands = uiState.commandsByGroupId[basicGroup.id] ?: persistentListOf(),
                isExpanded = !(uiState.collapsedMap[basicGroup.id] ?: true),
                onToggleCollapse = { viewModel.toggleCollapse(basicGroup.id) },
                onNavigate = onNavigate,
            )
        }
    }
}

@Composable
fun BasicGroupColumn(
    basicGroup: BasicGroup,
    commands: ImmutableList<BasicCommand> = persistentListOf(),
    searchText: String = "",
    isExpanded: Boolean,
    onToggleCollapse: () -> Unit,
    onNavigate: (String) -> Unit = {},
    matchingBasicCommandIds: ImmutableSet<Long> = persistentSetOf(),
) {
    val painter = rememberIconPainter(basicGroup.getIconId())

    ListItem(
        text = {
            HighlightedText(
                text = basicGroup.description,
                pattern = searchText,
                maxLines = 3,
            )
        },
        icon = {
            Icon(
                painter = painter,
                contentDescription = null,
                modifier = Modifier.size(40.dp),
            )
        },
        modifier = Modifier
            .pointerHoverIcon(PointerIcon.Hand)
            .clickable { onToggleCollapse() },
    )

    if (isExpanded) {
        ExpandedGroupContent(
            commands = commands,
            onNavigate = onNavigate,
            searchText = searchText,
            matchingBasicCommandIds = matchingBasicCommandIds,
        )
    }
}

@Composable
private fun ExpandedGroupContent(
    commands: ImmutableList<BasicCommand>,
    onNavigate: (String) -> Unit,
    searchText: String = "",
    matchingBasicCommandIds: ImmutableSet<Long> = persistentSetOf(),
) {
    commands.forEach { basicCommand ->
        val highlightText = if (basicCommand.id in matchingBasicCommandIds) searchText else ""
        val elements = remember(basicCommand.command, basicCommand.mans) {
            basicCommand.command.getCommandList(basicCommand.mans).toImmutableList()
        }
        CommandView(
            command = basicCommand.command,
            elements = elements,
            onNavigate = onNavigate,
            searchText = highlightText,
        )
    }
}
