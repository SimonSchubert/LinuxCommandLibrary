package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.shared.TextElement

@Composable
fun TableView(
    headers: List<List<TextElement>>,
    rows: List<List<List<TextElement>>>,
    onNavigate: (String) -> Unit = {},
    modifier: Modifier = Modifier,
) {
    val textMeasurer = rememberTextMeasurer()
    val density = LocalDensity.current
    val textStyle = MaterialTheme.typography.body1.copy(fontWeight = FontWeight.Bold)
    val firstColumnWidth = remember(headers, rows, textStyle) {
        val allFirstCells = listOf(headers.firstOrNull()?.toPlainText() ?: "") +
            rows.map { it.firstOrNull()?.toPlainText() ?: "" }
        val maxWidthPx = allFirstCells.maxOfOrNull { textMeasurer.measure(it, style = textStyle).size.width } ?: 0
        with(density) { maxWidthPx.toDp() + 16.dp }
    }
    val codeColor = MaterialTheme.colors.primary

    val hasHeaders = headers.any { it.toPlainText().isNotBlank() }

    Column(modifier = modifier.fillMaxWidth()) {
        if (hasHeaders) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min),
            ) {
                headers.forEachIndexed { index, headerElements ->
                    val cellModifier = if (index == 0) Modifier.width(firstColumnWidth) else Modifier.weight(1f)
                    Text(
                        text = headerElements.toPlainText(),
                        fontWeight = FontWeight.Bold,
                        modifier = cellModifier
                            .padding(horizontal = 8.dp, vertical = 4.dp),
                    )
                }
            }
        }

        rows.forEach { row ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min),
            ) {
                row.forEachIndexed { index, cellElements ->
                    val cellModifier = if (index == 0) Modifier.width(firstColumnWidth) else Modifier.weight(1f)
                    val annotatedString = remember(cellElements, codeColor) {
                        buildAnnotatedString {
                            cellElements.forEach { element ->
                                when (element) {
                                    is TextElement.Plain -> append(element.text)

                                    is TextElement.Bold -> {
                                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                                            append(element.text)
                                        }
                                    }

                                    is TextElement.Italic -> {
                                        withStyle(style = SpanStyle(fontStyle = FontStyle.Italic)) {
                                            append(element.text)
                                        }
                                    }

                                    is TextElement.Man -> {
                                        val start = this.length
                                        withStyle(style = SpanStyle(color = codeColor)) {
                                            append(element.man)
                                        }
                                        val end = this.length
                                        addLink(
                                            LinkAnnotation.Clickable(
                                                tag = "man:${element.man}",
                                                linkInteractionListener = {
                                                    onNavigate("command?commandName=${element.man}")
                                                },
                                            ),
                                            start,
                                            end,
                                        )
                                    }
                                }
                            }
                        }
                    }
                    Text(
                        text = annotatedString,
                        modifier = cellModifier
                            .padding(horizontal = 8.dp, vertical = 4.dp),
                    )
                }
            }
        }
    }
}

private fun List<TextElement>.toPlainText(): String = this.joinToString("") { element ->
    when (element) {
        is TextElement.Plain -> element.text
        is TextElement.Bold -> element.text
        is TextElement.Italic -> element.text
        is TextElement.Man -> element.man
    }
}
