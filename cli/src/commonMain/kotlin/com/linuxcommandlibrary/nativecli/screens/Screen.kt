package com.linuxcommandlibrary.nativecli.screens

import com.github.ajalt.mordant.input.KeyboardEvent
import com.github.ajalt.mordant.input.MouseEvent

sealed class ScreenResult {
    data object Stay : ScreenResult()
    data object Back : ScreenResult()
    data object Exit : ScreenResult()
    data class Navigate(val screen: Screen) : ScreenResult()
}

interface Screen {
    fun render(): String
    fun handleInput(event: KeyboardEvent): ScreenResult
    fun handleMouse(event: MouseEvent): ScreenResult = ScreenResult.Stay
    fun handleFallbackInput(input: String): ScreenResult = ScreenResult.Stay
}
