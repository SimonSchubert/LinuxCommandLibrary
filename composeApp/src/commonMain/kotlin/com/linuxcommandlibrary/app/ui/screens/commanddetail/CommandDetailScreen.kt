@file:OptIn(ExperimentalLayoutApi::class)

package com.linuxcommandlibrary.app.ui.screens.commanddetail

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.app.data.CommandSectionInfo
import com.linuxcommandlibrary.app.ui.AppIcons
import com.linuxcommandlibrary.app.ui.composables.TipSectionContent
import com.linuxcommandlibrary.app.ui.composables.WithScrollbar
import com.linuxcommandlibrary.app.ui.composables.rememberDebouncedClick
import com.linuxcommandlibrary.shared.TipSectionElement
import kotlinx.collections.immutable.ImmutableList

@Composable
fun CommandDetailScreen(
    viewModel: CommandDetailViewModel,
    onNavigate: (NavEvent) -> Unit,
) {
    val uiState by viewModel.state.collectAsState()
    val onToggleExpanded = remember(viewModel) { viewModel::onToggleExpanded }

    CommandDetailContent(
        uiState = uiState,
        onNavigate = onNavigate,
        onToggleExpanded = onToggleExpanded,
    )
}

@Composable
fun CommandDetailContent(
    uiState: CommandDetailUiState,
    onNavigate: (NavEvent) -> Unit,
    onToggleExpanded: (Long) -> Unit,
) {
    val listState = rememberLazyListState()
    SelectionContainer {
        WithScrollbar(
            state = listState,
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
                .fillMaxSize(),
        ) {
            LazyColumn(
                state = listState,
                modifier = Modifier.fillMaxSize(),
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
                        onToggleExpanded = onToggleExpanded,
                        onNavigate = onNavigate,
                    )
                }
            }
        }
    }
}

@Composable
private fun CommandSectionColumn(
    section: CommandSectionInfo,
    isExpanded: Boolean,
    seeAlsoCommands: ImmutableList<String>,
    onToggleExpanded: (Long) -> Unit,
    onNavigate: (NavEvent) -> Unit,
) {
    val chevronRotation by animateFloatAsState(targetValue = if (isExpanded) 180f else 0f)

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .pointerHoverIcon(PointerIcon.Hand, overrideDescendants = true)
            .clickable { onToggleExpanded(section.id) }
            .padding(start = 24.dp, end = 16.dp, top = 12.dp, bottom = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = section.title.uppercase(),
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.weight(1f),
        )
        Icon(
            imageVector = AppIcons.ExpandMore,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.primary,
            modifier = Modifier.graphicsLayer { rotationZ = chevronRotation },
        )
    }

    if (isExpanded) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceContainer,
            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
        ) {
            when (section.title) {
                "SEE ALSO" -> SeeAlsoSectionContent(
                    parsedContent = section.parsedContent,
                    seeAlsoCommands = seeAlsoCommands,
                    onNavigate = onNavigate,
                )

                else -> DefaultSectionContent(parsedContent = section.parsedContent, onNavigate = onNavigate)
            }
        }
    }
}

@Composable
private fun SeeAlsoSectionContent(
    parsedContent: ImmutableList<TipSectionElement>,
    seeAlsoCommands: ImmutableList<String>,
    onNavigate: (NavEvent) -> Unit,
) {
    if (seeAlsoCommands.isNotEmpty()) {
        FlowRow(
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            seeAlsoCommands.forEach { name ->
                SuggestionChip(
                    modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                    onClick = rememberDebouncedClick {
                        onNavigate(NavEvent.ToCommand(name))
                    },
                    label = {
                        Text(
                            text = name,
                            color = MaterialTheme.colorScheme.onSurface,
                        )
                    },
                )
            }
        }
    } else {
        DefaultSectionContent(parsedContent = parsedContent, onNavigate = onNavigate)
    }
}

@Composable
private fun DefaultSectionContent(
    parsedContent: ImmutableList<TipSectionElement>,
    onNavigate: (NavEvent) -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
    ) {
        TipSectionContent(
            sections = parsedContent,
            onNavigate = onNavigate,
            textColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
            commandVerticalPadding = 4.dp,
        )
    }
}
