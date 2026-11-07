package com.linuxcommandlibrary.shared

/**
 * Items whose name contains [query], exact match first, then prefix matches, then the rest.
 *
 * [lowerNames] holds each item's lowercased name, positionally parallel to [items], so callers on
 * a keystroke path can lowercase once up front. Bucketing rather than sorting: with [items] in
 * ascending name order, appending in input order keeps each bucket alphabetical for free.
 */
fun <T> rankByNameMatch(items: Iterable<T>, lowerNames: List<String>, query: String): List<T> {
    val lowerQuery = query.lowercase()
    val exact = mutableListOf<T>()
    val prefixed = mutableListOf<T>()
    val contained = mutableListOf<T>()

    // Iterated rather than indexed: callers pass ImmutableLists, where get(i) walks a trie.
    var i = 0
    for (item in items) {
        val lowerName = lowerNames[i++]
        if (!lowerName.contains(lowerQuery)) continue
        when {
            lowerName == lowerQuery -> exact += item
            lowerName.startsWith(lowerQuery) -> prefixed += item
            else -> contained += item
        }
    }
    return exact + prefixed + contained
}
