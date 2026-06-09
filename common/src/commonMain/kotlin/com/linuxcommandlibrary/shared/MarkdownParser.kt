package com.linuxcommandlibrary.shared

import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

/**
 * Shared markdown parsing utilities for text formatting, code blocks, and man page links.
 */
object MarkdownParser {

    /**
     * Parse text with **bold** and _italic_ formatting into TextElement list.
     */
    fun parseTextWithBold(text: String): ImmutableList<TextElement> {
        val elements = mutableListOf<TextElement>()
        val boldRegex = Regex("""\*\*([^*]+)\*\*""")
        val italicRegex = Regex("""_([^_]+)_""")
        var remaining = text

        while (remaining.isNotEmpty()) {
            val boldMatch = boldRegex.find(remaining)
            val italicMatch = italicRegex.find(remaining)

            // Find the earliest match
            val earliestMatch = listOfNotNull(
                boldMatch?.let { it.range.first to "bold" },
                italicMatch?.let { it.range.first to "italic" },
            ).minByOrNull { it.first }

            if (earliestMatch == null) {
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

                "italic" -> {
                    val match = italicMatch!!
                    elements.add(TextElement.Italic(match.groupValues[1]))
                    remaining = remaining.substring(match.range.last + 1)
                }
            }
        }

        return elements.toImmutableList()
    }

    /**
     * Parse code content for markdown links into CommandElement list.
     * Handles [text](/man/command) cross references and [text](https://...) external resource links.
     */
    fun parseCodeToElements(code: String): List<CommandElement> {
        val elements = mutableListOf<CommandElement>()
        var remaining = code

        // Parse [text](target) markdown links, classifying the target afterwards
        val linkRegex = Regex("""\[([^\]]+)]\(([^)]+)\)""")

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
                val label = match.groupValues[1]
                val target = match.groupValues[2]
                when {
                    // Man page cross reference (use the command name from the URL path)
                    target.startsWith("/man/") -> elements.add(CommandElement.Man(target.removePrefix("/man/")))

                    // External resource link (clickable, opens in browser)
                    target.startsWith("http://") || target.startsWith("https://") ->
                        elements.add(CommandElement.Url(label, target))

                    // Unknown target: fall back to the display text
                    else -> elements.add(CommandElement.Text(label))
                }

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

    /**
     * Strip markdown link syntax from code content.
     * Replaces [text](target) with just the display text.
     */
    fun cleanMarkdownCommand(code: String): String = code.replace(Regex("""\[([^\]]+)]\([^)]+\)"""), "$1")

    /**
     * Parse markdown content into sections suitable for display.
     * Handles bold text, code blocks (triple backticks), and blockquotes.
     */
    fun parseMarkdownContent(content: String): ImmutableList<TipSectionElement> {
        val sections = mutableListOf<TipSectionElement>()
        val lines = content.lines()
        var i = 0

        while (i < lines.size) {
            val line = lines[i]

            when {
                // HTML comment (hidden metadata, e.g. <!-- verified: 2026-06-09 -->) - never rendered
                line.trim().startsWith("<!--") -> {
                    // Skip the comment; for a multi-line comment, skip until the closing marker
                    if (!line.trim().endsWith("-->")) {
                        i++
                        while (i < lines.size && !lines[i].trim().endsWith("-->")) i++
                    }
                    i++
                }

                // Inline code block ```code``` (must have content between markers, length > 6)
                line.trim().let { it.startsWith("```") && it.endsWith("```") && it.length > 6 } -> {
                    val codeContent = line.trim().removeSurrounding("```")
                    val elements = parseCodeToElements(codeContent)
                    sections.add(
                        TipSectionElement.Code(
                            command = cleanMarkdownCommand(codeContent),
                            elements = elements.toImmutableList(),
                        ),
                    )
                    i++
                }

                // Multi-line code block (opening or closing)
                line.trim().startsWith("```") -> {
                    val codeLines = mutableListOf<String>()
                    i++ // Skip opening ```
                    while (i < lines.size && !lines[i].trim().startsWith("```")) {
                        codeLines.add(lines[i])
                        i++
                    }
                    if (i < lines.size) i++ // Skip closing ```
                    val codeContent = codeLines.joinToString("\n")
                    val elements = parseCodeToElements(codeContent)
                    sections.add(
                        TipSectionElement.Code(
                            command = cleanMarkdownCommand(codeContent),
                            elements = elements.toImmutableList(),
                        ),
                    )
                }

                // Blockquote
                line.trim().startsWith(">") -> {
                    val quoteContent = line.trim().removePrefix(">").trim()
                    if (quoteContent.isNotEmpty()) {
                        sections.add(TipSectionElement.Blockquote(parseTextWithBold(quoteContent)))
                    }
                    i++
                }

                // Markdown table
                line.trim().startsWith("|") && line.trim().endsWith("|") -> {
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

                // Plain text
                line.trim().isNotEmpty() -> {
                    val cleanText = line.trim()
                    sections.add(TipSectionElement.Text(parseTextWithBold(cleanText)))
                    i++
                }

                else -> {
                    i++
                }
            }
        }

        return sections.toImmutableList()
    }

    /**
     * Parse markdown table lines into a Table element.
     */
    fun parseMarkdownTable(lines: List<String>): TipSectionElement.Table? {
        if (lines.size < 2) return null

        // Parse header row (first row)
        val headerLine = lines[0]
        val headers = splitTableRow(headerLine).map { parseTableCellContent(it) }.toImmutableList()

        // Skip separator row (second row with dashes) and parse data rows
        val dataRows = lines.drop(2).mapNotNull { line ->
            // Skip separator rows (contain only |, -, and spaces)
            if (line.trim().replace(Regex("[|\\-\\s]"), "").isEmpty()) {
                return@mapNotNull null
            }
            splitTableRow(line).map { parseTableCellContent(it) }.toImmutableList()
        }.toImmutableList()

        if (headers.isEmpty()) return null

        return TipSectionElement.Table(headers = headers, rows = dataRows)
    }

    /**
     * Parse content within a table cell, handling bold, italic, inline code, and man links.
     */
    fun parseTableCellContent(cell: String): ImmutableList<TextElement> {
        val elements = mutableListOf<TextElement>()
        var remaining = cell

        // Pattern to match bold (**text**), italic (_text_), inline code with man link (`[text](/man/command) ...`), or plain inline code (`...`)
        val boldRegex = Regex("""\*\*([^*]+)\*\*""")
        val italicRegex = Regex("""_([^_]+)_""")
        val inlineCodeRegex = Regex("""`([^`]+)`""")

        while (remaining.isNotEmpty()) {
            val boldMatch = boldRegex.find(remaining)
            val italicMatch = italicRegex.find(remaining)
            val codeMatch = inlineCodeRegex.find(remaining)

            // Find the earliest match
            val earliestMatch = listOfNotNull(
                boldMatch?.let { it.range.first to "bold" },
                italicMatch?.let { it.range.first to "italic" },
                codeMatch?.let { it.range.first to "code" },
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

                "italic" -> {
                    val match = italicMatch!!
                    elements.add(TextElement.Italic(match.groupValues[1]))
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

        return elements.toImmutableList()
    }

    /**
     * Parse inline code content for man links.
     */
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

    /**
     * Split a markdown table row into cells.
     */
    fun splitTableRow(line: String): List<String> {
        // Use placeholder to preserve escaped pipes (\|)
        val placeholder = "\u0000PIPE\u0000"
        return line
            .trim()
            .replace("\\|", placeholder)
            .removeSurrounding("|")
            .split("|")
            .map { it.replace(placeholder, "|").trim() }
    }

    /**
     * Split markdown content by header level, respecting code blocks.
     * Returns list of pairs: (headerTitle, contentUnderHeader)
     *
     * @param content The markdown content to split
     * @param headerPrefix The header prefix to split by (e.g., "# " or "## ")
     */
    fun splitByHeaders(content: String, headerPrefix: String): List<Pair<String, String>> {
        val sections = mutableListOf<Pair<String, String>>()
        val lines = content.lines()
        var insideCodeBlock = false
        var currentTitle: String? = null
        val currentContent = StringBuilder()

        for (line in lines) {
            // Track code block boundaries
            if (line.trim().startsWith("```")) {
                val trimmed = line.trim()
                // Only toggle for multi-line code blocks, not inline ones like ```code```
                // Check if there's a closing ``` after the opening ```
                val afterOpening = if (trimmed.length > 3) trimmed.substring(3) else ""
                val isInlineCodeBlock = afterOpening.contains("```")
                if (!isInlineCodeBlock) {
                    insideCodeBlock = !insideCodeBlock
                }
            }

            // Only treat as header if NOT inside code block
            if (!insideCodeBlock && line.startsWith(headerPrefix) &&
                (headerPrefix == "## " || !line.startsWith("## "))
            ) {
                // Save previous section
                if (currentTitle != null) {
                    sections.add(currentTitle to currentContent.toString().trim())
                }
                currentTitle = line.removePrefix(headerPrefix).trim()
                currentContent.clear()
            } else if (currentTitle != null) {
                currentContent.appendLine(line)
            }
        }

        // Save last section
        if (currentTitle != null) {
            sections.add(currentTitle to currentContent.toString().trim())
        }

        return sections
    }

    /**
     * Parse a tips markdown file into list of TipInfo.
     */
    fun parseTips(content: String): ImmutableList<TipInfo> = splitByHeaders(content, "## ").map { (title, sectionContent) ->
        TipInfo(
            id = title.hashCode().toLong(),
            title = title,
            sections = parseMarkdownContent(sectionContent),
        )
    }.toImmutableList()

    /**
     * Parse a basics markdown file into BasicInfo.
     */
    fun parseBasic(content: String): BasicInfo {
        val lines = content.lines()
        var title = ""

        // Find the title (# Header)
        for (line in lines) {
            if (line.startsWith("# ") && !line.startsWith("## ")) {
                title = line.removePrefix("# ").trim()
                break
            }
        }

        // Get groups using ## headers
        val groups = splitByHeaders(content, "## ").map { (groupTitle, groupContent) ->
            BasicGroup(
                id = groupTitle.hashCode().toLong(),
                description = groupTitle,
                sections = parseMarkdownContent(groupContent),
            )
        }.toImmutableList()

        return BasicInfo(title = title, groups = groups)
    }

    /**
     * Parse a command markdown file into CommandInfo.
     */
    fun parseCommand(content: String, commandName: String): CommandInfo? {
        val sections = splitByHeaders(content, "# ").map { (sectionTitle, sectionContent) ->
            CommandSectionInfo(
                title = sectionTitle,
                content = sectionContent,
                elements = parseMarkdownContent(sectionContent),
            )
        }.toImmutableList()

        if (sections.isEmpty()) return null

        // Extract description from TAGLINE section (first line of text)
        var description: String? = null
        val tldrSection = sections.find { it.title.uppercase() == "TAGLINE" }
        if (tldrSection != null) {
            val firstTextLine = tldrSection.content.lines()
                .firstOrNull { it.trim().isNotEmpty() && !it.trim().startsWith("```") }
            description = firstTextLine?.trim()?.replace(Regex("\\*\\*([^*]+)\\*\\*"), "$1") ?: ""
        }

        return CommandInfo(
            name = commandName,
            description = description,
            sections = sections,
        )
    }
}
