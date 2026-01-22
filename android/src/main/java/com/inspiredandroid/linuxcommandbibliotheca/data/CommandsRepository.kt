package com.inspiredandroid.linuxcommandbibliotheca.data

import android.content.Context
import com.linuxcommandlibrary.shared.MarkdownParser

class CommandsRepository(private val context: Context) {

    private var cachedCommands: List<CommandInfo>? = null

    fun getCommands(): List<CommandInfo> {
        cachedCommands?.let { return it }

        val assetManager = context.assets
        val files = assetManager.list("commands") ?: return emptyList()

        val commands = files
            .filter { it.endsWith(".md") }
            .map { filename ->
                val name = filename.removeSuffix(".md")
                CommandInfo(
                    id = name.hashCode().toLong(),
                    name = name,
                )
            }
            .sortedBy { it.name }

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
                    // Exact match first
                    { it.name.lowercase() != lowerQuery },
                    // Starts with query second
                    { !it.name.lowercase().startsWith(lowerQuery) },
                    // Then alphabetically
                    { it.name },
                ),
            )
    }

    fun hasCommand(name: String): Boolean = getCommands().any { it.name == name }

    fun getSections(commandName: String): List<CommandSectionInfo> = try {
        val content = context.assets.open("commands/$commandName.md").bufferedReader().readText()

        // Use shared parser which properly handles code blocks
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
