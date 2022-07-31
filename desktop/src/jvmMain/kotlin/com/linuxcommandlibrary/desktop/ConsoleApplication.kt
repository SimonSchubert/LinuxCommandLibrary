package com.linuxcommandlibrary.desktop

import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.initDatabase

const val bold = "\u001b[1m"
const val reset = "\u001b[0m"

fun main() {
    initDatabase()

    showIntro()

    showStartMenu()
}

fun showIntro() {
    println(" _     _  __  _  __ __ __  __  ")
    println("| |__ | ||  \\| ||  |  |\\ \\/ /                    ")
    println("|____||_||_|\\__| \\___/ /_/\\_\\                    ")
    println(" ____  ____  __  __  __  __   ____   __  _  ____ ")
    println("/ (__`/ () \\|  \\/  ||  \\/  | / () \\ |  \\| || _) \\")
    println("\\____)\\____/|_|\\/|_||_|\\/|_|/__/\\__\\|_|\\__||____/")
    println(" _     _ _____ _____   ____  _____ __  __        ")
    println("| |__ | || () )| () ) / () \\ | () )\\ \\/ /        ")
    println("|____||_||_()_)|_|\\_\\/__/\\__\\|_|\\_\\ |__|    ")

    println()
}

fun showStartMenu() {
    println("1. Commands")
    println("2. Basics")
    println("3. Tips")

    val choice = readlnOrNull()?.toIntOrNull() ?: 0
    when (choice) {
        1 -> showSearch()
        2 -> showBasicCategories()
        3 -> showTips()
    }
}

fun showSearch() {
    print("Search: ")
    val input = readlnOrNull() ?: ""
    val commands = databaseHelper.getCommands().filter { it.name.contains(input) }.take(10)
    commands.forEachIndexed { index, command ->
        println("${index + 1} ${command.name}")
    }
    println()
    println("0 Back")

    val choice = readlnOrNull()?.toIntOrNull() ?: 0
    when (choice) {
        0 -> showStartMenu()
        else -> {
            val name = commands[choice - 1].name
            showCommand(name)
        }
    }
}

fun showCommand(name: String) {
    val commandId = databaseHelper.getCommand(name)?.id ?: return

    databaseHelper.getSections(commandId).forEach {
        println(bold + it.title + reset)

        println(
            it.content.replace("<br>", "\n").replace("<b>", bold).replace("</b>", reset)
                .replace(Regex("s/<(.*?)>//g"), "").replace("&nbsp;", "").replace("&amp;", "")
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

    val choice = readlnOrNull()?.toIntOrNull() ?: 0
    when (choice) {
        0 -> showStartMenu()
        else -> {
            val id = categories[choice - 1].id
            showBasicGroups(id)
        }
    }
}

fun showBasicGroups(id: Long) {
    databaseHelper.getBasicGroups(id).forEach { group ->
        println("$bold${group.description}$reset")
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

    val choice = readlnOrNull()?.toIntOrNull() ?: 0
    when (choice) {
        0 -> showStartMenu()
        else -> {
            val id = tips[choice - 1].id
            showTipsDetail(id)
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
    println(data.replace("\\n", "").replace("<b>", bold).replace("</b>", reset))

}