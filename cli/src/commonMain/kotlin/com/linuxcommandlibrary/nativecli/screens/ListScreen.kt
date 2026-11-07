package com.linuxcommandlibrary.nativecli.screens

import com.github.ajalt.mordant.input.KeyboardEvent
import com.github.ajalt.mordant.input.MouseEvent
import com.linuxcommandlibrary.nativecli.Theme
import com.linuxcommandlibrary.nativecli.components.ListItem
import com.linuxcommandlibrary.nativecli.components.SelectableList

/** A titled, selectable list where picking an entry (Enter, `l`, or its number) opens [open]. */
open class ListScreen<T>(
    private val title: String,
    values: List<T>,
    label: (T) -> String,
    private val open: (T) -> Screen,
) : Screen {

    private val items = values.map { ListItem(it, label(it)) }
    private val list = SelectableList(items, pageSize = 15)

    override fun render(): String {
        val sb = StringBuilder()
        sb.appendLine()
        sb.appendLine(Theme.sectionTitle(title))
        sb.appendLine()
        sb.appendLine(list.render())
        sb.appendLine()
        sb.appendLine(Theme.help("[Up/Down] Navigate  [Enter] Select  [q/Esc] Back"))
        return sb.toString()
    }

    override fun handleMouse(event: MouseEvent): ScreenResult {
        when {
            event.wheelUp -> list.moveUp()
            event.wheelDown -> list.moveDown()
        }
        return ScreenResult.Stay
    }

    override fun handleInput(event: KeyboardEvent): ScreenResult {
        when (event.key) {
            "ArrowUp", "k" -> list.moveUp()
            "ArrowDown", "j" -> list.moveDown()
            "PageUp" -> list.pageUp()
            "PageDown" -> list.pageDown()
            "Home" -> list.jumpToStart()
            "End" -> list.jumpToEnd()
            "Enter", "l" -> return list.selectedValue?.let { ScreenResult.Navigate(open(it)) } ?: ScreenResult.Stay
            "q", "Escape", "h" -> return ScreenResult.Back
            else -> return openNumber(event.key)
        }
        return ScreenResult.Stay
    }

    override fun handleFallbackInput(input: String): ScreenResult {
        val trimmed = input.trim()
        if (trimmed == "0" || trimmed.equals("back", ignoreCase = true) || trimmed.equals("q", ignoreCase = true)) {
            return ScreenResult.Back
        }
        return openNumber(trimmed)
    }

    // Number keys select an entry directly (1-based).
    private fun openNumber(input: String): ScreenResult {
        val number = input.toIntOrNull()
        return if (number != null && number in 1..items.size) {
            ScreenResult.Navigate(open(items[number - 1].value))
        } else {
            ScreenResult.Stay
        }
    }
}
