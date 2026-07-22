@file:OptIn(ExperimentalLayoutApi::class)

package com.linuxcommandlibrary.app.ui.screens.commanddetail

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollBy
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
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.withFrameNanos
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.app.data.CommandSectionInfo
import com.linuxcommandlibrary.app.platform.shareButtonDescription
import com.linuxcommandlibrary.app.platform.shareButtonIcon
import com.linuxcommandlibrary.app.ui.AppIcons
import com.linuxcommandlibrary.app.ui.composables.ElementHighlight
import com.linuxcommandlibrary.app.ui.composables.MatchIndex
import com.linuxcommandlibrary.app.ui.composables.TipSectionContent
import com.linuxcommandlibrary.app.ui.composables.WithScrollbar
import com.linuxcommandlibrary.app.ui.composables.rememberDebouncedClick
import com.linuxcommandlibrary.shared.InstallEntry
import com.linuxcommandlibrary.shared.TipSectionElement
import com.linuxcommandlibrary.shared.platform.ShareHandler
import kotlinx.collections.immutable.ImmutableList
import org.koin.compose.koinInject

/** Leaves the jumped-to match a little below the top edge instead of flush against it. */
private val MATCH_SCROLL_MARGIN = 48.dp

private data class ElementPosKey(val sectionIndex: Int, val elementIndex: Int)

@Composable
fun CommandDetailScreen(
    viewModel: CommandDetailViewModel,
    onNavigate: (NavEvent) -> Unit,
    searchQuery: String = "",
    activeMatchIndex: Int = 0,
    onMatchIndexChange: (MatchIndex) -> Unit = {},
) {
    val uiState by viewModel.state.collectAsState()
    val onToggleExpanded = remember(viewModel) { viewModel::onToggleExpanded }

    CommandDetailContent(
        uiState = uiState,
        onNavigate = onNavigate,
        onToggleExpanded = onToggleExpanded,
        searchQuery = searchQuery,
        activeMatchIndex = activeMatchIndex,
        onMatchIndexChange = onMatchIndexChange,
    )
}

@Composable
fun CommandDetailContent(
    uiState: CommandDetailUiState,
    onNavigate: (NavEvent) -> Unit,
    onToggleExpanded: (Long) -> Unit,
    searchQuery: String = "",
    activeMatchIndex: Int = 0,
    onMatchIndexChange: (MatchIndex) -> Unit = {},
) {
    val listState = rememberLazyListState()
    val isSearching = searchQuery.isNotEmpty()

    val matchIndex = remember(
        uiState.sections,
        uiState.seeAlsoCommands,
        uiState.resources,
        uiState.installEntries,
        searchQuery,
    ) {
        MatchIndex(
            findManPageMatches(
                sections = uiState.sections,
                seeAlsoCommands = uiState.seeAlsoCommands,
                resources = uiState.resources,
                query = searchQuery,
                installEntries = uiState.installEntries,
            ),
        )
    }
    LaunchedEffect(matchIndex) {
        onMatchIndexChange(matchIndex)
    }

    val highlightColor = MaterialTheme.colorScheme.secondaryContainer
    val activeHighlightColor = MaterialTheme.colorScheme.primary
    val onActiveHighlightColor = MaterialTheme.colorScheme.onPrimary
    val activeMatch = matchIndex.matches.getOrNull(activeMatchIndex)

    // Plain (non-snapshot) map on purpose: onGloballyPositioned fires every frame while scrolling,
    // and a snapshot map would turn that into a recomposition storm. Only the scroll effect reads
    // it, never composition.
    val elementCoords = remember { mutableMapOf<ElementPosKey, LayoutCoordinates>() }
    var rootCoords by remember { mutableStateOf<LayoutCoordinates?>(null) }
    val scrollMarginPx = with(LocalDensity.current) { MATCH_SCROLL_MARGIN.toPx() }

    // Two hops, because an off-screen section isn't composed and so has no coordinates yet:
    // scroll the section into view first, then refine to the matching element once it has laid
    // out. Both hops are non-animated so it reads as a single crisp jump, like a browser's find.
    LaunchedEffect(activeMatch, matchIndex) {
        val match = activeMatch ?: return@LaunchedEffect
        listState.scrollToItem(match.sectionIndex)
        val key = ElementPosKey(match.sectionIndex, match.elementIndex)
        repeat(3) {
            withFrameNanos { }
            val root = rootCoords
            val coords = elementCoords[key]
            if (root != null && coords != null && coords.isAttached) {
                val y = root.localPositionOf(coords, Offset.Zero).y
                listState.scrollBy(y - scrollMarginPx)
                return@LaunchedEffect
            }
        }
    }

    SelectionContainer {
        WithScrollbar(
            state = listState,
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
                .fillMaxSize(),
        ) {
            LazyColumn(
                state = listState,
                modifier = Modifier
                    .fillMaxSize()
                    .onGloballyPositioned { rootCoords = it },
            ) {
                itemsIndexed(
                    items = uiState.sections,
                    key = { index, _ -> index },
                    contentType = { _, _ -> "command_section_item" },
                ) { sectionIndex, section ->
                    val highlights = remember(matchIndex, sectionIndex, activeMatch) {
                        matchIndex.elementHighlightsFor(
                            sectionIndex = sectionIndex,
                            activeMatch = activeMatch,
                            color = highlightColor,
                            activeColor = activeHighlightColor,
                            onActiveColor = onActiveHighlightColor,
                        )
                    }
                    CommandSectionColumn(
                        section = section,
                        // While searching everything is forced open so no hit can hide inside a
                        // collapsed section. The user's own expand state is left untouched
                        // underneath and comes back when the query is cleared.
                        isExpanded = isSearching || (uiState.expandedSectionsMap[section.id] ?: false),
                        seeAlsoCommands = uiState.seeAlsoCommands,
                        resources = uiState.resources,
                        installEntries = uiState.installEntries,
                        onToggleExpanded = onToggleExpanded,
                        onNavigate = onNavigate,
                        highlights = highlights,
                        onElementPositioned = { elementIndex, coords ->
                            elementCoords[ElementPosKey(sectionIndex, elementIndex)] = coords
                        },
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
    resources: ImmutableList<ResourceLink>,
    installEntries: ImmutableList<InstallEntry>,
    onToggleExpanded: (Long) -> Unit,
    onNavigate: (NavEvent) -> Unit,
    highlights: Map<Int, ElementHighlight>? = null,
    onElementPositioned: ((Int, LayoutCoordinates) -> Unit)? = null,
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
            when {
                section.title == "SEE ALSO" -> SeeAlsoSectionContent(
                    parsedContent = section.parsedContent,
                    seeAlsoCommands = seeAlsoCommands,
                    onNavigate = onNavigate,
                    highlights = highlights,
                    onElementPositioned = onElementPositioned,
                )

                section.title == "RESOURCES" -> ResourcesSectionContent(
                    parsedContent = section.parsedContent,
                    resources = resources,
                    onNavigate = onNavigate,
                    highlights = highlights,
                    onElementPositioned = onElementPositioned,
                )

                section.title.equals("INSTALL", ignoreCase = true) -> InstallSectionContent(
                    parsedContent = section.parsedContent,
                    installEntries = installEntries,
                    onNavigate = onNavigate,
                    highlights = highlights,
                    onElementPositioned = onElementPositioned,
                )

                else -> DefaultSectionContent(
                    parsedContent = section.parsedContent,
                    onNavigate = onNavigate,
                    highlights = highlights,
                    onElementPositioned = onElementPositioned,
                )
            }
        }
    }
}

@Composable
private fun SeeAlsoSectionContent(
    parsedContent: ImmutableList<TipSectionElement>,
    seeAlsoCommands: ImmutableList<String>,
    onNavigate: (NavEvent) -> Unit,
    highlights: Map<Int, ElementHighlight>? = null,
    onElementPositioned: ((Int, LayoutCoordinates) -> Unit)? = null,
) {
    if (seeAlsoCommands.isNotEmpty()) {
        FlowRow(
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            seeAlsoCommands.forEach { name ->
                SuggestionChip(
                    modifier = Modifier.pointerHoverIcon(PointerIcon.Hand, overrideDescendants = true),
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
        DefaultSectionContent(
            parsedContent = parsedContent,
            onNavigate = onNavigate,
            highlights = highlights,
            onElementPositioned = onElementPositioned,
        )
    }
}

@Composable
private fun ResourcesSectionContent(
    parsedContent: ImmutableList<TipSectionElement>,
    resources: ImmutableList<ResourceLink>,
    onNavigate: (NavEvent) -> Unit,
    highlights: Map<Int, ElementHighlight>? = null,
    onElementPositioned: ((Int, LayoutCoordinates) -> Unit)? = null,
) {
    if (resources.isNotEmpty()) {
        val uriHandler = LocalUriHandler.current
        FlowRow(
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            resources.forEach { resource ->
                SuggestionChip(
                    modifier = Modifier.pointerHoverIcon(PointerIcon.Hand, overrideDescendants = true),
                    onClick = rememberDebouncedClick {
                        uriHandler.openUri(resource.url)
                    },
                    label = {
                        Text(
                            text = resource.label,
                            color = MaterialTheme.colorScheme.onSurface,
                        )
                    },
                )
            }
        }
    } else {
        DefaultSectionContent(
            parsedContent = parsedContent,
            onNavigate = onNavigate,
            highlights = highlights,
            onElementPositioned = onElementPositioned,
        )
    }
}

@Composable
private fun InstallSectionContent(
    parsedContent: ImmutableList<TipSectionElement>,
    installEntries: ImmutableList<InstallEntry>,
    onNavigate: (NavEvent) -> Unit,
    highlights: Map<Int, ElementHighlight>? = null,
    onElementPositioned: ((Int, LayoutCoordinates) -> Unit)? = null,
) {
    if (installEntries.isEmpty()) {
        DefaultSectionContent(
            parsedContent = parsedContent,
            onNavigate = onNavigate,
            highlights = highlights,
            onElementPositioned = onElementPositioned,
        )
        return
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        installEntries.forEach { entry ->
            InstallEntryRow(entry = entry)
        }
    }
}

@Composable
private fun InstallEntryRow(entry: InstallEntry) {
    val shareHandler: ShareHandler = koinInject()
    val onCopy = rememberDebouncedClick {
        shareHandler.shareText(entry.command)
    }

    // Same shape as CommandView: command + copy only.
    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        color = MaterialTheme.colorScheme.surfaceContainerHigh,
    ) {
        Row(
            modifier = Modifier.padding(start = 12.dp, end = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = entry.command,
                style = MaterialTheme.typography.titleSmall.copy(fontFamily = FontFamily.Monospace),
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier
                    .weight(1f)
                    .padding(vertical = 8.dp),
            )
            IconButton(
                modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                onClick = onCopy,
            ) {
                Icon(
                    imageVector = shareButtonIcon,
                    contentDescription = shareButtonDescription,
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
        }
    }
}

@Composable
private fun DefaultSectionContent(
    parsedContent: ImmutableList<TipSectionElement>,
    onNavigate: (NavEvent) -> Unit,
    highlights: Map<Int, ElementHighlight>? = null,
    onElementPositioned: ((Int, LayoutCoordinates) -> Unit)? = null,
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
            highlights = highlights,
            onElementPositioned = onElementPositioned,
        )
    }
}
