package com.inspiredandroid.linuxcommandbibliotheca.ui.composables

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.inspiredandroid.linuxcommandbibliotheca.data.TextElement
import com.inspiredandroid.linuxcommandbibliotheca.ui.theme.LinuxTheme

/* Copyright 2022 Simon Schubert
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

@Composable
fun TableView(
    headers: List<List<TextElement>>,
    rows: List<List<List<TextElement>>>,
    onNavigate: (String) -> Unit = {},
    modifier: Modifier = Modifier
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
        // Header row (only show if headers have content)
        if (hasHeaders) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min)
            ) {
                headers.forEachIndexed { index, headerElements ->
                    val cellModifier = if (index == 0) Modifier.width(firstColumnWidth) else Modifier.weight(1f)
                    Text(
                        text = headerElements.toPlainText(),
                        fontWeight = FontWeight.Bold,
                        modifier = cellModifier
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }
        }

        // Data rows
        rows.forEach { row ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min)
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
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }
        }
    }
}

private fun List<TextElement>.toPlainText(): String {
    return this.joinToString("") { element ->
        when (element) {
            is TextElement.Plain -> element.text
            is TextElement.Bold -> element.text
            is TextElement.Man -> element.man
        }
    }
}

@Composable
@Preview(showBackground = true)
fun TableViewPreview() {
    LinuxTheme {
        TableView(
            headers = listOf(
                listOf(TextElement.Plain("Shortcut")),
                listOf(TextElement.Plain("Action"))
            ),
            rows = listOf(
                listOf(
                    listOf(TextElement.Bold("ctrl + u")),
                    listOf(TextElement.Plain("Clear everything before cursor"))
                ),
                listOf(
                    listOf(TextElement.Bold("ctrl + a")),
                    listOf(TextElement.Plain("Jump to beginning of line"))
                ),
                listOf(
                    listOf(TextElement.Man("find"), TextElement.Plain(" ex*.txt")),
                    listOf(TextElement.Plain("Find files matching pattern"))
                )
            )
        )
    }
}
