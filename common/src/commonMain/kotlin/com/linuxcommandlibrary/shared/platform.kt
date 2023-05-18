package com.linuxcommandlibrary.shared

import com.linuxcommandlibrary.CommandDatabase
import com.squareup.sqldelight.db.SqlDriver
import databases.*

/* Copyright 2022 Simon Schubert
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

expect var databaseHelper: DatabaseHelper

class DatabaseHelper {

    private lateinit var sqlDriver: SqlDriver
    private lateinit var commandQueries: CommandQueries

    fun setupDriver(driver: SqlDriver) {
        sqlDriver = driver
        // println("Setup driver: $sqlDriver")
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
