package com.linuxcommandlibrary.app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteType
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.nav.LinuxNavState

/**
 * Expanded (rail) layout: pads every edge inside safeDrawing so the rail floats with margin and
 * `surfaceContainer` fills cutout/system-bar regions behind it; the content area has a rounded
 * top-corner clip and an 8.dp gutter from the rail. Cross-tab details render inside the
 * detail pane (no overlay).
 */
@Composable
internal fun ExpandedLinuxLayout(
    state: LinuxNavState,
    layoutType: NavigationSuiteType,
    content: @Composable () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surfaceContainer)
            .windowInsetsPadding(
                WindowInsets.safeDrawing.only(WindowInsetsSides.Horizontal + WindowInsetsSides.Vertical),
            )
            .padding(start = 4.dp, top = 16.dp, end = 16.dp),
    ) {
        LinuxNavigationSuite(
            state = state,
            layoutType = layoutType,
            modifier = Modifier
                .padding(start = 8.dp)
                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)),
            content = content,
        )
    }
}
