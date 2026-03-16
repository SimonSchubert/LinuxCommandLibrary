package com.linuxcommandlibrary.app

sealed class NavEvent {
    data class ToCommand(val commandName: String) : NavEvent()
    data class ToBasicGroups(val categoryId: String, val categoryTitle: String) : NavEvent()
    data class OpenAction(val action: String) : NavEvent()
}
