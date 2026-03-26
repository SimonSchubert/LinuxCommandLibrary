package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.platform.backIcon
import com.linuxcommandlibrary.app.ui.AppIcons
import com.linuxcommandlibrary.app.ui.screens.AppInfoDialog
import com.linuxcommandlibrary.app.ui.theme.LocalCustomColors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun appTopBarColors(): TopAppBarColors = TopAppBarDefaults.topAppBarColors(
    containerColor = LocalCustomColors.current.topBarBackground,
    titleContentColor = LocalCustomColors.current.topBarContent,
    navigationIconContentColor = LocalCustomColors.current.topBarContent,
    actionIconContentColor = LocalCustomColors.current.topBarContent,
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GenericTopBar(
    title: String,
    showBackIcon: Boolean,
    onBack: () -> Unit,
    showAppInfoIcon: Boolean,
) {
    var showDialog by remember { mutableStateOf(false) }

    TopAppBar(
        expandedHeight = 56.dp,
        title = {
            Text(
                title,
                modifier = Modifier.semantics { contentDescription = "TopAppBarTitle" },
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        },
        colors = appTopBarColors(),
        navigationIcon = {
            if (showBackIcon) {
                IconButton(
                    modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                    onClick = onBack,
                ) {
                    Icon(
                        imageVector = backIcon,
                        contentDescription = "Back",
                    )
                }
            }
        },
        actions = {
            if (showAppInfoIcon) {
                IconButton(
                    modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                    onClick = { showDialog = true },
                ) {
                    Icon(
                        imageVector = AppIcons.Info,
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
