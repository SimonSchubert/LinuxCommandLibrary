package com.linuxcommandlibrary.app.ui.screens.commanddetail

import com.linuxcommandlibrary.app.data.CommandsRepository
import com.linuxcommandlibrary.app.data.DataManager
import com.linuxcommandlibrary.app.data.getSortPriority
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.collections.immutable.toImmutableMap
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CommandDetailViewModel(
    private val commandName: String,
    private val dataManager: DataManager,
    private val commandsRepository: CommandsRepository,
    private val scope: CoroutineScope,
) {
    val state = MutableStateFlow(CommandDetailUiState())

    private companion object {
        val MARKDOWN_LINK_REGEX = Regex("\\[([^\\]]+)\\]\\([^)]+\\)")
    }

    init {
        scope.launch(Dispatchers.Default) {
            val sectionsData = commandsRepository.getSections(commandName).sortedBy { it.getSortPriority() }
            val isAutoExpandEnabled = dataManager.isAutoExpandSections()

            val seeAlsoSection = sectionsData.find { it.title == "SEE ALSO" }
            val seeAlsoCommands = seeAlsoSection?.content?.let { content ->
                MARKDOWN_LINK_REGEX.findAll(content)
                    .map { it.groupValues[1] }
                    .filter { commandsRepository.hasCommand(it) }
                    .toList()
                    .toImmutableList()
            } ?: persistentListOf()

            state.update {
                CommandDetailUiState(
                    sections = sectionsData.toImmutableList(),
                    expandedSectionsMap = sectionsData.associate { section ->
                        section.id to isAutoExpandEnabled
                    }.toImmutableMap(),
                    isBookmarked = dataManager.hasBookmark(commandName),
                    seeAlsoCommands = seeAlsoCommands,
                )
            }
        }
    }

    fun onToggleAllExpanded() {
        val isAllExpanded = state.value.isAllExpanded()
        state.update {
            val currentMap = it.expandedSectionsMap
            val updatedMap = currentMap.mapValues { !isAllExpanded }.toImmutableMap()
            it.copy(expandedSectionsMap = updatedMap)
        }
        dataManager.setAutoExpandSections(!isAllExpanded)
    }

    fun onToggleExpanded(id: Long) {
        state.update {
            val currentMap = it.expandedSectionsMap
            val updatedMap = currentMap.toMutableMap()
            val currentValue = updatedMap[id] ?: false
            updatedMap[id] = !currentValue
            it.copy(expandedSectionsMap = updatedMap.toImmutableMap())
        }
    }

    fun removeBookmark() {
        state.update {
            it.copy(isBookmarked = false)
        }
        dataManager.removeBookmark(commandName)
    }

    fun addBookmark() {
        state.update {
            it.copy(
                isBookmarked = true,
                showBookmarkDialog = true,
            )
        }
        dataManager.addBookmark(commandName)
    }

    fun hideBookmarkDialog() {
        state.update {
            it.copy(showBookmarkDialog = false)
        }
    }
}
