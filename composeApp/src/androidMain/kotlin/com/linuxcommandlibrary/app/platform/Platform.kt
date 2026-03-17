package com.linuxcommandlibrary.app.platform

import android.content.Intent
import android.os.Build
import android.provider.Settings
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext

actual val showRateAppButton: Boolean = true
actual val showAndroidTerminalTip: Boolean = Build.VERSION.SDK_INT >= 35
actual val backIcon: ImageVector = Icons.AutoMirrored.Filled.ArrowBack
actual val shareButtonIcon: ImageVector = Icons.Filled.Share
actual val shareButtonDescription: String = "Share"

@Composable
actual fun rememberOpenAppAction(): (String) -> Unit {
    val context = LocalContext.current
    return remember(context) {
        { action ->
            try {
                when (action) {
                    "settings" -> {
                        context.startActivity(
                            Intent(Settings.ACTION_SETTINGS).apply {
                                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                            },
                        )
                    }

                    "terminal" -> {
                        val intent = context.packageManager.getLaunchIntentForPackage(
                            "com.android.virtualization.terminal",
                        )
                        if (intent != null) {
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                            context.startActivity(intent)
                        }
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
