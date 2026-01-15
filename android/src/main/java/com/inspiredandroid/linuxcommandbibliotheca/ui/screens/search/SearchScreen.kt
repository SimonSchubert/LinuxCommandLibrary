package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.search

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.basicgroups.BasicGroupColumn
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commandlist.CommandListItem
import org.koin.androidx.compose.koinViewModel

@Composable
fun SearchScreen(
    searchText: String,
    viewModel: SearchViewModel = koinViewModel(),
    onNavigate: (String) -> Unit,
) {
    // Removed the early return for searchText.isEmpty() as ViewModel now handles it by emitting an empty state.
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(searchText) {
        viewModel.search(searchText)
    }

    val keyboardController = LocalSoftwareKeyboardController.current
    val lazyListState = rememberLazyListState()

    val showEmptyMessage by remember(uiState.filteredCommands, uiState.filteredBasicGroups, uiState.matchingBasicCommandIds) {
        derivedStateOf {
            uiState.filteredCommands.isEmpty() && uiState.filteredBasicGroups.isEmpty()
        }
    }

    // Only show "404" if search text is not empty and results are empty
    if (searchText.isNotEmpty() && showEmptyMessage) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clickable(enabled = false, onClick = {})
                .background(MaterialTheme.colors.background),
        ) {
            Text("404 command not found", modifier = Modifier.align(Alignment.Center))
        }
    } else {
        LazyColumn(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background),
            state = lazyListState,
        ) {
            items(
                items = uiState.filteredBasicGroups,
                key = { "basicGroup_${it.id}" },
                contentType = { "search_basic_group_item" },
            ) { basicGroup ->
                // All search results are expanded by default to show matching content
                BasicGroupColumn(
                    basicGroup = basicGroup,
                    searchText = searchText,
                    onNavigate = onNavigate,
                    isExpanded = !uiState.collapsedMap.getOrDefault(basicGroup.id, false),
                    onToggleCollapse = { viewModel.toggleCollapse(basicGroup.id) },
                    matchingBasicCommandIds = uiState.matchingBasicCommandIds,
                )
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
                    isBookmarked = false, // Or fetch actual bookmark status if relevant
                )
            }
        }
    }

    LaunchedEffect(lazyListState.isScrollInProgress) {
        if (lazyListState.isScrollInProgress) {
            keyboardController?.hide()
        }
    }
}
