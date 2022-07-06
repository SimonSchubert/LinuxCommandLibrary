import com.linuxcommandlibrary.shared.ManElement
import com.linuxcommandlibrary.shared.getCommandList
import com.linuxcommandlibrary.shared.getHtmlFileName
import com.linuxcommandlibrary.shared.getSortPriority
import databases.BasicCategory
import databases.CommandSection
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CommonTests {

    @Test
    fun testCommandListElements() {
        val command = "ps ax | grep firefox"
        val elements = command.getCommandList("ps,grep")
        assertTrue(elements.count { it is ManElement } == 2)
    }

    @Test
    fun testBasicCategory() {
        val category = BasicCategory(0L, 0L, "Users & Groups 2")
        assertTrue(category.getHtmlFileName() == "usersgroups")
    }

    @Test
    fun testSectionSorting() {
        val sections = listOf(
            CommandSection(0L, "SEE ALSO", "", 0L),
            CommandSection(0L, "RANDOM", "", 0L),
            CommandSection(0L, "TLDR", "", 0L),
            CommandSection(0L, "AUTHOR", "", 0L),
            CommandSection(0L, "SYNOPSIS", "", 0L)
        ).sortedBy { it.getSortPriority() }

        assertEquals("TLDR", sections[0].title)
        assertEquals("SYNOPSIS", sections[1].title)
        assertEquals("RANDOM", sections[2].title)
        assertEquals("SEE ALSO", sections[3].title)
        assertEquals("AUTHOR", sections[4].title)
    }
}