package com.linuxcommandlibrary.app.ui.screens.basicgroups

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.app.data.BasicCommand
import com.linuxcommandlibrary.app.data.BasicGroup
import com.linuxcommandlibrary.app.ui.composables.CommandView
import com.linuxcommandlibrary.app.ui.composables.HighlightedText
import com.linuxcommandlibrary.app.ui.composables.WithScrollbar
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
    onNavigate: (NavEvent) -> Unit = {},
) {
    val uiState by viewModel.uiState.collectAsState()

    BasicGroupsContent(
        uiState = uiState,
        toggleCollapse = { viewModel.toggleCollapse(it) },
        onNavigate = onNavigate,
    )
}

@Composable
fun BasicGroupsContent(
    uiState: BasicGroupsUiState,
    toggleCollapse: (Long) -> Unit,
    onNavigate: (NavEvent) -> Unit,
) {
    val listState = rememberLazyListState()
    SelectionContainer {
        WithScrollbar(
            state = listState,
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
        ) {
            LazyColumn(
                state = listState,
                modifier = Modifier.fillMaxSize(),
            ) {
                items(
                    items = uiState.basicGroups,
                    key = { it.id },
                    contentType = { "basic_group_item" },
                ) { basicGroup ->
                    BasicGroupColumn(
                        basicGroup = basicGroup,
                        commands = uiState.commandsByGroupId[basicGroup.id] ?: persistentListOf(),
                        isExpanded = !(uiState.collapsedMap[basicGroup.id] ?: true),
                        onToggleCollapse = { toggleCollapse(basicGroup.id) },
                        onNavigate = onNavigate,
                    )
                }
            }
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
    onNavigate: (NavEvent) -> Unit = {},
    matchingBasicCommandIds: ImmutableSet<Long> = persistentSetOf(),
) {
    val painter = rememberIconPainter(basicGroup.getIconId())

    ListItem(
        headlineContent = {
            HighlightedText(
                text = basicGroup.description,
                pattern = searchText,
                maxLines = 3,
            )
        },
        leadingContent = {
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
    onNavigate: (NavEvent) -> Unit,
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
