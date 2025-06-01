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
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.HighlightedText
import com.inspiredandroid.linuxcommandbibliotheca.ui.theme.LinuxTheme
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
            contentType = { "command_list_item" },
        ) { command ->
            CommandListItem(
                command = command,
                onNavigate = onNavigate,
                isBookmarked = viewModel.hasBookmark(command.id),
            )
        }
    }
}

@Composable
fun CommandListItem(
    command: Command,
    searchText: String = "",
    onNavigate: (String) -> Unit,
    isBookmarked: Boolean,
) {
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
                    painterResource(R.drawable.ic_bookmark_black_24dp),
                    contentDescription = stringResource(R.string.remove_bookmark),
                )
            }
        },
        secondaryText = {
            HighlightedText(
                text = command.description,
                pattern = searchText,
            )
        },
        modifier = Modifier.clickable(
            onClick = remember(command.id, command.name, onNavigate) {
                { onNavigate("command?commandId=${command.id}&commandName=${command.name}") }
            },
        ),
    )
}

@Preview
@Composable
fun CommandListItemPreview() {
    val command = Command(0L, 0L, "cowsay", "A talking cow says moo.")
    LinuxTheme {
        CommandListItem(
            command = command,
            searchText = "cow",
            onNavigate = { },
            isBookmarked = true,
        )
    }
}

@Preview
@Composable
fun CommandListScreenPreview() {
    // This preview is more complex due to the ViewModel dependency.
    // For a proper preview, you'd typically use a fake ViewModel implementation
    // or mock data source. For now, this will just show an empty screen
    // or potentially crash if the ViewModel koinViewModel() can't be resolved in preview.
    // To make it useful, one might need to adjust Koin setup for previews or pass
    // a fake ViewModel.
    // LinuxTheme {
    //    CommandListScreen(onNavigate = {})
    // }
}
