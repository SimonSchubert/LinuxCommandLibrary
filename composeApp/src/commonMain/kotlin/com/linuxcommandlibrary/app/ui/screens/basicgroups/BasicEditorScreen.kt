package com.linuxcommandlibrary.app.ui.screens.basicgroups

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.ui.composables.SectionTitle
import com.linuxcommandlibrary.app.ui.composables.TipSectionContent
import com.linuxcommandlibrary.shared.BasicGroup

@Composable
fun BasicEditorScreen(
    viewModel: BasicEditorViewModel,
    onNavigate: (String) -> Unit = {},
) {
    val groups by viewModel.groups.collectAsState()

    LazyVerticalStaggeredGrid(
        modifier = Modifier
            .background(MaterialTheme.colors.background)
            .fillMaxSize(),
        columns = StaggeredGridCells.Adaptive(minSize = 300.dp),
    ) {
        items(
            items = groups,
            key = { it.id },
            contentType = { "editor_group_item" },
        ) { group ->
            EditorGroupCard(group = group, onNavigate = onNavigate)
        }
    }
}

@Composable
private fun EditorGroupCard(group: BasicGroup, onNavigate: (String) -> Unit) {
    Card(
        elevation = 4.dp,
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth(),
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            SectionTitle(title = group.description)
            TipSectionContent(sections = group.sections, onNavigate = onNavigate)
        }
    }
}
