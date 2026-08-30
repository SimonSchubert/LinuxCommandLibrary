package com.linuxcommandlibrary.app.ui.screens.basicgroups

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.app.data.BasicGroup
import com.linuxcommandlibrary.app.ui.AppIcons
import com.linuxcommandlibrary.app.ui.composables.TipSectionContent
import com.linuxcommandlibrary.app.ui.composables.WithScrollbar
import com.linuxcommandlibrary.app.ui.composables.getIconId
import com.linuxcommandlibrary.app.ui.composables.rememberIconPainter
import com.linuxcommandlibrary.app.ui.theme.mutedBodyText
import com.linuxcommandlibrary.shared.TipSectionElement
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

@Composable
fun BasicGroupsScreen(
    viewModel: BasicGroupsViewModel,
    onNavigate: (NavEvent) -> Unit = {},
    focusGroupId: Long? = null,
    onFocusConsumed: () -> Unit = {},
) {
    val uiState by viewModel.uiState.collectAsState()
    val listState = rememberLazyListState()

    LaunchedEffect(uiState.basicGroups, focusGroupId) {
        val gid = focusGroupId ?: return@LaunchedEffect
        if (uiState.basicGroups.isEmpty()) return@LaunchedEffect
        val index = uiState.basicGroups.indexOfFirst { it.id == gid }
        if (index >= 0) {
            viewModel.expand(gid)
            listState.animateScrollToItem(index)
            onFocusConsumed()
        }
    }

    BasicGroupsContent(
        uiState = uiState,
        listState = listState,
        toggleCollapse = viewModel::toggleCollapse,
        onNavigate = onNavigate,
    )
}

@Composable
fun BasicGroupsContent(
    uiState: BasicGroupsUiState,
    listState: LazyListState,
    toggleCollapse: (Long) -> Unit,
    onNavigate: (NavEvent) -> Unit,
) {
    SelectionContainer {
        WithScrollbar(
            state = listState,
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
        ) {
            LazyColumn(
                state = listState,
                modifier = Modifier.fillMaxSize(),
            ) {
                items(
                    items = uiState.basicGroups,
                    key = { it.id },
                    contentType = { "basic_group_item" },
                ) { basicGroup ->
                    BasicGroupColumn(
                        basicGroup = basicGroup,
                        categoryTitle = uiState.categoryTitle,
                        sections = uiState.sectionsByGroupId[basicGroup.id] ?: persistentListOf(),
                        isExpanded = !(uiState.collapsedMap[basicGroup.id] ?: true),
                        onToggleCollapse = { toggleCollapse(basicGroup.id) },
                        onNavigate = onNavigate,
                    )
                }
            }
        }
    }
}

@Composable
fun BasicGroupColumn(
    basicGroup: BasicGroup,
    categoryTitle: String,
    isExpanded: Boolean,
    onToggleCollapse: () -> Unit,
    modifier: Modifier = Modifier,
    sections: ImmutableList<TipSectionElement> = persistentListOf(),
    onNavigate: (NavEvent) -> Unit = {},
) {
    val painter = rememberIconPainter(basicGroup.getIconId(categoryTitle))
    val chevronRotation by animateFloatAsState(targetValue = if (isExpanded) 180f else 0f)

    Column(modifier = modifier) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .pointerHoverIcon(PointerIcon.Hand, overrideDescendants = true)
                .clickable { onToggleCollapse() }
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                painter = painter,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.size(40.dp),
            )
            Text(
                // Deliberately unbounded: a fixed maxLines silently clipped the longer titles at
                // large font scales, where the text column is only ~146dp wide. Letting the row
                // grow keeps the whole title readable.
                text = basicGroup.description,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 16.dp),
            )
            Icon(
                imageVector = AppIcons.ExpandMore,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
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
                ExpandedGroupContent(
                    sections = sections,
                    onNavigate = onNavigate,
                )
            }
        }
    }
}

@Composable
private fun ExpandedGroupContent(
    sections: ImmutableList<TipSectionElement>,
    onNavigate: (NavEvent) -> Unit,
) {
    Column(modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp)) {
        TipSectionContent(
            sections = sections,
            onNavigate = onNavigate,
            textColor = MaterialTheme.colorScheme.mutedBodyText,
            commandVerticalPadding = 4.dp,
        )
    }
}
