package com.linuxcommandlibrary.app.platform

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

expect val showRateAppButton: Boolean
expect val showAndroidTerminalTip: Boolean
expect val showFastScrollBar: Boolean
expect val backIcon: ImageVector
expect val shareButtonIcon: ImageVector
expect val shareButtonDescription: String

@Composable
expect fun rememberOpenAppAction(): (String) -> Unit
