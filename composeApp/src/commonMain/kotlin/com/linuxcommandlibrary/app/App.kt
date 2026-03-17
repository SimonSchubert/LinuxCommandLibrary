package com.linuxcommandlibrary.app

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.linuxcommandlibrary.app.data.BasicsRepository
import com.linuxcommandlibrary.app.data.CommandsRepository
import com.linuxcommandlibrary.app.platform.AppNavHost
import com.linuxcommandlibrary.app.platform.rememberOpenAppAction
import com.linuxcommandlibrary.app.ui.composables.BottomBar
import com.linuxcommandlibrary.app.ui.composables.DetailTopBar
import com.linuxcommandlibrary.app.ui.composables.GenericTopBar
import com.linuxcommandlibrary.app.ui.composables.SearchTopBar
import com.linuxcommandlibrary.app.ui.composables.rememberSearchState
import com.linuxcommandlibrary.app.ui.screens.basiccategories.BasicCategoriesScreen
import com.linuxcommandlibrary.app.ui.screens.basiccategories.BasicCategoriesViewModel
import com.linuxcommandlibrary.app.ui.screens.basicgroups.BasicEditorScreen
import com.linuxcommandlibrary.app.ui.screens.basicgroups.BasicEditorViewModel
import com.linuxcommandlibrary.app.ui.screens.basicgroups.BasicGroupsScreen
import com.linuxcommandlibrary.app.ui.screens.basicgroups.BasicGroupsViewModel
import com.linuxcommandlibrary.app.ui.screens.commanddetail.CommandDetailScreen
import com.linuxcommandlibrary.app.ui.screens.commanddetail.CommandDetailViewModel
import com.linuxcommandlibrary.app.ui.screens.commandlist.CommandListScreen
import com.linuxcommandlibrary.app.ui.screens.commandlist.CommandListViewModel
import com.linuxcommandlibrary.app.ui.screens.search.SearchScreen
import com.linuxcommandlibrary.app.ui.screens.search.SearchViewModel
import com.linuxcommandlibrary.app.ui.screens.tips.TipsScreen
import com.linuxcommandlibrary.app.ui.screens.tips.TipsViewModel
import com.linuxcommandlibrary.app.ui.theme.LinuxTheme
import com.linuxcommandlibrary.shared.platform.ReviewHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.compose.koinInject
import org.koin.core.parameter.parametersOf

@Composable
fun App(initialDeeplink: String? = null) {
    val reviewHandler: ReviewHandler = koinInject()
    val commandsRepository: CommandsRepository = koinInject()
    LaunchedEffect(Unit) {
        reviewHandler.incrementAppStartCount()
        reviewHandler.requestReviewIfNeeded()
        withContext(Dispatchers.Default) {
            commandsRepository.getCommands()
        }
    }

    LinuxTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
        ) {
            LinuxApp(initialDeeplink = initialDeeplink)
        }
    }
}

@Composable
fun LinuxApp(initialDeeplink: String? = null) {
    val navController = rememberNavController()
    val initialRoute = remember(initialDeeplink) {
        parseDeeplink(initialDeeplink) ?: Route.Basics
    }

    val searchState = rememberSearchState()

    val openAppAction = rememberOpenAppAction()
    val onNavigate: (NavEvent) -> Unit = remember(navController, openAppAction) {
        { event ->
            when (event) {
                is NavEvent.ToCommand -> navController.navigate(Route.CommandDetail(event.commandName))
                is NavEvent.ToBasicGroups -> navController.navigate(Route.BasicGroups(event.categoryId, event.categoryTitle))
                is NavEvent.OpenAction -> openAppAction(event.action)
            }
        }
    }

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination

    val isOnBasics = currentRoute?.hasRoute<Route.Basics>() == true
    val isOnCommands = currentRoute?.hasRoute<Route.Commands>() == true
    val isOnTips = currentRoute?.hasRoute<Route.Tips>() == true
    val isOnBasicGroups = currentRoute?.hasRoute<Route.BasicGroups>() == true
    val isOnCommandDetail = currentRoute?.hasRoute<Route.CommandDetail>() == true

    val currentCommandName = if (isOnCommandDetail) {
        navBackStackEntry?.toRoute<Route.CommandDetail>()?.commandName
    } else {
        null
    }

    val commandDetailViewModel: CommandDetailViewModel? = currentCommandName?.let {
        koinInject { parametersOf(it) }
    }

    Scaffold(
        topBar = {
            when {
                isOnCommands || isOnBasics -> {
                    SearchTopBar(
                        title = if (isOnBasics) "Basics" else "Commands",
                        searchState = searchState,
                    )
                }

                isOnCommandDetail && currentCommandName != null -> {
                    commandDetailViewModel?.let { viewModel ->
                        DetailTopBar(
                            commandName = currentCommandName,
                            viewModel = viewModel,
                            onBack = { navController.popBackStack() },
                        )
                    }
                }

                else -> {
                    val title = when {
                        isOnTips -> "Tips"

                        isOnBasicGroups -> {
                            navBackStackEntry?.toRoute<Route.BasicGroups>()?.categoryTitle ?: ""
                        }

                        else -> ""
                    }
                    val showBackIcon = !isOnTips
                    val showAppInfoIcon = isOnTips
                    GenericTopBar(
                        title = title,
                        showBackIcon = showBackIcon,
                        onBack = { navController.popBackStack() },
                        showAppInfoIcon = showAppInfoIcon,
                    )
                }
            }
        },
        bottomBar = {
            BottomBar(
                currentDestination = currentRoute,
                onSelectTab = { route ->
                    navController.navigate(route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                    searchState.clear()
                },
            )
        },
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding),
        ) {
            AppNavHost(
                navController = navController,
                startDestination = initialRoute,
            ) {
                composable<Route.Basics> {
                    val viewModel: BasicCategoriesViewModel = koinInject()
                    BasicCategoriesScreen(viewModel = viewModel, onNavigate = onNavigate)
                }

                composable<Route.Commands> {
                    val viewModel: CommandListViewModel = koinInject()
                    CommandListScreen(viewModel = viewModel, onNavigate = onNavigate)
                }

                composable<Route.Tips> {
                    val viewModel: TipsViewModel = koinInject()
                    TipsScreen(viewModel = viewModel, onNavigate = onNavigate)
                }

                composable<Route.BasicGroups> { backStackEntry ->
                    val route = backStackEntry.toRoute<Route.BasicGroups>()
                    val basicsRepository: BasicsRepository = koinInject()
                    if (basicsRepository.usesCardLayout(route.categoryId)) {
                        val viewModel: BasicEditorViewModel = koinInject { parametersOf(route.categoryId) }
                        BasicEditorScreen(viewModel = viewModel, onNavigate = onNavigate)
                    } else {
                        val viewModel: BasicGroupsViewModel = koinInject { parametersOf(route.categoryId) }
                        BasicGroupsScreen(viewModel = viewModel, onNavigate = onNavigate)
                    }
                }

                composable<Route.CommandDetail> {
                    commandDetailViewModel?.let { viewModel ->
                        CommandDetailScreen(viewModel = viewModel, onNavigate = onNavigate)
                    }
                }
            }

            val isSearchVisible = searchState.searchText.isNotEmpty() && !isOnCommandDetail
            AnimatedVisibility(
                visible = isSearchVisible,
                enter = fadeIn(animationSpec = tween(300)),
                exit = fadeOut(animationSpec = tween(durationMillis = 300, delayMillis = 300)),
            ) {
                Box(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)) {
                    val searchViewModel: SearchViewModel = koinInject()
                    SearchScreen(
                        searchText = searchState.searchText,
                        viewModel = searchViewModel,
                        onNavigate = onNavigate,
                    )
                }
            }
        }
    }
}

private fun parseDeeplink(url: String?): Route? {
    if (url == null) return null

    return when {
        url.endsWith("/basics.html") || url.endsWith("/basics") -> Route.Basics

        url.endsWith("/tips.html") || url.endsWith("/tips") -> Route.Tips

        url.contains("/man/") -> {
            val commandName = url.substringAfterLast("/man/").removeSuffix(".html")
            Route.CommandDetail(commandName)
        }

        url.contains("/basic/") -> {
            val categoryId = url.substringAfterLast("/basic/").removeSuffix(".html")
            Route.BasicGroups(categoryId, categoryId)
        }

        url.endsWith("/") || url.endsWith("/index.html") -> Route.Commands

        else -> null
    }
}
