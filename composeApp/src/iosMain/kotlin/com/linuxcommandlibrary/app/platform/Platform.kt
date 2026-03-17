package com.linuxcommandlibrary.app.platform

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBackIos
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

actual val showRateAppButton: Boolean = false
actual val showAndroidTerminalTip: Boolean = false
actual val backIcon: ImageVector = Icons.AutoMirrored.Filled.ArrowBackIos
actual val shareButtonIcon: ImageVector = Icons.Filled.Share
actual val shareButtonDescription: String = "Share"

@Composable
actual fun rememberOpenAppAction(): (String) -> Unit = {}
