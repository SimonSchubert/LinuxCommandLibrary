package com.linuxcommandlibrary.nativecli

import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.rendering.TextStyles
import com.github.ajalt.mordant.rendering.TextStyles.*

/**
 * Central theme definitions for the CLI UI.
 * Uses red/coral tones as the primary accent color.
 */
object Theme {
    // Colors
    private val primary = brightRed
    private val secondary = red
    private val success = green
    private val linkColor = brightBlue

    // Combined styles
    private val titleStyle = bold + secondary
    private val selectedStyle = bold + primary
    private val codeStyle = success
    private val headerStyle = bold + secondary

    // Text formatting functions
    fun title(text: String): String = titleStyle(text)
    fun selected(text: String): String = selectedStyle(text)
    fun help(text: String): String = com.github.ajalt.mordant.rendering.TextStyles.dim(text)
    fun code(text: String): String = codeStyle(text)
    fun header(text: String): String = headerStyle(text)
    fun highlight(text: String): String = primary(text)
    fun dim(text: String): String = com.github.ajalt.mordant.rendering.TextStyles.dim(text)
    fun boldText(text: String): String = bold(text)
    fun italicText(text: String): String = italic(text)

    // Clickable OSC 8 hyperlink. Supporting terminals (iTerm2, kitty, WezTerm,
    // GNOME Terminal, Windows Terminal, ...) open [url] when [text] is clicked.
    // The link is colored (not underlined) for the affordance: some terminals
    // (e.g. the JetBrains/Android Studio console) don't honor the underline-off
    // code and would leak the style across the rest of the screen.
    fun link(url: String, text: String): String = (linkColor + TextStyles.hyperlink(url))(text)

    // Colored text used as an in-app link affordance (no URL). The TUI tracks these
    // regions and navigates on click instead of opening a browser.
    fun linkText(text: String): String = linkColor(text)

    // Logo styling - gradient from bright to regular red
    fun logoLine(line: String, lineIndex: Int): String = when {
        lineIndex < 3 -> brightRed(line)
        lineIndex < 6 -> red(line)
        else -> red(line)
    }

    // Decorative borders for section titles
    fun sectionTitle(text: String): String {
        val decorator = "═"
        val padding = 3
        val decoratorLength = padding
        return "${secondary(decorator.repeat(decoratorLength))} ${title(text)} ${secondary(decorator.repeat(decoratorLength))}"
    }
}
