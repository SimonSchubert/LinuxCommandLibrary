package com.linuxcommandlibrary.app.data

import com.linuxcommandlibrary.shared.MarkdownParser
import com.linuxcommandlibrary.shared.basicsSortOrder
import com.linuxcommandlibrary.shared.platform.AssetReader

class BasicsRepository(private val assetReader: AssetReader) {

    fun getCategories(): List<BasicCategory> {
        val files = assetReader.listFiles("basics")

        return files
            .filter { it.endsWith(".md") }
            .mapNotNull { filename ->
                val id = filename.removeSuffix(".md")
                val title = readCategoryTitle(filename)
                if (title != null) {
                    BasicCategory(id = id, title = title)
                } else {
                    null
                }
            }
            .sortedBy { basicsSortOrder.indexOf(it.title) }
    }

    private fun readCategoryTitle(filename: String): String? = try {
        val content = assetReader.readFile("basics/$filename")
        content?.lines()?.firstOrNull { it.startsWith("# ") }?.removePrefix("# ")?.trim()
    } catch (e: Exception) {
        null
    }

    fun getGroupsAndCommands(categoryId: String): Pair<List<BasicGroup>, Map<Long, List<BasicCommand>>> {
        val groups = mutableListOf<BasicGroup>()
        val commandsByGroupId = mutableMapOf<Long, MutableList<BasicCommand>>()

        try {
            val content = assetReader.readFile("basics/$categoryId.md") ?: return Pair(emptyList(), emptyMap())

            val groupSections = MarkdownParser.splitByHeaders(content, "## ")

            for ((description, groupContent) in groupSections) {
                val groupId = (categoryId + description).hashCode().toLong()
                groups.add(BasicGroup(id = groupId, description = description))
                commandsByGroupId[groupId] = mutableListOf()

                var commandIndex = 0
                val lines = groupContent.lines()

                for (line in lines) {
                    if (line.trim().startsWith("```") && line.trim().endsWith("```") && line.trim().length > 6) {
                        val (command, mans) = parseCommandLine(line)
                        val commandId = (categoryId + groupId + commandIndex).hashCode().toLong()
                        commandsByGroupId[groupId]?.add(
                            BasicCommand(id = commandId, command = command, mans = mans),
                        )
                        commandIndex++
                    }
                }
            }
        } catch (e: Exception) {
            // Return empty on error
        }

        return Pair(groups, commandsByGroupId)
    }

    private fun parseCommandLine(line: String): Pair<String, String> {
        val codeContent = line.trim().removeSurrounding("```")

        val manRegex = Regex("""\[([^\]]+)]\(/man/([^)]+)\)""")
        val mans = manRegex.findAll(codeContent)
            .map { it.groupValues[2] }
            .distinct()
            .joinToString(",")

        val command = codeContent.replace(manRegex, "$1").trim()

        return Pair(command, mans)
    }
}
