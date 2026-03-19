package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.platform.backIcon
import com.linuxcommandlibrary.app.ui.screens.BookmarkFeedbackDialog
import com.linuxcommandlibrary.app.ui.screens.commanddetail.CommandDetailViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailTopBar(
    commandName: String,
    viewModel: CommandDetailViewModel,
    onBack: () -> Unit,
) {
    val uiState by viewModel.state.collectAsState()
    val isAllExpanded = uiState.isAllExpanded()

    val expandAllPainter = rememberIconPainter(AppIcon.EXPAND_ALL)
    val collapseAllPainter = rememberIconPainter(AppIcon.COLLAPSE_ALL)
    val bookmarkPainter = rememberIconPainter(AppIcon.BOOKMARK)
    val bookmarkBorderPainter = rememberIconPainter(AppIcon.BOOKMARK_BORDER)

    TopAppBar(
        expandedHeight = 56.dp,
        title = {
            Text(
                commandName,
                modifier = Modifier.semantics { contentDescription = "TopAppBarTitle" },
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.titleLarge.copy(textDirection = TextDirection.Ltr),
            )
        },
        colors = appTopBarColors(),
        navigationIcon = {
            IconButton(
                modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                onClick = onBack,
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
