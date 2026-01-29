package com.linuxcommandlibrary.app.platform

import android.content.Context
import com.linuxcommandlibrary.shared.platform.AssetReader

class AndroidAssetReader(private val context: Context) : AssetReader {
    override fun listFiles(path: String): List<String> {
        return try {
            context.assets.list(path)?.toList() ?: emptyList()
        } catch (e: Exception) {
            emptyList()
        }
    }

    override fun readFile(path: String): String? {
        return try {
            context.assets.open(path).bufferedReader().readText()
        } catch (e: Exception) {
            null
        }
    }
}
