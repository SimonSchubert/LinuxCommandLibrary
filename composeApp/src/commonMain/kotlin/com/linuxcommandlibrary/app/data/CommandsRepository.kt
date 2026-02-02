package com.linuxcommandlibrary.app.data

import com.linuxcommandlibrary.shared.MarkdownParser
import com.linuxcommandlibrary.shared.platform.AssetReader

class CommandsRepository(private val assetReader: AssetReader) {

    private var cachedCommands: List<CommandInfo>? = null

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
        return commands
    }

    fun getCommandsByQuery(query: String): List<CommandInfo> {
        val commands = getCommands()
        val lowerQuery = query.lowercase()

        return commands
            .filter { it.name.lowercase().contains(lowerQuery) }
            .sortedWith(
                compareBy(
                    { it.name.lowercase() != lowerQuery },
                    { !it.name.lowercase().startsWith(lowerQuery) },
                    { it.name },
                ),
            )
    }

    fun hasCommand(name: String): Boolean = getCommands().any { it.name == name }

    fun getSections(commandName: String): List<CommandSectionInfo> = try {
        val content = assetReader.readFile("commands/$commandName.md") ?: return emptyList()

        MarkdownParser.splitByHeaders(content, "# ").map { (title, sectionContent) ->
            CommandSectionInfo(
                id = (commandName + title).hashCode().toLong(),
                title = title,
                content = sectionContent,
            )
        }.sortedBy { it.getSortPriority() }
    } catch (e: Exception) {
        emptyList()
    }
}
