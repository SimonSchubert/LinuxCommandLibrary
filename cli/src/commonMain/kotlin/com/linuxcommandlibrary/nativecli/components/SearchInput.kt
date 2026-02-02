package com.linuxcommandlibrary.nativecli.components

import com.linuxcommandlibrary.nativecli.Theme

class SearchInput(
    initialQuery: String = "",
) {
    private val buffer = StringBuilder(initialQuery)

    val query: String
        get() = buffer.toString()

    val isEmpty: Boolean
        get() = buffer.isEmpty()

    fun append(char: Char) {
        buffer.append(char)
    }

    fun appendString(str: String) {
        buffer.append(str)
    }

    fun backspace(): Boolean = if (buffer.isNotEmpty()) {
        buffer.deleteAt(buffer.length - 1)
        true
    } else {
        false
    }

    fun clear() {
        buffer.clear()
    }

    fun render(prompt: String = "Search: "): String = "${Theme.highlight(prompt)}${Theme.boldText(buffer.toString())}"
}
