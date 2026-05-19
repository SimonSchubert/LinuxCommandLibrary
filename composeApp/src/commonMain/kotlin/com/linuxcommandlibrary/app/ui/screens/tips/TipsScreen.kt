package com.linuxcommandlibrary.app.ui.screens.tips

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
import com.linuxcommandlibrary.shared.TipInfo
import kotlinx.collections.immutable.ImmutableList

@Composable
fun TipsScreen(
    viewModel: TipsViewModel,
    onNavigate: (NavEvent) -> Unit,
) {
    val tips by viewModel.tips.collectAsState()

    TipsContent(
        tips = tips,
        onNavigate = onNavigate,
    )
}

@Composable
fun TipsContent(
    tips: ImmutableList<TipInfo>,
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
                    items = tips,
                    key = { it.id },
                    contentType = { "tip_item" },
                ) { tip ->
                    TipItemCard(tip = tip, onNavigate = onNavigate)
                }
            }
        }
    }
}

@Composable
private fun TipItemCard(
    tip: TipInfo,
    onNavigate: (NavEvent) -> Unit,
) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
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
