package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle

@Composable
fun HighlightedText(
    text: String,
    pattern: String,
    maxLines: Int = 1,
) {
    val bodyLarge = MaterialTheme.typography.bodyLarge
    val ltrStyle = remember(bodyLarge) { bodyLarge.copy(textDirection = TextDirection.Ltr) }
    if (pattern.isEmpty()) {
        Text(
            text = text,
            maxLines = maxLines,
            overflow = TextOverflow.Ellipsis,
            style = ltrStyle,
        )
    } else if (text.equals(pattern, ignoreCase = true)) {
        Text(
            text = text,
            maxLines = maxLines,
            overflow = TextOverflow.Ellipsis,
            color = MaterialTheme.colorScheme.primary,
            style = ltrStyle,
        )
    } else {
        val highlightColor = MaterialTheme.colorScheme.primary
        val annotatedString = remember(text, pattern, highlightColor) {
            buildAnnotatedString {
                val splitText = text.split(pattern, ignoreCase = true)
                splitText.forEachIndexed { index, s ->
                    append(s)
                    if (index != splitText.size - 1) {
                        withStyle(style = SpanStyle(color = highlightColor)) {
                            append(pattern)
                        }
                    }
                }
            }
        }
        Text(
            text = annotatedString,
            maxLines = maxLines,
            overflow = TextOverflow.Ellipsis,
            style = ltrStyle,
        )
    }
}
