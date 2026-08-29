package com.linuxcommandlibrary.app.ui.screens.commandlist

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.app.data.CommandInfo
import com.linuxcommandlibrary.app.platform.showFastScrollBar
import com.linuxcommandlibrary.app.ui.composables.AppIcon
import com.linuxcommandlibrary.app.ui.composables.FastScrollBar
import com.linuxcommandlibrary.app.ui.composables.HighlightedText
import com.linuxcommandlibrary.app.ui.composables.WithScrollbar
import com.linuxcommandlibrary.app.ui.composables.debouncedClickable
import com.linuxcommandlibrary.app.ui.composables.rememberIconPainter
import com.linuxcommandlibrary.app.ui.composables.selectableListItemColors
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableSet

@Composable
fun CommandListScreen(
    commands: ImmutableList<CommandInfo>,
    bookmarkedNames: ImmutableSet<String>,
    listState: LazyListState,
    onNavigate: (NavEvent) -> Unit,
    modifier: Modifier = Modifier,
    selectedName: String? = null,
) {
    WithScrollbar(
        state = listState,
        modifier = modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxSize(),
    ) {
        LazyColumn(
            state = listState,
            modifier = Modifier.fillMaxSize(),
        ) {
            items(
                items = commands,
                key = { it.id },
                contentType = { "command_list_item" },
            ) { command ->
                CommandListItem(
                    command = command,
                    onNavigate = onNavigate,
                    isBookmarked = command.name in bookmarkedNames,
                    isSelected = command.name == selectedName,
                )
            }
        }

        if (showFastScrollBar) {
            FastScrollBar(
                listState = listState,
                itemCount = commands.size,
                modifier = Modifier.align(Alignment.CenterEnd),
            )
        }
    }
}

@Composable
fun CommandListItem(
    command: CommandInfo,
    onNavigate: (NavEvent) -> Unit,
    isBookmarked: Boolean,
    modifier: Modifier = Modifier,
    searchText: String = "",
    isSelected: Boolean = false,
) {
    ListItem(
        headlineContent = {
            HighlightedText(
                text = command.name,
                pattern = searchText,
            )
        },
        colors = selectableListItemColors(isSelected),
        // Resolved inside the slot rather than up here: hoisting it made every visible row load
        // the drawable, when only bookmarked rows ever draw it.
        trailingContent = if (isBookmarked) {
            {
                Icon(
                    painter = rememberIconPainter(AppIcon.BOOKMARK),
                    contentDescription = "Bookmarked",
                )
            }
        } else {
            null
        },
        modifier = modifier
            .pointerHoverIcon(PointerIcon.Hand)
            .debouncedClickable {
                onNavigate(NavEvent.ToCommand(command.name))
            },
    )
}
