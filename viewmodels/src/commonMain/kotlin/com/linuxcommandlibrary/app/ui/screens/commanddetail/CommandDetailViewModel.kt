package com.linuxcommandlibrary.app.ui.screens.commanddetail

import com.linuxcommandlibrary.app.data.CommandsRepository
import com.linuxcommandlibrary.app.data.DataManager
import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.TipSectionElement
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.collections.immutable.toImmutableMap
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CommandDetailViewModel(
    private val commandName: String,
    private val dataManager: DataManager,
    private val commandsRepository: CommandsRepository,
    private val scope: CoroutineScope,
) {
    private val _state = MutableStateFlow(CommandDetailUiState())
    val state = _state.asStateFlow()

    private var loadJob: Job? = null

    private companion object {
        val MARKDOWN_LINK_REGEX = Regex("\\[([^\\]]+)\\]\\([^)]+\\)")
    }

    init {
        loadJob = scope.launch(Dispatchers.Default) {
            val sectionsData = commandsRepository.getSections(commandName)
            val isAutoExpandEnabled = dataManager.isAutoExpandSections()

            val seeAlsoSection = sectionsData.find { it.title == "SEE ALSO" }
            val seeAlsoCommands = seeAlsoSection?.content?.let { content ->
                MARKDOWN_LINK_REGEX.findAll(content)
                    .map { it.groupValues[1] }
                    .filter { commandsRepository.hasCommand(it) }
                    .toList()
                    .toImmutableList()
            } ?: persistentListOf()

            val resourcesSection = sectionsData.find { it.title == "RESOURCES" }
            val resources = resourcesSection?.parsedContent
                ?.let { extractResourceLinks(it) }
                ?: persistentListOf()

            _state.update {
                CommandDetailUiState(
                    sections = sectionsData,
                    expandedSectionsMap = sectionsData.associate { section ->
                        section.id to isAutoExpandEnabled
                    }.toImmutableMap(),
                    isBookmarked = dataManager.hasBookmark(commandName),
                    seeAlsoCommands = seeAlsoCommands,
                    resources = resources,
                )
            }
        }
    }

    fun cancel() {
        loadJob?.cancel()
    }

    fun onToggleAllExpanded() {
        val isAllExpanded = _state.value.isAllExpanded()
        _state.update {
            val updatedMap = it.expandedSectionsMap.mapValues { !isAllExpanded }.toImmutableMap()
            it.copy(expandedSectionsMap = updatedMap)
        }
        dataManager.setAutoExpandSections(!isAllExpanded)
    }

    fun onToggleExpanded(id: Long) {
        _state.update {
            val updatedMap = it.expandedSectionsMap.toMutableMap()
            val currentValue = updatedMap[id] ?: false
            updatedMap[id] = !currentValue
            it.copy(expandedSectionsMap = updatedMap.toImmutableMap())
        }
    }

    fun removeBookmark() {
        _state.update {
            it.copy(isBookmarked = false)
        }
        dataManager.removeBookmark(commandName)
    }

    fun addBookmark() {
        _state.update {
            it.copy(isBookmarked = true)
        }
        dataManager.addBookmark(commandName)
    }
}

/**
 * Collect the external links from a parsed RESOURCES section into chip-ready data.
 * Each link is a one-line code block holding a single [CommandElement.Url].
 */
private fun extractResourceLinks(
    elements: ImmutableList<TipSectionElement>,
): ImmutableList<ResourceLink> = elements
    .filterIsInstance<TipSectionElement.Code>()
    .flatMap { it.elements }
    .filterIsInstance<CommandElement.Url>()
    .map { ResourceLink(label = it.command, url = it.url) }
    .toImmutableList()
