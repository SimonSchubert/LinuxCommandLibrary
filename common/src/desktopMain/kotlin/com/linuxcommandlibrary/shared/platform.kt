package com.linuxcommandlibrary.shared

import com.linuxcommandlibrary.CommandDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.sqlite.driver.JdbcSqliteDriver
import java.io.File

actual fun getPlatformName(): String {
    return "Desktop"
}


actual var databaseHelper = DatabaseHelper()

fun initDatabase() {
    val driver: SqlDriver = JdbcSqliteDriver("jdbc:sqlite:assets/database.db")
    if (!File("assets/database.db").exists()) {
        CommandDatabase.Schema.create(driver)
    }
    databaseHelper.setupDriver(driver)
}