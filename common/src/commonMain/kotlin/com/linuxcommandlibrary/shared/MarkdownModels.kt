package com.linuxcommandlibrary.shared

import kotlinx.collections.immutable.ImmutableList

/**
 * Data class for parsed tip from markdown.
 */
data class TipInfo(
    val id: Long,
    val title: String,
    val sections: ImmutableList<TipSectionElement>,
)

/**
 * Data class for parsed basic category from markdown.
 */
data class BasicInfo(
    val title: String,
    val groups: ImmutableList<BasicGroup>,
)

/**
 * Data class for parsed basic category group from markdown.
 */
data class BasicGroup(
    val id: Long,
    val description: String,
    val sections: ImmutableList<TipSectionElement>,
)

/**
 * Data class for command parsed from markdown.
 */
data class CommandInfo(
    val name: String,
    val description: String?,
    val sections: ImmutableList<CommandSectionInfo>,
)

/**
 * Data class for a section of a command.
 */
data class CommandSectionInfo(
    val title: String,
    val content: String,
    val elements: ImmutableList<TipSectionElement>,
)

/**
 * Get sort priority for command sections by title string.
 * TLDR first, SEE ALSO and AUTHOR/HISTORY last.
 */
fun getSectionSortPriority(title: String): Int = when (title.uppercase()) {
    "TLDR" -> 0
    "NAME" -> 1
    "SYNOPSIS" -> 2
    "DESCRIPTION" -> 3
    "PARAMETERS" -> 4
    "OPTIONS" -> 5
    "EXAMPLES" -> 6
    "CONFIGURATION" -> 7
    "CAVEATS" -> 90
    "HISTORY" -> 91
    "AUTHOR" -> 92
    "SEE ALSO" -> 93
    else -> 50
}

fun CommandSectionInfo.getSortPriority(): Int = getSectionSortPriority(title)
