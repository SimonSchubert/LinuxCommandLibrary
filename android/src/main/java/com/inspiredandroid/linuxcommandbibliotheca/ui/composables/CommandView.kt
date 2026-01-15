package com.inspiredandroid.linuxcommandbibliotheca.ui.composables

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.ui.theme.LinuxTheme
import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.databaseHelper
import kotlinx.collections.immutable.ImmutableList
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

@Composable
fun CommandView(
    command: String,
    elements: ImmutableList<CommandElement>,
    onNavigate: (String) -> Unit = {},
    verticalPadding: Dp = 6.dp,
    searchText: String = "",
) {
    val codeColor = MaterialTheme.colors.primary
    val highlightColor = MaterialTheme.colors.secondary
    val baseAnnotatedString = remember(elements, codeColor, searchText, highlightColor) {
        buildAnnotatedString {
            elements.forEach { element ->
                when (element) {
                    is CommandElement.Text -> {
                        appendWithHighlight(element.text, searchText, highlightColor)
                    }
                    is CommandElement.Man -> {
                        val start = this.length
                        withStyle(style = SpanStyle(color = codeColor)) {
                            appendWithHighlight(element.man, searchText, highlightColor)
                        }
                        val end = this.length
                        addLink(
                            LinkAnnotation.Clickable(
                                tag = "man:${element.man}",
                                linkInteractionListener = {
                                    val manCommand = databaseHelper.getCommand(element.man)
                                    if (manCommand != null) {
                                        onNavigate("command?commandId=${manCommand.id}&commandName=${manCommand.name}")
                                    }
                                },
                            ),
                            start,
                            end,
                        )
                    }
                    is CommandElement.Url -> {
                        val start = this.length
                        withStyle(style = SpanStyle(color = codeColor)) {
                            appendWithHighlight(element.command, searchText, highlightColor)
                        }
                        val end = this.length
                        addLink(
                            LinkAnnotation.Url(element.url),
                            start,
                            end,
                        )
                    }
                }
            }
        }
    }

    val finalAnnotatedString = remember(baseAnnotatedString) {
        if (baseAnnotatedString.text.isEmpty()) {
            baseAnnotatedString
        } else {
            buildAnnotatedString {
                append(baseAnnotatedString)
                addStyle(
                    style = ParagraphStyle(), // Default ParagraphStyle
                    start = 0,
                    end = baseAnnotatedString.text.length,
                )
            }
        }
    }

    Row(modifier = Modifier.padding(start = 12.dp, end = 4.dp).padding(vertical = verticalPadding)) {
        Text(
            text = finalAnnotatedString,
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically),
            style = MaterialTheme.typography.subtitle2,
        )

        val context = LocalContext.current
        val shareAction = remember(context, command) { { shareCommand(context, command) } }
        IconButton(
            modifier = Modifier.align(Alignment.CenterVertically),
            onClick = shareAction,
        ) {
            Icon(
                imageVector = Icons.Filled.Share,
                contentDescription = stringResource(R.string.share),
            )
        }
    }
}

fun shareCommand(context: Context, command: String) {
    val intent = Intent(Intent.ACTION_SEND)
    intent.type = "text/plain"
    intent.putExtra(
        Intent.EXTRA_TEXT,
        command.dropWhile { it == '$' || it.isWhitespace() }.replace("\\n", ""),
    )
    try {
        context.startActivity(Intent.createChooser(intent, "Share command"))
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

private fun AnnotatedString.Builder.appendWithHighlight(
    text: String,
    searchText: String,
    highlightColor: Color,
) {
    if (searchText.isEmpty()) {
        append(text)
        return
    }

    val lowercaseText = text.lowercase()
    val lowercaseSearch = searchText.lowercase()
    var currentIndex = 0

    while (currentIndex < text.length) {
        val matchIndex = lowercaseText.indexOf(lowercaseSearch, currentIndex)
        if (matchIndex == -1) {
            append(text.substring(currentIndex))
            break
        }
        // Append text before match
        if (matchIndex > currentIndex) {
            append(text.substring(currentIndex, matchIndex))
        }
        // Append highlighted match
        withStyle(style = SpanStyle(background = highlightColor.copy(alpha = 0.3f))) {
            append(text.substring(matchIndex, matchIndex + searchText.length))
        }
        currentIndex = matchIndex + searchText.length
    }
}

@Composable
@Preview
fun CommandViewPreview() {
    LinuxTheme {
        CommandView(
            command = "$ find ex?mple.txt",
            elements = listOf(
                CommandElement.Text("$ "),
                CommandElement.Man("find"),
                CommandElement.Text(" ex?mple.txt"),
            ).toImmutableList(),
        )
    }
}
