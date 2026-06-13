package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.app.ui.theme.mutedBodyText
import com.linuxcommandlibrary.shared.TipSectionElement
import kotlinx.collections.immutable.ImmutableList

/**
 * Flat card for rich markdown content (basics card-layout groups, tips): a darker
 * [androidx.compose.material3.ColorScheme.surfaceContainer] background with a bright
 * [SectionTitle] over [mutedBodyText]. Shared so every rich-content surface stays
 * visually consistent.
 */
@Composable
fun RichContentCard(
    title: String,
    sections: ImmutableList<TipSectionElement>,
    onNavigate: (NavEvent) -> Unit,
    modifier: Modifier = Modifier,
    showTitle: Boolean = true,
    commandVerticalPadding: Dp = 0.dp,
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainer,
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
        modifier = modifier
            .padding(4.dp)
            .fillMaxWidth(),
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            if (showTitle) {
                SectionTitle(title = title)
            }
            TipSectionContent(
                sections = sections,
                onNavigate = onNavigate,
                textColor = MaterialTheme.colorScheme.mutedBodyText,
                commandVerticalPadding = commandVerticalPadding,
            )
        }
    }
}
