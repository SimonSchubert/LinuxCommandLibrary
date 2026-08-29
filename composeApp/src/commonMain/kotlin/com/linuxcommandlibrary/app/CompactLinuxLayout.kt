package com.linuxcommandlibrary.app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteType
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.linuxcommandlibrary.app.nav.LinuxNavState

/**
 * Compact (phone) layout: top-only safe-area padding so [androidx.compose.material3.NavigationBar]
 * can extend its own background through the gesture-bar inset; cross-tab details overlay the
 * whole pane via [com.linuxcommandlibrary.app.nav.TabStackTop].
 */
@Composable
internal fun CompactLinuxLayout(
    state: LinuxNavState,
    layoutType: NavigationSuiteType,
    content: @Composable () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface)
            .windowInsetsPadding(WindowInsets.safeDrawing.only(WindowInsetsSides.Top)),
    ) {
        LinuxNavigationSuite(
            state = state,
            layoutType = layoutType,
            content = content,
        )
    }
}
