package com.linuxcommandlibrary.app

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.data.BasicsRepository
import com.linuxcommandlibrary.app.platform.backIcon
import com.linuxcommandlibrary.app.ui.composables.AppIcon
import com.linuxcommandlibrary.app.ui.composables.rememberIconPainter
import com.linuxcommandlibrary.app.ui.screens.AppInfoDialog
import com.linuxcommandlibrary.app.ui.screens.BookmarkFeedbackDialog
import com.linuxcommandlibrary.app.ui.screens.basiccategories.BasicCategoriesScreen
import com.linuxcommandlibrary.app.ui.screens.basiccategories.BasicCategoriesViewModel
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
import com.linuxcommandlibrary.app.ui.theme.LocalCustomColors
import com.linuxcommandlibrary.shared.platform.ReviewHandler
import org.koin.compose.koinInject
import org.koin.core.parameter.parametersOf

sealed class NavDestination {
    data object Basics : NavDestination()
    data object Commands : NavDestination()
    data object Tips : NavDestination()
    data class BasicGroups(val categoryId: String) : NavDestination()
    data class CommandDetail(val commandName: String) : NavDestination()
}

@Composable
fun App(initialDeeplink: String? = null) {
    val reviewHandler: ReviewHandler = koinInject()
    LaunchedEffect(Unit) {
        reviewHandler.incrementAppStartCount()
        reviewHandler.requestReviewIfNeeded()
    }

    LinuxTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            // Status bar area with primary color
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .windowInsetsTopHeight(WindowInsets.safeDrawing)
                    .background(MaterialTheme.colors.primary),
            )
            // Main content
            Box(modifier = Modifier.weight(1f)) {
                LinuxApp(initialDeeplink = initialDeeplink)
            }
            // Navigation bar area with white/surface color
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .windowInsetsBottomHeight(WindowInsets.safeDrawing)
                    .background(LocalCustomColors.current.navBarBackground),
            )
        }
    }
}

@Composable
fun LinuxApp(initialDeeplink: String? = null) {
    val initialDestination = remember(initialDeeplink) {
        parseDeeplink(initialDeeplink) ?: NavDestination.Basics
    }
    var currentDestination by remember { mutableStateOf<NavDestination>(initialDestination) }
    val navigationStack = remember { mutableListOf<NavDestination>() }
    val searchTextValue = rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue(text = "", selection = TextRange(0)))
    }
    val showSearch = rememberSaveable { mutableStateOf(false) }

    val onNavigate: (String) -> Unit = remember {
        { route ->
            val dest = parseRoute(route)
            if (dest != null) {
                navigationStack.add(currentDestination)
                currentDestination = dest
            }
        }
    }

    val onNavigateBack: () -> Unit = remember {
        {
            if (navigationStack.isNotEmpty()) {
                currentDestination = navigationStack.removeAt(navigationStack.lastIndex)
            }
        }
    }

    val resetSearch: () -> Unit = remember {
        {
            searchTextValue.value = TextFieldValue(text = "", selection = TextRange(0))
            showSearch.value = false
        }
    }

    // Create CommandDetailViewModel at this level so it can be shared between TopBar and Screen
    val commandDetailViewModel: CommandDetailViewModel? = when (val dest = currentDestination) {
        is NavDestination.CommandDetail -> koinInject { parametersOf(dest.commandName) }
        else -> null
    }

    Scaffold(
        topBar = {
            when (val dest = currentDestination) {
                NavDestination.Commands, NavDestination.Basics -> {
                    SearchTopBar(
                        title = getTitleForDestination(currentDestination),
                        textFieldValue = searchTextValue,
                        isSearchVisible = showSearch.value,
                        hideSearch = { showSearch.value = false },
                        showSearch = { showSearch.value = true },
                    )
                }

                is NavDestination.CommandDetail -> {
                    commandDetailViewModel?.let { viewModel ->
                        DetailTopBar(
                            commandName = dest.commandName,
                            viewModel = viewModel,
                            onNavigateBack = onNavigateBack,
                        )
                    }
                }

                else -> {
                    val showBackIcon = currentDestination != NavDestination.Tips
                    val showAppInfoIcon = currentDestination == NavDestination.Tips
                    GenericTopBar(
                        title = getTitleForDestination(currentDestination),
                        showBackIcon = showBackIcon,
                        onNavigateBack = onNavigateBack,
                        showAppInfoIcon = showAppInfoIcon,
                    )
                }
            }
        },
        bottomBar = {
            BottomBar(
                currentDestination = currentDestination,
                onSelectTab = { dest ->
                    // Clear navigation stack when switching tabs
                    navigationStack.clear()
                    currentDestination = dest
                    resetSearch()
                },
            )
        },
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            when (val dest = currentDestination) {
                NavDestination.Basics -> {
                    val viewModel: BasicCategoriesViewModel = koinInject()
                    BasicCategoriesScreen(viewModel = viewModel, onNavigate = onNavigate)
                }

                NavDestination.Commands -> {
                    val viewModel: CommandListViewModel = koinInject()
                    CommandListScreen(viewModel = viewModel, onNavigate = onNavigate)
                }

                NavDestination.Tips -> {
                    val viewModel: TipsViewModel = koinInject()
                    TipsScreen(viewModel = viewModel, onNavigate = onNavigate)
                }

                is NavDestination.BasicGroups -> {
                    val viewModel: BasicGroupsViewModel = koinInject { parametersOf(dest.categoryId) }
                    BasicGroupsScreen(viewModel = viewModel, onNavigate = onNavigate)
                }

                is NavDestination.CommandDetail -> {
                    commandDetailViewModel?.let { viewModel ->
                        CommandDetailScreen(viewModel = viewModel, onNavigate = onNavigate)
                    }
                }
            }

            val isSearchVisible by remember(searchTextValue) {
                derivedStateOf {
                    searchTextValue.value.text.isNotEmpty() && currentDestination !is NavDestination.CommandDetail
                }
            }
            AnimatedVisibility(
                visible = isSearchVisible,
                enter = fadeIn(animationSpec = tween(300)),
                exit = fadeOut(animationSpec = tween(durationMillis = 300, delayMillis = 300)),
            ) {
                Box(modifier = Modifier.fillMaxSize().background(MaterialTheme.colors.background)) {
                    val searchViewModel: SearchViewModel = koinInject()
                    SearchScreen(
                        searchText = searchTextValue.value.text,
                        viewModel = searchViewModel,
                        onNavigate = onNavigate,
                    )
                }
            }
        }
    }
}

private fun parseRoute(route: String): NavDestination? = when {
    route == "basics" -> NavDestination.Basics

    route == "commands" -> NavDestination.Commands

    route == "tips" -> NavDestination.Tips

    route.startsWith("basicgroups?") -> {
        val categoryId = route.substringAfter("categoryId=").substringBefore("&")
        NavDestination.BasicGroups(categoryId)
    }

    route.startsWith("command?") -> {
        val commandName = route.substringAfter("commandName=")
        NavDestination.CommandDetail(commandName)
    }

    else -> null
}

private fun parseDeeplink(url: String?): NavDestination? {
    if (url == null) return null
    
    return when {
        url.endsWith("/basics.html") || url.endsWith("/basics") -> NavDestination.Basics
        url.endsWith("/tips.html") || url.endsWith("/tips") -> NavDestination.Tips
        url.contains("/man/") -> {
            val commandName = url.substringAfterLast("/man/").removeSuffix(".html")
            NavDestination.CommandDetail(commandName)
        }
        url.contains("/basic/") -> {
            val categoryId = url.substringAfterLast("/basic/").removeSuffix(".html")
            NavDestination.BasicGroups(categoryId)
        }
        url.endsWith("/") || url.endsWith("/index.html") -> NavDestination.Commands
        else -> null
    }
}

@Composable
private fun getTitleForDestination(dest: NavDestination): String = when (dest) {
    NavDestination.Basics -> "Basics"

    NavDestination.Commands -> "Commands"

    NavDestination.Tips -> "Tips"

    is NavDestination.BasicGroups -> {
        val basicsRepository: BasicsRepository = koinInject()
        val categories = basicsRepository.getCategories()
        val category = categories.firstOrNull { it.id == dest.categoryId }
        category?.title ?: "Not found"
    }

    is NavDestination.CommandDetail -> dest.commandName
}

@Composable
private fun GenericTopBar(
    title: String,
    showBackIcon: Boolean,
    onNavigateBack: () -> Unit,
    showAppInfoIcon: Boolean,
) {
    var showDialog by remember { mutableStateOf(false) }

    TopAppBar(
        title = {
            Text(
                title,
                modifier = Modifier.semantics { contentDescription = "TopAppBarTitle" },
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        },
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = Color.White,
        navigationIcon = if (showBackIcon) {
            {
                IconButton(
                    modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                    onClick = onNavigateBack,
                ) {
                    Icon(
                        imageVector = backIcon,
                        contentDescription = "Back",
                    )
                }
            }
        } else {
            null
        },
        actions = {
            if (showAppInfoIcon) {
                IconButton(
                    modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                    onClick = { showDialog = true },
                ) {
                    Icon(
                        imageVector = Icons.Filled.Info,
                        contentDescription = "Info",
                    )
                }
            }
        },
    )
    if (showDialog) {
        AppInfoDialog(onDismiss = { showDialog = false })
    }
}

@Composable
private fun DetailTopBar(
    commandName: String,
    viewModel: CommandDetailViewModel,
    onNavigateBack: () -> Unit,
) {
    val uiState by viewModel.state.collectAsState()
    val isAllExpanded by remember { derivedStateOf { uiState.isAllExpanded() } }

    val expandAllPainter = rememberIconPainter(AppIcon.EXPAND_ALL)
    val collapseAllPainter = rememberIconPainter(AppIcon.COLLAPSE_ALL)
    val bookmarkPainter = rememberIconPainter(AppIcon.BOOKMARK)
    val bookmarkBorderPainter = rememberIconPainter(AppIcon.BOOKMARK_BORDER)

    TopAppBar(
        title = {
            Text(
                commandName,
                modifier = Modifier.semantics { contentDescription = "TopAppBarTitle" },
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        },
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = Color.White,
        navigationIcon = {
            IconButton(
                modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                onClick = onNavigateBack,
            ) {
                Icon(
                    imageVector = backIcon,
                    contentDescription = "Back",
                )
            }
        },
        actions = {
            IconButton(
                modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                onClick = { viewModel.onToggleAllExpanded() },
            ) {
                val painter = if (isAllExpanded) collapseAllPainter else expandAllPainter
                Icon(
                    painter = painter,
                    contentDescription = if (isAllExpanded) "Collapse all" else "Expand all",
                )
            }
            IconButton(
                modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                onClick = {
                    if (uiState.isBookmarked) viewModel.removeBookmark() else viewModel.addBookmark()
                },
            ) {
                val painter = if (uiState.isBookmarked) bookmarkPainter else bookmarkBorderPainter
                Icon(
                    painter = painter,
                    contentDescription = if (uiState.isBookmarked) "Remove bookmark" else "Add bookmark",
                )
            }
        },
    )

    if (uiState.showBookmarkDialog) {
        BookmarkFeedbackDialog(onDismiss = { viewModel.hideBookmarkDialog() })
    }
}

@Composable
private fun SearchTopBar(
    title: String,
    textFieldValue: MutableState<TextFieldValue>,
    isSearchVisible: Boolean,
    hideSearch: () -> Unit,
    showSearch: () -> Unit,
) {
    val focusRequester = remember { FocusRequester() }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.primary)
            .heightIn(min = 56.dp)
            .padding(horizontal = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (isSearchVisible) {
            IconButton(
                modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                onClick = {
                    hideSearch()
                    textFieldValue.value = TextFieldValue("")
                },
            ) {
                Icon(
                    imageVector = backIcon,
                    contentDescription = "Back",
                    tint = Color.White,
                )
            }
            OutlinedTextField(
                value = textFieldValue.value,
                onValueChange = { textFieldValue.value = it },
                modifier = Modifier
                    .weight(1f)
                    .focusRequester(focusRequester)
                    .padding(start = 8.dp, end = 8.dp),
                placeholder = { Text("Search...", color = Color.White.copy(alpha = 0.7f)) },
                textStyle = MaterialTheme.typography.subtitle1.copy(color = Color.White),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    textColor = Color.White,
                    cursorColor = Color.White,
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent,
                    disabledBorderColor = Color.Transparent,
                    backgroundColor = Color.Transparent,
                    trailingIconColor = LocalContentColor.current.copy(alpha = LocalContentAlpha.current),
                    placeholderColor = LocalContentColor.current.copy(alpha = 0.7f),
                ),
                maxLines = 1,
                singleLine = true,
            )
            if (textFieldValue.value.text.isNotEmpty()) {
                IconButton(
                    modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                    onClick = { textFieldValue.value = TextFieldValue("") },
                ) {
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = "Clear",
                        tint = Color.White,
                    )
                }
            }
        } else {
            Text(
                title,
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
                    .semantics { contentDescription = "TopAppBarTitle" },
                style = MaterialTheme.typography.h6.copy(color = LocalContentColor.current),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                color = Color.White,
            )
            IconButton(
                modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                onClick = showSearch,
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search",
                    tint = Color.White,
                )
            }
        }
    }

    LaunchedEffect(isSearchVisible) {
        if (isSearchVisible) {
            focusRequester.requestFocus()
        }
    }
}

@Composable
private fun BottomBar(
    currentDestination: NavDestination,
    onSelectTab: (NavDestination) -> Unit,
) {
    BottomNavigation(
        backgroundColor = LocalCustomColors.current.navBarBackground,
        elevation = 0.dp,
    ) {
        bottomBarItems.forEach { screen ->
            val painter = rememberIconPainter(screen.icon)
            val isSelected = when (screen) {
                Screen.Basics ->
                    currentDestination == NavDestination.Basics ||
                        currentDestination is NavDestination.BasicGroups

                Screen.Commands -> currentDestination == NavDestination.Commands

                Screen.Tips -> currentDestination == NavDestination.Tips
            }
            BottomNavigationItem(
                modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                icon = {
                    Icon(
                        painter = painter,
                        contentDescription = null,
                        modifier = Modifier.size(24.dp),
                    )
                },
                label = { Text(screen.titleRes) },
                selected = isSelected,
                selectedContentColor = MaterialTheme.colors.primary,
                unselectedContentColor = MaterialTheme.colors.onSurface,
                onClick = {
                    val dest = when (screen) {
                        Screen.Basics -> NavDestination.Basics
                        Screen.Commands -> NavDestination.Commands
                        Screen.Tips -> NavDestination.Tips
                    }
                    onSelectTab(dest)
                },
            )
        }
    }
}
