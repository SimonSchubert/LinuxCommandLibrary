package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.TimeMark
import kotlin.time.TimeSource

@Composable
fun rememberDebouncedClick(
    debounceTime: Duration = 300.milliseconds,
    onClick: () -> Unit,
): () -> Unit {
    var lastClickMark by remember { mutableStateOf<TimeMark?>(null) }
    return {
        val last = lastClickMark
        if (last == null || last.elapsedNow() >= debounceTime) {
            lastClickMark = TimeSource.Monotonic.markNow()
            onClick()
        }
    }
}

fun Modifier.debouncedClickable(
    debounceTime: Duration = 300.milliseconds,
    onClick: () -> Unit,
): Modifier = composed {
    clickable(onClick = rememberDebouncedClick(debounceTime, onClick))
}
