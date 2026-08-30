package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.foundation.text.TextAutoSize
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.takeOrElse

/**
 * A short fixed label - a tab name, a button caption, a screen title - that shrinks to fit
 * rather than wrapping off-screen or ellipsizing away.
 *
 * At the largest font size and display size the viewport is only ~274dp, and slots like a
 * navigation-bar item (a third of that) or a top-bar title flanked by action icons cannot hold
 * their label at full size. Shrinking keeps the whole word readable, which beats "Comma / nds"
 * running past the screen edge or a command name cut to "el...".
 *
 * Only for labels whose text is known and short. Body copy should keep the size the user asked
 * for and wrap instead.
 */
@Composable
fun AutoSizeText(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = LocalTextStyle.current,
    color: Color = Color.Unspecified,
    fontWeight: FontWeight? = null,
    maxLines: Int = 1,
) {
    Text(
        text = text,
        modifier = modifier,
        style = style,
        color = color,
        fontWeight = fontWeight,
        maxLines = maxLines,
        softWrap = maxLines > 1,
        overflow = TextOverflow.Ellipsis,
        autoSize = TextAutoSize.StepBased(
            // sp scales with the font-size setting too, so this floor is still ~12sp of actual
            // height at 2x - smaller than asked for, but readable, and only reached when the
            // label genuinely does not fit.
            minFontSize = 6.sp,
            maxFontSize = style.fontSize.takeOrElse { 14.sp },
        ),
    )
}
