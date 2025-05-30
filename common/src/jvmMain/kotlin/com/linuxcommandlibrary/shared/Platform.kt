package com.linuxcommandlibrary.shared

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver
import com.linuxcommandlibrary.CommandDatabase
import java.io.File

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

actual var databaseHelper = DatabaseHelper()

fun initDatabase() {
    val databaseFile = EmptyClass::class.java.classLoader?.getResource("database.db")?.toURI()
    val driver: SqlDriver = JdbcSqliteDriver("jdbc:sqlite::resource:$databaseFile")
    if (!File("assets/database.db").exists()) {
        CommandDatabase.Schema.create(driver)
    }
    databaseHelper.setupDriver(driver)
}
