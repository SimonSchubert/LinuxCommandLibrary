package com.inspiredandroid.linuxcommandbibliotheca.data

import android.content.Context
import com.linuxcommandlibrary.shared.MarkdownParser
import com.linuxcommandlibrary.shared.basicsSortOrder

class BasicsRepository(private val context: Context) {

    fun getCategories(): List<BasicCategory> {
        val assetManager = context.assets
        val files = assetManager.list("basics") ?: return emptyList()

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
        context.assets.open("basics/$filename").bufferedReader().useLines { lines ->
            lines.firstOrNull { it.startsWith("# ") }?.removePrefix("# ")?.trim()
        }
    } catch (e: Exception) {
        null
    }

    fun getGroupsAndCommands(categoryId: String): Pair<List<BasicGroup>, Map<Long, List<BasicCommand>>> {
        val groups = mutableListOf<BasicGroup>()
        val commandsByGroupId = mutableMapOf<Long, MutableList<BasicCommand>>()

        try {
            val content = context.assets.open("basics/$categoryId.md").bufferedReader().readText()

            // Use shared parser which properly handles code blocks when splitting by headers
            val groupSections = MarkdownParser.splitByHeaders(content, "## ")

            for ((description, groupContent) in groupSections) {
                val groupId = (categoryId + description).hashCode().toLong()
                groups.add(BasicGroup(id = groupId, description = description))
                commandsByGroupId[groupId] = mutableListOf()

                // Extract commands from the group content
                var commandIndex = 0
                val lines = groupContent.lines()

                for (line in lines) {
                    // Handle inline code blocks (```command```)
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
        // Extract code content from ```...```
        val codeContent = line.trim().removeSurrounding("```")

        // Extract man page names from [text](/man/xxx) links
        val manRegex = Regex("""\[([^\]]+)]\(/man/([^)]+)\)""")
        val mans = manRegex.findAll(codeContent)
            .map { it.groupValues[2] }
            .distinct()
            .joinToString(",")

        // Remove markdown link syntax to get clean command text
        val command = codeContent.replace(manRegex, "$1").trim()

        return Pair(command, mans)
    }
}
