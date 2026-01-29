package com.linuxcommandlibrary

import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.linuxcommandlibrary.app.App
import com.linuxcommandlibrary.app.di.commonModule
import com.linuxcommandlibrary.app.di.platformModule
import org.koin.core.context.startKoin

fun main() = application {
    startKoin {
        modules(commonModule, platformModule())
    }

    Window(
        onCloseRequest = ::exitApplication,
        title = "Linux Command Library",
        state = rememberWindowState(width = 900.dp, height = 700.dp),
    ) {
        App()
    }
}
