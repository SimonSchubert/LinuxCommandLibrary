import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.MarkdownParser
import com.linuxcommandlibrary.shared.TipSectionElement
import com.linuxcommandlibrary.shared.getCommandList
import com.linuxcommandlibrary.shared.toHtmlFileName
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CommonTests {

    @Test
    fun testCommandListElements() {
        val command = "ps ax | grep firefox"
        val elements = command.getCommandList("ps,grep")
        assertEquals(elements.count { it is CommandElement.Man }, 2)
    }

    @Test
    fun testHtmlFileName() {
        assertEquals("usersgroups".toHtmlFileName(), "usersgroups")
        assertEquals("Users & Groups 2".toHtmlFileName(), "usersgroups")
        assertEquals("Files & Folders".toHtmlFileName(), "filesfolders")
    }

    @Test
    fun testCommandListWithUrls() {
        val command = "install nvm"
        val elements = command.getCommandList("url:nvm|https://github.com/nvm-sh/nvm")
        assertTrue(elements.any { it is CommandElement.Url })
    }

    @Test
    fun testCommandListEmptyMans() {
        val command = "echo hello"
        val elements = command.getCommandList("")
        assertTrue(elements.all { it is CommandElement.Text })
    }

    @Test
    fun testParseExternalUrlInCodeBlock() {
        val elements = MarkdownParser.parseCodeToElements("Source [github.com/x/y](https://github.com/x/y)")
        val url = elements.filterIsInstance<CommandElement.Url>().single()
        assertEquals("github.com/x/y", url.command)
        assertEquals("https://github.com/x/y", url.url)
    }

    @Test
    fun testParseManLinkStillWorks() {
        val elements = MarkdownParser.parseCodeToElements("see [tar](/man/tar)")
        assertEquals("tar", elements.filterIsInstance<CommandElement.Man>().single().man)
    }

    @Test
    fun testHtmlCommentIsHidden() {
        val sections = MarkdownParser.parseMarkdownContent(
            "```[Homepage](https://example.org)```\n<!-- verified: 2026-06-09 -->",
        )
        assertTrue(sections.none { it is TipSectionElement.Text })
        assertTrue(sections.any { it is TipSectionElement.Code })
    }

    @Test
    fun testResourcesSectionParsesToLabeledChips() {
        // Mirrors the extraction the command detail view model does for RESOURCES chips.
        val content = "```[Source code](https://github.com/x/y)```\n\n" +
            "```[Documentation](https://x.dev/docs)```\n\n" +
            "<!-- verified: 2026-06-09 -->"
        val urls = MarkdownParser.parseMarkdownContent(content)
            .filterIsInstance<TipSectionElement.Code>()
            .flatMap { it.elements }
            .filterIsInstance<CommandElement.Url>()
        assertEquals(listOf("Source code", "Documentation"), urls.map { it.command })
        assertEquals("https://github.com/x/y", urls.first().url)
    }
}
