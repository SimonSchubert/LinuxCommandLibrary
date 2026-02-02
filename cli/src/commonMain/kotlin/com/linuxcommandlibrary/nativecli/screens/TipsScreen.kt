package com.linuxcommandlibrary.nativecli.screens

import com.github.ajalt.mordant.input.KeyboardEvent
import com.github.ajalt.mordant.terminal.Terminal
import com.linuxcommandlibrary.nativecli.Theme
import com.linuxcommandlibrary.nativecli.components.ListItem
import com.linuxcommandlibrary.nativecli.components.SelectableList
import com.linuxcommandlibrary.nativecli.data.DataRepository
import com.linuxcommandlibrary.shared.TipInfo

class TipsScreen : Screen {

    private val tips = DataRepository.getTips()
    private val items = tips.map { ListItem(it, it.title) }
    private val list = SelectableList(Terminal(), items, pageSize = 15)

    override fun render(): String {
        val sb = StringBuilder()
        sb.appendLine()
        sb.appendLine(Theme.sectionTitle("Tips"))
        sb.appendLine()
        sb.appendLine(list.render())
        sb.appendLine()
        sb.appendLine(Theme.help("[Up/Down] Navigate  [Enter] Select  [q/Esc] Back"))
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

        "PageUp" -> {
            list.pageUp()
            ScreenResult.Stay
        }

        "PageDown" -> {
            list.pageDown()
            ScreenResult.Stay
        }

        "Home" -> {
            list.jumpToStart()
            ScreenResult.Stay
        }

        "End" -> {
            list.jumpToEnd()
            ScreenResult.Stay
        }

        "Enter" -> {
            val selected = list.selectedValue
            if (selected != null) {
                ScreenResult.Navigate(TipDetailScreen(selected))
            } else {
                ScreenResult.Stay
            }
        }

        "q", "Escape" -> ScreenResult.Back

        else -> {
            // Handle number keys for direct selection
            val number = event.key.toIntOrNull()
            if (number != null && number in 1..items.size) {
                val tip = items[number - 1].value
                ScreenResult.Navigate(TipDetailScreen(tip))
            } else {
                ScreenResult.Stay
            }
        }
    }

    override fun handleFallbackInput(input: String): ScreenResult {
        val trimmed = input.trim()

        if (trimmed == "0" || trimmed.equals("back", ignoreCase = true) || trimmed.equals("q", ignoreCase = true)) {
            return ScreenResult.Back
        }

        val number = trimmed.toIntOrNull()
        if (number != null && number in 1..items.size) {
            val tip = items[number - 1].value
            return ScreenResult.Navigate(TipDetailScreen(tip))
        }

        return ScreenResult.Stay
    }
}
