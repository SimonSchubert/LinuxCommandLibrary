package com.linuxcommandlibrary.nativecli.components

import com.linuxcommandlibrary.nativecli.Theme

class ContentViewer(
    private val lines: List<String>,
    private val pageSize: Int = 20,
) {
    private var scrollOffset: Int = 0

    val totalLines: Int
        get() = lines.size

    val canScrollUp: Boolean
        get() = scrollOffset > 0

    val canScrollDown: Boolean
        get() = scrollOffset + pageSize < lines.size

    fun scrollUp(amount: Int = 1) {
        scrollOffset = (scrollOffset - amount).coerceAtLeast(0)
    }

    fun scrollDown(amount: Int = 1) {
        scrollOffset = (scrollOffset + amount).coerceAtMost((lines.size - pageSize).coerceAtLeast(0))
    }

    fun pageUp() {
        scrollUp(pageSize)
    }

    fun pageDown() {
        scrollDown(pageSize)
    }

    fun jumpToStart() {
        scrollOffset = 0
    }

    fun jumpToEnd() {
        scrollOffset = (lines.size - pageSize).coerceAtLeast(0)
    }

    fun render(): String {
        if (lines.isEmpty()) {
            return Theme.dim("(no content)")
        }

        val sb = StringBuilder()
        val endIndex = (scrollOffset + pageSize).coerceAtMost(lines.size)

        for (i in scrollOffset until endIndex) {
            sb.appendLine(lines[i])
        }

        // Show scroll indicator if content is scrollable
        if (lines.size > pageSize) {
            sb.appendLine()
            val indicator = buildString {
                append("[")
                if (canScrollUp) append("^") else append(" ")
                append(" ${scrollOffset + 1}-$endIndex/${lines.size} ")
                if (canScrollDown) append("v") else append(" ")
                append("]")
            }
            sb.append(Theme.dim(indicator))
        }

        return sb.toString()
    }

    fun reset() {
        scrollOffset = 0
    }

    companion object {
        fun fromText(text: String, pageSize: Int = 20): ContentViewer = ContentViewer(text.lines(), pageSize)
    }
}
