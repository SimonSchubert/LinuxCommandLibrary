@file:OptIn(ExperimentalMaterialApi::class, ExperimentalLayoutApi::class)

package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commanddetail

import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Chip
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.text.HtmlCompat
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.CommandView
import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.databaseHelper
import databases.CommandSection
import org.koin.androidx.compose.koinViewModel
import org.koin.core.parameter.parametersOf

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
fun CommandDetailScreen(
    commandId: Long,
    viewModel: CommandDetailViewModel = koinViewModel<CommandDetailViewModel>(
        parameters = { parametersOf(commandId) },
    ),
    onNavigate: (String) -> Unit,
) {
    LazyColumn(Modifier.fillMaxSize()) {
        items(
            items = viewModel.sections,
            key = { it.id },
        ) { section ->
            CommandSectionColumn(
                section = section,
                isCollapsed = viewModel.isGroupCollapsed(section.id),
                onToggleCollapse = { id -> viewModel.toggleCollapse(id) },
                onNavigate = onNavigate,
            )
        }
    }
}

@Composable
private fun CommandSectionColumn(
    section: CommandSection,
    isCollapsed: Boolean,
    onToggleCollapse: (Long) -> Unit,
    onNavigate: (String) -> Unit,
) {
    ListItem(
        text = {
            Text(
                section.title.uppercase(),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
            )
        },
        modifier = Modifier.clickable {
            onToggleCollapse(section.id)
        },
    )

    if (isCollapsed) {
        when (section.title) {
            "TLDR" -> {
                Column(
                    modifier = Modifier.padding(horizontal = 16.dp),
                ) {
                    val tldrParts = section.content.split("<b>")
                    tldrParts.forEachIndexed { index, s ->
                        val split = s.split("</b>")
                        if (split.size > 1) {
                            Text(
                                text = split[0],
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                            )

                            val command = "$ " + split[1].replace("<br>", "").replace("`", "")
                            CommandView(
                                command = command,
                                elements = listOf(CommandElement.Text(command)),
                                onNavigate = onNavigate,
                            )
                        }
                        if (index != tldrParts.lastIndex) {
                            Spacer(Modifier.height(6.dp))
                        }
                    }
                }
            }
            "SEE ALSO" -> {
                val commands = remember {
                    getCommands(section.content)
                }
                if (commands.isNotEmpty()) {
                    FlowRow(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        commands.forEach { name ->
                            Chip(onClick = {
                                onNavigate("command?commandName=$name")
                            }) {
                                Text(
                                    text = name,
                                    color = MaterialTheme.colors.onSurface,
                                )
                            }
                        }
                    }
                } else {
                    // fallback
                    Text(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        text = section.content.toAnnotatedString(),
                        color = MaterialTheme.colors.onSurface,
                    )
                }
            }
            else -> {
                Text(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    text = section.content.toAnnotatedString(),
                    color = MaterialTheme.colors.onSurface,
                )
            }
        }
    }
}

private fun getCommands(input: String): List<String> {
    val commands = input.split(",").map { it.trim() }

    return commands
        .map { command ->
            command.replace(Regex("\\(\\d+\\)$"), "").trim()
        }.filter {
            databaseHelper.getCommand(it) != null
        }
}

private fun String.toAnnotatedString(): AnnotatedString {
    val spanned = HtmlCompat.fromHtml(this, HtmlCompat.FROM_HTML_MODE_LEGACY)

    val trimmedText = spanned.toString().trim('\n', ' ')

    return buildAnnotatedString {
        append(trimmedText)

        spanned.getSpans(0, trimmedText.length, Any::class.java).forEach { span ->
            val start = spanned.getSpanStart(span)
            val end = spanned.getSpanEnd(span)

            when (span) {
                is StyleSpan -> when (span.style) {
                    android.graphics.Typeface.BOLD -> {
                        addStyle(SpanStyle(fontWeight = FontWeight.Bold), start, end)
                    }
                    android.graphics.Typeface.ITALIC -> {
                        addStyle(SpanStyle(fontStyle = FontStyle.Italic), start, end)
                    }
                }
                is UnderlineSpan -> {
                    addStyle(SpanStyle(textDecoration = TextDecoration.Underline), start, end)
                }
            }
        }
    }
}
