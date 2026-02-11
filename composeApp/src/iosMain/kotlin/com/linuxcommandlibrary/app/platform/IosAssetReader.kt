package com.linuxcommandlibrary.app.platform

import com.linuxcommandlibrary.shared.platform.AssetReader
import kotlinx.cinterop.ExperimentalForeignApi
import platform.Foundation.NSBundle
import platform.Foundation.NSString
import platform.Foundation.NSUTF8StringEncoding
import platform.Foundation.stringWithContentsOfFile

@OptIn(ExperimentalForeignApi::class)
class IosAssetReader : AssetReader {
    override fun listFiles(path: String): List<String> {
        return try {
            // Read from index file that lists all files in the directory
            // Assets are bundled under "assets" folder
            val bundlePath = NSBundle.mainBundle.resourcePath ?: return emptyList()
            val indexPath = "$bundlePath/assets/$path/index.txt"
            val content = NSString.stringWithContentsOfFile(indexPath, NSUTF8StringEncoding, null)
            content?.lines()?.filter { it.isNotBlank() } ?: emptyList()
        } catch (e: Exception) {
            emptyList()
        }
    }

    override fun readFile(path: String): String? {
        return try {
            // Assets are bundled under "assets" folder
            val bundlePath = NSBundle.mainBundle.resourcePath ?: return null
            val filePath = "$bundlePath/assets/$path"
            NSString.stringWithContentsOfFile(filePath, NSUTF8StringEncoding, null)
        } catch (e: Exception) {
            null
        }
    }
}
