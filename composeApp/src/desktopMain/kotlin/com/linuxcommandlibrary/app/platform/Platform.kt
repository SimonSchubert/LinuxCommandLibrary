package com.linuxcommandlibrary.app.platform

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

actual val showRateAppButton: Boolean = false
actual val showAndroidTerminalTip: Boolean = false
actual val backIcon: ImageVector = Icons.AutoMirrored.Filled.ArrowBack

@Composable
actual fun rememberOpenAppAction(): (String) -> Unit = {}
