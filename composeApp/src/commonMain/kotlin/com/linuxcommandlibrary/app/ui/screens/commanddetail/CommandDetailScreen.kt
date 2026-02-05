@file:OptIn(ExperimentalMaterialApi::class, ExperimentalLayoutApi::class)

package com.linuxcommandlibrary.app.ui.screens.commanddetail

import androidx.compose.foundation.background
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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.linuxcommandlibrary.app.data.CommandSectionInfo
import com.linuxcommandlibrary.app.ui.composables.TipSectionContent
import com.linuxcommandlibrary.app.ui.theme.LocalCustomColors
import com.linuxcommandlibrary.shared.MarkdownParser
import kotlinx.collections.immutable.ImmutableList

@Composable
fun CommandDetailScreen(
    viewModel: CommandDetailViewModel,
    onNavigate: (String) -> Unit,
) {
    val uiState by viewModel.state.collectAsState()

    LazyColumn(
        Modifier
            .background(MaterialTheme.colors.background)
            .fillMaxSize(),
    ) {
        itemsIndexed(
            items = uiState.sections,
            key = { index, _ -> index },
            contentType = { _, _ -> "command_section_item" },
        ) { _, section ->
            CommandSectionColumn(
                section = section,
                isExpanded = uiState.expandedSectionsMap[section.id] ?: false,
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
        modifier = Modifier
            .pointerHoverIcon(PointerIcon.Hand)
            .clickable {
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
                Chip(
                    modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                    onClick = {
                        onNavigate("command?commandName=$name")
                    },
                ) {
                    Text(
                        text = name,
                        color = MaterialTheme.colors.onSurface,
                    )
                }
            }
        }
    } else {
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
