package com.linuxcommandlibrary.nativecli

import com.github.ajalt.mordant.rendering.TextColors.*
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
