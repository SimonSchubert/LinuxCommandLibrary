package com.linuxcommandlibrary.nativecli

import com.github.ajalt.mordant.input.KeyboardEvent
import com.github.ajalt.mordant.input.MouseEvent
import com.github.ajalt.mordant.input.MouseTracking
import com.github.ajalt.mordant.input.enterRawModeOrNull
import com.github.ajalt.mordant.input.isCtrlC
import com.github.ajalt.mordant.terminal.Terminal
import com.linuxcommandlibrary.nativecli.screens.MainMenuScreen
import com.linuxcommandlibrary.nativecli.screens.Screen
import com.linuxcommandlibrary.nativecli.screens.ScreenResult

class TuiApp(private val terminal: Terminal) {

    private val screenStack = mutableListOf<Screen>()
    private var running = true
    private var rawModeSupported = true

    fun run(initialScreen: Screen = MainMenuScreen()) {
        screenStack.add(initialScreen)

        // Try to detect raw mode support
        rawModeSupported = detectRawModeSupport()

        while (running && screenStack.isNotEmpty()) {
            val currentScreen = screenStack.last()

            // Clear screen and render
            clearScreen()
            print(currentScreen.render())

            // Handle input
            val result = if (rawModeSupported) {
                handleRawModeInput(currentScreen)
            } else {
                handleFallbackInput(currentScreen)
            }

            processResult(result)
        }
    }

    private fun detectRawModeSupport(): Boolean = try {
        val os = getPlatformName()
        os != "Windows"
    } catch (e: Exception) {
        false
    }

    private fun handleRawModeInput(screen: Screen): ScreenResult {
        return try {
            val rawMode = terminal.enterRawModeOrNull(MouseTracking.Normal)
            if (rawMode == null) {
                rawModeSupported = false
                return handleFallbackInput(screen)
            }
            rawMode.use { scope ->
                when (val event = scope.readEvent()) {
                    is KeyboardEvent -> if (event.isCtrlC) ScreenResult.Exit else screen.handleInput(event)
                    is MouseEvent -> screen.handleMouse(event)
                }
            }
        } catch (e: Exception) {
            rawModeSupported = false
            handleFallbackInput(screen)
        }
    }

    private fun handleFallbackInput(screen: Screen): ScreenResult {
        print("\n> ")
        val input = readlnOrNull() ?: return ScreenResult.Exit
        return screen.handleFallbackInput(input)
    }

    private fun processResult(result: ScreenResult) {
        when (result) {
            is ScreenResult.Stay -> {
                // Do nothing, re-render current screen
            }

            is ScreenResult.Back -> {
                if (screenStack.size > 1) {
                    screenStack.removeLast()
                } else {
                    running = false
                }
            }

            is ScreenResult.Exit -> {
                running = false
            }

            is ScreenResult.Navigate -> {
                screenStack.add(result.screen)
            }
        }
    }

    private fun clearScreen() {
        print("[2J[H")
    }
}

internal expect fun getPlatformName(): String
