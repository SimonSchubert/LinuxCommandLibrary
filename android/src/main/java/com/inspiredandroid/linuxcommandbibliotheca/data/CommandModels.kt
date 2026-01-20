package com.inspiredandroid.linuxcommandbibliotheca.data

data class CommandInfo(
    /** name.hashCode().toLong() for stable ID */
    val id: Long,
    /** filename without .md */
    val name: String,
)

data class CommandSectionInfo(
    /** (commandName + title).hashCode().toLong() */
    val id: Long,
    /** "TLDR", "SYNOPSIS", etc. */
    val title: String,
    val content: String,
)

fun CommandSectionInfo.getSortPriority(): Int = when (title) {
    "TLDR" -> 0
    "SYNOPSIS" -> 10
    "SEE ALSO" -> 90
    "AUTHOR" -> 100
    else -> 50
}
