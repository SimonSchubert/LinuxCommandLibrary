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

private val onlyCharactersRegex = "[^a-z]".toRegex()

val basicsSortOrder =
    listOf(
        "One-liners",
        "AI tools",
        "System information",
        "System control",
        "System Recovery",
        "Users & Groups",
        "Files & Folders",
        "Input",
        "Printing",
        "JSON",
        "Network",
        "Search & Find",
        "Git",
        "SSH",
        "Video & Audio",
        "Package manager",
        "Text Processing",
        "Compression & Archiving",
        "Backup & Imaging",
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
