import com.linuxcommandlibrary.shared.CommandElement
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
        assertTrue(elements.count { it is CommandElement.Man } == 2)
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
}
