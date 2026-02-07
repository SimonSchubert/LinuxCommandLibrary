package com.linuxcommandlibrary.nativecli.data

import com.linuxcommandlibrary.nativecli.data.generated.allCommands
import com.linuxcommandlibrary.nativecli.data.generated.basicsData
import com.linuxcommandlibrary.nativecli.data.generated.commandNames
import com.linuxcommandlibrary.nativecli.data.generated.tipsData
import com.linuxcommandlibrary.shared.BasicInfo
import com.linuxcommandlibrary.shared.MarkdownParser
import com.linuxcommandlibrary.shared.TipInfo

data class CommandInfo(val name: String)

data class BasicCategory(val id: String, val title: String)

data class CommandSection(val title: String, val content: String)

object DataRepository {

    fun getCommandNames(): List<String> = commandNames

    fun getCommands(): List<CommandInfo> = commandNames.map { CommandInfo(it) }

    fun getCommandsByQuery(query: String): List<CommandInfo> {
        val lowerQuery = query.lowercase()
        return commandNames
            .filter { it.lowercase().contains(lowerQuery) }
            .sortedWith(
                compareBy(
                    { it.lowercase() != lowerQuery },
                    { !it.lowercase().startsWith(lowerQuery) },
                    { it },
                ),
            )
            .map { CommandInfo(it) }
    }

    fun getCommandContent(name: String): String? = allCommands[name]

    fun getCommandSections(name: String): List<CommandSection> {
        val content = allCommands[name] ?: return emptyList()
        return MarkdownParser.splitByHeaders(content, "# ").map { (title, sectionContent) ->
            CommandSection(title, sectionContent)
        }.filter { it.title.uppercase() != "TAGLINE" }
            .sortedBy { getSortPriority(it.title) }
    }

    private fun getSortPriority(title: String): Int = when (title.uppercase()) {
        "TLDR" -> 0
        "NAME" -> 1
        "SYNOPSIS" -> 2
        "DESCRIPTION" -> 3
        "PARAMETERS" -> 4
        "OPTIONS" -> 5
        "EXAMPLES" -> 6
        "CONFIGURATION" -> 7
        "CAVEATS" -> 90
        "HISTORY" -> 91
        "AUTHOR" -> 92
        "SEE ALSO" -> 93
        else -> 50
    }

    fun getBasicCategories(): List<BasicCategory> = basicsData.mapNotNull { (id, content) ->
        val title = content.lines().firstOrNull { it.startsWith("# ") }
            ?.removePrefix("# ")?.trim()
        if (title != null) {
            BasicCategory(id = id, title = title)
        } else {
            null
        }
    }.sortedBy { it.title }

    fun getBasicContent(categoryId: String): String? = basicsData[categoryId]

    fun getBasicInfo(categoryId: String): BasicInfo? {
        val content = basicsData[categoryId] ?: return null
        return MarkdownParser.parseBasic(content)
    }

    fun getTipsContent(): String = tipsData

    fun getTips(): List<TipInfo> = MarkdownParser.parseTips(tipsData)
}
