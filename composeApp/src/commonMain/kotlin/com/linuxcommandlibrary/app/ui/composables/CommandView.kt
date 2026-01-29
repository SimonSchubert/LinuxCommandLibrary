package com.linuxcommandlibrary.app.ui.composables

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
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.platform.ShareHandler
import kotlinx.collections.immutable.ImmutableList
import org.koin.compose.koinInject

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
                                    onNavigate("command?commandName=${element.man}")
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
                    style = ParagraphStyle(),
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

        val shareHandler: ShareHandler = koinInject()
        val shareAction = remember(shareHandler, command) {
            {
                val cleanedCommand = command.dropWhile { it == '$' || it.isWhitespace() }.replace("\\n", "")
                shareHandler.shareText(cleanedCommand)
            }
        }
        IconButton(
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .pointerHoverIcon(PointerIcon.Hand),
            onClick = shareAction,
        ) {
            Icon(
                imageVector = Icons.Filled.Share,
                contentDescription = "Share",
            )
        }
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
        if (matchIndex > currentIndex) {
            append(text.substring(currentIndex, matchIndex))
        }
        withStyle(style = SpanStyle(background = highlightColor.copy(alpha = 0.3f))) {
            append(text.substring(matchIndex, matchIndex + searchText.length))
        }
        currentIndex = matchIndex + searchText.length
    }
}
