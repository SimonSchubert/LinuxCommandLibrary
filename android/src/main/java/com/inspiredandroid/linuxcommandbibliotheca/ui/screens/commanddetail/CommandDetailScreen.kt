@file:OptIn(ExperimentalMaterialApi::class, ExperimentalLayoutApi::class)

package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commanddetail

import androidx.activity.compose.LocalActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Chip
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.inspiredandroid.linuxcommandbibliotheca.data.CommandSectionInfo
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.TipSectionContent
import com.linuxcommandlibrary.shared.MarkdownParser
import kotlinx.collections.immutable.ImmutableList
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
fun CommandDetailScreen(
    commandName: String,
    viewModel: CommandDetailViewModel = koinViewModel(
        key = commandName,
        viewModelStoreOwner = LocalActivity.current as ViewModelStoreOwner,
        parameters = { parametersOf(commandName) },
    ),
    onNavigate: (String) -> Unit,
) {
    val uiState by viewModel.state.collectAsStateWithLifecycle()

    LazyColumn(Modifier.fillMaxSize()) {
        itemsIndexed(
            items = uiState.sections,
            key = { index, _ -> index },
            contentType = { _, _ -> "command_section_item" },
        ) { _, section ->
            CommandSectionColumn(
                section = section,
                isExpanded = uiState.expandedSectionsMap.getOrDefault(section.id, false),
                seeAlsoCommands = uiState.seeAlsoCommands,
                onToggleExpanded = { id -> viewModel.onToggleExpanded(id) },
                onNavigate = onNavigate,
            )
        }
    }
}

@Composable
private fun CommandSectionColumn(
    section: CommandSectionInfo,
    isExpanded: Boolean,
    seeAlsoCommands: ImmutableList<String>,
    onToggleExpanded: (Long) -> Unit,
    onNavigate: (String) -> Unit,
) {
    ListItem(
        text = {
            Text(
                section.title.uppercase(),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
            )
        },
        modifier = Modifier.clickable {
            onToggleExpanded(section.id)
        },
    )

    if (isExpanded) {
        when (section.title) {
            "SEE ALSO" -> SeeAlsoSectionContent(
                content = section.content,
                seeAlsoCommands = seeAlsoCommands,
                onNavigate = onNavigate,
            )

            else -> DefaultSectionContent(content = section.content, onNavigate = onNavigate)
        }
    }
}

@Composable
private fun SeeAlsoSectionContent(
    content: String,
    seeAlsoCommands: ImmutableList<String>,
    onNavigate: (String) -> Unit,
) {
    if (seeAlsoCommands.isNotEmpty()) {
        FlowRow(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            seeAlsoCommands.forEach { name ->
                Chip(onClick = {
                    onNavigate("command?commandName=$name")
                }) {
                    Text(
                        text = name,
                        color = MaterialTheme.colors.onSurface,
                    )
                }
            }
        }
    } else {
        // fallback to default rendering if no commands were parsed (e.g. plain text)
        DefaultSectionContent(content = content, onNavigate = onNavigate)
    }
}

@Composable
private fun DefaultSectionContent(content: String, onNavigate: (String) -> Unit = {}) {
    val parsedSections = remember(content) {
        MarkdownParser.parseMarkdownContent(content)
    }

    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 8.dp),
    ) {
        TipSectionContent(
            sections = parsedSections,
            onNavigate = onNavigate,
            textColor = MaterialTheme.colors.onSurface.copy(alpha = 0.7f),
            commandVerticalPadding = 4.dp,
        )
    }
}
