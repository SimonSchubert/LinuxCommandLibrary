package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.app.ui.screens.search.SearchScreen
import com.linuxcommandlibrary.app.ui.screens.search.SearchViewModel
import org.koin.compose.koinInject

@Composable
fun SearchOverlayBox(
    searchState: SearchState,
    onNavigate: (NavEvent) -> Unit,
    modifier: Modifier = Modifier,
    selectedCommandName: String? = null,
    selectedBasicGroupId: Long? = null,
    content: @Composable () -> Unit,
) {
    Box(modifier = modifier.fillMaxSize()) {
        content()
        if (searchState.searchText.isNotEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.surface),
            ) {
                val searchViewModel: SearchViewModel = koinInject()
                SearchScreen(
                    searchText = searchState.searchText,
                    viewModel = searchViewModel,
                    onNavigate = onNavigate,
                    selectedCommandName = selectedCommandName,
                    selectedBasicGroupId = selectedBasicGroupId,
                )
            }
        }
    }
}
