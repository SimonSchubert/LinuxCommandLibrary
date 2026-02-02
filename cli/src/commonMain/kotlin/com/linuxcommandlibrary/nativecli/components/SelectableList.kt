package com.linuxcommandlibrary.nativecli.components

import com.github.ajalt.mordant.terminal.Terminal
import com.linuxcommandlibrary.nativecli.Theme

data class ListItem<T>(
    val value: T,
    val displayText: String,
)

class SelectableList<T>(
    private val terminal: Terminal,
    private val items: List<ListItem<T>>,
    private val pageSize: Int = 15,
    private var selectedIndex: Int = 0,
) {
    private var scrollOffset: Int = 0

    val selectedItem: ListItem<T>?
        get() = items.getOrNull(selectedIndex)

    val selectedValue: T?
        get() = selectedItem?.value

    val isEmpty: Boolean
        get() = items.isEmpty()

    fun moveUp() {
        if (items.isEmpty()) return
        selectedIndex = (selectedIndex - 1).coerceAtLeast(0)
        adjustScroll()
    }

    fun moveDown() {
        if (items.isEmpty()) return
        selectedIndex = (selectedIndex + 1).coerceAtMost(items.size - 1)
        adjustScroll()
    }

    fun pageUp() {
        if (items.isEmpty()) return
        selectedIndex = (selectedIndex - pageSize).coerceAtLeast(0)
        adjustScroll()
    }

    fun pageDown() {
        if (items.isEmpty()) return
        selectedIndex = (selectedIndex + pageSize).coerceAtMost(items.size - 1)
        adjustScroll()
    }

    fun jumpToStart() {
        selectedIndex = 0
        adjustScroll()
    }

    fun jumpToEnd() {
        if (items.isEmpty()) return
        selectedIndex = items.size - 1
        adjustScroll()
    }

    private fun adjustScroll() {
        if (selectedIndex < scrollOffset) {
            scrollOffset = selectedIndex
        } else if (selectedIndex >= scrollOffset + pageSize) {
            scrollOffset = selectedIndex - pageSize + 1
        }
    }

    fun render(): String {
        if (items.isEmpty()) {
            return Theme.dim("  (no items)")
        }

        val sb = StringBuilder()
        val endIndex = (scrollOffset + pageSize).coerceAtMost(items.size)

        for (i in scrollOffset until endIndex) {
            val item = items[i]
            if (i == selectedIndex) {
                sb.appendLine(Theme.selected("> ${item.displayText}"))
            } else {
                sb.appendLine("  ${item.displayText}")
            }
        }

        // Show scroll indicator if there are more items
        if (items.size > pageSize) {
            val position = selectedIndex + 1
            val total = items.size
            sb.appendLine()
            val indicator = buildString {
                append("  [$position/$total]")
                if (scrollOffset > 0) append(" ^")
                if (endIndex < items.size) append(" v")
            }
            sb.append(Theme.dim(indicator))
        }

        return sb.toString()
    }

    fun reset(newSelectedIndex: Int = 0) {
        selectedIndex = newSelectedIndex.coerceIn(0, (items.size - 1).coerceAtLeast(0))
        scrollOffset = 0
        adjustScroll()
    }
}

fun <T> Terminal.selectableList(
    items: List<ListItem<T>>,
    pageSize: Int = 15,
    selectedIndex: Int = 0,
): SelectableList<T> = SelectableList(this, items, pageSize, selectedIndex)
