package com.linuxcommandlibrary.app.ui.screens.commanddetail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
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
import com.linuxcommandlibrary.app.ui.composables.AutoSizeText
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
    var activeMatchIndex by remember { mutableIntStateOf(0) }

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
            val expandLabel = if (isAllExpanded) "Collapse all" else "Expand all"
            val bookmarkLabel = if (uiState.isBookmarked) "Remove bookmark" else "Add bookmark"
            val onToggleExpand = { viewModel.onToggleAllExpanded() }
            val onToggleBookmark = {
                if (uiState.isBookmarked) viewModel.removeBookmark() else viewModel.addBookmark()
            }
            BoxWithConstraints {
                // Three action icons plus the back button eat 192dp. On a narrow pane - a phone at
                // the largest display size is only ~274dp - that left the command name a 40dp
                // sliver, so the two secondary actions move into an overflow menu.
                val useOverflow = maxWidth < 360.dp
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
                        if (useOverflow) {
                            var menuExpanded by remember { mutableStateOf(false) }
                            Box {
                                IconButton(
                                    modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                                    onClick = { menuExpanded = true },
                                ) {
                                    Icon(
                                        imageVector = AppIcons.MoreVert,
                                        contentDescription = "More options",
                                    )
                                }
                                DropdownMenu(
                                    expanded = menuExpanded,
                                    onDismissRequest = { menuExpanded = false },
                                ) {
                                    DropdownMenuItem(
                                        text = { Text(expandLabel) },
                                        leadingIcon = { Icon(painter = expandPainter, contentDescription = null) },
                                        onClick = {
                                            menuExpanded = false
                                            onToggleExpand()
                                        },
                                    )
                                    DropdownMenuItem(
                                        text = { Text(bookmarkLabel) },
                                        leadingIcon = { Icon(painter = bookmarkPainter, contentDescription = null) },
                                        onClick = {
                                            menuExpanded = false
                                            onToggleBookmark()
                                        },
                                    )
                                }
                            }
                        } else {
                            IconButton(
                                modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                                onClick = onToggleExpand,
                            ) {
                                Icon(painter = expandPainter, contentDescription = expandLabel)
                            }
                            IconButton(
                                modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                                onClick = onToggleBookmark,
                            ) {
                                Icon(painter = bookmarkPainter, contentDescription = bookmarkLabel)
                            }
                        }
                    },
                )
            }
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
@OptIn(ExperimentalComposeUiApi::class)
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

    val textStyle = MaterialTheme.typography.bodyLarge.copy(
        color = MaterialTheme.colorScheme.onSurface,
    )
    val closeButton: @Composable () -> Unit = {
        IconButton(
            modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
            onClick = onClose,
        ) {
            Icon(imageVector = backIcon, contentDescription = "Close search")
        }
    }
    val queryField: @Composable (Modifier) -> Unit = { fieldModifier ->
        BasicTextField(
            value = searchState.currentValue,
            onValueChange = { searchState.updateText(it) },
            modifier = fieldModifier.focusRequester(textFieldFocus),
            singleLine = true,
            textStyle = textStyle,
            cursorBrush = SolidColor(MaterialTheme.colorScheme.primary),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(onSearch = { onNext() }),
            decorationBox = { innerTextField ->
                Box(contentAlignment = Alignment.CenterStart) {
                    if (searchState.searchText.isEmpty()) {
                        AutoSizeText(
                            text = "Search in page",
                            style = textStyle,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                    }
                    innerTextField()
                }
            },
        )
    }
    val matchControls: @Composable () -> Unit = {
        AutoSizeText(
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
    }

    // A Row rather than a TopAppBar so the query field can take the width the controls leave over
    // - TopAppBar sizes its title slot independently, which squeezed the field to about two
    // visible characters. On a narrow pane even the leftovers are too little, so the counter and
    // the arrows drop to a second row.
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.surface,
        contentColor = MaterialTheme.colorScheme.onSurface,
    ) {
        BoxWithConstraints {
            if (maxWidth < 360.dp) {
                Column(modifier = Modifier.padding(horizontal = 4.dp, vertical = 4.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        closeButton()
                        queryField(Modifier.weight(1f).padding(horizontal = 4.dp))
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        matchControls()
                    }
                }
            } else {
                Row(
                    modifier = Modifier
                        .heightIn(min = 56.dp)
                        .padding(horizontal = 4.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    closeButton()
                    queryField(Modifier.weight(1f).padding(horizontal = 4.dp))
                    matchControls()
                }
            }
        }
    }
}
