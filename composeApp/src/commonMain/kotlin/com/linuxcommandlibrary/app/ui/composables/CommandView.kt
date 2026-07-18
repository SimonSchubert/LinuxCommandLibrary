package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.app.platform.shareButtonDescription
import com.linuxcommandlibrary.app.platform.shareButtonIcon
import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.platform.ShareHandler
import kotlinx.collections.immutable.ImmutableList
import org.koin.compose.koinInject

/**
 * Builds the rendered string for a code block. Kept top-level (and non-composable) so the
 * man-page search can obtain exactly the text the user sees via `.text`, rather than
 * re-implementing the concatenation and risking drift from what gets drawn.
 */
fun buildCommandElementString(
    elements: ImmutableList<CommandElement>,
    codeColor: Color = Color.Unspecified,
    onNavigate: ((NavEvent) -> Unit)? = null,
): AnnotatedString = buildAnnotatedString {
    elements.forEach { element ->
        when (element) {
            is CommandElement.Text -> {
                append(element.text)
            }

            is CommandElement.Man -> {
                val start = this.length
                withStyle(style = SpanStyle(color = codeColor)) {
                    append(element.man)
                }
                val end = this.length
                if (onNavigate != null) {
                    addLink(
                        LinkAnnotation.Clickable(
                            tag = "man:${element.man}",
                            linkInteractionListener = {
                                onNavigate(NavEvent.ToCommand(element.man))
                            },
                        ),
                        start,
                        end,
                    )
                }
            }

            is CommandElement.Url -> {
                val start = this.length
                withStyle(style = SpanStyle(color = codeColor)) {
                    append(element.command)
                }
                val end = this.length
                if (onNavigate != null) {
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

@Composable
fun CommandView(
    command: String,
    elements: ImmutableList<CommandElement>,
    onNavigate: (NavEvent) -> Unit = {},
    verticalPadding: Dp = 6.dp,
    highlight: ElementHighlight? = null,
    modifier: Modifier = Modifier,
) {
    val codeColor = MaterialTheme.colorScheme.primary
    val styledAnnotatedString = remember(elements, codeColor) {
        buildCommandElementString(elements, codeColor, onNavigate)
    }
    val baseAnnotatedString = remember(styledAnnotatedString, highlight) {
        styledAnnotatedString.withMatchHighlight(highlight)
    }

    val finalAnnotatedString = remember(baseAnnotatedString) {
        if (baseAnnotatedString.text.isEmpty()) {
            baseAnnotatedString
        } else {
            buildAnnotatedString {
                append(baseAnnotatedString)
                addStyle(
                    style = ParagraphStyle(textDirection = TextDirection.Ltr),
                    start = 0,
                    end = baseAnnotatedString.text.length,
                )
            }
        }
    }

    Surface(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = verticalPadding),
        shape = RoundedCornerShape(12.dp),
        color = MaterialTheme.colorScheme.surfaceContainerHigh,
    ) {
        Row(
            modifier = Modifier.padding(start = 12.dp, end = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = finalAnnotatedString,
                modifier = Modifier
                    .weight(1f)
                    .padding(vertical = 8.dp),
                style = MaterialTheme.typography.titleSmall,
            )

            if ('\n' !in command) {
                val shareHandler: ShareHandler = koinInject()
                val shareAction = remember(shareHandler, command) {
                    {
                        val cleanedCommand = command.dropWhile { it == '$' || it.isWhitespace() }.replace("\\n", "")
                        shareHandler.shareText(cleanedCommand)
                    }
                }
                IconButton(
                    modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                    onClick = shareAction,
                ) {
                    Icon(
                        imageVector = shareButtonIcon,
                        contentDescription = shareButtonDescription,
                        tint = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
            }
        }
    }
}
