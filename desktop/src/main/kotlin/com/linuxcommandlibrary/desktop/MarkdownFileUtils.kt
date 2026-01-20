package com.linuxcommandlibrary.desktop

import java.io.File

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

/**
 * Utility functions for reading content from markdown files.
 * Provides database-free access to commands, basics, and tips data.
 */
object MarkdownFileUtils {

    /**
     * Count the number of command markdown files.
     */
    fun getCommandCount(): Int {
        val commandsDir = File("assets/commands")
        return commandsDir.listFiles { file -> file.extension == "md" }?.size ?: 0
    }

    /**
     * Get list of basic category titles from markdown files.
     */
    fun getBasicCategories(): List<String> {
        val basicsDir = File("assets/basics")
        return basicsDir.listFiles { file -> file.extension == "md" }
            ?.mapNotNull { mdFile ->
                val firstLine = mdFile.readLines().firstOrNull { it.startsWith("# ") }
                firstLine?.removePrefix("# ")?.trim()
            }
            ?.sorted()
            ?: emptyList()
    }

    /**
     * Get list of tip titles from tips.md.
     */
    fun getTipTitles(): List<String> {
        val tipsFile = File("assets/tips.md")
        if (!tipsFile.exists()) return emptyList()

        return tipsFile.readLines()
            .filter { it.startsWith("## ") }
            .map { it.removePrefix("## ").trim() }
    }
}
