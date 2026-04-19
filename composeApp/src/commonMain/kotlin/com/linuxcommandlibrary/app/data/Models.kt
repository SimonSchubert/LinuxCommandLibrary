package com.linuxcommandlibrary.app.data

import androidx.compose.runtime.Immutable
import com.linuxcommandlibrary.shared.TipSectionElement
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

@Immutable
data class BasicCategory(
    val id: String,
    val title: String,
)

@Immutable
data class BasicGroup(
    val id: Long,
    val description: String,
)

@Immutable
data class BasicCommand(
    val id: Long,
    val command: String,
    val mans: String,
)

@Immutable
data class CommandInfo(
    val id: Long,
    val name: String,
)

@Immutable
data class CommandSectionInfo(
    val id: Long,
    val title: String,
    val content: String,
    val parsedContent: ImmutableList<TipSectionElement> = persistentListOf(),
)

fun CommandSectionInfo.getSortPriority(): Int = com.linuxcommandlibrary.shared.getSectionSortPriority(title)
