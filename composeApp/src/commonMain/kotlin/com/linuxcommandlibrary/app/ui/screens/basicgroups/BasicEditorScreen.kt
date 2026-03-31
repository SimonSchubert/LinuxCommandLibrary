package com.linuxcommandlibrary.app.ui.screens.basicgroups

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.app.ui.composables.SectionTitle
import com.linuxcommandlibrary.app.ui.composables.TipSectionContent
import com.linuxcommandlibrary.app.ui.composables.WithScrollbar
import com.linuxcommandlibrary.shared.BasicGroup
import kotlinx.collections.immutable.ImmutableList

@Composable
fun BasicEditorScreen(
    viewModel: BasicEditorViewModel,
    onNavigate: (NavEvent) -> Unit,
) {
    val groups by viewModel.groups.collectAsState()
    val showTitles = viewModel.showTitles

    BasicEditorContent(
        groups = groups,
        showTitles = showTitles,
        onNavigate = onNavigate,
    )
}

@Composable
fun BasicEditorContent(
    groups: ImmutableList<BasicGroup>,
    showTitles: Boolean,
    onNavigate: (NavEvent) -> Unit,
) {
    val gridState = rememberLazyStaggeredGridState()
    SelectionContainer {
        WithScrollbar(
            state = gridState,
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
                .fillMaxSize(),
        ) {
            LazyVerticalStaggeredGrid(
                state = gridState,
                modifier = Modifier.fillMaxSize(),
                columns = StaggeredGridCells.Adaptive(minSize = 300.dp),
                contentPadding = PaddingValues(horizontal = 4.dp, vertical = 4.dp),
            ) {
                items(
                    items = groups,
                    key = { it.id },
                    contentType = { "editor_group_item" },
                ) { group ->
                    EditorGroupCard(group = group, onNavigate = onNavigate, showTitle = showTitles)
                }
            }
        }
    }
}

@Composable
private fun EditorGroupCard(
    group: BasicGroup,
    onNavigate: (NavEvent) -> Unit,
    showTitle: Boolean = true,
) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth(),
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            if (showTitle) {
                SectionTitle(title = group.description)
            }
            TipSectionContent(sections = group.sections, onNavigate = onNavigate, commandVerticalPadding = 4.dp)
        }
    }
}
