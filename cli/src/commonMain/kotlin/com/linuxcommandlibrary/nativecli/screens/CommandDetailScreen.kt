package com.linuxcommandlibrary.nativecli.screens

import com.github.ajalt.mordant.input.KeyboardEvent
import com.github.ajalt.mordant.input.MouseEvent
import com.linuxcommandlibrary.nativecli.ContentFormatter
import com.linuxcommandlibrary.nativecli.Theme
import com.linuxcommandlibrary.nativecli.components.ContentViewer
import com.linuxcommandlibrary.nativecli.data.DataRepository

class CommandDetailScreen(private val commandName: String) : Screen {

    private val viewer: ContentViewer

    // SEE ALSO / inline man references, with screen positions for click navigation.
    private val links: List<ContentFormatter.ManLink>

    init {
        val sections = DataRepository.getCommandSections(commandName)
        val lines = mutableListOf<String>()
        val collectedLinks = mutableListOf<ContentFormatter.ManLink>()
        sections.forEach { section ->
            lines.add(Theme.header(section.title))
            lines.add("")
            val formatted = ContentFormatter.formatInteractive(section.title, section.content)
            val base = lines.size
            lines.addAll(formatted.lines)
            formatted.links.forEach { collectedLinks.add(it.copy(lineIndex = it.lineIndex + base)) }
            lines.add("")
        }
        viewer = ContentViewer(lines, pageSize = PAGE_SIZE)
        links = collectedLinks
    }

    override fun render(): String {
        val sb = StringBuilder()
        sb.appendLine()
        sb.appendLine(Theme.sectionTitle(commandName))
        sb.appendLine()
        sb.appendLine(viewer.render())
        sb.appendLine()
        sb.appendLine(Theme.help("[Up/Down/PgUp/PgDn] Scroll  [Home/End] Jump  [Click] Open link  [q/Esc] Back"))
        return sb.toString()
    }

    override fun handleMouse(event: MouseEvent): ScreenResult {
        when {
            event.wheelUp -> viewer.scrollUp()
            event.wheelDown -> viewer.scrollDown()
            event.left -> linkAt(event.x, event.y)?.let { command ->
                if (DataRepository.hasCommand(command)) {
                    return ScreenResult.Navigate(CommandDetailScreen(command))
                }
            }
        }
        return ScreenResult.Stay
    }

    // Maps a click at screen column [x]/row [y] to a man-link target command, if any.
    private fun linkAt(x: Int, y: Int): String? {
        val viewportRow = y - CONTENT_START_ROW
        if (viewportRow < 0 || viewportRow >= viewer.visibleLineCount) return null
        val contentIndex = viewer.firstVisibleLine + viewportRow
        return links.firstOrNull { it.lineIndex == contentIndex && x >= it.startCol && x < it.endCol }
            ?.command
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

    companion object {
        private const val PAGE_SIZE = 20

        // render() prints: blank line, section title, blank line, then the viewer content,
        // so the first content line lands on screen row 3 (0-based). Keep in sync with render().
        private const val CONTENT_START_ROW = 3
    }
}
