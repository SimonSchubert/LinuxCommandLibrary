package com.linuxcommandlibrary.app.data

import com.linuxcommandlibrary.shared.BasicInfo
import com.linuxcommandlibrary.shared.MarkdownParser
import com.linuxcommandlibrary.shared.TipSectionElement
import com.linuxcommandlibrary.shared.basicsSortOrder
import com.linuxcommandlibrary.shared.platform.AssetReader
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableMap
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.persistentMapOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.collections.immutable.toImmutableMap

class BasicsRepository(private val assetReader: AssetReader) {

    private var cachedCategories: ImmutableList<BasicCategory>? = null
    private val cachedGroupsAndSections =
        mutableMapOf<String, Pair<ImmutableList<BasicGroup>, ImmutableMap<Long, ImmutableList<TipSectionElement>>>>()

    /** Search-only view of every group: the match plus its description pre-lowercased. */
    private class GroupSearchEntry(val match: BasicGroupMatch, val lowerDescription: String)

    private var cachedSearchIndex: List<GroupSearchEntry>? = null

    fun getCategories(): ImmutableList<BasicCategory> {
        cachedCategories?.let { return it }

        val files = assetReader.listFiles("basics")

        val categories = files
            .filter { it.endsWith(".md") }
            .mapNotNull { filename ->
                val id = filename.removeSuffix(".md")
                val title = readCategoryTitle(filename)
                if (title != null) {
                    BasicCategory(id = id, title = title)
                } else {
                    null
                }
            }
            .sortedBy { basicsSortOrder.indexOf(it.title) }
            .toImmutableList()

        cachedCategories = categories
        return categories
    }

    private fun readCategoryTitle(filename: String): String? = try {
        val content = assetReader.readFile("basics/$filename")
        content?.lineSequence()?.firstOrNull { it.startsWith("# ") }?.removePrefix("# ")?.trim()
    } catch (e: Exception) {
        null
    }

    fun getGroupsAndSections(
        categoryId: String,
    ): Pair<ImmutableList<BasicGroup>, ImmutableMap<Long, ImmutableList<TipSectionElement>>> {
        cachedGroupsAndSections[categoryId]?.let { return it }

        val groups = mutableListOf<BasicGroup>()
        val sectionsByGroupId = mutableMapOf<Long, ImmutableList<TipSectionElement>>()

        try {
            val content = assetReader.readFile("basics/$categoryId.md")
                ?: return Pair(persistentListOf(), persistentMapOf())

            val groupSections = MarkdownParser.splitByHeaders(content, "## ")

            for ((description, groupContent) in groupSections) {
                val groupId = (categoryId + description).hashCode().toLong()
                groups.add(BasicGroup(id = groupId, description = description))
                sectionsByGroupId[groupId] = MarkdownParser.parseMarkdownContent(groupContent)
            }
        } catch (e: Exception) {
            // Return empty on error
        }

        val result = Pair(
            groups.toImmutableList(),
            sectionsByGroupId.toImmutableMap(),
        )
        cachedGroupsAndSections[categoryId] = result
        return result
    }

    fun getBasicInfo(categoryId: String): BasicInfo? = try {
        val content = assetReader.readFile("basics/$categoryId.md") ?: return null
        MarkdownParser.parseBasic(content)
    } catch (e: Exception) {
        null
    }

    fun usesCardLayout(categoryId: String): Boolean = categoryId.endsWith("texteditor") ||
        categoryId in setOf("shellscripting", "tmux", "regularexpressions", "terminalgames", "backupimaging", "systemrecovery")

    /**
     * Group headings across every category, ready to match against.
     *
     * Deliberately does not go through [getGroupsAndSections]: that parses every group's body into
     * [TipSectionElement]s, which search never looks at. Splitting on the `## ` headers alone is
     * roughly an order of magnitude cheaper, and it used to be paid on the first keystroke in the
     * search box. Descriptions are lowercased once here rather than once per group per keystroke.
     */
    private fun getSearchIndex(): List<GroupSearchEntry> {
        cachedSearchIndex?.let { return it }

        val entries = mutableListOf<GroupSearchEntry>()
        for (category in getCategories()) {
            val content = try {
                assetReader.readFile("basics/${category.id}.md")
            } catch (e: Exception) {
                null
            } ?: continue

            for ((description, _) in MarkdownParser.splitByHeaders(content, "## ")) {
                entries += GroupSearchEntry(
                    match = BasicGroupMatch(
                        // Must stay in sync with getGroupsAndSections: the id is what the search
                        // result hands back for auto-expanding the group on the detail screen.
                        groupId = (category.id + description).hashCode().toLong(),
                        description = description,
                        categoryId = category.id,
                        categoryTitle = category.title,
                    ),
                    lowerDescription = description.lowercase(),
                )
            }
        }

        cachedSearchIndex = entries
        return entries
    }

    fun getMatchingGroups(query: String): ImmutableList<BasicGroupMatch> {
        if (query.isBlank()) return persistentListOf()
        val lower = query.lowercase()
        return getSearchIndex()
            .filter { it.lowerDescription.contains(lower) }
            .map { it.match }
            .toImmutableList()
    }
}
