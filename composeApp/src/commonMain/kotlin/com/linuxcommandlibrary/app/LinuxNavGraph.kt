@file:OptIn(androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi::class)

package com.linuxcommandlibrary.app

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.navigation.compose.composable
import com.linuxcommandlibrary.app.nav.LinuxNavState
import com.linuxcommandlibrary.app.nav.RouteKey
import com.linuxcommandlibrary.app.nav.TabStackTop
import com.linuxcommandlibrary.app.platform.AppNavHost
import com.linuxcommandlibrary.app.resources.Res
import com.linuxcommandlibrary.app.resources.info
import com.linuxcommandlibrary.app.resources.tips
import com.linuxcommandlibrary.app.ui.AppIcons
import com.linuxcommandlibrary.app.ui.composables.PaneTopBar
import com.linuxcommandlibrary.app.ui.screens.AppInfoDialog
import com.linuxcommandlibrary.app.ui.screens.basics.BasicsPaneScreen
import com.linuxcommandlibrary.app.ui.screens.commands.CommandsPaneScreen
import com.linuxcommandlibrary.app.ui.screens.tips.TipsScreen
import com.linuxcommandlibrary.app.ui.screens.tips.TipsViewModel
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.koinInject

@Composable
internal fun LinuxNavGraph(state: LinuxNavState, withTabStackOverlay: Boolean) {
    AppNavHost(
        navController = state.navController,
        startDestination = state.initialRoute,
    ) {
        composable<Route.Basics> { BasicsTab(state, withTabStackOverlay) }
        composable<Route.Commands> { CommandsTab(state, withTabStackOverlay) }
        composable<Route.Tips> { TipsTab(state) }
    }
}

@Composable
private fun BasicsTab(state: LinuxNavState, withTabStackOverlay: Boolean) {
    Box(modifier = Modifier.fillMaxSize()) {
        val basicsStack = state.stackFor(RouteKey.Basics)
        BasicsPaneScreen(
            navigator = state.basicsNavigator,
            searchState = state.searchState,
            pendingSelection = state.pendingBasic,
            onSelectionConsumed = { state.pendingBasic = null },
            pendingExpandGroupId = state.pendingExpand,
            onExpandConsumed = { state.pendingExpand = null },
            scope = rememberCoroutineScope(),
            onNavigate = state::onNavigate,
            stack = basicsStack,
            onPopStack = { state.popStack(RouteKey.Basics) },
            lastBasicsGroupId = state.lastBasicsGroupId,
            isExpanded = !withTabStackOverlay,
        )
        // Wide layouts render the stack inside the detail pane; mobile overlays the full pane.
        if (withTabStackOverlay) {
            TabStackTop(
                stack = basicsStack,
                onPop = { state.popStack(RouteKey.Basics) },
                onNavigate = state::onNavigate,
            )
        }
    }
}

@Composable
private fun CommandsTab(state: LinuxNavState, withTabStackOverlay: Boolean) {
    Box(modifier = Modifier.fillMaxSize()) {
        val commandsStack = state.stackFor(RouteKey.Commands)
        CommandsPaneScreen(
            navigator = state.commandsNavigator,
            searchState = state.searchState,
            pendingSelection = state.pendingCommand,
            onSelectionConsumed = { state.pendingCommand = null },
            scope = rememberCoroutineScope(),
            onNavigate = state::onNavigate,
            stack = commandsStack,
            onPopStack = { state.popStack(RouteKey.Commands) },
            isExpanded = !withTabStackOverlay,
        )
        if (withTabStackOverlay) {
            TabStackTop(
                stack = commandsStack,
                onPop = { state.popStack(RouteKey.Commands) },
                onNavigate = state::onNavigate,
            )
        }
    }
}

@Composable
private fun TipsTab(state: LinuxNavState) {
    Box(modifier = Modifier.fillMaxSize()) {
        var showInfo by rememberSaveable { mutableStateOf(false) }
        Column(modifier = Modifier.fillMaxSize()) {
            PaneTopBar(
                title = stringResource(Res.string.tips),
                actions = {
                    IconButton(
                        modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                        onClick = { showInfo = true },
                    ) {
                        Icon(
                            imageVector = AppIcons.Info,
                            contentDescription = stringResource(Res.string.info),
                        )
                    }
                },
            )
            val viewModel: TipsViewModel = koinInject()
            TipsScreen(viewModel = viewModel, onNavigate = state::onNavigate)
        }
        if (showInfo) {
            AppInfoDialog(onDismiss = { showInfo = false })
        }
        TabStackTop(
            stack = state.stackFor(RouteKey.Tips),
            onPop = { state.popStack(RouteKey.Tips) },
            onNavigate = state::onNavigate,
        )
    }
}
