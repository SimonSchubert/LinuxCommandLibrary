package com.linuxcommandlibrary.nativecli.screens

import com.github.ajalt.mordant.input.KeyboardEvent
import com.github.ajalt.mordant.terminal.Terminal
import com.linuxcommandlibrary.nativecli.Theme
import com.linuxcommandlibrary.nativecli.components.ListItem
import com.linuxcommandlibrary.nativecli.components.SelectableList
import com.linuxcommandlibrary.shared.Version

enum class MainMenuItem {
    COMMANDS,
    BASICS,
    TIPS,
    EXIT,
}

class MainMenuScreen(terminal: Terminal) : Screen {

    private val items = listOf(
        ListItem(MainMenuItem.COMMANDS, "Commands"),
        ListItem(MainMenuItem.BASICS, "Basics"),
        ListItem(MainMenuItem.TIPS, "Tips"),
        ListItem(MainMenuItem.EXIT, "Exit"),
    )

    private val list = SelectableList(terminal, items, pageSize = 10)

    override fun render(): String {
        val logoLines = listOf(
            " _     _  __  _  __ __ __  __",
            "| |__ | ||  \\| ||  |  |\\ \\/ /",
            "|____||_||_|\\__| \\___/ /_/\\_\\",
            " ____  ____  __  __  __  __   ____   __  _  ____",
            "/ (__`/ () \\|  \\/  ||  \\/  | / () \\ |  \\| || _) \\",
            "\\____)\\____/|_|\\/|_||_|\\/|_|/__/\\__\\|_|\\__||____/",
            " _     _ _____ _____   ____  _____ __  __",
            "| |__ | || () )| () ) / () \\ | () )\\ \\/ /",
            "|____||_||_()_)|_|\\_\\/__/\\__\\|_|\\_\\ |__|",
        )

        val sb = StringBuilder()
        sb.appendLine()
        logoLines.forEachIndexed { index, line ->
            sb.appendLine(Theme.logoLine(line, index))
        }
        sb.appendLine(Theme.dim("Version: ${Version.APP_VERSION}"))
        sb.appendLine()
        sb.appendLine(list.render())
        sb.appendLine()
        sb.appendLine(Theme.help("[Up/Down] Navigate  [Enter] Select  [q] Quit"))
        return sb.toString()
    }

    override fun handleInput(event: KeyboardEvent): ScreenResult = when (event.key) {
        "ArrowUp", "k" -> {
            list.moveUp()
            ScreenResult.Stay
        }

        "ArrowDown", "j" -> {
            list.moveDown()
            ScreenResult.Stay
        }

        "Enter", "l" -> {
            when (list.selectedValue) {
                MainMenuItem.COMMANDS -> ScreenResult.Navigate(SearchScreen())
                MainMenuItem.BASICS -> ScreenResult.Navigate(BasicCategoriesScreen())
                MainMenuItem.TIPS -> ScreenResult.Navigate(TipsScreen())
                MainMenuItem.EXIT, null -> ScreenResult.Exit
            }
        }

        "q", "Escape", "h" -> ScreenResult.Exit

        "1" -> ScreenResult.Navigate(SearchScreen())

        "2" -> ScreenResult.Navigate(BasicCategoriesScreen())

        "3" -> ScreenResult.Navigate(TipsScreen())

        "0" -> ScreenResult.Exit

        else -> ScreenResult.Stay
    }

    override fun handleFallbackInput(input: String): ScreenResult = when (input.trim()) {
        "1" -> ScreenResult.Navigate(SearchScreen())
        "2" -> ScreenResult.Navigate(BasicCategoriesScreen())
        "3" -> ScreenResult.Navigate(TipsScreen())
        "0", "q", "exit", "quit" -> ScreenResult.Exit
        else -> ScreenResult.Stay
    }
}
