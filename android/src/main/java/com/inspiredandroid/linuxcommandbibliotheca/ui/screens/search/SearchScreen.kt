package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.search

import androidx.compose.foundation.background
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
import androidx.compose.runtime.getValue
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
    if (searchText.isEmpty()) {
        return
    }
    val commands by viewModel.filteredCommands.collectAsState()
    val basicGroups by viewModel.filteredBasicGroups.collectAsState()

    LaunchedEffect(searchText) {
        viewModel.search(searchText)
    }

    val keyboardController = LocalSoftwareKeyboardController.current
    val lazyListState = rememberLazyListState()

    if (commands.isEmpty() && basicGroups.isEmpty()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
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
                items = basicGroups,
                key = { "basicGroup_${it.id}" },
            ) { basicGroup ->
                BasicGroupColumn(
                    basicGroup = basicGroup,
                    searchText = searchText,
                    onNavigate = onNavigate,
                    // Assuming isGroupCollapsed(id) == true means content is hidden
                    isExpanded = !viewModel.isGroupCollapsed(basicGroup.id),
                    onToggleCollapse = { viewModel.toggleCollapse(basicGroup.id) },
                )
            }
            items(
                items = commands,
                key = { "command_${it.id}" },
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
