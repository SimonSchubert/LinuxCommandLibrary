package com.linuxcommandlibrary.app.ui.screens.commanddetail

import com.linuxcommandlibrary.app.data.CommandSectionInfo
import com.linuxcommandlibrary.shared.TipSectionElement
import com.linuxcommandlibrary.shared.tableCellsInRenderOrder
import com.linuxcommandlibrary.shared.toPlainText

/**
 * One occurrence of a search query in a command page.
 *
 * The address is deliberately flat ints rather than nested types or an `IntRange`, so it bridges
 * to Swift as a plain struct with no wrapper classes.
 *
 * [subIndex] is 0 for text, blockquote and code elements, which render one string each. Tables
 * render many, so their cells are numbered by `tableCellsInRenderOrder`. [start] and [end] are
 * offsets into that rendered string, end-exclusive.
 */
data class ManPageMatch(
    val sectionIndex: Int,
    val elementIndex: Int,
    val subIndex: Int,
    val start: Int,
    val end: Int,
)

/**
 * Finds every occurrence of [query] in the text a command page actually draws, in render order.
 *
 * Shared by the Compose and SwiftUI detail screens so both platforms count and number matches
 * identically. Offsets are measured against `toPlainText()`, which is the contract both renderers
 * follow when building their styled strings.
 *
 * Matching is case-insensitive and non-overlapping.
 */
fun findManPageMatches(
    sections: List<CommandSectionInfo>,
    seeAlsoCommands: List<String>,
    resources: List<ResourceLink>,
    query: String,
): List<ManPageMatch> {
    if (query.isEmpty()) return emptyList()

    val matches = mutableListOf<ManPageMatch>()
    sections.forEachIndexed { sectionIndex, section ->
        // SEE ALSO and RESOURCES render as chips rather than text when they have data, on both
        // platforms. Their markdown is then never on screen and must not be counted - otherwise
        // the counter promises hits the user can never be scrolled to.
        val rendersAsChips = (section.title == "SEE ALSO" && seeAlsoCommands.isNotEmpty()) ||
            (section.title == "RESOURCES" && resources.isNotEmpty())
        if (rendersAsChips) return@forEachIndexed

        section.parsedContent.forEachIndexed { elementIndex, element ->
            when (element) {
                is TipSectionElement.Text -> matches += matchesIn(
                    text = element.elements.toPlainText(),
                    query = query,
                    sectionIndex = sectionIndex,
                    elementIndex = elementIndex,
                    subIndex = 0,
                )

                is TipSectionElement.Blockquote -> matches += matchesIn(
                    text = element.elements.toPlainText(),
                    query = query,
                    sectionIndex = sectionIndex,
                    elementIndex = elementIndex,
                    subIndex = 0,
                )

                is TipSectionElement.Code -> matches += matchesIn(
                    text = element.elements.toPlainText(),
                    query = query,
                    sectionIndex = sectionIndex,
                    elementIndex = elementIndex,
                    subIndex = 0,
                )

                is TipSectionElement.Table ->
                    tableCellsInRenderOrder(element.headers, element.rows)
                        .forEachIndexed { subIndex, cell ->
                            matches += matchesIn(
                                text = cell.toPlainText(),
                                query = query,
                                sectionIndex = sectionIndex,
                                elementIndex = elementIndex,
                                subIndex = subIndex,
                            )
                        }
            }
        }
    }
    return matches
}

private fun matchesIn(
    text: String,
    query: String,
    sectionIndex: Int,
    elementIndex: Int,
    subIndex: Int,
): List<ManPageMatch> {
    if (text.isEmpty()) return emptyList()
    val result = mutableListOf<ManPageMatch>()
    var from = 0
    while (from <= text.length - query.length) {
        val start = text.indexOf(query, from, ignoreCase = true)
        if (start < 0) break
        result += ManPageMatch(
            sectionIndex = sectionIndex,
            elementIndex = elementIndex,
            subIndex = subIndex,
            start = start,
            end = start + query.length,
        )
        from = start + query.length
    }
    return result
}
