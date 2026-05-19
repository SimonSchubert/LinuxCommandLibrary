package com.linuxcommandlibrary.app.ui.screens.commanddetail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import com.linuxcommandlibrary.app.NavEvent
import com.linuxcommandlibrary.app.resources.Res
import com.linuxcommandlibrary.app.resources.add_bookmark
import com.linuxcommandlibrary.app.resources.collapse_all
import com.linuxcommandlibrary.app.resources.expand_all
import com.linuxcommandlibrary.app.resources.remove_bookmark
import com.linuxcommandlibrary.app.ui.composables.AppIcon
import com.linuxcommandlibrary.app.ui.composables.PaneTopBar
import com.linuxcommandlibrary.app.ui.composables.rememberIconPainter
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.currentKoinScope
import org.koin.core.parameter.parametersOf

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

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface),
    ) {
        PaneTopBar(
            title = commandName,
            onBack = onBack,
            actions = {
                IconButton(
                    modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                    onClick = { viewModel.onToggleAllExpanded() },
                ) {
                    Icon(
                        painter = expandPainter,
                        contentDescription = if (isAllExpanded) stringResource(Res.string.collapse_all) else stringResource(Res.string.expand_all),
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
                        contentDescription = if (uiState.isBookmarked) stringResource(Res.string.remove_bookmark) else stringResource(Res.string.add_bookmark),
                    )
                }
            },
        )
        CommandDetailScreen(viewModel = viewModel, onNavigate = onNavigate)
    }
}
