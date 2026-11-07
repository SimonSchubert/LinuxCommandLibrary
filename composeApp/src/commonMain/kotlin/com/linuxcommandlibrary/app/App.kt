package com.linuxcommandlibrary.app

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfoV2
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteType
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.movableContentOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.platform.UriHandler
import androidx.navigationevent.NavigationEventInfo
import androidx.navigationevent.compose.NavigationBackHandler
import androidx.navigationevent.compose.rememberNavigationEventState
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

    // The platform handler throws when no app can open the link (e.g. no browser installed).
    val platformUriHandler = LocalUriHandler.current
    val safeUriHandler = remember(platformUriHandler) {
        object : UriHandler {
            override fun openUri(uri: String) {
                runCatching { platformUriHandler.openUri(uri) }
            }
        }
    }

    CompositionLocalProvider(LocalUriHandler provides safeUriHandler) {
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
}

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
fun LinuxApp(initialDeeplink: String? = null) {
    val adaptiveInfo = currentWindowAdaptiveInfoV2()
    val state = rememberLinuxNavState(initialDeeplink, adaptiveInfo)
    val layoutType = navigationSuiteTypeFor(adaptiveInfo)
    val isCompact = layoutType == NavigationSuiteType.NavigationBar

    NavigationBackHandler(
        state = rememberNavigationEventState(NavigationEventInfo.None),
        isBackEnabled = state.isBackEnabled(),
        onBackCompleted = { state.onBack() },
    )

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
