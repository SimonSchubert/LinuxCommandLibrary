package com.linuxcommandlibrary.shared

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

sealed class CommandElement {
    data class Text(val text: String) : CommandElement()
    data class Man(val man: String) : CommandElement()
    data class Url(val command: String, val url: String) : CommandElement()
}

/**
 * Return a list of sealed Elements for visual representation
 */
fun String.getCommandList(
    mans: String,
    hasBrackets: Boolean = false,
): List<CommandElement> {
    var command = " $this"
    val list = mutableListOf<CommandElement>()
    mans.split(",").filterNot { it.isEmpty() }.map { it.replace("(", "").replace(")", "") }
        .forEach {
            command = if (it.startsWith("url:")) {
                val cmd = it.substring(4).split("|").first()
                command.replace(cmd, " ü${it}ä")
            } else {
                if (hasBrackets) {
                    val escapedIt = Regex.escape(it)
                    val regex = "(?:[\\s,])($escapedIt)".toRegex()
                    command.replace(regex, " ü${it}ä")
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
            list.add(CommandElement.Text(currentText.replace("\n", "")))
            currentText = ""
            isCommand = true
        } else if (it == 'ä') {
            if (currentCommand.isNotBlank()) {
                when {
                    currentCommand.startsWith("url:") -> {
                        val url = currentCommand.split("|").last()
                        val cmd = currentCommand.substring(4).split("|").first()
                        list.add(CommandElement.Url(cmd, url))
                    }

                    else -> {
                        list.add(CommandElement.Man(currentCommand))
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
    list.add(CommandElement.Text(currentText.replace("[cmd]", "[command]").replace("\n", "")))
    return list.toList()
}

val onlyCharactersRegex = "[^a-z]".toRegex()

val basicsSortOrder =
    listOf(
        "One-liners",
        "AI tools",
        "System information",
        "System control",
        "Users & Groups",
        "Files & Folders",
        "Input",
        "Printing",
        "JSON",
        "Network",
        "Search & Find",
        "GIT",
        "SSH",
        "Video & Audio",
        "Package manager",
        "Text Processing",
        "Compression & Archiving",
        "Hacking tools",
        "Terminal games",
        "Cryptocurrencies",
        "Shell Scripting",
        "Tmux",
        "Regular Expressions",
        "VIM Text Editor",
        "Emacs Text Editor",
        "Nano Text Editor",
        "Pico Text Editor",
        "Micro Text Editor",
    )

/**
 * Only allow characters in html file names to guarantee matching on the website and app deep linking
 */
fun String.toHtmlFileName(): String = this.lowercase().replace(onlyCharactersRegex, "")

fun String.isLetter(): Boolean = this.firstOrNull() in 'a'..'z' || this.firstOrNull() in 'A'..'Z'
