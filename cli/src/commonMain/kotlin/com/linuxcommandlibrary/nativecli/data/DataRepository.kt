package com.linuxcommandlibrary.nativecli.data

import com.linuxcommandlibrary.nativecli.data.generated.allCommands
import com.linuxcommandlibrary.nativecli.data.generated.basicsData
import com.linuxcommandlibrary.nativecli.data.generated.commandNames
import com.linuxcommandlibrary.nativecli.data.generated.tipsData
import com.linuxcommandlibrary.shared.BasicInfo
import com.linuxcommandlibrary.shared.MarkdownParser
import com.linuxcommandlibrary.shared.TipInfo
import com.linuxcommandlibrary.shared.getSectionSortPriority
import com.linuxcommandlibrary.shared.rankByNameMatch

data class CommandInfo(val name: String)

data class BasicCategory(val id: String, val title: String)

data class CommandSection(val title: String, val content: String)

object DataRepository {

    fun getCommandNames(): List<String> = commandNames

    fun hasCommand(name: String): Boolean = allCommands.containsKey(name)

    fun getCommands(): List<CommandInfo> = commandNames.map { CommandInfo(it) }

    private val lowerCommandNames by lazy { commandNames.map { it.lowercase() } }

    fun getCommandsByQuery(query: String): List<CommandInfo> = rankByNameMatch(commandNames, lowerCommandNames, query).map { CommandInfo(it) }

    fun getCommandSections(name: String): List<CommandSection> {
        val content = allCommands[name] ?: return emptyList()
        return MarkdownParser.splitByHeaders(content, "# ").map { (title, sectionContent) ->
            CommandSection(title, sectionContent)
        }.filter { it.title.uppercase() != "TAGLINE" }
            .sortedBy { getSectionSortPriority(it.title) }
    }

    fun getBasicCategories(): List<BasicCategory> = basicsData.mapNotNull { (id, content) ->
        MarkdownParser.parseTitle(content)?.let { BasicCategory(id = id, title = it) }
    }.sortedBy { it.title }

    fun getBasicInfo(categoryId: String): BasicInfo? {
        val content = basicsData[categoryId] ?: return null
        return MarkdownParser.parseBasic(content)
    }

    fun getTips(): List<TipInfo> = MarkdownParser.parseTips(tipsData)
}
