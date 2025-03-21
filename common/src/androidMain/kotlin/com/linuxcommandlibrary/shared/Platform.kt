package com.linuxcommandlibrary.shared

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.linuxcommandlibrary.CommandDatabase
import java.io.File
import java.io.InputStream
import java.io.OutputStream

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
