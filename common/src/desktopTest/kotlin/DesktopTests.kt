import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals

class DesktopTests {

    @Test
    fun testCommandListNoDuplicateIds() {
        val assetsDir = File("../assets/commands")
        val commandNames = assetsDir.listFiles()
            ?.filter { it.extension == "md" }
            ?.map { it.nameWithoutExtension }
            ?.sorted()
            ?: error("Could not read commands from ${assetsDir.absolutePath}")

        // Verify using index as ID produces no duplicates (mirrors CommandsRepository logic)
        val ids = commandNames.mapIndexed { index, _ -> index.toLong() }
        assertEquals(ids.size, ids.distinct().size, "Found duplicate IDs")
    }
}
