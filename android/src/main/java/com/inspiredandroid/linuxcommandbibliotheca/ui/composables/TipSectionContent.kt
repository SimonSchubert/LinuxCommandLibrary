package com.inspiredandroid.linuxcommandbibliotheca.ui.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.shared.TextElement
import com.linuxcommandlibrary.shared.TipSectionElement
import kotlinx.collections.immutable.toImmutableList

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

fun buildTextElementString(elements: List<TextElement>): AnnotatedString = buildAnnotatedString {
    elements.forEach { textElement ->
        when (textElement) {
            is TextElement.Plain -> append(textElement.text)

            is TextElement.Bold -> {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append(textElement.text)
                }
            }

            is TextElement.Italic -> {
                withStyle(style = SpanStyle(fontStyle = FontStyle.Italic)) {
                    append(textElement.text)
                }
            }

            is TextElement.Man -> append(textElement.man)
        }
    }
}

@Composable
fun TipSectionContent(
    sections: List<TipSectionElement>,
    onNavigate: (String) -> Unit,
    textColor: Color = Color.Unspecified,
    commandVerticalPadding: Dp = 0.dp,
) {
    sections.forEach { section ->
        when (section) {
            is TipSectionElement.Text -> {
                Text(
                    text = buildTextElementString(section.elements),
                    color = textColor,
                )
            }

            is TipSectionElement.Blockquote -> {
                Text(
                    text = buildTextElementString(section.elements),
                    color = textColor,
                    modifier = Modifier.padding(start = 8.dp, bottom = 8.dp),
                )
            }

            is TipSectionElement.Code -> {
                CommandView(
                    command = section.command,
                    elements = section.elements.toImmutableList(),
                    onNavigate = onNavigate,
                    verticalPadding = commandVerticalPadding,
                )
            }

            is TipSectionElement.Table -> {
                TableView(
                    headers = section.headers,
                    rows = section.rows,
                    onNavigate = onNavigate,
                )
            }
        }
    }
}
