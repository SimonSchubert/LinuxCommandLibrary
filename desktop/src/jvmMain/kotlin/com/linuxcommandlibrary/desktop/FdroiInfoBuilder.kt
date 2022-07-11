package com.linuxcommandlibrary.desktop

import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.initDatabase
import java.io.File
import java.io.PrintStream

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

fun main() {
    initDatabase()

    val builder = FdroidInfoBuilder()
    builder.buildFullDescription()
    builder.buildShortDescription()
}

class FdroidInfoBuilder {

    fun buildFullDescription() {
        val file = File("fastlane/metadata/android/en-US/full_description.txt")
        val stream = PrintStream(file)
        stream.appendLine("The app currently has <b>${databaseHelper.getCommands().size}</b> manual pages, <b>${databaseHelper.getBasics().size}</b> basic categories and a bunch of general terminal tips. It works 100% offline, doesn't need an internet connection and has no tracking software.")
        stream.appendLine()
        stream.appendLine("<b>Categories</b>")
        stream.appendLine()
        databaseHelper.getBasics().forEach { category ->
            stream.appendLine("* ${category.title}")
        }
        stream.appendLine()
        stream.appendLine("<b>Tips</b>")
        stream.appendLine()
        databaseHelper.getTips().forEach { tip ->
            stream.appendLine("* ${tip.title}")
        }

        stream.close()
    }

    fun buildShortDescription() {
        val file = File("fastlane/metadata/android/en-US/short_description.txt")
        val stream = PrintStream(file)
        stream.appendLine("${databaseHelper.getCommands().size} manual pages, ${databaseHelper.getBasics().size} basic categories and a bunch of general terminal tips.")

        stream.close()
    }
}