package com.inspiredandroid.linuxcommandbibliotheca.data

data class CommandInfo(
    val id: Long,      // name.hashCode().toLong() for stable ID
    val name: String,  // filename without .md
)

data class CommandSectionInfo(
    val id: Long,      // (commandName + title).hashCode().toLong()
    val title: String, // "TLDR", "SYNOPSIS", etc.
    val content: String,
)

fun CommandSectionInfo.getSortPriority(): Int = when (title) {
    "TLDR" -> 0
    "SYNOPSIS" -> 10
    "SEE ALSO" -> 90
    "AUTHOR" -> 100
    else -> 50
}
