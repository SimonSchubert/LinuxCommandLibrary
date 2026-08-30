package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.platform.backIcon

/**
 * A Row rather than a Material [androidx.compose.material3.TopAppBar] because the bar has to grow
 * with the text: a TopAppBar is a fixed height, so a title that needs a second line at large font
 * scales gets clipped instead. The metrics below match the ones it used.
 */
@Composable
fun PaneTopBar(
    title: String,
    modifier: Modifier = Modifier,
    onBack: (() -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {},
) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.surface,
        contentColor = MaterialTheme.colorScheme.onSurface,
    ) {
        Row(
            modifier = Modifier
                .heightIn(min = 56.dp)
                .padding(horizontal = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (onBack != null) {
                IconButton(
                    modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                    onClick = onBack,
                ) {
                    Icon(imageVector = backIcon, contentDescription = "Back")
                }
            } else {
                Spacer(Modifier.width(12.dp))
            }
            // Shrinks and takes a second line before it truncates. A command-detail bar carries
            // three action icons, which on a narrow screen at 2x text left the title two
            // characters wide - long enough to render "elasticsearch-..." as "el...".
            AutoSizeText(
                text = title,
                style = MaterialTheme.typography.titleLarge,
                maxLines = 2,
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 4.dp, vertical = 8.dp),
            )
            actions()
        }
    }
}
