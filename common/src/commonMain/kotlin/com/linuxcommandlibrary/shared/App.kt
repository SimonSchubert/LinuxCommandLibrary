package com.linuxcommandlibrary.shared

import databases.BasicCategory
import databases.Command
import databases.CommandSection
import java.util.*

/* Copyright 2022 Simon Schubert
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

sealed class CommandElement
data class TextCommandElement(val text: String) : CommandElement()
data class ManCommandElement(val man: String) : CommandElement()
data class UrlCommandElement(val command: String, val url: String) : CommandElement()

/**
 * Search in name and description and return sorted by priority
 */
fun List<Command>.search(input: String): List<Command> {
    return this.filter { it.name.contains(input) || it.description.contains(input) }.sortedBy {
        if(it.name.contains(input)) {
            if(it.name == input) {
                0
            } else if(it.name.startsWith(input)) {
                10
            } else {
                20
            }
        } else {
            30
        }
    }
}

/**
 * Return a list of sealed Elements for visual representation
 */
fun String.getCommandList(mans: String, hasBrackets: Boolean = false): List<CommandElement> {
    var command = " $this"
    val list = mutableListOf<CommandElement>()
    mans.split(",").filterNot { it.isEmpty() }.map { it.replace("(", "").replace(")", "") }
        .forEach {
            command = if (it.startsWith("url:")) {
                val cmd = it.substring(4).split("|").first()
                command.replace(cmd, " ü${it}ä")
            } else {
                if (hasBrackets) {
                    command.replace("(?:[\\s,])($it)".toRegex(), " ü${it}ä")
                } else {
                    command.replace(it, " ü${it}ä")
                }
            }
        }

    var currentText = ""
    var currentCommand = ""
    var isCommand = false
    command.trim().forEach {
        if (it == 'ü') {
            list.add(TextCommandElement(currentText.replace("\\n", "")))
            currentText = ""
            isCommand = true
        } else if (it == 'ä') {
            if (currentCommand.isNotBlank()) {
                when {
                    currentCommand.startsWith("url:") -> {
                        val url = currentCommand.split("|").last()
                        val cmd = currentCommand.substring(4).split("|").first()
                        list.add(UrlCommandElement(cmd, url))
                    }
//                    database.getCommandByName(currentCommand) != null -> {
//                        list.add(Man(currentCommand))
//                    }
//                    else -> {
//                        list.add(Text(currentCommand))
//                    }
                    else -> {
                        list.add(ManCommandElement(currentCommand))
                    }
                }
            }
            currentCommand = ""
            isCommand = false
        } else {
            if (isCommand) {
                currentCommand += it
            } else {
                currentText += it
            }
        }
    }
    list.add(TextCommandElement(currentText.replace("[cmd]", "[command]").replace("\\n", "")))
    return list.toList()
}

val onlyCharactersRegex = "[^a-z]".toRegex()

/**
 * Only allow characters in html file names to guarantee matching on the website and app deep linking
 */
fun BasicCategory.getHtmlFileName(): String {
    return this.title.lowercase(Locale.US).replace(onlyCharactersRegex, "")
}

/**
 * Show TLDR and SYNOPSIS always on the top and SEE ALSO and AUTHOR on the bottom. Everything else in between
 */
fun CommandSection.getSortPriority(): Int {
    return when (this.title) {
        "TLDR" -> 0
        "SYNOPSIS" -> 10
        "SEE ALSO" -> 90
        "AUTHOR" -> 100
        else -> 50
    }
}