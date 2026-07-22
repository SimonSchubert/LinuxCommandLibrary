import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.InstallEntries
import com.linuxcommandlibrary.shared.MarkdownParser
import com.linuxcommandlibrary.shared.TipSectionElement
import com.linuxcommandlibrary.shared.getCommandList
import com.linuxcommandlibrary.shared.getSectionSortPriority
import com.linuxcommandlibrary.shared.toHtmlFileName
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
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

    @Test
    fun testInstallLineParsesManagerCommandAndPackageUrl() {
        val entry = InstallEntries.parseCodeLine("apt: sudo apt install 7zip")!!
        assertEquals("apt", entry.manager)
        assertEquals("sudo apt install 7zip", entry.command)
        assertEquals("7zip", entry.packageName)
        assertEquals(
            "https://packages.debian.org/search?keywords=7zip",
            entry.packageUrl,
        )
    }

    @Test
    fun testInstallNixPackageNameAfterHash() {
        val entry = InstallEntries.parseCodeLine(
            "nix: nix profile install nixpkgs#ripgrep",
        )!!
        assertEquals("nix", entry.manager)
        assertEquals("ripgrep", entry.packageName)
        assertEquals(
            "https://search.nixos.org/packages?query=ripgrep",
            entry.packageUrl,
        )
    }

    @Test
    fun testInstallIgnoresUnknownManagerAndGarbage() {
        assertNull(InstallEntries.parseCodeLine("foo: bar install baz"))
        assertNull(InstallEntries.parseCodeLine("just a plain command"))
        assertNull(InstallEntries.parseCodeLine("apt:"))
    }

    @Test
    fun testInstallSectionParsesMultipleManagers() {
        val content = """
            ```apt: sudo apt install 7zip```

            ```brew: brew install 7zip```

            <!-- packages: 2026-07-22 -->
        """.trimIndent()
        val entries = InstallEntries.parseFromElements(MarkdownParser.parseMarkdownContent(content))
        assertEquals(listOf("apt", "brew"), entries.map { it.manager })
        assertEquals("https://formulae.brew.sh/formula/7zip", entries.last().packageUrl)
    }

    @Test
    fun testInstallSortsBeforeSeeAlso() {
        assertTrue(getSectionSortPriority("INSTALL") < getSectionSortPriority("SEE ALSO"))
        assertTrue(getSectionSortPriority("INSTALL") < getSectionSortPriority("RESOURCES"))
        assertTrue(getSectionSortPriority("INSTALL") < getSectionSortPriority("HISTORY"))
    }
}
