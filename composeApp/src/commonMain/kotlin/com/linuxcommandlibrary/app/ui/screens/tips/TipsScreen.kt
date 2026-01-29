package com.linuxcommandlibrary.app.ui.screens.tips

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.data.TipInfo
import com.linuxcommandlibrary.app.ui.composables.SectionTitle
import com.linuxcommandlibrary.app.ui.composables.TipSectionContent

@Composable
fun TipsScreen(
    viewModel: TipsViewModel,
    onNavigate: (String) -> Unit = {},
) {
    val tips by viewModel.tips.collectAsState()

    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Adaptive(minSize = 300.dp),
    ) {
        items(
            items = tips,
            key = { it.id },
            contentType = { "tip_item" },
        ) { tip ->
            TipItemCard(tip = tip, onNavigate = onNavigate)
        }
    }
}

@Composable
private fun TipItemCard(tip: TipInfo, onNavigate: (String) -> Unit) {
    Card(
        elevation = 4.dp,
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth(),
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            SectionTitle(title = tip.title)
            TipSectionContent(sections = tip.sections, onNavigate = onNavigate)
        }
    }
}
