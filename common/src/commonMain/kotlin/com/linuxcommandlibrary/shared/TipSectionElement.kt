package com.linuxcommandlibrary.shared

import kotlinx.collections.immutable.ImmutableList

/**
 * Represents text formatting elements within tip sections.
 */
sealed class TextElement {
    data class Plain(val text: String) : TextElement()
    data class Bold(val text: String) : TextElement()
    data class Italic(val text: String) : TextElement()
    data class Man(val man: String) : TextElement()
    data class Link(val text: String, val action: String) : TextElement()
}

/**
 * Represents different types of content sections in tips and basics.
 */
sealed class TipSectionElement {
    data class Text(val elements: ImmutableList<TextElement>) : TipSectionElement()
    data class Blockquote(val elements: ImmutableList<TextElement>) : TipSectionElement()
    data class Code(val command: String, val elements: ImmutableList<CommandElement>) : TipSectionElement()
    data class Table(
        val headers: ImmutableList<ImmutableList<TextElement>>,
        val rows: ImmutableList<ImmutableList<ImmutableList<TextElement>>>,
    ) : TipSectionElement()
}
