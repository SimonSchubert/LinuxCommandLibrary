package com.inspiredandroid.linuxcommandbibliotheca.ui.composables

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
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
fun HighlightedText(
    text: String,
    pattern: String,
    maxLines: Int = 1,
) {
    if (pattern.isEmpty()) {
        Text(
            text,
            maxLines = maxLines,
            overflow = TextOverflow.Ellipsis,
        )
    } else {
        val highlightColor = MaterialTheme.colors.primary
        val annotatedString = remember(pattern) {
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
        )
    }
}

@Composable
@Preview
fun HighlightedTextPreview() {
    LinuxTheme {
        HighlightedText(
            text = "pacman",
            pattern = "cm",
        )
    }
}
