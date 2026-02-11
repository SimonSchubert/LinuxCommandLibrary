package com.linuxcommandlibrary.nativecli.screens

import com.github.ajalt.mordant.input.KeyboardEvent
import com.linuxcommandlibrary.nativecli.Theme
import com.linuxcommandlibrary.nativecli.components.ContentViewer
import com.linuxcommandlibrary.nativecli.data.DataRepository

class CommandDetailScreen(private val commandName: String) : Screen {

    private val viewer: ContentViewer

    init {
        val sections = DataRepository.getCommandSections(commandName)
        val content = buildString {
            sections.forEach { section ->
                appendLine(Theme.header(section.title))
                appendLine()
                // Convert markdown to CLI-friendly format
                val formatted = formatContent(section.content)
                appendLine(formatted)
                appendLine()
            }
        }
        viewer = ContentViewer.fromText(content, pageSize = 20)
    }

    private fun formatContent(content: String): String = content
        .replace(Regex("\\*\\*([^*]+)\\*\\*")) { Theme.boldText(it.groupValues[1]) } // Bold
        .replace(Regex("_([^_]+)_")) { Theme.italicText(it.groupValues[1]) } // Italic
        .replace(Regex("```([^`]+)```")) { "  ${Theme.code("$")} ${it.groupValues[1]}" } // Inline code blocks
        .replace(Regex("\\[([^\\]]+)]\\(/man/[^)]+\\)")) { it.groupValues[1] } // Man links
        .replace(Regex("> (.+)")) { "    ${it.groupValues[1]}" } // Blockquotes
        .lines()
        .joinToString("\n") { line ->
            // Handle multi-line code blocks that weren't inline
            if (line.trim().startsWith("```")) {
                ""
            } else {
                line
            }
        }

    override fun render(): String {
        val sb = StringBuilder()
        sb.appendLine()
        sb.appendLine(Theme.sectionTitle(commandName))
        sb.appendLine()
        sb.appendLine(viewer.render())
        sb.appendLine()
        sb.appendLine(Theme.help("[Up/Down/PgUp/PgDn] Scroll  [Home/End] Jump  [q/Esc] Back"))
        return sb.toString()
    }

    override fun handleInput(event: KeyboardEvent): ScreenResult = when (event.key) {
        "ArrowUp", "k" -> {
            viewer.scrollUp()
            ScreenResult.Stay
        }

        "ArrowDown", "j" -> {
            viewer.scrollDown()
            ScreenResult.Stay
        }

        "PageUp", "b" -> {
            viewer.pageUp()
            ScreenResult.Stay
        }

        "PageDown", " " -> {
            viewer.pageDown()
            ScreenResult.Stay
        }

        "Home", "g" -> {
            viewer.jumpToStart()
            ScreenResult.Stay
        }

        "End", "G" -> {
            viewer.jumpToEnd()
            ScreenResult.Stay
        }

        "q", "Escape", "Enter", "h" -> ScreenResult.Back

        else -> ScreenResult.Stay
    }

    override fun handleFallbackInput(input: String): ScreenResult {
        val trimmed = input.trim().lowercase()
        return when (trimmed) {
            "", "0", "back", "q", "exit" -> ScreenResult.Back
            else -> ScreenResult.Stay
        }
    }
}
