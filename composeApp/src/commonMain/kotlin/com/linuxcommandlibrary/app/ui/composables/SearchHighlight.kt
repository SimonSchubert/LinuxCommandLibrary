package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import com.linuxcommandlibrary.app.ui.screens.commanddetail.ManPageMatch

/**
 * Compose-side view of the shared man-page match list: the same matches, grouped for fast lookup
 * while drawing. Matching itself lives in `:viewmodels` so Android and iOS agree on what counts.
 */
@Immutable
class MatchIndex(val matches: List<ManPageMatch>) {
    // section -> element -> sub-index -> ranges. Grouped once up front: stepping to the next match
    // re-resolves the highlights of every visible section, which would otherwise rescan the whole
    // match list each time - noticeable on a one-letter query against a large page.
    private val bySection: Map<Int, Map<Int, Map<Int, List<IntRange>>>> = matches
        .groupBy { it.sectionIndex }
        .mapValues { (_, sectionMatches) ->
            sectionMatches
                .groupBy { it.elementIndex }
                .mapValues { (_, elementMatches) ->
                    elementMatches.groupBy({ it.subIndex }, { it.start until it.end })
                }
        }

    val size: Int get() = matches.size

    /**
     * The draw-ready highlights for one section, keyed by element index. Returns null when the
     * section has no matches, so unaffected sections keep passing null down the render tree.
     */
    fun elementHighlightsFor(
        sectionIndex: Int,
        activeMatch: ManPageMatch?,
        color: Color,
        activeColor: Color,
        onActiveColor: Color,
    ): Map<Int, ElementHighlight>? {
        val section = bySection[sectionIndex] ?: return null
        return section.mapValues { (elementIndex, ranges) ->
            val isActiveElement = activeMatch != null &&
                activeMatch.sectionIndex == sectionIndex &&
                activeMatch.elementIndex == elementIndex
            ElementHighlight(
                ranges = ranges,
                activeSubIndex = if (isActiveElement) activeMatch.subIndex else -1,
                activeRange = if (isActiveElement) activeMatch.start until activeMatch.end else null,
                color = color,
                activeColor = activeColor,
                onActiveColor = onActiveColor,
            )
        }
    }

    companion object {
        val EMPTY = MatchIndex(emptyList())
    }
}

/**
 * The match ranges for the strings rendered by one section element, resolved down to the colors
 * the renderer should paint. Passed to [TipSectionContent], [CommandView] and [TableView].
 */
@Immutable
class ElementHighlight(
    private val ranges: Map<Int, List<IntRange>>,
    private val activeSubIndex: Int,
    private val activeRange: IntRange?,
    val color: Color,
    val activeColor: Color,
    val onActiveColor: Color,
) {
    fun rangesFor(subIndex: Int): List<IntRange> = ranges[subIndex].orEmpty()

    fun activeRangeFor(subIndex: Int): IntRange? = if (subIndex == activeSubIndex) activeRange else null
}

/**
 * Layers match backgrounds over an already-styled string. Adding spans on top rather than
 * rebuilding means the bold/italic/link styling the markdown renderers produced survives intact.
 *
 * The active match also overrides the foreground color: man-page links are drawn in `primary`,
 * which would vanish against the `primary` active background otherwise.
 */
fun AnnotatedString.withMatchHighlight(
    highlight: ElementHighlight?,
    subIndex: Int = 0,
): AnnotatedString {
    if (highlight == null) return this
    val ranges = highlight.rangesFor(subIndex)
    if (ranges.isEmpty()) return this
    val activeRange = highlight.activeRangeFor(subIndex)
    val source = this
    return buildAnnotatedString {
        append(source)
        ranges.forEach { range ->
            val start = range.first.coerceIn(0, source.length)
            val end = (range.last + 1).coerceIn(0, source.length)
            if (start >= end) return@forEach
            val isActive = range == activeRange
            addStyle(
                style = if (isActive) {
                    SpanStyle(background = highlight.activeColor, color = highlight.onActiveColor)
                } else {
                    SpanStyle(background = highlight.color)
                },
                start = start,
                end = end,
            )
        }
    }
}
