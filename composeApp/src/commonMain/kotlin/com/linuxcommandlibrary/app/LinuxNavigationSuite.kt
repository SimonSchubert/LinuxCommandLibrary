package com.linuxcommandlibrary.app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationItemColors
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteDefaults
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteItem
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteType
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.nav.LinuxNavState
import com.linuxcommandlibrary.app.nav.TopLevelDestinations
import com.linuxcommandlibrary.app.nav.route
import com.linuxcommandlibrary.app.ui.composables.rememberIconPainter
import com.linuxcommandlibrary.app.ui.theme.LocalCustomColors

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
internal fun LinuxNavigationSuite(
    state: LinuxNavState,
    layoutType: NavigationSuiteType,
    contentModifier: Modifier,
    content: @Composable () -> Unit,
) {
    val hoverModifier = Modifier.pointerHoverIcon(PointerIcon.Hand)
    val colorScheme = MaterialTheme.colorScheme
    val itemColors = remember(colorScheme) {
        NavigationItemColors(
            selectedIconColor = colorScheme.onSurface,
            selectedTextColor = colorScheme.onSurface,
            selectedIndicatorColor = colorScheme.surfaceContainerHighest,
            unselectedIconColor = colorScheme.onSurfaceVariant,
            unselectedTextColor = colorScheme.onSurfaceVariant,
            disabledIconColor = colorScheme.onSurfaceVariant.copy(alpha = 0.38f),
            disabledTextColor = colorScheme.onSurfaceVariant.copy(alpha = 0.38f),
        )
    }
    val currentKey = state.currentKey()
    NavigationSuiteScaffold(
        navigationSuiteType = layoutType,
        containerColor = Color.Transparent,
        navigationSuiteColors = NavigationSuiteDefaults.colors(
            navigationBarContainerColor = LocalCustomColors.current.navBarBackground,
            navigationRailContainerColor = Color.Transparent,
        ),
        navigationItemVerticalArrangement = Arrangement.Center,
        navigationItems = {
            TopLevelDestinations.forEach { dest ->
                NavigationSuiteItem(
                    modifier = hoverModifier,
                    navigationSuiteType = layoutType,
                    selected = currentKey == dest.key,
                    onClick = { state.selectTab(dest.key.route) },
                    icon = {
                        Icon(
                            painter = rememberIconPainter(dest.icon),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                        )
                    },
                    label = { Text(dest.label) },
                    colors = itemColors,
                )
            }
        },
    ) {
        Box(
            modifier = contentModifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.surface),
        ) {
            content()
        }
    }
}
