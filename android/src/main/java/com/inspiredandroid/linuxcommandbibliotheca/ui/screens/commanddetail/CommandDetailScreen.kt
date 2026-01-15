@file:OptIn(ExperimentalMaterialApi::class, ExperimentalLayoutApi::class)

package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commanddetail

import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import androidx.activity.compose.LocalActivity
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
import androidx.compose.runtime.getValue
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
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.CommandView
import com.linuxcommandlibrary.shared.CommandElement
import databases.CommandSection
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList
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
    viewModel: CommandDetailViewModel = koinViewModel(
        key = commandId.toString(),
        viewModelStoreOwner = LocalActivity.current as ViewModelStoreOwner,
        parameters = { parametersOf(commandId) },
    ),
    onNavigate: (String) -> Unit,
) {
    val uiState by viewModel.state.collectAsStateWithLifecycle()

    LazyColumn(Modifier.fillMaxSize()) {
        items(
            items = uiState.sections, // This should ideally be ImmutableList from ViewModel
            key = { it.id },
            contentType = { "command_section_item" },
        ) { section ->
            CommandSectionColumn(
                section = section,
                isExpanded = uiState.expandedSectionsMap.getOrDefault(section.id, false),
                seeAlsoCommands = uiState.seeAlsoCommands,
                onToggleExpanded = { id -> viewModel.onToggleExpanded(id) },
                onNavigate = onNavigate,
            )
        }
    }
}

@Composable
private fun CommandSectionColumn(
    section: CommandSection,
    isExpanded: Boolean,
    seeAlsoCommands: ImmutableList<String>,
    onToggleExpanded: (Long) -> Unit,
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
            onToggleExpanded(section.id)
        },
    )

    if (isExpanded) {
        when (section.title) {
            "TLDR" -> TldrSectionContent(content = section.content, onNavigate = onNavigate)
            "SEE ALSO" -> SeeAlsoSectionContent(
                content = section.content,
                seeAlsoCommands = seeAlsoCommands,
                onNavigate = onNavigate,
            )
            else -> DefaultSectionContent(content = section.content)
        }
    }
}

private data class TldrPart(
    val description: String,
    val command: String,
    val elements: ImmutableList<CommandElement>,
)

@Composable
private fun TldrSectionContent(content: String, onNavigate: (String) -> Unit) {
    val parsedParts = remember(content) {
        content.split("<b>").mapNotNull { part ->
            val split = part.split("</b>")
            if (split.size > 1) {
                val command = "$ " + split[1].replace("<br>", "").replace("`", "")
                TldrPart(
                    description = split[0],
                    command = command,
                    elements = listOf(CommandElement.Text(command)).toImmutableList(),
                )
            } else {
                null
            }
        }
    }

    Column(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp),
    ) {
        parsedParts.forEachIndexed { index, tldrPart ->
            Text(
                text = tldrPart.description,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colors.onSurface.copy(alpha = 0.7f),
            )

            CommandView(
                command = tldrPart.command,
                elements = tldrPart.elements,
                onNavigate = onNavigate,
                verticalPadding = 4.dp,
            )

            if (index != parsedParts.lastIndex) {
                Spacer(Modifier.height(6.dp))
            }
        }
    }
}

@Composable
private fun SeeAlsoSectionContent(
    content: String,
    seeAlsoCommands: ImmutableList<String>,
    onNavigate: (String) -> Unit,
) {
    if (seeAlsoCommands.isNotEmpty()) {
        FlowRow(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            seeAlsoCommands.forEach { name ->
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
        // fallback to default rendering if no commands were parsed (e.g. plain text)
        DefaultSectionContent(content = content, isFallback = true)
    }
}

@Composable
private fun DefaultSectionContent(content: String, isFallback: Boolean = false) {
    val annotatedString = remember(content) { content.toAnnotatedString() }
    Text(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = if (isFallback) 0.dp else 8.dp, bottom = 8.dp),
        text = annotatedString,
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.7f),
    )
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
