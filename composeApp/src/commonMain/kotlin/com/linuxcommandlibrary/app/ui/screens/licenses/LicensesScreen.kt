package com.linuxcommandlibrary.app.ui.screens.licenses

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.ui.AppIcons
import com.linuxcommandlibrary.app.ui.composables.PaneTopBar
import com.linuxcommandlibrary.app.ui.composables.SectionTitle
import com.linuxcommandlibrary.app.ui.composables.WithScrollbar
import com.linuxcommandlibrary.shared.LicenseEntry
import com.linuxcommandlibrary.shared.Licenses
import com.linuxcommandlibrary.shared.Version

/**
 * Attribution for the app's own license, its content sources and the bundled third-party
 * libraries. Reached from [com.linuxcommandlibrary.app.ui.screens.AppInfoDialog].
 *
 * Reads [Licenses] directly instead of taking the groups as a parameter: a `List` parameter on a
 * composable trips the ComposeUnstableCollections lint, and the list is static anyway.
 */
@Composable
fun LicensesScreen(onBack: () -> Unit) {
    val listState = rememberLazyListState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface),
    ) {
        PaneTopBar(title = "Open source licenses", onBack = onBack)
        WithScrollbar(state = listState, modifier = Modifier.fillMaxSize()) {
            LazyColumn(
                state = listState,
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(bottom = 24.dp),
            ) {
                item(key = "app", contentType = "app_header") {
                    AppLicenseHeader()
                }
                Licenses.groups.forEach { group ->
                    item(key = "title_${group.title}", contentType = "group_title") {
                        SectionTitle(
                            title = group.title,
                            modifier = Modifier.padding(
                                start = 16.dp,
                                end = 16.dp,
                                top = 20.dp,
                                bottom = 4.dp,
                            ),
                        )
                    }
                    items(
                        items = group.entries,
                        key = { "${group.title}_${it.name}" },
                        contentType = { "license_entry" },
                    ) { entry ->
                        LicenseRow(entry)
                    }
                }
            }
        }
    }
}

@Composable
private fun AppLicenseHeader() {
    Column {
        LicenseRow(Licenses.app, subtitle = "Version ${Version.APP_VERSION}")
        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 16.dp),
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f),
        )
    }
}

@Composable
private fun LicenseRow(entry: LicenseEntry, subtitle: String? = null) {
    val uriHandler = LocalUriHandler.current
    val url = entry.url
    val secondary = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .then(
                if (url != null) {
                    Modifier
                        .pointerHoverIcon(PointerIcon.Hand)
                        .clickable { uriHandler.openUri(url) }
                } else {
                    Modifier
                },
            ).padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = entry.name,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Medium,
            )
            if (subtitle != null) {
                Text(text = subtitle, style = MaterialTheme.typography.bodySmall, color = secondary)
            }
            Spacer(Modifier.height(2.dp))
            Text(text = entry.license, style = MaterialTheme.typography.bodySmall, color = secondary)
            entry.copyright?.let {
                Text(text = it, style = MaterialTheme.typography.bodySmall, color = secondary)
            }
        }
        if (url != null) {
            Spacer(Modifier.width(12.dp))
            Icon(
                imageVector = AppIcons.OpenInNew,
                contentDescription = "Opens in browser",
                modifier = Modifier.size(18.dp),
                tint = secondary,
            )
        }
    }
}
