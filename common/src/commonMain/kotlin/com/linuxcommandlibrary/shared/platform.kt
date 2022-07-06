package com.linuxcommandlibrary.shared

import com.linuxcommandlibrary.CommandDatabase
import com.squareup.sqldelight.db.SqlDriver
import databases.*

expect fun getPlatformName(): String

expect var databaseHelper: DatabaseHelper

class DatabaseHelper {

    private lateinit var sqlDriver: SqlDriver
    private lateinit var commandQueries: CommandQueries

    fun setupDriver(driver: SqlDriver) {
        sqlDriver = driver
        println("Setup driver: $sqlDriver")
        commandQueries = CommandDatabase(sqlDriver).commandQueries
    }

    fun getCommand(name: String): Command? {
        return commandQueries.selectCommandByName(name).executeAsOneOrNull()
    }

    fun getCommands(): List<Command> {
        return commandQueries.selectCommands().executeAsList()
    }

    fun getBasics(): List<BasicCategory> {
        return commandQueries.selectBasicCategories().executeAsList()
    }

    fun getBasicGroups(categoryId: Long): List<BasicGroup> {
        return commandQueries.selectBasicGroupByCategory(categoryId).executeAsList()
    }

    fun getBasicCommands(groupId: Long): List<BasicCommand> {
        return commandQueries.selectBasicCommandByGroupId(groupId).executeAsList()
    }

    fun getSections(commandId: Long): List<CommandSection> {
        return commandQueries.selectCommandSectionsByCommandId(commandId).executeAsList()
    }

    fun getTips(): List<Tip> {
        return commandQueries.selectTips().executeAsList()
    }

    fun getTipSections(): List<TipSection> {
        return commandQueries.selectAllTipSections().executeAsList()
    }
}
