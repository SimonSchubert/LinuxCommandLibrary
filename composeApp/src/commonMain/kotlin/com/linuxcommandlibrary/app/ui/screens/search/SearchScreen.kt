package com.linuxcommandlibrary.app.ui.screens.search

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.app.ui.screens.commandlist.CommandListItem

@Composable
fun SearchScreen(
    searchText: String,
    viewModel: SearchViewModel,
    onNavigate: (NavEvent) -> Unit,
) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(searchText) {
        viewModel.search(searchText)
    }

    SearchContent(
        uiState = uiState,
        searchText = searchText,
        onNavigate = onNavigate,
    )
}

@Composable
fun SearchContent(
    uiState: SearchUiState,
    searchText: String,
    onNavigate: (NavEvent) -> Unit,
) {
    val lazyListState = rememberLazyListState()

    val showEmptyMessage by remember(uiState.filteredCommands) {
        derivedStateOf {
            uiState.filteredCommands.isEmpty()
        }
    }

    if (searchText.isNotEmpty() && showEmptyMessage) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clickable(enabled = false, onClick = {})
                .background(MaterialTheme.colorScheme.background),
        ) {
            Text("404 command not found", modifier = Modifier.align(Alignment.Center))
        }
    } else {
        LazyColumn(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
            state = lazyListState,
        ) {
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
                )
            }
        }
    }
}
