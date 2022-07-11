package com.linuxcommandlibrary.shared

import databases.BasicCategory
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

sealed class CodeElement
data class TextCodeElement(val text: String) : CodeElement()
data class ManCodeElement(val man: String) : CodeElement()
data class UrlCodeElement(val command: String, val url: String) : CodeElement()

/**
 * Return a list of sealed Elements for visual representation
 */
fun String.getCommandList(mans: String, hasBrackets: Boolean = false): List<CodeElement> {
    var command = " $this"
    val list = mutableListOf<CodeElement>()
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
            list.add(TextCodeElement(currentText.replace("\\n", "")))
            currentText = ""
            isCommand = true
        } else if (it == 'ä') {
            if (currentCommand.isNotBlank()) {
                when {
                    currentCommand.startsWith("url:") -> {
                        val url = currentCommand.split("|").last()
                        val cmd = currentCommand.substring(4).split("|").first()
                        list.add(UrlCodeElement(cmd, url))
                    }
//                    database.getCommandByName(currentCommand) != null -> {
//                        list.add(Man(currentCommand))
//                    }
//                    else -> {
//                        list.add(Text(currentCommand))
//                    }
                    else -> {
                        list.add(ManCodeElement(currentCommand))
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
    list.add(TextCodeElement(currentText.replace("[cmd]", "[command]").replace("\\n", "")))
    return list.toList()
}

/**
 * Only allow characters in html file names to guarantee matching on the website and app deep linking
 */
fun BasicCategory.getHtmlFileName(): String {
    return this.title.lowercase(Locale.US).replace("[^a-z]".toRegex(), "")
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