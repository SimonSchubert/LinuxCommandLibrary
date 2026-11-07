package com.linuxcommandlibrary.desktop

import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.TextElement
import com.linuxcommandlibrary.shared.TipSectionElement
import com.linuxcommandlibrary.shared.toPlainText

/**
 * Renders TipSectionElement lists to HTML strings for the website.
 */
object HtmlMarkdownRenderer {

    /**
     * Render a list of sections to HTML string. With [previews], multi-line code blocks are styled
     * as previews (monospace, no $ prefix, no copy button).
     */
    fun renderSections(sections: List<TipSectionElement>, previews: Boolean = false): String = buildString {
        sections.forEach { section ->
            when (section) {
                is TipSectionElement.Text -> append(renderText(section))

                is TipSectionElement.Blockquote -> append(renderBlockquote(section))

                is TipSectionElement.Code -> append(
                    if (previews && section.command.contains("\n")) renderPreviewCode(section) else renderCode(section),
                )

                is TipSectionElement.Table -> append(renderTable(section))
            }
        }
    }

    private fun renderText(text: TipSectionElement.Text): String = buildString {
        append("<span>")
        text.elements.forEach { element ->
            append(renderTextElement(element))
        }
        append("</span>")
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
        is TextElement.Man -> manLink(element.man)
        is TextElement.Link -> "<b>${element.text.escapeHtml()}</b>"
    }

    private fun renderCode(code: TipSectionElement.Code): String = buildString {
        append("""<div class="code-wrapper"><span class="code">$ """)
        code.elements.forEach { element ->
            when (element) {
                is CommandElement.Man -> append(manLink(element.man))

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
        append(copyButtonEnd(code.command))
    }

    private fun renderPreviewCode(code: TipSectionElement.Code): String = """<pre class="code-preview">${code.elements.toPlainText().escapeHtml()}</pre>"""

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
                    is TextElement.Link -> element.text.isNotBlank()
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
                if (index > 0 && cells.any { it is TextElement.Man }) {
                    append(renderCellAsCode(cells))
                } else {
                    cells.forEach { append(renderTextElement(it)) }
                }
                append("</td>")
            }
            append("</tr>")
        }

        append("</table>")
    }

    private fun renderCellAsCode(elements: List<TextElement>): String {
        val command = elements.toPlainText()
        return buildString {
            append("""<div class="code-wrapper"><span class="code">$ """)
            elements.forEach { element ->
                when (element) {
                    is TextElement.Man -> append(manLink(element.man))

                    is TextElement.Plain -> {
                        element.text.split(" ").forEachIndexed { i, word ->
                            if (i > 0) append("&nbsp;")
                            append(word.escapeHtml())
                        }
                    }

                    else -> append(renderTextElement(element))
                }
            }
            append(copyButtonEnd(command))
        }
    }

    private fun manLink(man: String) = """<a href="/man/$man" title="$man man page">$man</a>"""

    private fun copyButtonEnd(command: String) = """</span><div onclick="javascript:copy('${command.escapeJsAttribute()}')" class="copy-button">""" +
        """<img src="/images/icon-copy.svg" alt="copy" width="24" height="24"></div></div>"""
}

/**
 * Escape HTML special characters.
 */
private fun String.escapeHtml(): String = this
    .replace("&", "&amp;")
    .replace("<", "&lt;")
    .replace(">", "&gt;")
    .replace("\"", "&quot;")

/**
 * Escape a command for embedding in a single-quoted `onclick="copy('...')"` attribute.
 */
internal fun String.escapeJsAttribute(): String = escapeHtml().replace("'", "&#039;")
