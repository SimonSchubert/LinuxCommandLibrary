package com.linuxcommandlibrary.shared

import kotlin.jvm.JvmName

/**
 * The plain text a list of [TextElement]s renders to, with no styling.
 *
 * This is the canonical definition of "what string does this element show", and the man-page
 * search measures its match offsets against it. The Compose renderer (`buildTextElementString`)
 * and the SwiftUI renderer (`TextElementsView.buildAttributedString`) must append exactly these
 * same substrings in this same order, or a highlight will land on the wrong characters.
 */
@JvmName("textElementsToPlainText")
fun List<TextElement>.toPlainText(): String = joinToString("") { element ->
    when (element) {
        is TextElement.Plain -> element.text
        is TextElement.Bold -> element.text
        is TextElement.Italic -> element.text
        is TextElement.Man -> element.man
        is TextElement.Link -> element.text
    }
}

/**
 * The plain text a code block renders to. Counterpart of [toPlainText] for [CommandElement];
 * the same renderer-agreement contract applies.
 */
@JvmName("commandElementsToPlainText")
fun List<CommandElement>.toPlainText(): String = joinToString("") { element ->
    when (element) {
        is CommandElement.Text -> element.text
        is CommandElement.Man -> element.man
        is CommandElement.Url -> element.command
    }
}

/**
 * Every cell a table renders, in the order it is drawn: the header row first, then each body row
 * left to right. A cell's position in this list is its sub-index, which is how a match inside a
 * table is addressed. Both the Compose and SwiftUI table renderers draw in this order.
 */
fun tableCellsInRenderOrder(
    headers: List<List<TextElement>>,
    rows: List<List<List<TextElement>>>,
): List<List<TextElement>> = headers + rows.flatten()
