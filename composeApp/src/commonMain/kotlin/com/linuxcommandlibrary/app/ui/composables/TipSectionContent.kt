package com.linuxcommandlibrary.app.ui.composables

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

fun buildTextElementString(
    elements: List<TextElement>,
    textColor: Color = Color.Unspecified,
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
                    text = buildTextElementString(section.elements, textColor),
                    color = textColor,
                )
            }

            is TipSectionElement.Blockquote -> {
                Text(
                    text = buildTextElementString(section.elements, textColor),
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
