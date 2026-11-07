package com.linuxcommandlibrary.app.ui.screens.basicgroups

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.app.data.BasicsRepository
import com.linuxcommandlibrary.app.ui.composables.PaneTopBar
import com.linuxcommandlibrary.app.ui.screens.basiccategories.BasicCategoriesViewModel
import org.koin.compose.currentKoinScope
import org.koin.compose.koinInject
import org.koin.core.parameter.parametersOf

@Composable
fun BasicGroupDetailPane(
    categoryId: String,
    expandGroupId: Long?,
    onBack: () -> Unit,
    onNavigate: (NavEvent) -> Unit,
) {
    val categoriesViewModel: BasicCategoriesViewModel = koinInject()
    val categories by categoriesViewModel.basicCategories.collectAsState()
    var focusedGroupId by remember(categoryId) { mutableStateOf(expandGroupId) }

    BasicCategoryDetail(
        categoryId = categoryId,
        title = categories.firstOrNull { it.id == categoryId }?.title.orEmpty(),
        onBack = onBack,
        onNavigate = onNavigate,
        focusGroupId = focusedGroupId,
        onFocusConsumed = { focusedGroupId = null },
    )
}

/**
 * A basics category's detail: top bar plus either the card grid or the collapsible groups.
 * Shared by the stack entry ([BasicGroupDetailPane]) and the Basics tab's detail pane.
 */
@Composable
fun BasicCategoryDetail(
    categoryId: String,
    title: String,
    onBack: () -> Unit,
    onNavigate: (NavEvent) -> Unit,
    focusGroupId: Long?,
    onFocusConsumed: () -> Unit,
) {
    val basicsRepository: BasicsRepository = koinInject()
    val koinScope = currentKoinScope()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface),
    ) {
        PaneTopBar(title = title, onBack = onBack)
        if (basicsRepository.usesCardLayout(categoryId)) {
            val editorViewModel = remember(categoryId, koinScope) {
                koinScope.get<BasicEditorViewModel> { parametersOf(categoryId) }
            }
            BasicEditorScreen(viewModel = editorViewModel, onNavigate = onNavigate)
            // Card-layout categories have no collapsible groups; drop the pending id so it
            // doesn't trigger on a later non-card visit.
            LaunchedEffect(focusGroupId, categoryId) {
                if (focusGroupId != null) onFocusConsumed()
            }
        } else {
            val groupsViewModel = remember(categoryId, koinScope) {
                koinScope.get<BasicGroupsViewModel> { parametersOf(categoryId) }
            }
            BasicGroupsScreen(
                viewModel = groupsViewModel,
                onNavigate = onNavigate,
                focusGroupId = focusGroupId,
                onFocusConsumed = onFocusConsumed,
            )
        }
    }
}
