package com.linuxcommandlibrary.app.ui.screens.commands

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.layout.AnimatedPane
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffold
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffoldRole
import androidx.compose.material3.adaptive.navigation.BackNavigationBehavior
import androidx.compose.material3.adaptive.navigation.ThreePaneScaffoldNavigator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.app.nav.TabStackEntry
import com.linuxcommandlibrary.app.nav.TabStackEntryContent
import com.linuxcommandlibrary.app.resources.Res
import com.linuxcommandlibrary.app.resources.search
import com.linuxcommandlibrary.app.resources.select_a_command
import com.linuxcommandlibrary.app.ui.composables.InlineSearchField
import com.linuxcommandlibrary.app.ui.composables.SearchOverlayBox
import com.linuxcommandlibrary.app.ui.composables.SearchState
import com.linuxcommandlibrary.app.ui.screens.commanddetail.CommandDetailPane
import com.linuxcommandlibrary.app.ui.screens.commandlist.CommandListScreen
import com.linuxcommandlibrary.app.ui.screens.commandlist.CommandListViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.koinInject

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
internal fun CommandsPaneScreen(
    navigator: ThreePaneScaffoldNavigator<String>,
    searchState: SearchState,
    pendingSelection: String?,
    onSelectionConsumed: () -> Unit,
    scope: CoroutineScope,
    onNavigate: (NavEvent) -> Unit,
    stack: SnapshotStateList<TabStackEntry>,
    onPopStack: () -> Unit,
    isExpanded: Boolean,
) {
    val listViewModel: CommandListViewModel = koinInject()

    LaunchedEffect(pendingSelection) {
        val name = pendingSelection ?: return@LaunchedEffect
        navigator.navigateTo(ListDetailPaneScaffoldRole.Detail, name)
        onSelectionConsumed()
    }

    // Two-pane layouts: pre-select the first command once data loads so the detail
    // pane shows real content instead of an empty placeholder. Compact (single-pane)
    // skips this — auto-pushing to detail on launch would be jarring.
    LaunchedEffect(isExpanded) {
        if (!isExpanded) return@LaunchedEffect
        val list = listViewModel.commands.first { it.isNotEmpty() }
        if (navigator.currentDestination?.contentKey == null &&
            stack.isEmpty() &&
            pendingSelection == null
        ) {
            navigator.navigateTo(ListDetailPaneScaffoldRole.Detail, list.first().name)
        }
    }

    // Hoisted so the LazyColumn keeps its scroll position across AnimatedPane's
    // exit/enter cycle. Without hoisting, the pane content's nested rememberSaveable was
    // intermittently coerced to 0 on re-mount because the bookmark-driven sort re-emits
    // the commands list.
    val listState = rememberLazyListState()

    val stackTop = stack.lastOrNull()
    val selectedName = when (stackTop) {
        is TabStackEntry.Command -> stackTop.name
        is TabStackEntry.BasicGroup -> null
        null -> navigator.currentDestination?.contentKey
    }
    // Basic-groups only land on Commands via the stack, so it's the only source.
    val selectedSearchBasicGroupId = (stackTop as? TabStackEntry.BasicGroup)?.expandGroupId

    ListDetailPaneScaffold(
        directive = navigator.scaffoldDirective,
        scaffoldState = navigator.scaffoldState,
        listPane = {
            AnimatedPane(
                enterTransition = EnterTransition.None,
                exitTransition = ExitTransition.None,
            ) {
                CommandsListPane(
                    listViewModel = listViewModel,
                    listState = listState,
                    searchState = searchState,
                    selectedName = selectedName,
                    selectedSearchBasicGroupId = selectedSearchBasicGroupId,
                    onNavigate = onNavigate,
                )
            }
        },
        detailPane = {
            AnimatedPane(
                enterTransition = EnterTransition.None,
                exitTransition = ExitTransition.None,
            ) {
                if (stackTop != null) {
                    TabStackEntryContent(entry = stackTop, onBack = onPopStack, onNavigate = onNavigate)
                } else {
                    val selected = navigator.currentDestination?.contentKey
                    if (selected == null) {
                        EmptyDetailPlaceholder(stringResource(Res.string.select_a_command))
                    } else {
                        CommandDetailPane(
                            commandName = selected,
                            onBack = {
                                scope.launch {
                                    navigator.navigateBack(BackNavigationBehavior.PopUntilContentChange)
                                }
                            },
                            onNavigate = onNavigate,
                        )
                    }
                }
            }
        },
    )
}

@Composable
private fun CommandsListPane(
    listViewModel: CommandListViewModel,
    listState: LazyListState,
    searchState: SearchState,
    selectedName: String?,
    selectedSearchBasicGroupId: Long?,
    onNavigate: (NavEvent) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface),
    ) {
        InlineSearchField(searchState = searchState, placeholder = stringResource(Res.string.search))
        SearchOverlayBox(
            searchState = searchState,
            onNavigate = onNavigate,
            selectedCommandName = selectedName,
            selectedBasicGroupId = selectedSearchBasicGroupId,
        ) {
            CommandListScreen(
                viewModel = listViewModel,
                listState = listState,
                onNavigate = onNavigate,
                selectedName = selectedName,
            )
        }
    }
}

@Composable
private fun EmptyDetailPlaceholder(text: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )
    }
}
