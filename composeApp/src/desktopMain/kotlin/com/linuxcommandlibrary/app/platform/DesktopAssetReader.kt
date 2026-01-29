package com.linuxcommandlibrary.app.platform

import com.linuxcommandlibrary.shared.platform.AssetReader
import java.io.BufferedReader

class DesktopAssetReader : AssetReader {
    override fun listFiles(path: String): List<String> {
        return try {
            // Read from index file that lists all files in the directory
            val indexPath = "$path/index.txt"
            val stream = javaClass.classLoader?.getResourceAsStream(indexPath)
            stream?.bufferedReader()?.use { it.readLines() } ?: emptyList()
        } catch (e: Exception) {
            emptyList()
        }
    }

    override fun readFile(path: String): String? {
        return try {
            val stream = javaClass.classLoader?.getResourceAsStream(path)
            stream?.bufferedReader()?.use(BufferedReader::readText)
        } catch (e: Exception) {
            null
        }
    }
}
