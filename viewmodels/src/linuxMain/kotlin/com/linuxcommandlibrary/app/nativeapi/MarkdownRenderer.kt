package com.linuxcommandlibrary.app.nativeapi

import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.TextElement
import com.linuxcommandlibrary.shared.TipSectionElement

/**
 * Renders parsed basics/tips content back to Markdown for Qt's Text.MarkdownText.
 *
 * Commands already ship as Markdown and are passed through untouched, but basics and
 * tips only exist as parsed element trees. Serialising them here keeps the C boundary
 * to plain strings instead of exposing the whole sealed hierarchy through the header.
 *
 * Man pages and links become `man:` / `lcl:` URLs so QML's onLinkActivated can route
 * them without needing to know how they were encoded.
 */
/** Block kind, so the UI can style code and quotes differently from prose. */
internal fun TipSectionElement.kind(): String = when (this) {
    is TipSectionElement.Text -> "text"
    is TipSectionElement.Blockquote -> "quote"
    is TipSectionElement.Code -> "code"
    is TipSectionElement.Table -> "table"
}

internal fun TipSectionElement.toMarkdown(): String = when (this) {
    is TipSectionElement.Text -> elements.inline()
    is TipSectionElement.Blockquote -> "> " + elements.inline()
    is TipSectionElement.Code -> elements.commandLine().ifBlank { "`$command`" }
    is TipSectionElement.Table -> table()
}

/**
 * Character count of the rendered element, without rendering it. Used to balance the
 * tip card columns, which otherwise had to build every tip's Markdown just to measure it.
 */
internal fun TipSectionElement.weight(): Int = when (this) {
    is TipSectionElement.Text -> elements.textLength()
    is TipSectionElement.Blockquote -> elements.textLength()
    is TipSectionElement.Code -> command.length
    is TipSectionElement.Table -> headers.sumOf { it.textLength() } + rows.sumOf { row -> row.sumOf { it.textLength() } }
}

private fun List<TextElement>.textLength(): Int = sumOf { element ->
    when (element) {
        is TextElement.Plain -> element.text.length
        is TextElement.Bold -> element.text.length
        is TextElement.Italic -> element.text.length
        is TextElement.Man -> element.man.length
        is TextElement.Link -> element.text.length
    }
}

private fun List<TextElement>.inline(): String = joinToString("") { element ->
    when (element) {
        is TextElement.Plain -> element.text
        is TextElement.Bold -> "**${element.text}**"
        is TextElement.Italic -> "_${element.text}_"
        is TextElement.Man -> "[${element.man}](man:${element.man})"
        is TextElement.Link -> "[${element.text}](lcl:${element.action})"
    }
}

private fun List<CommandElement>.commandLine(): String = joinToString("") { element ->
    when (element) {
        is CommandElement.Text -> element.text
        is CommandElement.Man -> "[${element.man}](man:${element.man})"
        is CommandElement.Url -> "[${element.command}](${element.url})"
    }
}.trim()

private fun TipSectionElement.Table.table(): String {
    if (headers.isEmpty()) return ""
    val head = headers.joinToString(" | ", prefix = "| ", postfix = " |") { it.inline() }
    val divider = headers.joinToString(" | ", prefix = "| ", postfix = " |") { "---" }
    val body = rows.joinToString("\n") { row ->
        row.joinToString(" | ", prefix = "| ", postfix = " |") { it.inline() }
    }
    return listOf(head, divider, body).filter { it.isNotBlank() }.joinToString("\n")
}
