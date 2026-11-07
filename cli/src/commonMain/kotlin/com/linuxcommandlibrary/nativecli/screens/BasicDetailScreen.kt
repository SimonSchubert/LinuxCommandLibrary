package com.linuxcommandlibrary.nativecli.screens

import com.linuxcommandlibrary.nativecli.ContentFormatter
import com.linuxcommandlibrary.nativecli.Theme
import com.linuxcommandlibrary.nativecli.components.ContentViewer
import com.linuxcommandlibrary.nativecli.data.DataRepository
import com.linuxcommandlibrary.shared.TipSectionElement

class BasicDetailScreen(
    private val categoryId: String,
    private val categoryTitle: String,
) : ViewerScreen {

    override val viewer: ContentViewer

    init {
        val basicInfo = DataRepository.getBasicInfo(categoryId)
        val content = buildString {
            if (basicInfo != null) {
                basicInfo.groups.forEach { group ->
                    appendLine(Theme.header(group.description))
                    group.sections.forEach { section ->
                        when (section) {
                            is TipSectionElement.Code -> appendLine("  ${Theme.code("$")} ${section.command}")

                            is TipSectionElement.Text -> {
                                val text = ContentFormatter.renderTextElements(section.elements)
                                appendLine("  $text")
                            }

                            is TipSectionElement.Blockquote -> {
                                val text = ContentFormatter.renderTextElements(section.elements)
                                appendLine("    > $text")
                            }

                            is TipSectionElement.Table -> {
                                if (section.headers.isNotEmpty()) {
                                    val headerText = section.headers.joinToString(" | ") { cells ->
                                        ContentFormatter.renderTextElements(cells)
                                    }
                                    appendLine("  ${Theme.dim(headerText)}")
                                }
                                section.rows.forEach { row ->
                                    val rowText = row.joinToString(" | ") { cells ->
                                        ContentFormatter.renderTextElements(cells)
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

    private fun ContentFormatter.renderTextElements(elements: List<com.linuxcommandlibrary.shared.TextElement>): String = elements.joinToString("") { element ->
        when (element) {
            is com.linuxcommandlibrary.shared.TextElement.Plain -> element.text
            is com.linuxcommandlibrary.shared.TextElement.Bold -> Theme.boldText(element.text)
            is com.linuxcommandlibrary.shared.TextElement.Italic -> Theme.italicText(element.text)
            is com.linuxcommandlibrary.shared.TextElement.Man -> element.man
            is com.linuxcommandlibrary.shared.TextElement.Link -> element.text
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
}
