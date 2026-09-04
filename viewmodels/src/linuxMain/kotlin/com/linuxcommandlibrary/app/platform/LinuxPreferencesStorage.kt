package com.linuxcommandlibrary.app.platform

import com.linuxcommandlibrary.shared.platform.PreferencesStorage

/**
 * Key/value preferences backed by a single XDG state file. Values are newline
 * separated `key=value` pairs; keys never contain '=' and values are single line.
 */
class LinuxPreferencesStorage(
    private val dir: String = env("XDG_STATE_HOME")?.let { "$it/lcl" }
        ?: "${env("HOME") ?: "."}/.local/state/lcl",
) : PreferencesStorage {
    private val file = "$dir/preferences"

    private val values: MutableMap<String, String> by lazy {
        val loaded = mutableMapOf<String, String>()
        readTextFile(file)?.lineSequence()?.forEach { line ->
            val separator = line.indexOf('=')
            if (separator > 0) loaded[line.substring(0, separator)] = line.substring(separator + 1)
        }
        loaded
    }

    private fun persist() {
        mkdirs(dir)
        writeTextFile(file, values.entries.joinToString("\n") { "${it.key}=${it.value}" })
    }

    override fun getString(key: String, defaultValue: String): String = values[key] ?: defaultValue

    override fun putString(key: String, value: String) {
        values[key] = value
        persist()
    }

    override fun getBoolean(key: String, defaultValue: Boolean): Boolean =
        values[key]?.toBooleanStrictOrNull() ?: defaultValue

    override fun putBoolean(key: String, value: Boolean) = putString(key, value.toString())

    override fun getInt(key: String, defaultValue: Int): Int = values[key]?.toIntOrNull() ?: defaultValue

    override fun putInt(key: String, value: Int) = putString(key, value.toString())
}
