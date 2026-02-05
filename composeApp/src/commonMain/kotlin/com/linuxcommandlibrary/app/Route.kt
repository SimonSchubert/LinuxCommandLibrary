package com.linuxcommandlibrary.app

import kotlinx.serialization.Serializable

@Serializable
sealed class Route {
    @Serializable
    data object Basics : Route()

    @Serializable
    data object Commands : Route()

    @Serializable
    data object Tips : Route()

    @Serializable
    data class BasicGroups(val categoryId: String) : Route()

    @Serializable
    data class CommandDetail(val commandName: String) : Route()
}
