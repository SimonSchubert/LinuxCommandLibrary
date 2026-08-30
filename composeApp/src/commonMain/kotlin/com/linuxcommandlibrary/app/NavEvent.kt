package com.linuxcommandlibrary.app

sealed class NavEvent {
    data class ToCommand(val commandName: String) : NavEvent()
    data class ToBasicGroups(
        val categoryId: String,
        val expandGroupId: Long? = null,
    ) : NavEvent()
    data class OpenAction(val action: String) : NavEvent()
    data object ToLicenses : NavEvent()
}
