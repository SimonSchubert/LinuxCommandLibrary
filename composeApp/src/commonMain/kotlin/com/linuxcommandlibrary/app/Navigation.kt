package com.linuxcommandlibrary.app

import com.linuxcommandlibrary.app.ui.composables.AppIcon

sealed class Screen(
    val route: String,
    val titleRes: String,
    val icon: AppIcon,
) {
    data object Commands : Screen("commands", "Commands", AppIcon.SEARCH)
    data object Basics : Screen("basics", "Basics", AppIcon.PUZZLE)
    data object Tips : Screen("tips", "Tips", AppIcon.IDEA)
}

val bottomBarItems = listOf(
    Screen.Basics,
    Screen.Tips,
    Screen.Commands,
)

const val DEEPLINK_URI = "https://linuxcommandlibrary.com"
