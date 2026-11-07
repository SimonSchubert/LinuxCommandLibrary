package com.linuxcommandlibrary.app.data

import com.linuxcommandlibrary.shared.MarkdownParser
import com.linuxcommandlibrary.shared.platform.AssetReader
import com.linuxcommandlibrary.shared.rankByNameMatch
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

    /** Commands whose name contains [query], ranked by [rankByNameMatch]. Runs on every keystroke. */
    fun getCommandsByQuery(query: String): ImmutableList<CommandInfo> {
        val commands = cachedCommands ?: getCommands()
        val lowerNames = cachedLowerNames ?: return persistentListOf()
        return rankByNameMatch(commands, lowerNames, query).toImmutableList()
    }

    fun hasCommand(name: String): Boolean {
        getCommands()
        return name in cachedCommandNames!!
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
