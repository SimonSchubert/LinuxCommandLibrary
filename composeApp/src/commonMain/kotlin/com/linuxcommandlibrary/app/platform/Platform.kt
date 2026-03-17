package com.linuxcommandlibrary.app.platform

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

expect val isIOS: Boolean
expect val showRateAppButton: Boolean
expect val showAndroidTerminalTip: Boolean
expect val backIcon: ImageVector

@Composable
expect fun rememberOpenAppAction(): (String) -> Unit
