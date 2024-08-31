package com.inspiredandroid.linuxcommandbibliotheca

import androidx.navigation.NavBackStackEntry
import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.getHtmlFileName

fun NavBackStackEntry.getCommandId(): Long? {
    var commandId =
        arguments?.getString("commandId")?.toLongOrNull()
    if (commandId == null) {
        // get id by command name when opened via deeplink
        val commandName = arguments?.getString("commandName") ?: ""
        val command = databaseHelper.getCommand(commandName)
        commandId = command?.id
    }
    return commandId
}

fun NavBackStackEntry.getCategoryId(): Long? {
    var categoryId =
        arguments?.getString("categoryId")?.toLongOrNull()
    if (categoryId == null) {
        // get id by category name when opened via deeplink
        val categoryName =
            arguments?.getString("deepLinkCategoryName") ?: ""
        val categories = databaseHelper.getBasics()
        categoryId = categories.firstOrNull { it.getHtmlFileName() == categoryName }?.id
    }
    return categoryId
}
