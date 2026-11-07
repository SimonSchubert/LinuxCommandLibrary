package com.linuxcommandlibrary.nativecli.screens

import com.github.ajalt.mordant.input.KeyboardEvent
import com.linuxcommandlibrary.nativecli.components.ContentViewer

/** A read-only scrollable page: shared key bindings for scrolling and going back. */
interface ViewerScreen : Screen {
    val viewer: ContentViewer

    override fun handleInput(event: KeyboardEvent): ScreenResult {
        when (event.key) {
            "ArrowUp", "k" -> viewer.scrollUp()
            "ArrowDown", "j" -> viewer.scrollDown()
            "PageUp", "b" -> viewer.pageUp()
            "PageDown", " " -> viewer.pageDown()
            "Home", "g" -> viewer.jumpToStart()
            "End", "G" -> viewer.jumpToEnd()
            "q", "Escape", "Enter", "h" -> return ScreenResult.Back
        }
        return ScreenResult.Stay
    }

    override fun handleFallbackInput(input: String): ScreenResult = when (input.trim().lowercase()) {
        "", "0", "back", "q", "exit" -> ScreenResult.Back
        else -> ScreenResult.Stay
    }
}
