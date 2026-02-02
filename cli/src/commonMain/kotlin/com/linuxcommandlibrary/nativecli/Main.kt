package com.linuxcommandlibrary.nativecli

import com.github.ajalt.mordant.terminal.Terminal
import com.linuxcommandlibrary.nativecli.data.DataRepository
import com.linuxcommandlibrary.shared.Version

fun main(args: Array<String>) {
    val terminal = Terminal()

    when {
        args.isEmpty() -> {
            // Interactive mode
            val app = TuiApp(terminal)
            app.run()
        }

        args[0] == "--help" || args[0] == "-h" -> {
            showHelp(terminal)
        }

        args[0] == "--version" || args[0] == "-v" -> {
            terminal.println("Linux Command Library v${Version.APP_VERSION}")
        }

        args[0] == "--list" || args[0] == "-l" -> {
            // List all commands
            DataRepository.getCommandNames().forEach { name ->
                terminal.println(name)
            }
        }

        else -> {
            // Direct command access: lcl grep
            val commandName = args[0].lowercase()
            val commands = DataRepository.getCommandNames()

            // Check for exact match
            val exactMatch = commands.find { it.lowercase() == commandName }
            if (exactMatch != null) {
                // Show command details directly (non-interactive)
                showCommandNonInteractive(terminal, exactMatch)
            } else {
                // Try fuzzy search
                val matches = DataRepository.getCommandsByQuery(commandName).take(10)
                if (matches.isNotEmpty()) {
                    if (matches.size == 1) {
                        // Single match, show it
                        showCommandNonInteractive(terminal, matches[0].name)
                    } else {
                        // Multiple matches, start interactive with search pre-filled
                        terminal.println("Multiple commands found for '$commandName':")
                        matches.forEachIndexed { index, cmd ->
                            terminal.println("  ${index + 1}. ${cmd.name}")
                        }
                        terminal.println()
                        terminal.println("Run 'lcl <command>' with an exact name, or run 'lcl' for interactive mode.")
                    }
                } else {
                    terminal.println("Command not found: $commandName")
                    terminal.println("Run 'lcl --list' to see all available commands.")
                }
            }
        }
    }
}

private fun showHelp(terminal: Terminal) {
    terminal.println(
        """
Linux Command Library - Native CLI

Usage:
  lcl                    Start interactive mode
  lcl <command>          Show details for a specific command
  lcl --list, -l         List all available commands
  lcl --version, -v      Show version
  lcl --help, -h         Show this help

Interactive Mode Controls:
  Arrow keys / j/k       Navigate up/down
  Enter                  Select item
  Esc / q                Go back / Exit
  Page Up/Down           Scroll pages
  Home / End             Jump to start/end
  Type characters        Search (in search screen)

Examples:
  lcl                    # Start interactive browser
  lcl grep               # Show grep command details
  lcl --list | grep net  # Find network-related commands
        """.trimIndent(),
    )
}

private fun showCommandNonInteractive(terminal: Terminal, commandName: String) {
    val sections = DataRepository.getCommandSections(commandName)

    terminal.println()
    terminal.println(Theme.sectionTitle(commandName))
    terminal.println()

    sections.forEach { section ->
        terminal.println(Theme.header(section.title))
        val content = section.content
            .replace(Regex("\\*\\*([^*]+)\\*\\*")) { Theme.boldText(it.groupValues[1]) }
            .replace(Regex("_([^_]+)_")) { Theme.italicText(it.groupValues[1]) }
            .replace(Regex("```([^`]+)```")) { "  ${Theme.code("$")} ${it.groupValues[1]}" }
            .replace(Regex("\\[([^\\]]+)]\\(/man/[^)]+\\)")) { it.groupValues[1] }
            .replace(Regex("> (.+)")) { "    ${it.groupValues[1]}" }
        terminal.println(content)
        terminal.println()
    }
}
