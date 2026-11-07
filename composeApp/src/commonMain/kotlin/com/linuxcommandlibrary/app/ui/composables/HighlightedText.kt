package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle

@Composable
fun HighlightedText(
    text: String,
    pattern: String,
    modifier: Modifier = Modifier,
    maxLines: Int = 1,
) {
    val bodyLarge = MaterialTheme.typography.bodyLarge
    val ltrStyle = remember(bodyLarge) { bodyLarge.copy(textDirection = TextDirection.Ltr) }
    val highlightColor = MaterialTheme.colorScheme.primary
    val annotatedString = remember(text, pattern, highlightColor) {
        buildAnnotatedString {
            // Style the original substring, not the pattern, so the text keeps its own casing.
            var from = 0
            while (pattern.isNotEmpty()) {
                val start = text.indexOf(pattern, from, ignoreCase = true)
                if (start < 0) break
                append(text.substring(from, start))
                withStyle(SpanStyle(color = highlightColor)) {
                    append(text.substring(start, start + pattern.length))
                }
                from = start + pattern.length
            }
            append(text.substring(from))
        }
    }
    Text(
        text = annotatedString,
        modifier = modifier,
        maxLines = maxLines,
        overflow = TextOverflow.Ellipsis,
        style = ltrStyle,
    )
}
