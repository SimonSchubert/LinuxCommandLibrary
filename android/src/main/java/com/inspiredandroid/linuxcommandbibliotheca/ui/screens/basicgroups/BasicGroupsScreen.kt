@file:OptIn(ExperimentalMaterialApi::class)

package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.basicgroups

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.unit.dp
import com.inspiredandroid.linuxcommandbibliotheca.getIconResource
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.CommandView
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.HighlightedText
import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.getCommandList
import databases.BasicGroup
import kotlinx.collections.immutable.ImmutableSet
import kotlinx.collections.immutable.persistentSetOf
import kotlinx.collections.immutable.toImmutableList
import org.koin.androidx.compose.koinViewModel
import org.koin.core.parameter.parametersOf

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
fun BasicGroupsScreen(
    categoryId: Long,
    viewModel: BasicGroupsViewModel = koinViewModel<BasicGroupsViewModel>(
        parameters = { parametersOf(categoryId) },
    ),
    onNavigate: (String) -> Unit = {},
) {
    val uiState by viewModel.uiState.collectAsState()

    LazyColumn(Modifier.fillMaxSize()) {
        items(
            items = uiState.basicGroups,
            key = { it.id },
            contentType = { "basic_group_item" },
        ) { basicGroup ->
            BasicGroupColumn(
                basicGroup = basicGroup,
                isExpanded = !uiState.collapsedMap.getOrDefault(basicGroup.id, true),
                onToggleCollapse = { viewModel.toggleCollapse(basicGroup.id) },
                onNavigate = onNavigate,
            )
        }
    }
}

@Composable
fun BasicGroupColumn(
    basicGroup: BasicGroup,
    searchText: String = "",
    isExpanded: Boolean,
    onToggleCollapse: () -> Unit,
    onNavigate: (String) -> Unit = {},
    matchingBasicCommandIds: ImmutableSet<Long> = persistentSetOf(),
) {
    ListItem(
        text = {
            HighlightedText(
                text = basicGroup.description,
                pattern = searchText,
                maxLines = 3,
            )
        },
        icon = {
            Icon(
                painterResource(basicGroup.getIconResource()),
                contentDescription = null,
                modifier = Modifier.size(40.dp),
            )
        },
        modifier = Modifier.clickable { onToggleCollapse() },
    )

    if (isExpanded) {
        ExpandedGroupContent(
            basicGroup = basicGroup,
            onNavigate = onNavigate,
            searchText = searchText,
            matchingBasicCommandIds = matchingBasicCommandIds,
        )
    }
}

@Composable
private fun ExpandedGroupContent(
    basicGroup: BasicGroup,
    onNavigate: (String) -> Unit,
    searchText: String = "",
    matchingBasicCommandIds: ImmutableSet<Long> = persistentSetOf(),
) {
    val commands = remember(basicGroup.id) {
        databaseHelper.getBasicCommands(basicGroup.id).toImmutableList()
    }
    commands.forEach { basicCommand ->
        // Only highlight search text if this command matched the search
        val highlightText = if (basicCommand.id in matchingBasicCommandIds) searchText else ""
        CommandView(
            command = basicCommand.command,
            elements = basicCommand.command.getCommandList(basicCommand.mans).toImmutableList(),
            onNavigate = onNavigate,
            searchText = highlightText,
        )
    }
}
