package com.linuxcommandlibrary.app.data

import com.linuxcommandlibrary.shared.MarkdownParser
import com.linuxcommandlibrary.shared.platform.AssetReader
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList

class CommandsRepository(private val assetReader: AssetReader) {

    private var cachedCommands: ImmutableList<CommandInfo>? = null
    private var cachedCommandNames: Set<String>? = null
    private var cachedQueryIndex: List<Pair<CommandInfo, String>>? = null

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
        cachedQueryIndex = commands.map { it to it.name.lowercase() }
        return commands
    }

    fun getCommandsByQuery(query: String): ImmutableList<CommandInfo> {
        val lowerQuery = query.lowercase()
        if (cachedQueryIndex == null) getCommands()
        val index = cachedQueryIndex ?: return persistentListOf()

        return index
            .filter { (_, lowerName) -> lowerName.contains(lowerQuery) }
            .sortedWith(
                compareBy(
                    { (_, lowerName) -> lowerName != lowerQuery },
                    { (_, lowerName) -> !lowerName.startsWith(lowerQuery) },
                    { (cmd, _) -> cmd.name },
                ),
            )
            .map { (cmd, _) -> cmd }
            .toImmutableList()
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
