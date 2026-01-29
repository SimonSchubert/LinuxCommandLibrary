package com.linuxcommandlibrary.shared.platform

/**
 * Platform abstraction for reading markdown asset files.
 */
interface AssetReader {
    /**
     * List files in a directory.
     * @param path The directory path (e.g., "commands", "basics")
     * @return List of filenames in the directory
     */
    fun listFiles(path: String): List<String>

    /**
     * Read the content of a file.
     * @param path The file path (e.g., "commands/ls.md")
     * @return The file content as a string, or null if not found
     */
    fun readFile(path: String): String?
}
