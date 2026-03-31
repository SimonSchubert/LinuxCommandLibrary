package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
actual fun WithScrollbar(
    state: LazyListState,
    modifier: Modifier,
    content: @Composable BoxScope.() -> Unit,
) {
    Box(modifier, content = content)
}

@Composable
actual fun WithScrollbar(
    state: LazyGridState,
    modifier: Modifier,
    content: @Composable BoxScope.() -> Unit,
) {
    Box(modifier, content = content)
}

@Composable
actual fun WithScrollbar(
    state: LazyStaggeredGridState,
    modifier: Modifier,
    content: @Composable BoxScope.() -> Unit,
) {
    Box(modifier, content = content)
}
