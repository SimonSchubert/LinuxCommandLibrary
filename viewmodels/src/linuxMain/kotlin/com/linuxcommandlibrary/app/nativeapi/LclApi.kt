package com.linuxcommandlibrary.app.nativeapi

import com.linuxcommandlibrary.app.data.BasicsRepository
import com.linuxcommandlibrary.app.data.CommandSectionInfo
import com.linuxcommandlibrary.app.data.CommandsRepository
import com.linuxcommandlibrary.app.data.TipsRepository
import com.linuxcommandlibrary.app.di.commonModule
import com.linuxcommandlibrary.app.di.platformModule
import com.linuxcommandlibrary.shared.TipInfo
import com.linuxcommandlibrary.shared.TipSectionElement
import org.koin.core.context.startKoin
import org.koin.mp.KoinPlatform

/**
 * Flat, C-friendly facade over the shared repositories.
 *
 * The generated C header exposes repositories directly, but their return types are
 * opaque ImmutableList handles that C++ would have to walk element by element. This
 * layer hands the Qt frontend plain Ints and Strings instead.
 *
 * Every accessor is addressed by index alone. What a list is *of* is chosen once via
 * [setQuery], [selectCommand] or [selectCategory], so the row reads that follow do not
 * each have to carry a key back across the boundary and re-resolve it.
 */
object LclApi {

    private lateinit var commands: CommandsRepository
    private lateinit var basics: BasicsRepository
    private lateinit var tips: TipsRepository
    private var started = false

    fun start() {
        if (started) return
        startKoin { modules(commonModule, platformModule()) }
        val koin = KoinPlatform.getKoin()
        commands = koin.get()
        basics = koin.get()
        tips = koin.get()
        started = true
        setQuery("")
    }

    // --- Command list ---

    // Flattened to an array: the repositories return persistent lists, which are tries,
    // so indexing one per row walks it instead of doing an array read.
    private var results: Array<String> = emptyArray()

    fun setQuery(query: String) {
        val matches = if (query.isBlank()) commands.getCommands() else commands.getCommandsByQuery(query)
        val names = ArrayList<String>(matches.size)
        for (command in matches) names.add(command.name)
        results = names.toTypedArray()
    }

    fun resultCount(): Int = results.size

    fun resultName(index: Int): String = results.getOrElse(index) { "" }

    // --- Sections of the selected command ---

    private var sections: List<CommandSectionInfo> = emptyList()

    fun selectCommand(name: String) {
        sections = if (name.isEmpty()) emptyList() else commands.getSections(name)
    }

    fun sectionCount(): Int = sections.size

    fun sectionTitle(index: Int): String = sections.getOrNull(index)?.title.orEmpty()

    fun sectionBlockCount(index: Int): Int = sectionBlocks(index).size

    fun sectionBlockKind(index: Int, block: Int): String =
        sectionBlocks(index).getOrNull(block)?.kind().orEmpty()

    fun sectionBlockText(index: Int, block: Int): String =
        sectionBlocks(index).getOrNull(block)?.toMarkdown().orEmpty()

    private fun sectionBlocks(index: Int): List<TipSectionElement> =
        sections.getOrNull(index)?.parsedContent.orEmpty()

    // --- Basics categories ---
    // No local cache: BasicsRepository already memoises getCategories().

    fun categoryCount(): Int = basics.getCategories().size

    fun categoryId(index: Int): String = basics.getCategories().getOrNull(index)?.id.orEmpty()

    fun categoryTitle(index: Int): String = basics.getCategories().getOrNull(index)?.title.orEmpty()

    // --- Groups of the selected category ---

    private var groupTitles: List<String> = emptyList()

    // Resolved once per category rather than per row read: the detail list destroys and
    // recreates delegates while scrolling, and some categories have ~100 groups.
    private var groupBlocks: List<List<TipSectionElement>> = emptyList()

    fun selectCategory(id: String) {
        if (id.isEmpty()) {
            groupTitles = emptyList()
            groupBlocks = emptyList()
            return
        }
        val (groups, sectionsById) = basics.getGroupsAndSections(id)
        groupTitles = groups.map { it.description }
        groupBlocks = groups.map { sectionsById[it.id].orEmpty() }
    }

    fun groupCount(): Int = groupTitles.size

    fun groupTitle(index: Int): String = groupTitles.getOrNull(index).orEmpty()

    fun groupBlockCount(index: Int): Int = groupBlocks.getOrNull(index)?.size ?: 0

    fun groupBlockKind(index: Int, block: Int): String =
        groupBlocks.getOrNull(index)?.getOrNull(block)?.kind().orEmpty()

    fun groupBlockText(index: Int, block: Int): String =
        groupBlocks.getOrNull(index)?.getOrNull(block)?.toMarkdown().orEmpty()

    // --- Tips ---
    // Cached locally because TipsRepository.getTips() re-parses tips.md on every call.

    private var tipInfos: List<TipInfo> = emptyList()

    private fun tipList(): List<TipInfo> {
        if (tipInfos.isEmpty()) tipInfos = tips.getTips()
        return tipInfos
    }

    private fun tipSections(index: Int): List<TipSectionElement> =
        tipList().getOrNull(index)?.sections.orEmpty()

    fun tipCount(): Int = tipList().size

    fun tipTitle(index: Int): String = tipList().getOrNull(index)?.title.orEmpty()

    /**
     * Rough rendered size of a tip, for balancing the card columns. Counts characters
     * without building anything, so laying out the grid does not render every tip.
     */
    fun tipWeight(index: Int): Int =
        tipTitle(index).length + tipSections(index).sumOf { it.weight() }

    // Tips are drawn as cards rather than one Markdown document, so the UI needs the
    // blocks individually: code lines get a chip background, prose does not.

    fun tipBlockCount(index: Int): Int = tipSections(index).size

    fun tipBlockKind(index: Int, block: Int): String =
        tipSections(index).getOrNull(block)?.kind().orEmpty()

    fun tipBlockText(index: Int, block: Int): String =
        tipSections(index).getOrNull(block)?.toMarkdown().orEmpty()
}
