package com.linuxcommandlibrary.app.ui.screens.search

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.app.data.BasicGroup
import com.linuxcommandlibrary.app.data.BasicGroupMatch
import com.linuxcommandlibrary.app.resources.Res
import com.linuxcommandlibrary.app.resources.command_not_found
import com.linuxcommandlibrary.app.ui.composables.HighlightedText
import com.linuxcommandlibrary.app.ui.composables.WithScrollbar
import com.linuxcommandlibrary.app.ui.composables.debouncedClickable
import com.linuxcommandlibrary.app.ui.composables.getIconId
import com.linuxcommandlibrary.app.ui.composables.rememberIconPainter
import com.linuxcommandlibrary.app.ui.composables.selectableListItemColors
import com.linuxcommandlibrary.app.ui.screens.commandlist.CommandListItem
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun SearchScreen(
    searchText: String,
    viewModel: SearchViewModel,
    onNavigate: (NavEvent) -> Unit,
    selectedCommandName: String? = null,
    selectedBasicGroupId: Long? = null,
) {
    val uiState by viewModel.uiState.collectAsState()
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusManager = LocalFocusManager.current

    LaunchedEffect(searchText) {
        viewModel.search(searchText)
    }

    val dismissKeyboardAndNavigate: (NavEvent) -> Unit = { event ->
        keyboardController?.hide()
        focusManager.clearFocus()
        onNavigate(event)
    }

    SearchContent(
        uiState = uiState,
        searchText = searchText,
        onNavigate = dismissKeyboardAndNavigate,
        selectedCommandName = selectedCommandName,
        selectedBasicGroupId = selectedBasicGroupId,
    )
}

@Composable
fun SearchContent(
    uiState: SearchUiState,
    searchText: String,
    onNavigate: (NavEvent) -> Unit,
    selectedCommandName: String? = null,
    selectedBasicGroupId: Long? = null,
) {
    val lazyListState = rememberLazyListState()
    val showEmptyMessage = uiState.filteredCommands.isEmpty() && uiState.filteredBasicGroups.isEmpty()

    if (searchText.isNotEmpty() && showEmptyMessage) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clickable(enabled = false, onClick = {})
                .background(MaterialTheme.colorScheme.background),
        ) {
            Text(stringResource(Res.string.command_not_found), modifier = Modifier.align(Alignment.Center))
        }
    } else {
        WithScrollbar(
            state = lazyListState,
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                state = lazyListState,
            ) {
                if (uiState.filteredCommands.isNotEmpty()) {
                    item(key = "header_commands", contentType = "section_header") {
                        SectionHeader("Commands (${uiState.filteredCommands.size})")
                    }
                    items(
                        items = uiState.filteredCommands,
                        key = { "command_${it.id}" },
                        contentType = { "search_command_item" },
                    ) { command ->
                        CommandListItem(
                            command = command,
                            searchText = searchText,
                            onNavigate = onNavigate,
                            isBookmarked = false,
                            isSelected = command.name == selectedCommandName,
                        )
                    }
                }
                if (uiState.filteredBasicGroups.isNotEmpty()) {
                    item(key = "header_basics", contentType = "section_header") {
                        SectionHeader("Basics (${uiState.filteredBasicGroups.size})")
                    }
                    items(
                        items = uiState.filteredBasicGroups,
                        key = { "basic_${it.groupId}" },
                        contentType = { "search_basic_item" },
                    ) { match ->
                        BasicGroupSearchItem(
                            match = match,
                            searchText = searchText,
                            onNavigate = onNavigate,
                            isSelected = match.groupId == selectedBasicGroupId,
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun SectionHeader(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.labelLarge,
        color = MaterialTheme.colorScheme.onSurfaceVariant,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 8.dp),
    )
}

@Composable
private fun BasicGroupSearchItem(
    match: BasicGroupMatch,
    searchText: String,
    onNavigate: (NavEvent) -> Unit,
    isSelected: Boolean = false,
) {
    val iconPainter = rememberIconPainter(
        BasicGroup(id = match.groupId, description = match.description).getIconId(),
    )
    ListItem(
        headlineContent = {
            HighlightedText(
                text = match.description,
                pattern = searchText,
            )
        },
        supportingContent = {
            Text(
                text = match.categoryTitle,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        },
        leadingContent = {
            Icon(
                painter = iconPainter,
                contentDescription = null,
                modifier = Modifier.size(40.dp),
            )
        },
        colors = selectableListItemColors(isSelected),
        modifier = Modifier
            .pointerHoverIcon(PointerIcon.Hand)
            .debouncedClickable {
                onNavigate(
                    NavEvent.ToBasicGroups(
                        categoryId = match.categoryId,
                        expandGroupId = match.groupId,
                    ),
                )
            },
    )
}
