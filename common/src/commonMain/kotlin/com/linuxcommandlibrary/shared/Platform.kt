package com.linuxcommandlibrary.shared

import app.cash.sqldelight.db.SqlDriver
import com.linuxcommandlibrary.CommandDatabase
import databases.BasicCategory
import databases.BasicCommand
import databases.BasicGroup
import databases.Command
import databases.CommandQueries
import databases.CommandSection
import databases.Tip
import databases.TipSection

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

    fun getCommand(name: String): Command? = commandQueries.selectCommandByName(name).executeAsOneOrNull()

    fun getCommands(): List<Command> = commandQueries.selectCommands().executeAsList().sortedBy { !it.name.isLetter() }

    fun getCommandsByQuery(query: String): List<Command> = commandQueries.selectCommandsByQuery(query, query).executeAsList()

    fun getBasics(): List<BasicCategory> = commandQueries.selectBasicCategories().executeAsList()

    fun getBasicGroupsByQuery(categoryId: Long): List<BasicGroup> = commandQueries.selectBasicGroupByCategory(categoryId).executeAsList()

    fun getBasicCommands(groupId: Long): List<BasicCommand> = commandQueries.selectBasicCommandByGroupId(groupId).executeAsList()

    fun getBasicCommandsByQuery(query: String): List<BasicCommand> = commandQueries.selectBasicCommandsByQuery(query).executeAsList()

    fun getBasicGroup(groupId: Long): BasicGroup? = commandQueries.selectBasicGroupById(groupId).executeAsOneOrNull()

    fun getBasicGroupsByIds(ids: List<Long>): List<BasicGroup> = if (ids.isEmpty()) {
        emptyList()
    } else {
        commandQueries.selectBasicGroupsByIds(ids).executeAsList()
    }

    fun getBasicGroupsByQuery(query: String): List<BasicGroup> = commandQueries.selectBasicGroupsByQuery(query).executeAsList()

    fun getSections(commandId: Long): List<CommandSection> = commandQueries.selectCommandSectionsByCommandId(commandId).executeAsList()

    fun getTips(): List<Tip> = commandQueries.selectTips().executeAsList()

    fun getTipSections(): List<TipSection> = commandQueries.selectAllTipSections().executeAsList()
}
