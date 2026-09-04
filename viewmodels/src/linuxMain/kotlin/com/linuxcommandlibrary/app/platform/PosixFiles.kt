package com.linuxcommandlibrary.app.platform

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.convert
import kotlinx.cinterop.toKString
import kotlinx.cinterop.usePinned
import platform.posix.SEEK_END
import platform.posix.fclose
import platform.posix.fopen
import platform.posix.fputs
import platform.posix.fread
import platform.posix.fseek
import platform.posix.ftell
import platform.posix.getenv
import platform.posix.mkdir
import platform.posix.rewind

/** Minimal posix file helpers so the shared layer needs no extra native dependency. */
@OptIn(ExperimentalForeignApi::class)
internal fun readTextFile(path: String): String? {
    val file = fopen(path, "rb") ?: return null
    try {
        fseek(file, 0, SEEK_END)
        val size = ftell(file)
        rewind(file)
        if (size <= 0) return ""
        val buffer = ByteArray(size.toInt())
        val read = buffer.usePinned { fread(it.addressOf(0), 1.convert(), size.convert(), file) }
        return buffer.decodeToString(0, read.toInt())
    } finally {
        fclose(file)
    }
}

@OptIn(ExperimentalForeignApi::class)
internal fun writeTextFile(path: String, content: String): Boolean {
    val file = fopen(path, "wb") ?: return false
    try {
        return fputs(content, file) >= 0
    } finally {
        fclose(file)
    }
}

@OptIn(ExperimentalForeignApi::class)
internal fun env(name: String): String? = getenv(name)?.toKString()?.takeIf { it.isNotEmpty() }

@OptIn(ExperimentalForeignApi::class)
internal fun mkdirs(path: String) {
    var current = ""
    path.split("/").filter { it.isNotEmpty() }.forEach { segment ->
        current += "/$segment"
        mkdir(current, 493.convert()) // 0755
    }
}
