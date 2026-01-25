package com.linuxcommandlibrary.desktop

import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.TextElement
import com.linuxcommandlibrary.shared.TipSectionElement

/**
 * Renders TipSectionElement lists to HTML strings for the website.
 */
object HtmlMarkdownRenderer {

    /**
     * Render a list of sections to HTML string.
     */
    fun renderSections(sections: List<TipSectionElement>): String = buildString {
        sections.forEach { section ->
            when (section) {
                is TipSectionElement.Text -> append(renderText(section))
                is TipSectionElement.Blockquote -> append(renderBlockquote(section))
                is TipSectionElement.Code -> append(renderCode(section))
                is TipSectionElement.Table -> append(renderTable(section))
            }
        }
    }

    private fun renderText(text: TipSectionElement.Text): String = buildString {
        append("<span>")
        text.elements.forEach { element ->
            append(renderTextElement(element))
        }
        append("</span><br>")
    }

    private fun renderBlockquote(blockquote: TipSectionElement.Blockquote): String = buildString {
        append("<blockquote>")
        blockquote.elements.forEach { element ->
            append(renderTextElement(element))
        }
        append("</blockquote>")
    }

    private fun renderTextElement(element: TextElement): String = when (element) {
        is TextElement.Plain -> element.text.escapeHtml()
        is TextElement.Bold -> "<b>${element.text.escapeHtml()}</b>"
        is TextElement.Italic -> "<i>${element.text.escapeHtml()}</i>"
        is TextElement.Man -> """<a href="/man/${element.man}" title="${element.man} man page">${element.man}</a>"""
    }

    private fun renderCode(code: TipSectionElement.Code): String {
        val escapedCommand = code.command.escapeHtml().replace("'", "&#039;")
        return buildString {
            append("""<div class="code-wrapper"><span class="code">$ """)
            code.elements.forEach { element ->
                when (element) {
                    is CommandElement.Man -> append("""<a href="/man/${element.man}" title="${element.man} man page">${element.man}</a>""")

                    is CommandElement.Text -> {
                        element.text.split("\n").forEachIndexed { index, line ->
                            if (index > 0) {
                                append("<br>")
                            }
                            // Replace spaces with &nbsp; to preserve formatting
                            line.split(" ").forEachIndexed { spaceIndex, word ->
                                if (spaceIndex > 0) {
                                    append("&nbsp;")
                                }
                                append(word.escapeHtml())
                            }
                        }
                    }

                    is CommandElement.Url -> append("""<a href="${element.url}" target="_blank" rel="noopener">${element.command.escapeHtml()}</a>""")
                }
            }
            append("""</span><div onclick="javascript:copy('$escapedCommand')" class="copy-button">""")
            append("""<img src="/images/icon-copy.svg" alt="copy" width="24" height="24"></div></div>""")
        }
    }

    private fun renderTable(table: TipSectionElement.Table): String = buildString {
        append("<table>")

        // Render header row if headers have content
        val hasHeaders = table.headers.any { cells ->
            cells.any { element ->
                when (element) {
                    is TextElement.Plain -> element.text.isNotBlank()
                    is TextElement.Bold -> element.text.isNotBlank()
                    is TextElement.Italic -> element.text.isNotBlank()
                    is TextElement.Man -> true
                }
            }
        }

        if (hasHeaders) {
            append("<tr>")
            table.headers.forEach { headerCells ->
                append("<th>")
                headerCells.forEach { element ->
                    append(renderTextElement(element))
                }
                append("</th>")
            }
            append("</tr>")
        }

        // Render data rows
        table.rows.forEach { row ->
            append("<tr>")
            row.forEachIndexed { index, cells ->
                append("<td>")
                if (index == 0) {
                    // First column often contains bold shortcuts
                    cells.forEach { element ->
                        when (element) {
                            is TextElement.Bold -> append("<b>${element.text.escapeHtml()}</b>")
                            else -> append(renderTextElement(element))
                        }
                    }
                } else {
                    // Other columns may contain code blocks or plain text
                    val hasCode = cells.any { it is TextElement.Man }
                    if (hasCode) {
                        // Render as inline code with man links
                        cells.forEach { element ->
                            append(renderTextElement(element))
                        }
                    } else {
                        cells.forEach { element ->
                            append(renderTextElement(element))
                        }
                    }
                }
                append("</td>")
            }
            append("</tr>")
        }

        append("</table>")
    }

    /**
     * Escape HTML special characters.
     */
    private fun String.escapeHtml(): String = this
        .replace("&", "&amp;")
        .replace("<", "&lt;")
        .replace(">", "&gt;")
        .replace("\"", "&quot;")
}
