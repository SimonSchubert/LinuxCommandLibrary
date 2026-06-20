import com.linuxcommandlibrary.nativecli.ContentFormatter
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/** OSC 8 hyperlink introducer emitted by Mordant: ESC ] 8 ; */
private const val OSC8 = "]8;"

/** Strip SGR styling so we can assert on the visible text. */
private fun String.visible(): String = replace(Regex("\\[[0-9;]*m"), "")

class ContentFormatterTest {

    // --- Non-interactive output: man references are clickable web links ---

    @Test
    fun seeAlsoManLinksBecomeWebLinks() {
        val input = "[7za](/man/7za)(1), [tar](/man/tar)(1)"
        val output = ContentFormatter.format("SEE ALSO", input)

        assertContains(output, OSC8)
        assertContains(output, "https://linuxcommandlibrary.com/man/7za")
        assertContains(output, "https://linuxcommandlibrary.com/man/tar")
        assertContains(output, "7za")
        assertContains(output, "(1)")
        assertFalse(output.contains("](/man/"), "markdown man-link syntax should be replaced")
    }

    @Test
    fun resourcesUrlsBecomeClickable() {
        val input = """
            ```[Source code](https://github.com/ip7z/7zip)```

            ```[Homepage](https://www.7-zip.org/)```

            <!-- verified: 2026-06-10 -->
        """.trimIndent()
        val output = ContentFormatter.format("RESOURCES", input)

        assertContains(output, OSC8)
        assertContains(output, "https://github.com/ip7z/7zip")
        assertContains(output, "https://www.7-zip.org/")
        assertContains(output, "Source code")
        assertContains(output, "Homepage")
        assertFalse(output.contains("verified:"), "verified metadata comment should be dropped")
        assertFalse(output.contains("```"), "resource code fences should be stripped")
    }

    // --- Interactive output: man references are in-app navigable, with click regions ---

    @Test
    fun interactiveSeeAlsoReportsClickRegions() {
        val input = "[7za](/man/7za)(1), [7zr](/man/7zr)(1)"
        val section = ContentFormatter.formatInteractive("SEE ALSO", input)

        // Single rendered line whose visible text keeps the labels and section numbers.
        assertEquals(1, section.lines.size)
        assertEquals("7za(1), 7zr(1)", section.lines[0].visible())

        // In-app links carry no web URL (no OSC 8 hyperlink).
        assertFalse(section.lines[0].contains(OSC8), "interactive man links must not be web links")

        // The reported regions line up with where the labels actually render.
        assertEquals(
            listOf(
                ContentFormatter.ManLink(lineIndex = 0, startCol = 0, endCol = 3, command = "7za"),
                ContentFormatter.ManLink(lineIndex = 0, startCol = 8, endCol = 11, command = "7zr"),
            ),
            section.links,
        )
    }

    @Test
    fun interactiveColumnsAccountForStylingBeforeTheLink() {
        // Bold markup expands to invisible SGR codes; the link column must count visible chars only.
        val section = ContentFormatter.formatInteractive("DESCRIPTION", "**Note** see [tar](/man/tar)")

        assertEquals("Note see tar", section.lines[0].visible())
        assertEquals(
            listOf(ContentFormatter.ManLink(lineIndex = 0, startCol = 9, endCol = 12, command = "tar")),
            section.links,
        )
    }

    @Test
    fun plainTextWithoutLinksHasNoRegions() {
        val section = ContentFormatter.formatInteractive("DESCRIPTION", "A simple description with no links.")
        assertTrue(section.links.isEmpty())
        assertEquals("A simple description with no links.", section.lines[0].visible())
    }
}
