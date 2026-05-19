package com.linuxcommandlibrary.app.nav

import com.linuxcommandlibrary.app.resources.Res
import com.linuxcommandlibrary.app.resources.basics
import com.linuxcommandlibrary.app.resources.commands
import com.linuxcommandlibrary.app.resources.tips
import com.linuxcommandlibrary.app.ui.composables.AppIcon
import org.jetbrains.compose.resources.StringResource

internal data class TopLevelDestination(
    val key: RouteKey,
    val label: StringResource,
    val icon: AppIcon,
)

internal val TopLevelDestinations: List<TopLevelDestination> = listOf(
    TopLevelDestination(RouteKey.Basics, Res.string.basics, AppIcon.PUZZLE),
    TopLevelDestination(RouteKey.Tips, Res.string.tips, AppIcon.IDEA),
    TopLevelDestination(RouteKey.Commands, Res.string.commands, AppIcon.SEARCH),
)
