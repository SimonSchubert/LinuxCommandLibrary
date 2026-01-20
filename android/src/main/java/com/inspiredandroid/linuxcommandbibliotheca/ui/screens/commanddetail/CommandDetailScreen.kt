@file:OptIn(ExperimentalMaterialApi::class, ExperimentalLayoutApi::class)

package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commanddetail

import androidx.activity.compose.LocalActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.inspiredandroid.linuxcommandbibliotheca.data.CommandSectionInfo
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.CommandView
import com.linuxcommandlibrary.shared.CommandElement
import com.mikepenz.markdown.compose.Markdown
import com.mikepenz.markdown.compose.components.MarkdownComponents
import com.mikepenz.markdown.compose.components.markdownComponents
import com.mikepenz.markdown.compose.elements.MarkdownHighlightedCodeBlock
import com.mikepenz.markdown.compose.elements.MarkdownHighlightedCodeFence
import com.mikepenz.markdown.m2.markdownColor
import com.mikepenz.markdown.m2.markdownTypography
import com.mikepenz.markdown.model.MarkdownColors
import com.mikepenz.markdown.model.MarkdownTypography
import com.mikepenz.markdown.model.rememberMarkdownState
import dev.snipme.highlights.Highlights
import dev.snipme.highlights.model.SyntaxLanguage
import dev.snipme.highlights.model.SyntaxThemes
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

private val LocalMarkdownColors = staticCompositionLocalOf<MarkdownColors> {
    error("MarkdownColors not provided")
}
private val LocalMarkdownTypography = staticCompositionLocalOf<MarkdownTypography> {
    error("MarkdownTypography not provided")
}
private val LocalMarkdownComponents = staticCompositionLocalOf<MarkdownComponents> {
    error("MarkdownComponents not provided")
}

@Composable
fun CommandDetailScreen(
    commandName: String,
    viewModel: CommandDetailViewModel = koinViewModel(
        key = commandName,
        viewModelStoreOwner = LocalActivity.current as ViewModelStoreOwner,
        parameters = { parametersOf(commandName) },
    ),
    onNavigate: (String) -> Unit,
) {
    val uiState by viewModel.state.collectAsStateWithLifecycle()

    val isDarkTheme = isSystemInDarkTheme()
    val colors = MaterialTheme.colors
    val typography = MaterialTheme.typography

    val highlightsBuilder = remember(isDarkTheme) {
        Highlights.Builder()
            .theme(SyntaxThemes.atom(darkMode = isDarkTheme))
            .language(SyntaxLanguage.SHELL)
    }

    val mdColors = markdownColor(
        text = colors.onSurface.copy(alpha = 0.7f),
        codeBackground = colors.surface,
    )

    val mdTypography = markdownTypography(
        text = typography.body1,
        code = typography.subtitle2,
    )

    val mdComponents = remember(highlightsBuilder) {
        markdownComponents(
            codeBlock = {
                MarkdownHighlightedCodeBlock(
                    content = it.content,
                    node = it.node,
                    highlightsBuilder = highlightsBuilder,
                )
            },
            codeFence = {
                MarkdownHighlightedCodeFence(
                    content = it.content,
                    node = it.node,
                    highlightsBuilder = highlightsBuilder,
                )
            },
        )
    }

    CompositionLocalProvider(
        LocalMarkdownColors provides mdColors,
        LocalMarkdownTypography provides mdTypography,
        LocalMarkdownComponents provides mdComponents,
    ) {
        LazyColumn(Modifier.fillMaxSize()) {
            items(
                items = uiState.sections,
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
}

@Composable
private fun CommandSectionColumn(
    section: CommandSectionInfo,
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
        DefaultSectionContent(content = content)
    }
}

@Composable
private fun DefaultSectionContent(content: String) {
    val markdownState = rememberMarkdownState(content)
    Markdown(
        markdownState = markdownState,
        colors = LocalMarkdownColors.current,
        typography = LocalMarkdownTypography.current,
        components = LocalMarkdownComponents.current,
        modifier = Modifier.fillMaxWidth()
            .padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 8.dp),
    )
}
