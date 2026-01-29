@file:OptIn(ExperimentalMaterialApi::class)

package com.linuxcommandlibrary.app.ui.screens.commandlist

import androidx.compose.foundation.clickable
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
import com.linuxcommandlibrary.app.data.CommandInfo
import com.linuxcommandlibrary.app.ui.composables.AppIcon
import com.linuxcommandlibrary.app.ui.composables.HighlightedText
import com.linuxcommandlibrary.app.ui.composables.rememberIconPainter

@Composable
fun CommandListScreen(
    viewModel: CommandListViewModel,
    onNavigate: (String) -> Unit,
) {
    val commands by viewModel.commands.collectAsState()

    LazyColumn {
        items(
            items = commands,
            key = { it.id },
            contentType = { "command_list_item" },
        ) { command ->
            CommandListItem(
                command = command,
                onNavigate = onNavigate,
                isBookmarked = viewModel.hasBookmark(command.name),
            )
        }
    }
}

@Composable
fun CommandListItem(
    command: CommandInfo,
    searchText: String = "",
    onNavigate: (String) -> Unit,
    isBookmarked: Boolean,
) {
    val bookmarkPainter = rememberIconPainter(AppIcon.BOOKMARK)

    ListItem(
        text = {
            HighlightedText(
                text = command.name,
                pattern = searchText,
            )
        },
        trailing = {
            if (isBookmarked) {
                Icon(
                    painter = bookmarkPainter,
                    contentDescription = "Bookmarked",
                )
            }
        },
        modifier = Modifier
            .pointerHoverIcon(PointerIcon.Hand)
            .clickable(
                onClick = remember(command.name, onNavigate) {
                    { onNavigate("command?commandName=${command.name}") }
                },
            ),
    )
}
