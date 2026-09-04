package com.linuxcommandlibrary.app.platform

import com.linuxcommandlibrary.shared.platform.AssetReader

/**
 * Reads markdown assets from disk. Packages install them under /usr/share/lcl/assets;
 * LCL_ASSETS_DIR overrides that for development.
 */
class LinuxAssetReader(
    private val baseDir: String = env("LCL_ASSETS_DIR") ?: "/usr/share/lcl/assets",
) : AssetReader {
    override fun listFiles(path: String): List<String> =
        readTextFile("$baseDir/$path/index.txt")
            ?.lineSequence()
            ?.map { it.trim() }
            ?.filter { it.isNotEmpty() }
            ?.toList()
            .orEmpty()

    override fun readFile(path: String): String? = readTextFile("$baseDir/$path")
}
