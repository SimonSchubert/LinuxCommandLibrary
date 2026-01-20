package com.linuxcommandlibrary.cli

import com.linuxcommandlibrary.shared.MarkdownParser
import com.linuxcommandlibrary.shared.TipSectionElement
import com.linuxcommandlibrary.shared.Version
import kotlin.system.exitProcess

const val BOLD = "\u001b[1m"
const val ITALIC = "\u001b[3m"
const val RESET = "\u001b[0m"

// Data classes for CLI
data class CommandInfo(val name: String)
data class CommandSection(val title: String, val content: String)
data class BasicCategory(val id: String, val title: String)
data class TipInfo(val id: Long, val title: String, val sections: List<TipSectionElement>)

fun main() {
    showIntro()
    showStartMenu()
}

private fun showIntro() {
    println(" _     _  __  _  __ __ __  __")
    println("| |__ | ||  \\| ||  |  |\\ \\/ /")
    println("|____||_||_|\\__| \\___/ /_/\\_\\")
    println(" ____  ____  __  __  __  __   ____   __  _  ____")
    println("/ (__`/ () \\|  \\/  ||  \\/  | / () \\ |  \\| || _) \\")
    println("\\____)\\____/|_|\\/|_||_|\\/|_|/__/\\__\\|_|\\__||____/")
    println(" _     _ _____ _____   ____  _____ __  __")
    println("| |__ | || () )| () ) / () \\ | () )\\ \\/ /")
    println("|____||_||_()_)|_|\\_\\/__/\\__\\|_|\\_\\ |__|")
    println("Version: ${Version.appVersion}")
}

private fun showStartMenu() {
    println()
    println("1 Commands")
    println("2 Basics")
    println("3 Tips")
    println()
    println("0 Exit")

    when (readNumber()) {
        0 -> exitProcess(0)
        1 -> showSearch()
        2 -> showBasicCategories()
        3 -> showTips()
        else -> {
            println("Invalid input")
            showStartMenu()
        }
    }
}

// Helper function to read classpath resources
private fun readResource(path: String): String? {
    return object {}.javaClass.getResourceAsStream("/$path")?.bufferedReader()?.readText()
}

// Command functions
private fun getCommands(): List<CommandInfo> {
    val index = readResource("commands.index") ?: return emptyList()
    return index.lines()
        .filter { it.isNotBlank() }
        .map { CommandInfo(it) }
        .sortedBy { it.name }
}

private fun getCommandsByQuery(query: String): List<CommandInfo> {
    val lowerQuery = query.lowercase()
    return getCommands()
        .filter { it.name.lowercase().contains(lowerQuery) }
        .sortedWith(
            compareBy(
                { it.name.lowercase() != lowerQuery },
                { !it.name.lowercase().startsWith(lowerQuery) },
                { it.name },
            ),
        )
}

private fun getSections(commandName: String): List<CommandSection> {
    val sections = mutableListOf<CommandSection>()
    val content = readResource("commands/$commandName.md") ?: return sections

    val lines = content.lines()
    var currentTitle: String? = null
    val currentContent = StringBuilder()

    for (line in lines) {
        if (line.startsWith("# ")) {
            if (currentTitle != null) {
                sections.add(CommandSection(currentTitle, currentContent.toString().trim()))
            }
            currentTitle = line.removePrefix("# ").trim()
            currentContent.clear()
        } else if (currentTitle != null) {
            currentContent.appendLine(line)
        }
    }

    if (currentTitle != null) {
        sections.add(CommandSection(currentTitle, currentContent.toString().trim()))
    }

    return sections.sortedBy { getSortPriority(it.title) }
}

private fun getSortPriority(title: String): Int = when (title.uppercase()) {
    "TLDR" -> 0
    "SYNOPSIS" -> 10
    "DESCRIPTION" -> 20
    "SEE ALSO" -> 90
    "AUTHOR" -> 100
    else -> 50
}

private fun showSearch() {
    print("Search: ")
    val input = readlnOrNull() ?: ""
    val commands = getCommandsByQuery(input).take(10)
    if (commands.isEmpty()) {
        println("No results for \"$input\"")
        showSearch()
        return
    }
    commands.forEachIndexed { index, command ->
        println("${index + 1} ${command.name}")
    }
    println()
    println("0 Back")

    when (val choice = readNumber()) {
        0 -> showStartMenu()
        in 1..commands.size -> {
            val name = commands[choice - 1].name
            showCommand(name)
        }
        else -> {
            println("Invalid input")
            showSearch()
        }
    }
}

private fun showCommand(name: String) {
    val sections = getSections(name)
    if (sections.isEmpty()) {
        println("Command not found: $name")
        showStartMenu()
        return
    }

    sections.forEach { section ->
        println(BOLD + section.title + RESET)
        // Convert markdown to plain text for CLI display
        val content = section.content
            .replace(Regex("\\*\\*([^*]+)\\*\\*")) { "${BOLD}${it.groupValues[1]}$RESET" } // Bold
            .replace(Regex("_([^_]+)_")) { "${ITALIC}${it.groupValues[1]}$RESET" } // Italic
            .replace(Regex("```([^`]+)```")) { "$ ${it.groupValues[1]}" } // Code blocks
            .replace(Regex("\\[([^\\]]+)]\\(/man/[^)]+\\)")) { it.groupValues[1] } // Man links
            .replace(Regex("> (.+)")) { "  ${it.groupValues[1]}" } // Blockquotes
        println(content)
        println()
    }

    println("Press enter")
    readlnOrNull()
    showStartMenu()
}

// Basic categories functions
private fun getBasicCategories(): List<BasicCategory> {
    val index = readResource("basics.index") ?: return emptyList()
    return index.lines()
        .filter { it.isNotBlank() }
        .mapNotNull { id ->
            val content = readResource("basics/$id.md") ?: return@mapNotNull null
            val title = content.lines().firstOrNull { it.startsWith("# ") }
                ?.removePrefix("# ")?.trim()
            if (title != null) {
                BasicCategory(id = id, title = title)
            } else {
                null
            }
        }
        .sortedBy { it.title }
}

private fun showBasicCategories() {
    val categories = getBasicCategories()
    categories.forEachIndexed { index, category ->
        println("${index + 1} ${category.title}")
    }
    println()
    println("0 Back")

    when (val choice = readNumber()) {
        0 -> showStartMenu()
        in 1..categories.size -> {
            val id = categories[choice - 1].id
            showBasicGroups(id)
        }
        else -> {
            println("Invalid input")
            showBasicCategories()
        }
    }
}

private fun showBasicGroups(categoryId: String) {
    val content = readResource("basics/$categoryId.md")
    if (content == null) {
        println("Category not found")
        showBasicCategories()
        return
    }

    val lines = content.lines()
    var currentGroup: String? = null

    for (line in lines) {
        when {
            line.startsWith("## ") -> {
                if (currentGroup != null) println()
                currentGroup = line.removePrefix("## ").trim()
                println("$BOLD$currentGroup$RESET")
            }
            line.trim().startsWith("```") && currentGroup != null -> {
                val code = line.trim().removeSurrounding("```")
                    .replace(Regex("\\[([^\\]]+)]\\(/man/[^)]+\\)")) { it.groupValues[1] } // Remove man links
                println("- $ $code")
            }
        }
    }

    println()
    println("Press enter")
    readlnOrNull()
    showBasicCategories()
}

// Tips functions
private fun getTips(): List<TipInfo> {
    val content = readResource("tips.md") ?: return emptyList()
    val tips = mutableListOf<TipInfo>()

    val tipBlocks = content.split(Regex("(?=^## )", RegexOption.MULTILINE))
        .filter { it.trim().startsWith("## ") }

    for (block in tipBlocks) {
        val lines = block.lines()
        val titleLine = lines.firstOrNull() ?: continue
        val title = titleLine.removePrefix("## ").trim()
        if (title.isEmpty()) continue

        val contentLines = lines.drop(1).joinToString("\n")
        val sections = MarkdownParser.parseMarkdownContent(contentLines)

        tips.add(
            TipInfo(
                id = title.hashCode().toLong(),
                title = title,
                sections = sections,
            ),
        )
    }

    return tips
}

private fun showTips() {
    val tips = getTips()
    tips.forEachIndexed { index, tip ->
        println("${index + 1} ${tip.title}")
    }
    println()
    println("0 Back")

    when (val choice = readNumber()) {
        0 -> showStartMenu()
        in 1..tips.size -> {
            showTipDetail(tips[choice - 1])
        }
        else -> {
            println("Invalid input")
            showTips()
        }
    }
}

private fun showTipDetail(tip: TipInfo) {
    println("$BOLD${tip.title}$RESET")
    println()

    tip.sections.forEach { section ->
        when (section) {
            is TipSectionElement.Text -> {
                val text = section.elements.joinToString("") { element ->
                    when (element) {
                        is com.linuxcommandlibrary.shared.TextElement.Plain -> element.text
                        is com.linuxcommandlibrary.shared.TextElement.Bold -> "$BOLD${element.text}$RESET"
                        is com.linuxcommandlibrary.shared.TextElement.Italic -> "$ITALIC${element.text}$RESET"
                        is com.linuxcommandlibrary.shared.TextElement.Man -> element.man
                    }
                }
                println(text)
            }
            is TipSectionElement.Blockquote -> {
                val text = section.elements.joinToString("") { element ->
                    when (element) {
                        is com.linuxcommandlibrary.shared.TextElement.Plain -> element.text
                        is com.linuxcommandlibrary.shared.TextElement.Bold -> "$BOLD${element.text}$RESET"
                        is com.linuxcommandlibrary.shared.TextElement.Italic -> "$ITALIC${element.text}$RESET"
                        is com.linuxcommandlibrary.shared.TextElement.Man -> element.man
                    }
                }
                println("  > $text")
            }
            is TipSectionElement.Code -> {
                println("$ ${section.command}")
            }
            is TipSectionElement.Table -> {
                // Simple table rendering
                section.rows.forEach { row ->
                    val rowText = row.joinToString(" | ") { cells ->
                        cells.joinToString("") { element ->
                            when (element) {
                                is com.linuxcommandlibrary.shared.TextElement.Plain -> element.text
                                is com.linuxcommandlibrary.shared.TextElement.Bold -> "$BOLD${element.text}$RESET"
                                is com.linuxcommandlibrary.shared.TextElement.Italic -> "$ITALIC${element.text}$RESET"
                                is com.linuxcommandlibrary.shared.TextElement.Man -> element.man
                            }
                        }
                    }
                    println(rowText)
                }
            }
        }
    }

    println()
    println("Press enter")
    readlnOrNull()
    showTips()
}

private fun readNumber(): Int = readlnOrNull()?.toIntOrNull() ?: -1
