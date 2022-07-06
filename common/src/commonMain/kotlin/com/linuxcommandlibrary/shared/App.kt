package com.linuxcommandlibrary.shared

import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    Button(onClick = {
        text = "Hello, ${getPlatformName()}"
    }) {
        Text(text)
    }
}


sealed class Element
data class TextElement(val text: String) : Element()
data class ManElement(val man: String) : Element()
data class UrlElement(val command: String, val url: String) : Element()

fun String.getCommandList(mans: String, hasBrackets: Boolean = false): List<Element> {
    var command = " $this"
    val list = mutableListOf<Element>()
    mans.split(",").filterNot { it.isEmpty() }.map { it.replace("(", "").replace(")", "") }.forEach {
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
            list.add(TextElement(currentText))
            currentText = ""
            isCommand = true
        } else if (it == 'ä') {
            if (currentCommand.isNotBlank()) {
                when {
                    currentCommand.startsWith("url:") -> {
                        val url = currentCommand.split("|").last()
                        val cmd = currentCommand.substring(4).split("|").first()
                        list.add(UrlElement(cmd, url))
                    }
//                    database.getCommandByName(currentCommand) != null -> {
//                        list.add(Man(currentCommand))
//                    }
//                    else -> {
//                        list.add(Text(currentCommand))
//                    }
                    else -> {
                        list.add(ManElement(currentCommand))
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
    list.add(TextElement(currentText.replace("[cmd]", "[command]")))
    return list.toList()
}

fun BasicCategory.getHtmlFileName(): String {
    return this.title.lowercase(Locale.getDefault()).replace("[^a-z]".toRegex(), "")
}

fun CommandSection.getSortPriority(): Int {
    return when (this.title) {
        "TLDR" -> 0
        "SYNOPSIS" -> 10
        "SEE ALSO" -> 90
        "AUTHOR" -> 100
        else -> 50
    }
}