package com.inspiredandroid.linuxcommandbibliotheca.data

import android.content.Context

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
            .sortedBy { it.title }
    }

    private fun readCategoryTitle(filename: String): String? {
        return try {
            context.assets.open("basics/$filename").bufferedReader().useLines { lines ->
                lines.firstOrNull { it.startsWith("# ") }?.removePrefix("# ")?.trim()
            }
        } catch (e: Exception) {
            null
        }
    }

    fun getGroupsAndCommands(categoryId: String): Pair<List<BasicGroup>, Map<Long, List<BasicCommand>>> {
        val groups = mutableListOf<BasicGroup>()
        val commandsByGroupId = mutableMapOf<Long, MutableList<BasicCommand>>()

        try {
            val content = context.assets.open("basics/$categoryId.md").bufferedReader().readText()
            val lines = content.lines()

            var currentGroupId: Long? = null
            var commandIndex = 0

            for (line in lines) {
                when {
                    line.startsWith("## ") -> {
                        val description = line.removePrefix("## ").trim()
                        val groupId = (categoryId + description).hashCode().toLong()
                        groups.add(BasicGroup(id = groupId, description = description))
                        currentGroupId = groupId
                        commandsByGroupId[groupId] = mutableListOf()
                        commandIndex = 0
                    }
                    line.contains("<code>") && currentGroupId != null -> {
                        val (command, mans) = parseCommandLine(line)
                        val commandId = (categoryId + currentGroupId + commandIndex).hashCode().toLong()
                        commandsByGroupId[currentGroupId]?.add(
                            BasicCommand(id = commandId, command = command, mans = mans)
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
        // Extract command from <code>...</code>
        val codeRegex = Regex("<code>(.*?)</code>")
        val codeMatch = codeRegex.find(line)
        val codeContent = codeMatch?.groupValues?.get(1) ?: ""

        // Extract man links from <a href="/man/xxx">
        val manRegex = Regex("""<a href="/man/([^"]+)">""")
        val mans = manRegex.findAll(codeContent)
            .map { it.groupValues[1] }
            .distinct()
            .joinToString(",")

        // Remove HTML tags to get clean command text
        val command = codeContent
            .replace(Regex("""<a href="[^"]*">"""), "")
            .replace("</a>", "")
            .replace("&gt;", ">")
            .replace("&lt;", "<")
            .replace("&amp;", "&")
            .trim()

        return Pair(command, mans)
    }
}
