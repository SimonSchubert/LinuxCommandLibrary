package com.linuxcommandlibrary.app.data

data class BasicCategory(
    val id: String,
    val title: String,
)

data class BasicGroup(
    val id: Long,
    val description: String,
)

data class BasicCommand(
    val id: Long,
    val command: String,
    val mans: String,
)

data class CommandInfo(
    val id: Long,
    val name: String,
)

data class CommandSectionInfo(
    val id: Long,
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
