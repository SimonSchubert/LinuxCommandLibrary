package com.linuxcommandlibrary.app.platform

import android.content.Context
import com.linuxcommandlibrary.shared.platform.AssetReader

class AndroidAssetReader(private val context: Context) : AssetReader {
    override fun listFiles(path: String): List<String> = try {
        context.assets.open("$path/index.txt").bufferedReader().use {
            it.readLines()
        }
    } catch (e: Exception) {
        emptyList()
    }

    override fun readFile(path: String): String? = try {
        context.assets.open(path).bufferedReader().readText()
    } catch (e: Exception) {
        null
    }
}
