package com.inspiredandroid.linuxcommandbibliotheca.data

import android.content.Context

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

    fun getCommand(name: String): CommandInfo? = getCommands().find { it.name == name }

    fun hasCommand(name: String): Boolean = getCommands().any { it.name == name }

    fun getSections(commandName: String): List<CommandSectionInfo> {
        val sections = mutableListOf<CommandSectionInfo>()

        try {
            val content = context.assets.open("commands/$commandName.md").bufferedReader().readText()
            val lines = content.lines()

            var currentTitle: String? = null
            val currentContent = StringBuilder()

            for (line in lines) {
                if (line.startsWith("# ")) {
                    // Save previous section if exists
                    if (currentTitle != null) {
                        sections.add(
                            CommandSectionInfo(
                                id = (commandName + currentTitle).hashCode().toLong(),
                                title = currentTitle,
                                content = currentContent.toString().trim(),
                            ),
                        )
                    }
                    // Start new section
                    currentTitle = line.removePrefix("# ").trim()
                    currentContent.clear()
                } else if (currentTitle != null) {
                    currentContent.appendLine(line)
                }
            }

            // Save the last section
            if (currentTitle != null) {
                sections.add(
                    CommandSectionInfo(
                        id = (commandName + currentTitle).hashCode().toLong(),
                        title = currentTitle,
                        content = currentContent.toString().trim(),
                    ),
                )
            }
        } catch (e: Exception) {
            // Return empty on error
        }

        return sections.sortedBy { it.getSortPriority() }
    }
}
