package com.inspiredandroid.linuxcommandbibliotheca.data

import android.content.Context
import com.linuxcommandlibrary.shared.MarkdownParser
import com.linuxcommandlibrary.shared.TextElement
import com.linuxcommandlibrary.shared.TipSectionElement
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

data class TipInfo(
    val id: Long,
    val title: String,
    val sections: ImmutableList<TipSectionElement>,
    val markdown: String,
)

class TipsRepository(private val context: Context) {

    fun getTips(): List<TipInfo> = try {
        val content = context.assets.open("tips.md").bufferedReader().readText()
        parseTips(content)
    } catch (e: Exception) {
        emptyList()
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
                    markdown = content,
                ),
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
                        val table = MarkdownParser.parseMarkdownTable(tableLines)
                        if (table != null) {
                            sections.add(table)
                        }
                    }
                }
                line.trim().startsWith("```") && line.trim().endsWith("```") -> {
                    // Markdown inline code block
                    val codeContent = line.trim().removeSurrounding("```")
                    val elements = MarkdownParser.parseCodeToElements(codeContent)
                    sections.add(
                        TipSectionElement.Code(
                            command = MarkdownParser.cleanMarkdownCommand(codeContent),
                            elements = elements,
                        ),
                    )
                    i++
                }
                line.trim().isNotEmpty() -> {
                    // Plain text with potential bold formatting
                    val cleanText = cleanHtmlText(line.trim())
                    if (cleanText.isNotEmpty()) {
                        sections.add(TipSectionElement.Text(MarkdownParser.parseTextWithBold(cleanText)))
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

    private fun cleanHtmlText(text: String): String = text
        .replace(Regex("""<a href="[^"]*">"""), "")
        .replace("</a>", "")
        .replace("<code>", "")
        .replace("</code>", "")
        .replace("&gt;", ">")
        .replace("&lt;", "<")
        .replace("&amp;", "&")
        .trim()
}
