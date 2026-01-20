package com.linuxcommandlibrary.shared

/**
 * Represents text formatting elements within tip sections.
 */
sealed class TextElement {
    data class Plain(val text: String) : TextElement()
    data class Bold(val text: String) : TextElement()
    data class Italic(val text: String) : TextElement()
    data class Man(val man: String) : TextElement()
}

/**
 * Represents different types of content sections in tips and basics.
 */
sealed class TipSectionElement {
    data class Text(val elements: List<TextElement>) : TipSectionElement()
    data class Blockquote(val elements: List<TextElement>) : TipSectionElement()
    data class Code(val command: String, val elements: List<CommandElement>) : TipSectionElement()
    data class Table(
        val headers: List<List<TextElement>>,
        val rows: List<List<List<TextElement>>>,
    ) : TipSectionElement()
}
