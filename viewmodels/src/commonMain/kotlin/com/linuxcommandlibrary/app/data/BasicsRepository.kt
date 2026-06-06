package com.linuxcommandlibrary.app.data

import com.linuxcommandlibrary.shared.BasicInfo
import com.linuxcommandlibrary.shared.MarkdownParser
import com.linuxcommandlibrary.shared.basicsSortOrder
import com.linuxcommandlibrary.shared.platform.AssetReader
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableMap
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.persistentMapOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.collections.immutable.toImmutableMap

class BasicsRepository(private val assetReader: AssetReader) {

    private var cachedCategories: ImmutableList<BasicCategory>? = null
    private val cachedGroupsAndCommands =
        mutableMapOf<String, Pair<ImmutableList<BasicGroup>, ImmutableMap<Long, ImmutableList<BasicCommand>>>>()

    fun getCategories(): ImmutableList<BasicCategory> {
        cachedCategories?.let { return it }

        val files = assetReader.listFiles("basics")

        val categories = files
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
            .toImmutableList()

        cachedCategories = categories
        return categories
    }

    private fun readCategoryTitle(filename: String): String? = try {
        val content = assetReader.readFile("basics/$filename")
        content?.lines()?.firstOrNull { it.startsWith("# ") }?.removePrefix("# ")?.trim()
    } catch (e: Exception) {
        null
    }

    fun getGroupsAndCommands(
        categoryId: String,
    ): Pair<ImmutableList<BasicGroup>, ImmutableMap<Long, ImmutableList<BasicCommand>>> {
        cachedGroupsAndCommands[categoryId]?.let { return it }

        val groups = mutableListOf<BasicGroup>()
        val commandsByGroupId = mutableMapOf<Long, MutableList<BasicCommand>>()

        try {
            val content = assetReader.readFile("basics/$categoryId.md")
                ?: return Pair(persistentListOf(), persistentMapOf())

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

        val result = Pair(
            groups.toImmutableList(),
            commandsByGroupId.mapValues { it.value.toImmutableList() }.toImmutableMap(),
        )
        cachedGroupsAndCommands[categoryId] = result
        return result
    }

    fun getBasicInfo(categoryId: String): BasicInfo? = try {
        val content = assetReader.readFile("basics/$categoryId.md") ?: return null
        MarkdownParser.parseBasic(content)
    } catch (e: Exception) {
        null
    }

    fun usesCardLayout(categoryId: String): Boolean = categoryId.endsWith("texteditor") ||
        categoryId in setOf("shellscripting", "tmux", "regularexpressions", "terminalgames", "backupimaging")

    fun getMatchingGroups(query: String): ImmutableList<BasicGroupMatch> {
        if (query.isBlank()) return persistentListOf()
        val lower = query.lowercase()
        val matches = mutableListOf<BasicGroupMatch>()
        for (category in getCategories()) {
            val (groups, _) = getGroupsAndCommands(category.id)
            for (group in groups) {
                if (group.description.lowercase().contains(lower)) {
                    matches += BasicGroupMatch(
                        groupId = group.id,
                        description = group.description,
                        categoryId = category.id,
                        categoryTitle = category.title,
                    )
                }
            }
        }
        return matches.toImmutableList()
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
