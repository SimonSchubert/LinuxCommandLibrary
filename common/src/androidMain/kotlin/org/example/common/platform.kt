package org.example.common

import android.content.Context
import com.linuxcommandlibrary.CommandDatabase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver
import java.io.File

actual fun getPlatformName(): String {
    return "Android"
}

actual var databaseHelper = DatabaseHelper()

fun initDatabase(context: Context) {
    val databaseFolder = File(context.dataDir, "databases")
    if (!databaseFolder.exists()) {
        databaseFolder.mkdir()
    }
    val file = File(databaseFolder, "database.db")
    if (!file.exists()) {
        println("Copy ${file.name} from assets to $file")
        val inputStream = context.assets.open("database.db")
        inputStream.copyTo(file.outputStream())
        inputStream.close()

        // Delete old realm database
        val filesFolder = File(context.dataDir, "files")
        if(filesFolder.exists()) {
            File(filesFolder, "database.realm").delete()
        }
    }

    val driver: SqlDriver = AndroidSqliteDriver(CommandDatabase.Schema, context, "database.db")
    databaseHelper.setupDriver(driver)
}