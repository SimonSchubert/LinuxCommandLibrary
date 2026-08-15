package com.linuxcommandlibrary.app.data

import com.linuxcommandlibrary.shared.MarkdownParser
import com.linuxcommandlibrary.shared.platform.AssetReader
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList

class CommandsRepository(private val assetReader: AssetReader) {

    private var cachedCommands: ImmutableList<CommandInfo>? = null
    private var cachedCommandNames: Set<String>? = null

    /** Lowercased command names, positionally parallel to [cachedCommands]. */
    private var cachedLowerNames: List<String>? = null

    private val sectionsCache = linkedMapOf<String, ImmutableList<CommandSectionInfo>>()
    private val sectionsCacheMaxSize = 50

    fun getCommands(): ImmutableList<CommandInfo> {
        cachedCommands?.let { return it }

        val files = assetReader.listFiles("commands")

        val commands = files
            .filter { it.endsWith(".md") }
            .map { it.removeSuffix(".md") }
            .sorted()
            .mapIndexed { index, name ->
                CommandInfo(
                    id = index.toLong(),
                    name = name,
                )
            }
            .toImmutableList()

        cachedCommands = commands
        cachedCommandNames = commands.mapTo(HashSet()) { it.name }
        cachedLowerNames = commands.map { it.name.lowercase() }
        return commands
    }

    /**
     * Commands whose name contains [query], exact match first, then prefix matches, then the rest,
     * each group alphabetical.
     *
     * Bucketing rather than sorting: [getCommands] already returns names in ascending order, so
     * appending in input order keeps each bucket alphabetical for free. This runs on every
     * keystroke against ~9k commands, where the comparator sort was doing O(n log n) work plus
     * boxing a Boolean per comparison.
     */
    fun getCommandsByQuery(query: String): ImmutableList<CommandInfo> {
        val commands = cachedCommands ?: getCommands()
        val lowerNames = cachedLowerNames ?: return persistentListOf()
        val lowerQuery = query.lowercase()

        val exact = mutableListOf<CommandInfo>()
        val prefixed = mutableListOf<CommandInfo>()
        val contained = mutableListOf<CommandInfo>()

        // Iterated rather than indexed: an ImmutableList is a trie, so commands[i] walks it.
        var i = 0
        for (command in commands) {
            val lowerName = lowerNames[i++]
            if (!lowerName.contains(lowerQuery)) continue
            when {
                lowerName == lowerQuery -> exact += command
                lowerName.startsWith(lowerQuery) -> prefixed += command
                else -> contained += command
            }
        }

        val result = ArrayList<CommandInfo>(exact.size + prefixed.size + contained.size)
        result.addAll(exact)
        result.addAll(prefixed)
        result.addAll(contained)
        return result.toImmutableList()
    }

    fun hasCommand(name: String): Boolean {
        val names = cachedCommandNames
            ?: getCommands().mapTo(HashSet()) { it.name }.also { cachedCommandNames = it }
        return name in names
    }

    fun getSections(commandName: String): ImmutableList<CommandSectionInfo> {
        sectionsCache.remove(commandName)?.let {
            sectionsCache[commandName] = it
            return it
        }

        val sections = try {
            val content = assetReader.readFile("commands/$commandName.md") ?: return persistentListOf()

            MarkdownParser.splitByHeaders(content, "# ").map { (title, sectionContent) ->
                CommandSectionInfo(
                    id = (commandName + title).hashCode().toLong(),
                    title = title,
                    content = sectionContent,
                    parsedContent = MarkdownParser.parseMarkdownContent(sectionContent),
                )
            }.filter { it.title.uppercase() != "TAGLINE" }
                .sortedBy { it.getSortPriority() }
                .toImmutableList()
        } catch (e: Exception) {
            persistentListOf()
        }

        sectionsCache[commandName] = sections
        if (sectionsCache.size > sectionsCacheMaxSize) {
            sectionsCache.remove(sectionsCache.keys.first())
        }
        return sections
    }
}
