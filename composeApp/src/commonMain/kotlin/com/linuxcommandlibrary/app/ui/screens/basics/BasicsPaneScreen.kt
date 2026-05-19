package com.linuxcommandlibrary.app.ui.screens.basics

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.app.data.BasicsRepository
import com.linuxcommandlibrary.app.nav.TabStackEntry
import com.linuxcommandlibrary.app.nav.TabStackEntryContent
import com.linuxcommandlibrary.app.resources.Res
import com.linuxcommandlibrary.app.resources.search
import com.linuxcommandlibrary.app.resources.select_a_category
import com.linuxcommandlibrary.app.ui.composables.InlineSearchField
import com.linuxcommandlibrary.app.ui.composables.PaneTopBar
import com.linuxcommandlibrary.app.ui.composables.SearchOverlayBox
import com.linuxcommandlibrary.app.ui.composables.SearchState
import com.linuxcommandlibrary.app.ui.screens.basiccategories.BasicCategoriesScreen
import com.linuxcommandlibrary.app.ui.screens.basiccategories.BasicCategoriesViewModel
import com.linuxcommandlibrary.app.ui.screens.basicgroups.BasicEditorScreen
import com.linuxcommandlibrary.app.ui.screens.basicgroups.BasicEditorViewModel
import com.linuxcommandlibrary.app.ui.screens.basicgroups.BasicGroupsScreen
import com.linuxcommandlibrary.app.ui.screens.basicgroups.BasicGroupsViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.currentKoinScope
import org.koin.compose.koinInject
import org.koin.core.parameter.parametersOf

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
internal fun BasicsPaneScreen(
    navigator: ThreePaneScaffoldNavigator<String>,
    searchState: SearchState,
    pendingSelection: String?,
    onSelectionConsumed: () -> Unit,
    pendingExpandGroupId: Long?,
    onExpandConsumed: () -> Unit,
    scope: CoroutineScope,
    onNavigate: (NavEvent) -> Unit,
    stack: SnapshotStateList<TabStackEntry>,
    onPopStack: () -> Unit,
    lastBasicsGroupId: Long?,
    isExpanded: Boolean,
) {
    val categoriesViewModel: BasicCategoriesViewModel = koinInject()
    val basicsRepository: BasicsRepository = koinInject()

    val categories by categoriesViewModel.basicCategories.collectAsState()

    LaunchedEffect(pendingSelection) {
        val id = pendingSelection ?: return@LaunchedEffect
        navigator.navigateTo(ListDetailPaneScaffoldRole.Detail, id)
        onSelectionConsumed()
    }

    // Two-pane layouts: pre-select the first category once data loads so the detail
    // pane shows real content instead of an empty placeholder.
    LaunchedEffect(isExpanded) {
        if (!isExpanded) return@LaunchedEffect
        val list = categoriesViewModel.basicCategories.first { it.isNotEmpty() }
        if (navigator.currentDestination?.contentKey == null &&
            stack.isEmpty() &&
            pendingSelection == null
        ) {
            navigator.navigateTo(ListDetailPaneScaffoldRole.Detail, list.first().id)
        }
    }

    val stackTop = stack.lastOrNull()
    val selectedId = when (stackTop) {
        is TabStackEntry.BasicGroup -> stackTop.categoryId
        is TabStackEntry.Command -> null
        null -> navigator.currentDestination?.contentKey
    }
    val selectedSearchCommandName = (stackTop as? TabStackEntry.Command)?.name
    // Falls back to lastBasicsGroupId because the basicsNavigator path clears
    // pendingExpandGroupId on consume, leaving no other stable id to match.
    val selectedSearchBasicGroupId = (stackTop as? TabStackEntry.BasicGroup)?.expandGroupId
        ?: lastBasicsGroupId

    // Hoisted so the grid keeps its scroll position across AnimatedPane's exit/enter cycle.
    val gridState = rememberLazyGridState()

    ListDetailPaneScaffold(
        directive = navigator.scaffoldDirective,
        scaffoldState = navigator.scaffoldState,
        listPane = {
            AnimatedPane(
                enterTransition = EnterTransition.None,
                exitTransition = ExitTransition.None,
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
                        selectedCommandName = selectedSearchCommandName,
                        selectedBasicGroupId = selectedSearchBasicGroupId,
                    ) {
                        BasicCategoriesScreen(
                            viewModel = categoriesViewModel,
                            gridState = gridState,
                            onNavigate = onNavigate,
                            selectedId = selectedId,
                        )
                    }
                }
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
                    val navSelectedId = navigator.currentDestination?.contentKey
                    if (navSelectedId == null) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(MaterialTheme.colorScheme.surface),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = stringResource(Res.string.select_a_category),
                                style = MaterialTheme.typography.bodyLarge,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                            )
                        }
                    } else {
                        val koinScope = currentKoinScope()
                        val usesCardLayout = basicsRepository.usesCardLayout(navSelectedId)
                        val selectedTitle = categories.firstOrNull { it.id == navSelectedId }?.title.orEmpty()
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(MaterialTheme.colorScheme.surface),
                        ) {
                            PaneTopBar(
                                title = selectedTitle,
                                onBack = {
                                    scope.launch {
                                        navigator.navigateBack(BackNavigationBehavior.PopUntilContentChange)
                                    }
                                },
                            )
                            if (usesCardLayout) {
                                val editorViewModel = remember(navSelectedId, koinScope) {
                                    koinScope.get<BasicEditorViewModel> { parametersOf(navSelectedId) }
                                }
                                BasicEditorScreen(viewModel = editorViewModel, onNavigate = onNavigate)
                                // Card-layout categories have no collapsible groups; drop the
                                // pending id so it doesn't trigger on a later non-card visit.
                                LaunchedEffect(pendingExpandGroupId, navSelectedId) {
                                    if (pendingExpandGroupId != null) onExpandConsumed()
                                }
                            } else {
                                val groupsViewModel = remember(navSelectedId, koinScope) {
                                    koinScope.get<BasicGroupsViewModel> { parametersOf(navSelectedId) }
                                }
                                BasicGroupsScreen(
                                    viewModel = groupsViewModel,
                                    onNavigate = onNavigate,
                                    focusGroupId = pendingExpandGroupId,
                                    onFocusConsumed = onExpandConsumed,
                                )
                            }
                        }
                    }
                }
            }
        },
    )
}
