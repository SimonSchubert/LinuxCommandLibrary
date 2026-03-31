package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.foundation.ScrollbarStyle
import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.v2.ScrollbarAdapter
import androidx.compose.foundation.v2.maxScrollOffset
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlin.math.abs

@Composable
private fun scrollbarStyle(): ScrollbarStyle {
    val color = MaterialTheme.colorScheme.onSurface
    return ScrollbarStyle(
        minimalHeight = 48.dp,
        thickness = 8.dp,
        shape = RoundedCornerShape(4.dp),
        hoverDurationMillis = 300,
        unhoverColor = color.copy(alpha = 0.30f),
        hoverColor = color.copy(alpha = 0.55f),
    )
}

@Composable
actual fun WithScrollbar(
    state: LazyListState,
    modifier: Modifier,
    content: @Composable BoxScope.() -> Unit,
) {
    Box(modifier) {
        content()
        VerticalScrollbar(
            adapter = rememberScrollbarAdapter(state),
            modifier = Modifier.align(Alignment.CenterEnd).fillMaxHeight(),
            style = scrollbarStyle(),
        )
    }
}

@Composable
actual fun WithScrollbar(
    state: LazyGridState,
    modifier: Modifier,
    content: @Composable BoxScope.() -> Unit,
) {
    Box(modifier) {
        content()
        VerticalScrollbar(
            adapter = rememberScrollbarAdapter(state),
            modifier = Modifier.align(Alignment.CenterEnd).fillMaxHeight(),
            style = scrollbarStyle(),
        )
    }
}

@Composable
actual fun WithScrollbar(
    state: LazyStaggeredGridState,
    modifier: Modifier,
    content: @Composable BoxScope.() -> Unit,
) {
    Box(modifier) {
        content()
        VerticalScrollbar(
            adapter = remember(state) { LazyStaggeredGridScrollbarAdapter(state) },
            modifier = Modifier.align(Alignment.CenterEnd).fillMaxHeight(),
            style = scrollbarStyle(),
        )
    }
}

private class LazyStaggeredGridScrollbarAdapter(
    private val scrollState: LazyStaggeredGridState,
) : ScrollbarAdapter {

    private val isVertical: Boolean
        get() = scrollState.layoutInfo.orientation == Orientation.Vertical

    private val numLanes: Int
        get() = scrollState.layoutInfo.visibleItemsInfo
            .maxOfOrNull { it.lane + 1 } ?: 1

    private fun averageVisibleItemMainAxisSize(): Double {
        val items = scrollState.layoutInfo.visibleItemsInfo
        if (items.isEmpty()) return 0.0
        return items.map {
            if (isVertical) it.size.height else it.size.width
        }.average()
    }

    override val viewportSize: Double
        get() = with(scrollState.layoutInfo) {
            if (orientation == Orientation.Vertical) viewportSize.height else viewportSize.width
        }.toDouble()

    override val contentSize: Double
        get() {
            val totalItems = scrollState.layoutInfo.totalItemsCount
            if (totalItems == 0) return 0.0
            val lanes = numLanes
            val avgSize = averageVisibleItemMainAxisSize()
            val totalRows = (totalItems + lanes - 1) / lanes
            val spacing = scrollState.layoutInfo.mainAxisItemSpacing
            val padding = with(scrollState.layoutInfo) { beforeContentPadding + afterContentPadding }
            return avgSize * totalRows + spacing * (totalRows - 1).coerceAtLeast(0) + padding
        }

    override val scrollOffset: Double
        get() {
            val items = scrollState.layoutInfo.visibleItemsInfo
            if (items.isEmpty()) return 0.0
            val firstItem = items.minByOrNull {
                if (isVertical) it.offset.y else it.offset.x
            } ?: return 0.0
            val mainAxisOffset = if (isVertical) firstItem.offset.y else firstItem.offset.x
            val lanes = numLanes
            val avgSize = averageVisibleItemMainAxisSize()
            val spacing = scrollState.layoutInfo.mainAxisItemSpacing
            val estimatedRow = firstItem.index / lanes
            return estimatedRow * (avgSize + spacing) - mainAxisOffset
        }

    override suspend fun scrollTo(scrollOffset: Double) {
        val distance = scrollOffset - this.scrollOffset
        if (abs(distance) <= viewportSize) {
            scrollState.scrollBy(distance.toFloat())
        } else {
            val scrollOffsetCoerced = scrollOffset.coerceIn(0.0, maxScrollOffset)
            val lanes = numLanes
            val avgSize = averageVisibleItemMainAxisSize()
            val spacing = scrollState.layoutInfo.mainAxisItemSpacing
            val avgSizeWithSpacing = avgSize + spacing
            if (avgSizeWithSpacing <= 0) return
            val row = (scrollOffsetCoerced / avgSizeWithSpacing).toInt().coerceAtLeast(0)
            val index = (row * lanes).coerceAtMost(
                (scrollState.layoutInfo.totalItemsCount - 1).coerceAtLeast(0),
            )
            val offset = (scrollOffsetCoerced - row * avgSizeWithSpacing).toInt().coerceAtLeast(0)
            scrollState.scrollToItem(index, offset)
        }
    }
}
