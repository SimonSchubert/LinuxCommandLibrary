package com.linuxcommandlibrary.nativecli.screens

import com.github.ajalt.mordant.input.KeyboardEvent
import com.linuxcommandlibrary.nativecli.Theme
import com.linuxcommandlibrary.nativecli.components.ContentViewer
import com.linuxcommandlibrary.shared.TextElement
import com.linuxcommandlibrary.shared.TipInfo
import com.linuxcommandlibrary.shared.TipSectionElement

class TipDetailScreen(private val tip: TipInfo) : Screen {

    private val viewer: ContentViewer

    init {
        val content = buildString {
            appendLine(Theme.title(tip.title))
            appendLine()

            tip.sections.forEach { section ->
                when (section) {
                    is TipSectionElement.Text -> {
                        val text = renderTextElements(section.elements)
                        appendLine(text)
                    }

                    is TipSectionElement.Blockquote -> {
                        val text = renderTextElements(section.elements)
                        appendLine("  > $text")
                    }

                    is TipSectionElement.Code -> {
                        appendLine("  ${Theme.code("$")} ${section.command}")
                    }

                    is TipSectionElement.Table -> {
                        section.rows.forEach { row ->
                            val rowText = row.joinToString(" | ") { cells ->
                                renderTextElements(cells)
                            }
                            appendLine(rowText)
                        }
                    }
                }
            }
        }
        viewer = ContentViewer.fromText(content, pageSize = 20)
    }

    private fun renderTextElements(elements: List<TextElement>): String = elements.joinToString("") { element ->
        when (element) {
            is TextElement.Plain -> element.text
            is TextElement.Bold -> Theme.boldText(element.text)
            is TextElement.Italic -> Theme.italicText(element.text)
            is TextElement.Man -> element.man
        }
    }

    override fun render(): String {
        val sb = StringBuilder()
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

        "q", "Escape", "Enter" -> ScreenResult.Back

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
