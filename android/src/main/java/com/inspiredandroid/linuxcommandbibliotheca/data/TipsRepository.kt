package com.inspiredandroid.linuxcommandbibliotheca.data

import android.content.Context
import com.linuxcommandlibrary.shared.CommandElement
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

data class TipInfo(
    val id: Long,
    val title: String,
    val sections: ImmutableList<TipSectionElement>,
    val markdown: String
)

sealed class TextElement {
    data class Plain(val text: String) : TextElement()
    data class Bold(val text: String) : TextElement()
    data class Man(val man: String) : TextElement()
}

sealed class TipSectionElement {
    data class Text(val elements: List<TextElement>) : TipSectionElement()
    data class Code(val command: String, val elements: ImmutableList<CommandElement>) : TipSectionElement()
    data class NestedCode(
        val text: String,
        val command: String,
        val elements: ImmutableList<CommandElement>,
    ) : TipSectionElement()
    data class NestedText(val text: String, val info: String) : TipSectionElement()
    data class Table(
        val headers: List<List<TextElement>>,
        val rows: List<List<List<TextElement>>>
    ) : TipSectionElement()
}

class TipsRepository(private val context: Context) {

    fun getTips(): List<TipInfo> {
        return try {
            val content = context.assets.open("tips.md").bufferedReader().readText()
            parseTips(content)
        } catch (e: Exception) {
            emptyList()
        }
    }

    private fun parseTips(content: String): List<TipInfo> {
        val tips = mutableListOf<TipInfo>()

        // Split by ## headers to get individual tips
        val tipBlocks = content.split(Regex("(?=^## )", RegexOption.MULTILINE))
            .filter { it.trim().startsWith("## ") }

        for (block in tipBlocks) {
            val lines = block.lines()
            val titleLine = lines.firstOrNull() ?: continue
            val title = titleLine.removePrefix("## ").trim()
            if (title.isEmpty()) continue

            val contentLines = lines.drop(1)
            val sections = parseContent(contentLines)

            tips.add(
                TipInfo(
                    id = title.hashCode().toLong(),
                    title = title,
                    sections = sections.toImmutableList(),
                    markdown = content
                )
            )
        }

        return tips
    }

    private fun parseContent(lines: List<String>): List<TipSectionElement> {
        val sections = mutableListOf<TipSectionElement>()
        var i = 0

        while (i < lines.size) {
            val line = lines[i]

            when {
                line.trim().startsWith("|") && line.trim().endsWith("|") -> {
                    // Collect consecutive markdown table lines
                    val tableLines = mutableListOf<String>()
                    while (i < lines.size && lines[i].trim().let { it.startsWith("|") && it.endsWith("|") }) {
                        tableLines.add(lines[i])
                        i++
                    }
                    if (tableLines.isNotEmpty()) {
                        val table = parseMarkdownTable(tableLines)
                        if (table != null) {
                            sections.add(table)
                        }
                    }
                }
                line.trim().startsWith("```") && line.trim().endsWith("```") -> {
                    // Markdown inline code block
                    val codeContent = line.trim().removeSurrounding("```")
                    val elements = parseMarkdownCodeToElements(codeContent)
                    sections.add(
                        TipSectionElement.Code(
                            command = cleanMarkdownCommand(codeContent),
                            elements = elements.toImmutableList(),
                        )
                    )
                    i++
                }
                line.trim().isNotEmpty() -> {
                    // Plain text with potential bold formatting
                    val cleanText = cleanHtmlText(line.trim())
                    if (cleanText.isNotEmpty()) {
                        sections.add(TipSectionElement.Text(parseTextWithBold(cleanText)))
                    }
                    i++
                }
                else -> {
                    i++
                }
            }
        }

        return sections
    }

    private fun parseMarkdownTable(lines: List<String>): TipSectionElement.Table? {
        if (lines.size < 2) return null

        // Parse header row (first row)
        val headerLine = lines[0]
        val headers = splitTableRow(headerLine).map { parseTableCellContent(it) }

        // Skip separator row (second row with dashes) and parse data rows
        val dataRows = lines.drop(2).mapNotNull { line ->
            // Skip separator rows (contain only |, -, and spaces)
            if (line.trim().replace(Regex("[|\\-\\s]"), "").isEmpty()) {
                return@mapNotNull null
            }
            splitTableRow(line).map { parseTableCellContent(it) }
        }

        if (headers.isEmpty()) return null

        return TipSectionElement.Table(headers = headers, rows = dataRows)
    }

    private fun parseTextWithBold(text: String): List<TextElement> {
        val elements = mutableListOf<TextElement>()
        val boldRegex = Regex("""\*\*([^*]+)\*\*""")
        var remaining = text

        while (remaining.isNotEmpty()) {
            val boldMatch = boldRegex.find(remaining)

            if (boldMatch == null) {
                if (remaining.isNotEmpty()) {
                    elements.add(TextElement.Plain(remaining))
                }
                break
            }

            // Add text before the match
            if (boldMatch.range.first > 0) {
                elements.add(TextElement.Plain(remaining.substring(0, boldMatch.range.first)))
            }

            elements.add(TextElement.Bold(boldMatch.groupValues[1]))
            remaining = remaining.substring(boldMatch.range.last + 1)
        }

        return elements
    }

    private fun parseTableCellContent(cell: String): List<TextElement> {
        val elements = mutableListOf<TextElement>()
        var remaining = cell

        // Pattern to match bold (**text**), inline code with man link (`[text](/man/command) ...`), or plain inline code (`...`)
        val boldRegex = Regex("""\*\*([^*]+)\*\*""")
        val inlineCodeRegex = Regex("""`([^`]+)`""")

        while (remaining.isNotEmpty()) {
            val boldMatch = boldRegex.find(remaining)
            val codeMatch = inlineCodeRegex.find(remaining)

            // Find the earliest match
            val earliestMatch = listOfNotNull(
                boldMatch?.let { it.range.first to "bold" },
                codeMatch?.let { it.range.first to "code" }
            ).minByOrNull { it.first }

            if (earliestMatch == null) {
                // No more matches, add remaining as text
                if (remaining.isNotEmpty()) {
                    elements.add(TextElement.Plain(remaining))
                }
                break
            }

            val (matchStart, matchType) = earliestMatch

            // Add text before the match
            if (matchStart > 0) {
                elements.add(TextElement.Plain(remaining.substring(0, matchStart)))
            }

            when (matchType) {
                "bold" -> {
                    val match = boldMatch!!
                    elements.add(TextElement.Bold(match.groupValues[1]))
                    remaining = remaining.substring(match.range.last + 1)
                }
                "code" -> {
                    val match = codeMatch!!
                    val codeContent = match.groupValues[1]
                    // Parse man links within inline code
                    parseInlineCodeContent(codeContent, elements)
                    remaining = remaining.substring(match.range.last + 1)
                }
            }
        }

        return elements
    }

    private fun parseInlineCodeContent(codeContent: String, elements: MutableList<TextElement>) {
        val manLinkRegex = Regex("""\[([^\]]+)]\(/man/([^)]+)\)""")
        var remaining = codeContent

        while (remaining.isNotEmpty()) {
            val match = manLinkRegex.find(remaining)
            if (match != null) {
                // Add text before the match
                if (match.range.first > 0) {
                    val textBefore = remaining.substring(0, match.range.first)
                    if (textBefore.isNotEmpty()) {
                        elements.add(TextElement.Plain(textBefore))
                    }
                }
                // Add the man link
                val manName = match.groupValues[2]
                elements.add(TextElement.Man(manName))

                remaining = remaining.substring(match.range.last + 1)
            } else {
                // No more links, add remaining text
                if (remaining.isNotEmpty()) {
                    elements.add(TextElement.Plain(remaining))
                }
                break
            }
        }
    }

    private fun splitTableRow(line: String): List<String> {
        // Use placeholder to preserve escaped pipes (\|)
        val placeholder = "\u0000PIPE\u0000"
        return line
            .trim()
            .replace("\\|", placeholder)
            .removeSurrounding("|")
            .split("|")
            .map { it.replace(placeholder, "|").trim() }
    }

    private fun cleanHtmlText(text: String): String {
        return text
            .replace(Regex("""<a href="[^"]*">"""), "")
            .replace("</a>", "")
            .replace("<code>", "")
            .replace("</code>", "")
            .replace("&gt;", ">")
            .replace("&lt;", "<")
            .replace("&amp;", "&")
            .trim()
    }

    private fun parseMarkdownCodeToElements(codeContent: String): List<CommandElement> {
        val elements = mutableListOf<CommandElement>()
        var remaining = codeContent

        // Parse [text](/man/command) markdown links
        val linkRegex = Regex("""\[([^\]]+)]\(/man/([^)]+)\)""")

        while (remaining.isNotEmpty()) {
            val match = linkRegex.find(remaining)
            if (match != null) {
                // Add text before the match
                if (match.range.first > 0) {
                    val textBefore = remaining.substring(0, match.range.first)
                    if (textBefore.isNotEmpty()) {
                        elements.add(CommandElement.Text(textBefore))
                    }
                }
                // Add the man link (use the command name from the URL path)
                val manName = match.groupValues[2]
                elements.add(CommandElement.Man(manName))

                // Continue with remaining text
                remaining = remaining.substring(match.range.last + 1)
            } else {
                // No more links, add remaining text
                if (remaining.isNotEmpty()) {
                    elements.add(CommandElement.Text(remaining))
                }
                break
            }
        }

        return elements
    }

    private fun cleanMarkdownCommand(codeContent: String): String {
        // Replace markdown links [text](/man/command) with just the display text
        return codeContent.replace(Regex("""\[([^\]]+)]\(/man/[^)]+\)"""), "$1")
    }
}
