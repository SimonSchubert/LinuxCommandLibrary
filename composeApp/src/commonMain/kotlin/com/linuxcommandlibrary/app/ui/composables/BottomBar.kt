package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
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
    val selectedColor = MaterialTheme.colorScheme.primary
    val unselectedColor = MaterialTheme.colorScheme.onSurface

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(LocalCustomColors.current.navBarBackground)
            .windowInsetsPadding(WindowInsets.navigationBars),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .defaultMinSize(minHeight = 56.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            bottomTabs.forEach { tab ->
                val isSelected = when (tab.route) {
                    Route.Basics -> currentDestination?.hasRoute<Route.Basics>() == true ||
                        currentDestination?.hasRoute<Route.BasicGroups>() == true

                    Route.Commands -> currentDestination?.hasRoute<Route.Commands>() == true

                    Route.Tips -> currentDestination?.hasRoute<Route.Tips>() == true

                    else -> false
                }
                val tint = if (isSelected) selectedColor else unselectedColor

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .defaultMinSize(minHeight = 56.dp)
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                        ) { onSelectTab(tab.route) }
                        .pointerHoverIcon(PointerIcon.Hand),
                    contentAlignment = Alignment.Center,
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            painter = rememberIconPainter(tab.icon),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            tint = tint,
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = tab.title,
                            color = tint,
                            style = MaterialTheme.typography.labelMedium,
                        )
                    }
                }
            }
        }
    }
}
