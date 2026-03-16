package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

private val BUBBLE_HEIGHT_DP = 56.dp
private val BUBBLE_WIDTH_DP = 24.dp
private val TOUCH_TARGET_WIDTH_DP = 48.dp

private val BubbleShape = object : Shape {
    override fun createOutline(size: Size, layoutDirection: LayoutDirection, density: Density): Outline {
        val w = size.width
        val h = size.height

        val path = Path().apply {
            // Top point (right side)
            moveTo(w, 0f)
            // Left bulge curve from top to bottom
            cubicTo(w, h * 0.15f, 0f, h * 0.2f, 0f, h * 0.5f)
            cubicTo(0f, h * 0.8f, w, h * 0.85f, w, h)
            // Right edge (straight line back to top)
            close()
        }
        return Outline.Generic(path)
    }
}

@Composable
fun FastScrollBar(
    listState: LazyListState,
    itemCount: Int,
    modifier: Modifier = Modifier,
) {
    if (itemCount == 0) return

    val coroutineScope = rememberCoroutineScope()
    var trackHeightPx by remember { mutableStateOf(0f) }
    var thumbHeightPx by remember { mutableStateOf(0f) }
    var isDragging by remember { mutableStateOf(false) }

    val scrollableRange by remember {
        derivedStateOf { (trackHeightPx - thumbHeightPx).coerceAtLeast(1f) }
    }

    val thumbOffsetY by remember {
        derivedStateOf {
            if (itemCount <= 0) return@derivedStateOf 0f
            val firstVisible = listState.firstVisibleItemIndex
            val fraction = firstVisible.toFloat() / itemCount
            fraction * scrollableRange
        }
    }

    fun scrollToFraction(y: Float) {
        val fraction = ((y - thumbHeightPx / 2f) / scrollableRange).coerceIn(0f, 1f)
        val targetIndex = (fraction * itemCount).toInt().coerceIn(0, (itemCount - 1).coerceAtLeast(0))
        coroutineScope.launch {
            listState.scrollToItem(targetIndex)
        }
    }

    Box(
        modifier = modifier
            .fillMaxHeight()
            .width(TOUCH_TARGET_WIDTH_DP)
            .pointerHoverIcon(PointerIcon.Hand)
            .onSizeChanged { trackHeightPx = it.height.toFloat() }
            .pointerInput(itemCount) {
                detectTapGestures { offset ->
                    scrollToFraction(offset.y)
                }
            }
            .pointerInput(itemCount) {
                detectDragGestures(
                    onDragStart = { offset ->
                        isDragging = true
                        scrollToFraction(offset.y)
                    },
                    onDragEnd = { isDragging = false },
                    onDragCancel = { isDragging = false },
                    onDrag = { change, _ ->
                        change.consume()
                        scrollToFraction(change.position.y)
                    },
                )
            },
        contentAlignment = Alignment.TopEnd,
    ) {
        // Bubble thumb
        Box(
            modifier = Modifier
                .offset { IntOffset(0, thumbOffsetY.toInt()) }
                .width(BUBBLE_WIDTH_DP)
                .height(BUBBLE_HEIGHT_DP)
                .onSizeChanged { thumbHeightPx = it.height.toFloat() }
                .background(
                    color = MaterialTheme.colorScheme.onSurface.copy(
                        alpha = if (isDragging) 0.4f else 0.15f,
                    ),
                    shape = BubbleShape,
                ),
            contentAlignment = Alignment.CenterEnd,
        ) {
            // Circle handle
            Box(
                modifier = Modifier
                    .padding(end = 2.dp)
                    .size(16.dp)
                    .background(
                        color = MaterialTheme.colorScheme.onSurface.copy(
                            alpha = if (isDragging) 0.6f else 0.3f,
                        ),
                        shape = CircleShape,
                    ),
            )
        }
    }
}
