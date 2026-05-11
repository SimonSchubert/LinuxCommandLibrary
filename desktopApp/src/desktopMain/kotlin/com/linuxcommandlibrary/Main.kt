package com.linuxcommandlibrary

import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.linuxcommandlibrary.app.App
import com.linuxcommandlibrary.app.di.commonModule
import com.linuxcommandlibrary.app.di.platformModule
import com.linuxcommandlibrary.ai.di.aiModule
import org.koin.core.context.startKoin

fun main() {
    // Tell macOS AppKit to follow the system dark/light setting for the window title bar
    // and other native chrome. Without this, the JVM defaults to "aqua" (light) regardless
    // of the system theme. Harmless no-op on Linux/Windows.
    System.setProperty("apple.awt.application.appearance", "system")

    application {
        startKoin {
            modules(commonModule, platformModule(), aiModule)
        }

        Window(
            onCloseRequest = ::exitApplication,
            title = "Linux Command Library",
            state = rememberWindowState(width = 900.dp, height = 700.dp),
        ) {
            App()
        }
    }
}
