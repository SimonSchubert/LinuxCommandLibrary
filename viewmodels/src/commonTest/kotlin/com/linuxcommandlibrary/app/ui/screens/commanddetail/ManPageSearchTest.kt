package com.linuxcommandlibrary.app.ui.screens.commanddetail

import com.linuxcommandlibrary.app.data.CommandSectionInfo
import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.TextElement
import com.linuxcommandlibrary.shared.TipSectionElement
import kotlinx.collections.immutable.persistentListOf
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ManPageSearchTest {

    private fun section(
        title: String,
        vararg elements: TipSectionElement,
    ) = CommandSectionInfo(
        id = title.hashCode().toLong(),
        title = title,
        content = "",
        parsedContent = persistentListOf(*elements),
    )

    private fun text(vararg parts: TextElement) = TipSectionElement.Text(persistentListOf(*parts))

    @Test
    fun findsCaseInsensitiveNonOverlappingMatches() {
        val sections = listOf(
            section("DESCRIPTION", text(TextElement.Plain("Delete and delete and DELETE"))),
        )

        val matches = findManPageMatches(sections, emptyList(), emptyList(), "delete")

        assertEquals(3, matches.size)
        assertEquals(listOf(0, 11, 22), matches.map { it.start })
        assertTrue(matches.all { it.end - it.start == 6 })
        assertTrue(matches.all { it.sectionIndex == 0 && it.elementIndex == 0 && it.subIndex == 0 })
    }

    @Test
    fun overlappingCandidatesAreNotDoubleCounted() {
        val sections = listOf(section("NAME", text(TextElement.Plain("aaaa"))))

        val matches = findManPageMatches(sections, emptyList(), emptyList(), "aa")

        assertEquals(2, matches.size)
        assertEquals(listOf(0, 2), matches.map { it.start })
    }

    @Test
    fun offsetsAccountForStyledRunsAndManLinks() {
        // The rendered string is "run grep now" - offsets must be measured across the whole
        // concatenation, not per element.
        val sections = listOf(
            section(
                "DESCRIPTION",
                text(
                    TextElement.Plain("run "),
                    TextElement.Man("grep"),
                    TextElement.Bold(" now"),
                ),
            ),
        )

        val matches = findManPageMatches(sections, emptyList(), emptyList(), "grep")

        assertEquals(1, matches.size)
        assertEquals(4, matches.single().start)
        assertEquals(8, matches.single().end)
    }

    @Test
    fun numbersTableCellsHeadersFirstThenRowsLeftToRight() {
        val table = TipSectionElement.Table(
            headers = persistentListOf(
                persistentListOf(TextElement.Plain("Code")),
                persistentListOf(TextElement.Plain("hit")),
            ),
            rows = persistentListOf(
                persistentListOf(
                    persistentListOf(TextElement.Plain("0")),
                    persistentListOf(TextElement.Plain("hit")),
                ),
            ),
        )
        val sections = listOf(section("EXIT STATUS", table))

        val matches = findManPageMatches(sections, emptyList(), emptyList(), "hit")

        // Header cell 1, then row cell at index 2 + 1 = 3.
        assertEquals(listOf(1, 3), matches.map { it.subIndex })
    }

    @Test
    fun skipsSeeAlsoAndResourcesWhenTheyRenderAsChips() {
        val sections = listOf(
            section("SEE ALSO", text(TextElement.Plain("grep"))),
            section("RESOURCES", text(TextElement.Plain("grep"))),
        )

        val asChips = findManPageMatches(
            sections = sections,
            seeAlsoCommands = listOf("grep"),
            resources = listOf(ResourceLink("Source", "https://example.com")),
            query = "grep",
        )
        assertEquals(0, asChips.size, "chip-rendered sections show no markdown, so nothing to find")

        val asMarkdown = findManPageMatches(sections, emptyList(), emptyList(), "grep")
        assertEquals(2, asMarkdown.size, "with no chip data both sections fall back to markdown")
    }

    @Test
    fun matchesInsideCodeBlocks() {
        val sections = listOf(
            section(
                "TLDR",
                TipSectionElement.Code(
                    command = "find . -delete",
                    elements = persistentListOf(
                        CommandElement.Man("find"),
                        CommandElement.Text(" . -delete"),
                    ),
                ),
            ),
        )

        val matches = findManPageMatches(sections, emptyList(), emptyList(), "delete")

        assertEquals(1, matches.size)
        assertEquals(8, matches.single().start)
    }

    @Test
    fun emptyQueryFindsNothing() {
        val sections = listOf(section("NAME", text(TextElement.Plain("anything"))))
        assertEquals(0, findManPageMatches(sections, emptyList(), emptyList(), "").size)
    }

    @Test
    fun matchesAreReturnedInRenderOrder() {
        val sections = listOf(
            section("NAME", text(TextElement.Plain("x"))),
            section("DESCRIPTION", text(TextElement.Plain("x")), text(TextElement.Plain("x"))),
        )

        val matches = findManPageMatches(sections, emptyList(), emptyList(), "x")

        assertEquals(
            listOf(0 to 0, 1 to 0, 1 to 1),
            matches.map { it.sectionIndex to it.elementIndex },
        )
    }
}
