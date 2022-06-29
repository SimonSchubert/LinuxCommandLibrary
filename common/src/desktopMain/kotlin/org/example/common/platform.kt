package org.example.common

import com.linuxcommandlibrary.CommandDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.sqlite.driver.JdbcSqliteDriver
import java.io.File

actual fun getPlatformName(): String {
    return "Desktop"
}


actual var databaseHelper = DatabaseHelper()

fun initDatabase() {
    val driver: SqlDriver = JdbcSqliteDriver("jdbc:sqlite:database.db")
    if (!File("database.db").exists()) {
        CommandDatabase.Schema.create(driver)
    }
    databaseHelper.setupDriver(driver)
}