package com.linuxcommandlibrary.app

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteType
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.movableContentOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.backhandler.BackHandler
import com.linuxcommandlibrary.app.data.CommandsRepository
import com.linuxcommandlibrary.app.nav.navigationSuiteTypeFor
import com.linuxcommandlibrary.app.nav.rememberLinuxNavState
import com.linuxcommandlibrary.app.ui.theme.LinuxTheme
import com.linuxcommandlibrary.shared.platform.ReviewHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.compose.koinInject

@Composable
fun App(
    initialDeeplink: String? = null,
    darkMode: Boolean = isSystemInDarkTheme(),
) {
    val reviewHandler: ReviewHandler = koinInject()
    val commandsRepository: CommandsRepository = koinInject()
    LaunchedEffect(Unit) {
        reviewHandler.incrementAppStartCount()
        reviewHandler.requestReviewIfNeeded()
        withContext(Dispatchers.Default) {
            commandsRepository.getCommands()
        }
    }

    LinuxTheme(darkMode = darkMode) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
        ) {
            LinuxApp(initialDeeplink = initialDeeplink)
        }
    }
}

@OptIn(ExperimentalMaterial3AdaptiveApi::class, ExperimentalComposeUiApi::class)
@Composable
fun LinuxApp(initialDeeplink: String? = null) {
    val adaptiveInfo = currentWindowAdaptiveInfo()
    val state = rememberLinuxNavState(initialDeeplink, adaptiveInfo)
    val layoutType = navigationSuiteTypeFor(adaptiveInfo)
    val isCompact = layoutType == NavigationSuiteType.NavigationBar

    // Deprecated in CMP 1.11 in favor of androidx.navigationevent's NavigationEventHandler, but
    // that reads LocalNavigationEventDispatcherOwner, which CMP only wires up via its internal
    // compat local that this BackHandler uses - migrating would throw on desktop/iOS. Revisit
    // once CMP provides the public local (see JetBrains/compose-multiplatform).
    @Suppress("DEPRECATION")
    BackHandler(enabled = state.isBackEnabled()) { state.onBack() }

    // Wrapped in movableContentOf so the navigation graph (and its mounted ListDetailPaneScaffold
    // navigators / SeekableTransitionState) survive the if/else swap when the window crosses the
    // rail/bar breakpoint. Without this, BasicsPaneScreen unmounts and remounts, re-binding the
    // same navigator-owned SeekableTransitionState to a fresh Transition — which Compose rejects.
    val navGraph = remember(state) {
        movableContentOf<Boolean> { withOverlay ->
            LinuxNavGraph(state, withTabStackOverlay = withOverlay)
        }
    }

    if (isCompact) {
        CompactLinuxLayout(state, layoutType) { navGraph(true) }
    } else {
        ExpandedLinuxLayout(state, layoutType) { navGraph(false) }
    }
}
