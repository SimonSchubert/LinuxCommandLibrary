package com.linuxcommandlibrary.shared

/**
 * Data class for parsed tip from markdown.
 */
data class TipInfo(
    val id: Long,
    val title: String,
    val sections: List<TipSectionElement>,
)

/**
 * Data class for parsed basic category from markdown.
 */
data class BasicInfo(
    val title: String,
    val groups: List<BasicGroup>,
)

/**
 * Data class for parsed basic category group from markdown.
 */
data class BasicGroup(
    val id: Long,
    val description: String,
    val sections: List<TipSectionElement>,
)

/**
 * Data class for command parsed from markdown.
 */
data class CommandInfo(
    val name: String,
    val description: String?,
    val sections: List<CommandSectionInfo>,
)

/**
 * Data class for a section of a command.
 */
data class CommandSectionInfo(
    val title: String,
    val content: String,
    val elements: List<TipSectionElement>,
)

/**
 * Get sort priority for command sections.
 * TLDR first, SEE ALSO and AUTHOR/HISTORY last.
 */
fun CommandSectionInfo.getSortPriority(): Int = when (title.uppercase()) {
    "TLDR" -> 0
    "NAME" -> 1
    "SYNOPSIS" -> 2
    "DESCRIPTION" -> 3
    "PARAMETERS" -> 4
    "OPTIONS" -> 5
    "EXAMPLES" -> 6
    "CAVEATS" -> 90
    "HISTORY" -> 91
    "AUTHOR" -> 92
    "SEE ALSO" -> 93
    else -> 50
}
