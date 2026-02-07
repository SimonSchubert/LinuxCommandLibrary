package com.linuxcommandlibrary.app.data

import com.linuxcommandlibrary.shared.MarkdownParser
import com.linuxcommandlibrary.shared.platform.AssetReader

class CommandsRepository(private val assetReader: AssetReader) {

    private var cachedCommands: List<CommandInfo>? = null
    private var cachedCommandNames: Set<String>? = null

    fun getCommands(): List<CommandInfo> {
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

        cachedCommands = commands
        cachedCommandNames = commands.mapTo(HashSet()) { it.name }
        return commands
    }

    fun getCommandsByQuery(query: String): List<CommandInfo> {
        val lowerQuery = query.lowercase()

        return getCommands()
            .map { cmd -> cmd to cmd.name.lowercase() }
            .filter { (_, lowerName) -> lowerName.contains(lowerQuery) }
            .sortedWith(
                compareBy(
                    { (_, lowerName) -> lowerName != lowerQuery },
                    { (_, lowerName) -> !lowerName.startsWith(lowerQuery) },
                    { (cmd, _) -> cmd.name },
                ),
            )
            .map { (cmd, _) -> cmd }
    }

    fun hasCommand(name: String): Boolean = name in (cachedCommandNames ?: getCommands().let { cachedCommandNames!! })

    fun getSections(commandName: String): List<CommandSectionInfo> = try {
        val content = assetReader.readFile("commands/$commandName.md") ?: return emptyList()

        MarkdownParser.splitByHeaders(content, "# ").map { (title, sectionContent) ->
            CommandSectionInfo(
                id = (commandName + title).hashCode().toLong(),
                title = title,
                content = sectionContent,
            )
        }.filter { it.title.uppercase() != "TAGLINE" }
            .sortedBy { it.getSortPriority() }
    } catch (e: Exception) {
        emptyList()
    }
}
