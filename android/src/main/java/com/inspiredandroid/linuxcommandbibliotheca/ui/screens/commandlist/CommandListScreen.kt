@file:OptIn(ExperimentalMaterialApi::class, ExperimentalMaterialApi::class)

package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commandlist

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.ListItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.ui.theme.LinuxTheme
import com.linuxcommandlibrary.shared.search
import databases.Command

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
    commands: List<Command>,
    searchText: String,
    bookmarkedIds: List<Long>,
    onNavigate: (String) -> Unit = {}
) {
    // TODO: Implement viewmodel

    val filteredCommands = remember(commands, searchText, bookmarkedIds) {
        if (searchText.isEmpty()) {
            if (bookmarkedIds.isNotEmpty()) {
                commands.sortedBy { !bookmarkedIds.contains(it.id) }
            } else {
                commands
            }
        } else {
            commands.search(searchText)
        }
    }

    if (filteredCommands.isEmpty()) {
        Box(modifier = Modifier.fillMaxSize()) {
            Text("404 command not found", modifier = Modifier.align(Alignment.Center))
        }
    } else {
        LazyColumn {
            items(
                items = filteredCommands,
                key = { it.id }) { command ->
                ListItem(
                    text = {
                        if (searchText.isEmpty()) {
                            Text(
                                command.name,
                                maxLines = 1,
                                softWrap = false,
                                overflow = TextOverflow.Ellipsis
                            )
                        } else {
                            HighlightedText(command.name, searchText)
                        }
                    },
                    trailing = {
                        if (bookmarkedIds.contains(command.id)) {
                            Icon(
                                painterResource(R.drawable.ic_bookmark_black_24dp),
                                contentDescription = stringResource(R.string.bookmarked)
                            )
                        }
                    },
                    secondaryText = {
                        if (searchText.isEmpty()) {
                            Text(
                                command.description,
                                maxLines = 1,
                                softWrap = false,
                                overflow = TextOverflow.Ellipsis
                            )
                        } else {
                            HighlightedText(command.description, searchText)
                        }
                    },
                    modifier = Modifier.clickable {
                        onNavigate("command?commandId=${command.id}&commandName=${command.name}")
                    })
            }
        }
    }
}


@Composable
fun HighlightedText(text: String, pattern: String) {
    Text(
        buildAnnotatedString {
            val splitText = text.split(pattern)
            splitText.forEachIndexed { index, s ->
                append(s)
                if (index != splitText.size - 1) {
                    withStyle(style = SpanStyle(color = MaterialTheme.colors.primary)) {
                        append(pattern)
                    }
                }
            }
        },
        maxLines = 1,
        softWrap = false,
        overflow = TextOverflow.Ellipsis
    )
}

@Preview
@Composable
fun CommandListScreenPreview() {
    val commands = listOf(
        Command(0L, 0L, "cowsay", "speaking cow"),
        Command(1L, 0L, "cowthink", "thinking cow")
    )
    LinuxTheme {
        CommandListScreen(commands, "cow", listOf(0L)) {}
    }
}