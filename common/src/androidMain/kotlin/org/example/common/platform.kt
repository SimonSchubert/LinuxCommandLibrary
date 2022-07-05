package org.example.common

import android.content.Context
import com.linuxcommandlibrary.CommandDatabase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver
import java.io.File
import java.io.InputStream
import java.io.OutputStream

actual fun getPlatformName(): String {
    return "Android"
}

actual var databaseHelper = DatabaseHelper()

fun hasDatabase(context: Context): Boolean {
    val file = File(context.dataDir, "databases/database.db")
    return file.exists()
}

fun copyDatabase(context: Context, onUpdateStatus: (Int) -> Unit = {}) {
    val databaseFolder = File(context.dataDir, "databases")
    if (!databaseFolder.exists()) {
        databaseFolder.mkdir()
    }
    val file = File(databaseFolder, "database.db")

    println("Copy ${file.name} from assets to $file")
    val inputStream = context.assets.open("database.db")
    inputStream.copyToWithStatus(file.outputStream(), onUpdateStatus)
    inputStream.close()

    // Delete old realm database
    val filesFolder = File(context.dataDir, "files")
    if (filesFolder.exists()) {
        File(filesFolder, "database.realm").delete()
    }
}

fun InputStream.copyToWithStatus(out: OutputStream, onUpdateStatus: (Int) -> Unit = {}): Long {
    var bytesCopied: Long = 0
    val buffer = ByteArray(DEFAULT_BUFFER_SIZE)
    var bytes = read(buffer)
    val totalSize = this.available().toFloat()
    while (bytes >= 0) {
        out.write(buffer, 0, bytes)
        bytesCopied += bytes
        bytes = read(buffer)
        onUpdateStatus(bytesCopied.div(totalSize).times(100f).toInt())
    }
    return bytesCopied
}

fun initDatabase(context: Context) {
    val driver: SqlDriver = AndroidSqliteDriver(CommandDatabase.Schema, context, "database.db")
    databaseHelper.setupDriver(driver)
}