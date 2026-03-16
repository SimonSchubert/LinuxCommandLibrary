package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hasRoute
import com.linuxcommandlibrary.app.Route
import com.linuxcommandlibrary.app.ui.theme.LocalCustomColors

private data class BottomTab(
    val route: Route,
    val title: String,
    val icon: AppIcon,
)

private val bottomTabs = listOf(
    BottomTab(Route.Basics, "Basics", AppIcon.PUZZLE),
    BottomTab(Route.Tips, "Tips", AppIcon.IDEA),
    BottomTab(Route.Commands, "Commands", AppIcon.SEARCH),
)

@Composable
fun BottomBar(
    currentDestination: NavDestination?,
    onSelectTab: (Route) -> Unit,
) {
    val itemColors = NavigationBarItemDefaults.colors(
        selectedIconColor = MaterialTheme.colorScheme.primary,
        selectedTextColor = MaterialTheme.colorScheme.primary,
        unselectedIconColor = MaterialTheme.colorScheme.onSurface,
        unselectedTextColor = MaterialTheme.colorScheme.onSurface,
        indicatorColor = Color.Transparent,
    )

    NavigationBar(
        modifier = Modifier.height(64.dp),
        containerColor = LocalCustomColors.current.navBarBackground,
        tonalElevation = 0.dp,
    ) {
        bottomTabs.forEach { tab ->
            val painter = rememberIconPainter(tab.icon)
            val isSelected = when (tab.route) {
                Route.Basics -> currentDestination?.hasRoute<Route.Basics>() == true ||
                    currentDestination?.hasRoute<Route.BasicGroups>() == true

                Route.Commands -> currentDestination?.hasRoute<Route.Commands>() == true

                Route.Tips -> currentDestination?.hasRoute<Route.Tips>() == true

                else -> false
            }
            NavigationBarItem(
                modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                icon = {
                    Icon(
                        painter = painter,
                        contentDescription = null,
                        modifier = Modifier.size(24.dp),
                    )
                },
                label = { Text(tab.title) },
                selected = isSelected,
                colors = itemColors,
                onClick = { onSelectTab(tab.route) },
            )
        }
    }
}
