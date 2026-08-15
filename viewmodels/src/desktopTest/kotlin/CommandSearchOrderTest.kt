import com.linuxcommandlibrary.app.data.CommandsRepository
import com.linuxcommandlibrary.shared.platform.AssetReader
import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

private class FileAssetReader : AssetReader {
    override fun listFiles(path: String): List<String> = File("../assets/$path/index.txt").readLines()
    override fun readFile(path: String): String? = File("../assets/$path").takeIf { it.exists() }?.readText()
}

/**
 * Guards the ordering contract of [CommandsRepository.getCommandsByQuery].
 *
 * It buckets matches instead of sorting them, which only yields alphabetical groups because
 * [CommandsRepository.getCommands] hands back names already in ascending order. Both halves of that
 * assumption are asserted here, so a change to either one fails loudly rather than quietly
 * reshuffling search results.
 */
class CommandSearchOrderTest {

    private val repository = CommandsRepository(FileAssetReader())

    @Test
    fun commandsAreReturnedInAscendingNameOrder() {
        val names = repository.getCommands().map { it.name }
        assertEquals(names.sorted(), names)
    }

    @Test
    fun resultsAreExactThenPrefixThenContained() {
        listOf("e", "a", "ls", "grep", "git", "GREP").forEach { query ->
            val lower = query.lowercase()
            val results = repository.getCommandsByQuery(query).map { it.name }
            assertTrue(results.isNotEmpty(), "expected hits for '$query'")

            val ranks = results.map { name ->
                val lowerName = name.lowercase()
                assertTrue(lowerName.contains(lower), "'$name' does not match '$query'")
                when {
                    lowerName == lower -> 0
                    lowerName.startsWith(lower) -> 1
                    else -> 2
                }
            }
            assertEquals(ranks.sorted(), ranks, "buckets out of order for '$query'")

            // Alphabetical within each bucket.
            ranks.distinct().forEach { rank ->
                val bucket = results.filterIndexed { i, _ -> ranks[i] == rank }
                assertEquals(bucket.sorted(), bucket, "bucket $rank unsorted for '$query'")
            }
        }
    }

    @Test
    fun queryMatchingIsCaseInsensitive() {
        assertEquals(repository.getCommandsByQuery("grep"), repository.getCommandsByQuery("GrEp"))
    }
}
