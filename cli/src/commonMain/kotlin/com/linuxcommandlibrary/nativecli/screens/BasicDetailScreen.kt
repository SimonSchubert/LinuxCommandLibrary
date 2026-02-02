package com.linuxcommandlibrary.nativecli.screens

import com.github.ajalt.mordant.input.KeyboardEvent
import com.linuxcommandlibrary.nativecli.Theme
import com.linuxcommandlibrary.nativecli.components.ContentViewer
import com.linuxcommandlibrary.nativecli.data.DataRepository
import com.linuxcommandlibrary.shared.TipSectionElement

class BasicDetailScreen(
    private val categoryId: String,
    private val categoryTitle: String,
) : Screen {

    private val viewer: ContentViewer

    init {
        val basicInfo = DataRepository.getBasicInfo(categoryId)
        val content = buildString {
            if (basicInfo != null) {
                basicInfo.groups.forEach { group ->
                    appendLine(Theme.header(group.description))
                    group.sections.forEach { section ->
                        when (section) {
                            is TipSectionElement.Code -> {
                                val code = section.command
                                    .replace(Regex("\\[([^\\]]+)]\\(/man/[^)]+\\)")) { it.groupValues[1] }
                                appendLine("  ${Theme.code("$")} $code")
                            }

                            is TipSectionElement.Text -> {
                                val text = renderTextElements(section.elements)
                                appendLine("  $text")
                            }

                            is TipSectionElement.Blockquote -> {
                                val text = renderTextElements(section.elements)
                                appendLine("    > $text")
                            }

                            is TipSectionElement.Table -> {
                                section.rows.forEach { row ->
                                    val rowText = row.joinToString(" | ") { cells ->
                                        renderTextElements(cells)
                                    }
                                    appendLine("  $rowText")
                                }
                            }
                        }
                    }
                    appendLine()
                }
            } else {
                appendLine(Theme.dim("Category not found"))
            }
        }
        viewer = ContentViewer.fromText(content, pageSize = 20)
    }

    private fun renderTextElements(elements: List<com.linuxcommandlibrary.shared.TextElement>): String = elements.joinToString("") { element ->
        when (element) {
            is com.linuxcommandlibrary.shared.TextElement.Plain -> element.text
            is com.linuxcommandlibrary.shared.TextElement.Bold -> Theme.boldText(element.text)
            is com.linuxcommandlibrary.shared.TextElement.Italic -> Theme.italicText(element.text)
            is com.linuxcommandlibrary.shared.TextElement.Man -> element.man
        }
    }

    override fun render(): String {
        val sb = StringBuilder()
        sb.appendLine()
        sb.appendLine(Theme.sectionTitle(categoryTitle))
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
