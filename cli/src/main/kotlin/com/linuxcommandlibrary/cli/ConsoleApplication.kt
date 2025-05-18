package com.linuxcommandlibrary.cli

import com.linuxcommandlibrary.shared.Version
import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.initDatabase
import com.linuxcommandlibrary.shared.sortedSearch
import kotlin.system.exitProcess

const val BOLD = "\u001b[1m"
const val RESET = "\u001b[0m"

fun main() {
    initDatabase()

    showIntro()

    showStartMenu()
}

fun showIntro() {
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

fun showStartMenu() {
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

fun showSearch() {
    print("Search: ")
    val input = readlnOrNull() ?: ""
    val commands = databaseHelper.getCommandsByQuery(input).sortedSearch(input).take(10)
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

fun showCommand(name: String) {
    val commandId = databaseHelper.getCommand(name)?.id ?: return

    databaseHelper.getSections(commandId).forEach {
        println(BOLD + it.title + RESET)

        println(
            it.content.replace("<br>", "\n").replace("<b>", BOLD).replace("</b>", RESET)
                .replace(Regex("s/<(.*?)>//g"), "").replace("&nbsp;", "").replace("&amp;", ""),
        )
        println()
    }

    println("Press enter")
    readlnOrNull()
    showStartMenu()
}

fun showBasicCategories() {
    val categories = databaseHelper.getBasics()
    categories.forEachIndexed { index, basicCategory ->
        println("${index + 1} " + basicCategory.title)
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

fun showBasicGroups(id: Long) {
    databaseHelper.getBasicGroupsByQuery(id).forEach { group ->
        println("$BOLD${group.description}$RESET")
        databaseHelper.getBasicCommands(group.id).forEach { command ->
            println("- " + command.command)
        }
        println()
    }

    println("Press enter")
    readlnOrNull()
    showBasicCategories()
}

fun showTips() {
    val tips = databaseHelper.getTips()
    tips.forEachIndexed { index, tip ->
        println("${index + 1} ${tip.title}")
    }
    println()
    println("0 Back")

    when (val choice = readNumber()) {
        0 -> showStartMenu()
        in 1..tips.size -> {
            val id = tips[choice - 1].id
            showTipsDetail(id)
        }

        else -> {
            println("Invalid input")
            showTips()
        }
    }
}

fun showTipsDetail(id: Long) {
    databaseHelper.getTipSections().filter { it.tip_id == id }.forEach {
        when (it.type) {
            0L -> {
                printTipData(it.data1)
            }

            1L -> {
                printTipData(it.data1)
            }

            3L -> {
                if (it.data1.isNotBlank()) {
                    printTipData(it.data1)
                }
                printTipData(it.data2)
            }
        }
    }

    println("Press enter")
    readlnOrNull()
    showTips()
}

fun printTipData(data: String) {
    println(data.replace("\\n", "").replace("<b>", BOLD).replace("</b>", RESET))
}

fun readNumber(): Int = readlnOrNull()?.toIntOrNull() ?: -1
