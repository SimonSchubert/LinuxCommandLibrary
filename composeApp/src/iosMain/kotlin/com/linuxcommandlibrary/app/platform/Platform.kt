package com.linuxcommandlibrary.app.platform

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.linuxcommandlibrary.app.ui.AppIcons

actual val showRateAppButton: Boolean = false
actual val showAndroidTerminalTip: Boolean = false
actual val showFastScrollBar: Boolean = true
actual val backIcon: ImageVector = AppIcons.ArrowBackIos
actual val shareButtonIcon: ImageVector = AppIcons.Share
actual val shareButtonDescription: String = "Share"

@Composable
actual fun rememberOpenAppAction(): (String) -> Unit = {}
