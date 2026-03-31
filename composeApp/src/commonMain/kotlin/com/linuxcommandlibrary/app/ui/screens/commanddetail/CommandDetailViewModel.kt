package com.linuxcommandlibrary.app.ui.screens.commanddetail

import com.linuxcommandlibrary.app.data.CommandsRepository
import com.linuxcommandlibrary.app.data.DataManager
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.collections.immutable.toImmutableMap
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
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

    private companion object {
        val MARKDOWN_LINK_REGEX = Regex("\\[([^\\]]+)\\]\\([^)]+\\)")
    }

    init {
        scope.launch(Dispatchers.Default) {
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

            _state.update {
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
        val isAllExpanded = _state.value.isAllExpanded()
        _state.update {
            val currentMap = it.expandedSectionsMap
            val updatedMap = currentMap.mapValues { !isAllExpanded }.toImmutableMap()
            it.copy(expandedSectionsMap = updatedMap)
        }
        dataManager.setAutoExpandSections(!isAllExpanded)
    }

    fun onToggleExpanded(id: Long) {
        _state.update {
            val currentMap = it.expandedSectionsMap
            val updatedMap = currentMap.toMutableMap()
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
            it.copy(
                isBookmarked = true,
                showBookmarkDialog = true,
            )
        }
        dataManager.addBookmark(commandName)
    }

    fun hideBookmarkDialog() {
        _state.update {
            it.copy(showBookmarkDialog = false)
        }
    }
}
