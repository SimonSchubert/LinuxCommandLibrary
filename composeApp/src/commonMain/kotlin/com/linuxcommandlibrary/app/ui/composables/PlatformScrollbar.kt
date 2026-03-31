package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
expect fun WithScrollbar(
    state: LazyListState,
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit,
)

@Composable
expect fun WithScrollbar(
    state: LazyGridState,
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit,
)

@Composable
expect fun WithScrollbar(
    state: LazyStaggeredGridState,
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit,
)
