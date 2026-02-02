package com.linuxcommandlibrary.nativecli.screens

import com.github.ajalt.mordant.input.KeyboardEvent
import com.linuxcommandlibrary.nativecli.Theme
import com.linuxcommandlibrary.nativecli.components.ListItem
import com.linuxcommandlibrary.nativecli.components.SearchInput
import com.linuxcommandlibrary.nativecli.components.SelectableList
import com.linuxcommandlibrary.nativecli.data.CommandInfo
import com.linuxcommandlibrary.nativecli.data.DataRepository

class SearchScreen : Screen {

    private val searchInput = SearchInput()
    private var items: List<ListItem<CommandInfo>> = emptyList()
    private var list: SelectableList<CommandInfo>? = null
    private val maxResults = 20

    init {
        updateResults()
    }

    private fun updateResults() {
        val commands = if (searchInput.isEmpty) {
            DataRepository.getCommands().take(maxResults)
        } else {
            DataRepository.getCommandsByQuery(searchInput.query).take(maxResults)
        }

        items = commands.map { ListItem(it, it.name) }
        list = SelectableList(
            terminal = com.github.ajalt.mordant.terminal.Terminal(),
            items = items,
            pageSize = 15,
        )
    }

    override fun render(): String {
        val sb = StringBuilder()
        sb.appendLine()
        sb.appendLine(Theme.sectionTitle("Commands"))
        sb.appendLine()
        sb.appendLine(searchInput.render())
        sb.appendLine()

        val currentList = list
        if (currentList != null && !currentList.isEmpty) {
            sb.appendLine(currentList.render())
        } else {
            sb.appendLine(Theme.dim("  No commands found for \"${searchInput.query}\""))
        }

        sb.appendLine()
        sb.appendLine(Theme.help("[Type] Search  [Up/Down] Navigate  [Enter] Select  [Esc/Q] Back"))
        return sb.toString()
    }

    override fun handleInput(event: KeyboardEvent): ScreenResult = when (event.key) {
        "ArrowUp" -> {
            list?.moveUp()
            ScreenResult.Stay
        }

        "ArrowDown" -> {
            list?.moveDown()
            ScreenResult.Stay
        }

        "PageUp" -> {
            list?.pageUp()
            ScreenResult.Stay
        }

        "PageDown" -> {
            list?.pageDown()
            ScreenResult.Stay
        }

        "Home" -> {
            list?.jumpToStart()
            ScreenResult.Stay
        }

        "End" -> {
            list?.jumpToEnd()
            ScreenResult.Stay
        }

        "Enter" -> {
            val selected = list?.selectedValue
            if (selected != null) {
                ScreenResult.Navigate(CommandDetailScreen(selected.name))
            } else {
                ScreenResult.Stay
            }
        }

        "Backspace", "Delete" -> {
            if (searchInput.backspace()) {
                updateResults()
            }
            ScreenResult.Stay
        }

        "Escape", "Esc" -> {
            ScreenResult.Back
        }

        "q" -> {
            if (searchInput.isEmpty) {
                ScreenResult.Back
            } else {
                searchInput.append('q')
                updateResults()
                ScreenResult.Stay
            }
        }

        "Q" -> {
            // Shift+Q always quits, even with search text
            ScreenResult.Back
        }

        else -> {
            // Handle character input
            val char = event.key.firstOrNull()
            if (char != null && (char.isLetterOrDigit() || char in ".-_+")) {
                searchInput.append(char)
                updateResults()
            }
            ScreenResult.Stay
        }
    }

    override fun handleFallbackInput(input: String): ScreenResult {
        val trimmed = input.trim()

        // Check for back commands
        if (trimmed == "0" || trimmed.equals("back", ignoreCase = true) || trimmed.equals("q", ignoreCase = true)) {
            return ScreenResult.Back
        }

        // Check for number selection
        val number = trimmed.toIntOrNull()
        if (number != null && number in 1..items.size) {
            val command = items[number - 1].value
            return ScreenResult.Navigate(CommandDetailScreen(command.name))
        }

        // Treat as search query
        searchInput.clear()
        searchInput.appendString(trimmed)
        updateResults()
        return ScreenResult.Stay
    }
}
