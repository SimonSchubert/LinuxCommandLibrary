package com.linuxcommandlibrary.app.platform

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

actual val showRateAppButton: Boolean = false
actual val showAndroidTerminalTip: Boolean = false
actual val backIcon: ImageVector = Icons.AutoMirrored.Filled.ArrowBack
actual val shareButtonIcon: ImageVector = Icons.Filled.ContentCopy
actual val shareButtonDescription: String = "Copy to clipboard"

@Composable
actual fun rememberOpenAppAction(): (String) -> Unit = {}
