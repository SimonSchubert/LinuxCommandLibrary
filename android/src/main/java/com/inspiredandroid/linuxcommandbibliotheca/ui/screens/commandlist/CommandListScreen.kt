@file:OptIn(
    ExperimentalMaterialApi::class,
    ExperimentalMaterialApi::class,
    ExperimentalMaterialApi::class,
)

package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commandlist

import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.ListItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.HighlightedText
import databases.Command
import org.koin.androidx.compose.koinViewModel

/* Copyright 2022 Simon Schubert
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

@Composable
fun CommandListScreen(
    viewModel: CommandListViewModel = koinViewModel(),
    onNavigate: (String) -> Unit,
) {
    val commands by viewModel.commands.collectAsState()

    LazyColumn {
        items(
            items = commands,
            key = { it.id },
        ) { command ->
            CommandListItem(
                command = command,
                onNavigate = onNavigate,
                isBookmarked = { id -> viewModel.hasBookmark(id) },
            )
        }
    }
}

@Composable
fun CommandListItem(
    command: Command,
    searchText: String = "",
    onNavigate: (String) -> Unit,
    isBookmarked: (Long) -> Boolean,
) {
    ListItem(
        text = {
            HighlightedText(
                text = command.name,
                pattern = searchText,
            )
        },
        trailing = {
            if (isBookmarked(command.id)) {
                Icon(
                    painterResource(R.drawable.ic_bookmark_black_24dp),
                    contentDescription = stringResource(R.string.bookmarked),
                )
            }
        },
        secondaryText = {
            HighlightedText(
                text = command.description,
                pattern = searchText,
            )
        },
        modifier = Modifier.clickable {
            onNavigate("command?commandId=${command.id}&commandName=${command.name}")
        },
    )
}

@Preview
@Composable
fun CommandListScreenPreview() {
//    val commands = listOf(
//        Command(0L, 0L, "cowsay", "speaking cow"),
//        Command(1L, 0L, "cowthink", "thinking cow")
//    )
//    LinuxTheme {
//        CommandListScreen(commands, "cow", listOf(0L)) {}
//    }
}
