import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.getCommandList
import com.linuxcommandlibrary.shared.getHtmlFileName
import com.linuxcommandlibrary.shared.getSortPriority
import com.linuxcommandlibrary.shared.sortedSearch
import databases.BasicCategory
import databases.Command
import databases.CommandSection
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CommonTests {

    @Test
    fun testCommandListElements() {
        val command = "ps ax | grep firefox"
        val elements = command.getCommandList("ps,grep")
        assertTrue(elements.count { it is CommandElement.Man } == 2)
    }

    @Test
    fun testCommandListSearch() {
        val commands = listOf(
            Command(0, 0, "optipng", "convert"),
            Command(0, 0, "thumbnail", "take png and do something"),
            Command(0, 0, "Pngcheck", "print detailed"),
            Command(0, 0, "png", "png"),
        )

        val filteredCommands = commands.sortedSearch("png")

        assert(filteredCommands.size == 4)

        assertEquals(filteredCommands[0].name, "png")
        assertEquals(filteredCommands[1].name, "Pngcheck")
        assertEquals(filteredCommands[2].name, "optipng")
        assertEquals(filteredCommands[3].name, "thumbnail")
    }

    @Test
    fun testBasicCategory() {
        val category = BasicCategory(0L, 0L, "Users & Groups 2")
        assertEquals(category.getHtmlFileName(), "usersgroups")
    }

    @Test
    fun testSectionSorting() {
        val sections = listOf(
            CommandSection(0L, "SEE ALSO", "", 0L),
            CommandSection(0L, "RANDOM", "", 0L),
            CommandSection(0L, "TLDR", "", 0L),
            CommandSection(0L, "AUTHOR", "", 0L),
            CommandSection(0L, "SYNOPSIS", "", 0L),
        ).sortedBy { it.getSortPriority() }

        assertEquals("TLDR", sections[0].title)
        assertEquals("SYNOPSIS", sections[1].title)
        assertEquals("RANDOM", sections[2].title)
        assertEquals("SEE ALSO", sections[3].title)
        assertEquals("AUTHOR", sections[4].title)
    }
}
