package com.linuxcommandlibrary.nativecli.screens

import com.linuxcommandlibrary.nativecli.ContentFormatter
import com.linuxcommandlibrary.nativecli.Theme
import com.linuxcommandlibrary.nativecli.components.ContentViewer
import com.linuxcommandlibrary.shared.TipInfo
import com.linuxcommandlibrary.shared.TipSectionElement

class TipDetailScreen(private val tip: TipInfo) : ViewerScreen {

    override val viewer: ContentViewer

    init {
        val content = buildString {
            appendLine(Theme.title(tip.title))
            appendLine()

            tip.sections.forEach { section ->
                when (section) {
                    is TipSectionElement.Text -> {
                        val text = ContentFormatter.renderTextElements(section.elements)
                        appendLine(text)
                    }

                    is TipSectionElement.Blockquote -> {
                        val text = ContentFormatter.renderTextElements(section.elements)
                        appendLine("  > $text")
                    }

                    is TipSectionElement.Code -> {
                        appendLine("  ${Theme.code("$")} ${section.command}")
                    }

                    is TipSectionElement.Table -> {
                        section.rows.forEach { row ->
                            val rowText = row.joinToString(" | ") { cells ->
                                ContentFormatter.renderTextElements(cells)
                            }
                            appendLine(rowText)
                        }
                    }
                }
            }
        }
        viewer = ContentViewer.fromText(content, pageSize = 20)
    }

    override fun render(): String {
        val sb = StringBuilder()
        sb.appendLine()
        sb.appendLine(viewer.render())
        sb.appendLine()
        sb.appendLine(Theme.help("[Up/Down/PgUp/PgDn] Scroll  [Home/End] Jump  [q/Esc] Back"))
        return sb.toString()
    }
}
