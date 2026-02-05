package com.linuxcommandlibrary.app.ui.screens.search

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
import com.linuxcommandlibrary.app.ui.screens.commandlist.CommandListItem
import com.linuxcommandlibrary.app.ui.theme.LocalCustomColors

@Composable
fun SearchScreen(
    searchText: String,
    viewModel: SearchViewModel,
    onNavigate: (String) -> Unit,
) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(searchText) {
        viewModel.search(searchText)
    }

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
