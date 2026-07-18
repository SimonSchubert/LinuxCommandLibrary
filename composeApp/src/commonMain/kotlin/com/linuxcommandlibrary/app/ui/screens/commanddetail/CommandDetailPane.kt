package com.linuxcommandlibrary.app.ui.screens.commanddetail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.backhandler.BackHandler
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.app.platform.backIcon
import com.linuxcommandlibrary.app.ui.AppIcons
import com.linuxcommandlibrary.app.ui.composables.AppIcon
import com.linuxcommandlibrary.app.ui.composables.MatchIndex
import com.linuxcommandlibrary.app.ui.composables.PaneTopBar
import com.linuxcommandlibrary.app.ui.composables.SearchState
import com.linuxcommandlibrary.app.ui.composables.rememberIconPainter
import com.linuxcommandlibrary.app.ui.composables.rememberSearchState
import org.koin.compose.currentKoinScope
import org.koin.core.parameter.parametersOf

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun CommandDetailPane(
    commandName: String,
    onBack: () -> Unit,
    onNavigate: (NavEvent) -> Unit,
) {
    val koinScope = currentKoinScope()
    val viewModel = remember(commandName, koinScope) {
        koinScope.get<CommandDetailViewModel> { parametersOf(commandName) }
    }
    val uiState by viewModel.state.collectAsState()
    val isAllExpanded = uiState.isAllExpanded()
    val expandPainter = rememberIconPainter(
        if (isAllExpanded) AppIcon.COLLAPSE_ALL else AppIcon.EXPAND_ALL,
    )
    val bookmarkPainter = rememberIconPainter(
        if (uiState.isBookmarked) AppIcon.BOOKMARK else AppIcon.BOOKMARK_BORDER,
    )

    val searchState = rememberSearchState()
    var matchIndex by remember { mutableStateOf(MatchIndex.EMPTY) }
    var activeMatchIndex by remember { mutableStateOf(0) }

    // This composable keeps its identity when the selected command changes, so the search would
    // otherwise stay open holding a query matched against the previous page.
    LaunchedEffect(commandName) {
        searchState.clear()
        matchIndex = MatchIndex.EMPTY
        activeMatchIndex = 0
    }
    LaunchedEffect(searchState.searchText) {
        activeMatchIndex = 0
    }

    // Deprecated in CMP 1.11 in favor of androidx.navigationevent's NavigationEventHandler, but
    // that reads LocalNavigationEventDispatcherOwner, which CMP only wires up via its internal
    // compat local that this BackHandler uses - migrating would throw on desktop/iOS. Revisit
    // once CMP provides the public local (see JetBrains/compose-multiplatform).
    // Nested inside the app-level handler in App.kt; Compose routes back to the innermost
    // enabled one, so back closes the search before it pops the pane.
    @Suppress("DEPRECATION")
    BackHandler(enabled = searchState.isVisible) { searchState.clear() }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface),
    ) {
        if (searchState.isVisible) {
            CommandSearchTopBar(
                searchState = searchState,
                matchCount = matchIndex.size,
                activeMatchIndex = activeMatchIndex,
                onPrevious = {
                    if (matchIndex.size > 0) {
                        activeMatchIndex = (activeMatchIndex - 1 + matchIndex.size) % matchIndex.size
                    }
                },
                onNext = {
                    if (matchIndex.size > 0) {
                        activeMatchIndex = (activeMatchIndex + 1) % matchIndex.size
                    }
                },
                onClose = { searchState.clear() },
            )
        } else {
            PaneTopBar(
                title = commandName,
                onBack = onBack,
                actions = {
                    IconButton(
                        modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                        onClick = {
                            searchState.show()
                            searchState.requestFocus()
                        },
                    ) {
                        Icon(
                            imageVector = AppIcons.Search,
                            contentDescription = "Search in page",
                        )
                    }
                    IconButton(
                        modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                        onClick = { viewModel.onToggleAllExpanded() },
                    ) {
                        Icon(
                            painter = expandPainter,
                            contentDescription = if (isAllExpanded) "Collapse all" else "Expand all",
                        )
                    }
                    IconButton(
                        modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                        onClick = {
                            if (uiState.isBookmarked) viewModel.removeBookmark() else viewModel.addBookmark()
                        },
                    ) {
                        Icon(
                            painter = bookmarkPainter,
                            contentDescription = if (uiState.isBookmarked) "Remove bookmark" else "Add bookmark",
                        )
                    }
                },
            )
        }
        CommandDetailScreen(
            viewModel = viewModel,
            onNavigate = onNavigate,
            searchQuery = searchState.searchText,
            activeMatchIndex = activeMatchIndex,
            onMatchIndexChange = { matchIndex = it },
        )
    }
}

/**
 * Replaces the title bar while a find-in-page is running: query field, match counter and
 * prev/next. Expand-all and bookmark are dropped for the duration - there is no room on a phone,
 * and expand-all is meaningless while search force-expands every section anyway.
 */
@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
private fun CommandSearchTopBar(
    searchState: SearchState,
    matchCount: Int,
    activeMatchIndex: Int,
    onPrevious: () -> Unit,
    onNext: () -> Unit,
    onClose: () -> Unit,
) {
    val textFieldFocus = remember { FocusRequester() }
    val keyboardController = LocalSoftwareKeyboardController.current
    LaunchedEffect(searchState.focusEpoch) {
        if (searchState.focusEpoch > 0) {
            textFieldFocus.requestFocus()
            keyboardController?.show()
        }
    }

    TopAppBar(
        expandedHeight = 56.dp,
        title = {
            val textStyle = MaterialTheme.typography.bodyLarge.copy(
                color = MaterialTheme.colorScheme.onSurface,
            )
            BasicTextField(
                value = searchState.currentValue,
                onValueChange = { searchState.updateText(it) },
                modifier = Modifier
                    .fillMaxWidth()
                    .focusRequester(textFieldFocus),
                singleLine = true,
                textStyle = textStyle,
                cursorBrush = SolidColor(MaterialTheme.colorScheme.primary),
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
                keyboardActions = KeyboardActions(onSearch = { onNext() }),
                decorationBox = { innerTextField ->
                    Box(contentAlignment = Alignment.CenterStart) {
                        if (searchState.searchText.isEmpty()) {
                            Text(
                                text = "Search in page",
                                style = textStyle,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                            )
                        }
                        innerTextField()
                    }
                },
            )
        },
        navigationIcon = {
            IconButton(
                modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                onClick = onClose,
            ) {
                Icon(imageVector = backIcon, contentDescription = "Close search")
            }
        },
        actions = {
            Text(
                text = if (matchCount == 0) "0/0" else "${activeMatchIndex + 1}/$matchCount",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.padding(horizontal = 4.dp),
            )
            IconButton(
                modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                onClick = onPrevious,
                enabled = matchCount > 0,
            ) {
                Icon(
                    imageVector = AppIcons.ExpandMore,
                    contentDescription = "Previous match",
                    modifier = Modifier.graphicsLayer { rotationZ = 180f },
                )
            }
            IconButton(
                modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                onClick = onNext,
                enabled = matchCount > 0,
            ) {
                Icon(
                    imageVector = AppIcons.ExpandMore,
                    contentDescription = "Next match",
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.surface,
            titleContentColor = MaterialTheme.colorScheme.onSurface,
            navigationIconContentColor = MaterialTheme.colorScheme.onSurface,
            actionIconContentColor = MaterialTheme.colorScheme.onSurface,
        ),
        windowInsets = WindowInsets(0, 0, 0, 0),
    )
}
