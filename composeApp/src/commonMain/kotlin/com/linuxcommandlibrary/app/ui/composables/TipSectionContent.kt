package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.shared.TextElement
import com.linuxcommandlibrary.shared.TipSectionElement
import kotlinx.collections.immutable.ImmutableList

fun buildTextElementString(
    elements: ImmutableList<TextElement>,
    textColor: Color = Color.Unspecified,
    linkColor: Color = Color.Unspecified,
    onNavigate: ((NavEvent) -> Unit)? = null,
): AnnotatedString = buildAnnotatedString {
    elements.forEach { textElement ->
        when (textElement) {
            is TextElement.Plain -> append(textElement.text)

            is TextElement.Bold -> {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = textColor)) {
                    append(textElement.text)
                }
            }

            is TextElement.Italic -> {
                withStyle(style = SpanStyle(fontStyle = FontStyle.Italic, color = textColor)) {
                    append(textElement.text)
                }
            }

            is TextElement.Man -> append(textElement.man)

            is TextElement.Link -> {
                if (onNavigate != null) {
                    val start = this.length
                    withStyle(
                        style = SpanStyle(
                            color = linkColor,
                            fontWeight = FontWeight.Bold,
                            textDecoration = TextDecoration.Underline,
                        ),
                    ) {
                        append(textElement.text)
                    }
                    val end = this.length
                    addLink(
                        LinkAnnotation.Clickable(
                            tag = "action:${textElement.action}",
                            linkInteractionListener = {
                                onNavigate(NavEvent.OpenAction(textElement.action))
                            },
                        ),
                        start,
                        end,
                    )
                } else {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = textColor)) {
                        append(textElement.text)
                    }
                }
            }
        }
    }
}

@Composable
fun TipSectionContent(
    sections: ImmutableList<TipSectionElement>,
    onNavigate: (NavEvent) -> Unit,
    textColor: Color = Color.Unspecified,
    commandVerticalPadding: Dp = 0.dp,
    highlights: Map<Int, ElementHighlight>? = null,
    onElementPositioned: ((Int, LayoutCoordinates) -> Unit)? = null,
) {
    val linkColor = MaterialTheme.colorScheme.primary
    sections.forEachIndexed { elementIndex, section ->
        val highlight = highlights?.get(elementIndex)
        val positionModifier = if (onElementPositioned != null && highlight != null) {
            Modifier.onGloballyPositioned { onElementPositioned(elementIndex, it) }
        } else {
            Modifier
        }
        when (section) {
            is TipSectionElement.Text -> {
                val styledString = remember(section.elements, textColor, linkColor) {
                    buildTextElementString(section.elements, textColor, linkColor, onNavigate)
                }
                val annotatedString = remember(styledString, highlight) {
                    styledString.withMatchHighlight(highlight)
                }
                Text(
                    text = annotatedString,
                    color = textColor,
                    modifier = positionModifier,
                )
            }

            is TipSectionElement.Blockquote -> {
                val styledString = remember(section.elements, textColor) {
                    buildTextElementString(section.elements, textColor)
                }
                val annotatedString = remember(styledString, highlight) {
                    styledString.withMatchHighlight(highlight)
                }
                Text(
                    text = annotatedString,
                    color = textColor,
                    modifier = positionModifier.padding(start = 8.dp, bottom = 8.dp),
                )
            }

            is TipSectionElement.Code -> {
                CommandView(
                    command = section.command,
                    elements = section.elements,
                    onNavigate = onNavigate,
                    verticalPadding = commandVerticalPadding,
                    highlight = highlight,
                    modifier = positionModifier,
                )
            }

            is TipSectionElement.Table -> {
                TableView(
                    headers = section.headers,
                    rows = section.rows,
                    onNavigate = onNavigate,
                    highlight = highlight,
                    modifier = positionModifier,
                )
            }
        }
    }
}
