package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.sortedSearch
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.persistentSetOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.collections.immutable.toImmutableSet
import kotlinx.collections.immutable.toPersistentMap
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlin.coroutines.cancellation.CancellationException

class SearchViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(SearchUiState())
    val uiState = _uiState.asStateFlow()

    fun isGroupCollapsed(id: Long): Boolean = _uiState.value.collapsedMap.getOrDefault(id, false)

    fun toggleCollapse(id: Long) {
        _uiState.update { currentState ->
            val newMap = currentState.collapsedMap.toMutableMap()
            newMap[id] = !currentState.collapsedMap.getOrDefault(id, false)
            currentState.copy(collapsedMap = newMap.toPersistentMap())
        }
    }

    private var searchJob: Job? = null
    fun search(searchText: String) {
        searchJob?.cancel()
        if (searchText.isBlank()) {
            _uiState.update {
                it.copy(
                    filteredCommands = persistentListOf(),
                    filteredBasicGroups = persistentListOf(),
                    matchingBasicCommandIds = persistentSetOf(),
                    groupsMatchedByCommand = persistentSetOf(),
                )
            }
            return
        }
        searchJob = viewModelScope.launch(Dispatchers.IO) {
            try {
                ensureActive()

                // Search commands (man pages)
                val commands = databaseHelper.getCommandsByQuery(searchText).sortedSearch(searchText)
                // Search basic groups by description
                val basicGroupsByDescription = databaseHelper.getBasicGroupsByQuery(searchText)
                // Search basic commands (one-liners) by command text
                val matchingBasicCommands = databaseHelper.getBasicCommandsByQuery(searchText)

                ensureActive()

                // Get parent groups for matching basic commands
                val groupsFromCommands = matchingBasicCommands
                    .mapNotNull { basicCommand ->
                        databaseHelper.getBasicGroup(basicCommand.group_id)
                    }
                    .distinctBy { it.id }

                // Track which groups were matched via their commands (for auto-expand)
                val groupsMatchedByCommandIds = groupsFromCommands.map { it.id }.toSet()

                // Merge groups: description matches + command matches (avoid duplicates)
                val descriptionMatchIds = basicGroupsByDescription.map { it.id }.toSet()
                val allGroups = basicGroupsByDescription + groupsFromCommands.filter { it.id !in descriptionMatchIds }

                ensureActive()

                _uiState.update { currentState ->
                    currentState.copy(
                        filteredCommands = commands.toImmutableList(),
                        filteredBasicGroups = allGroups.toImmutableList(),
                        matchingBasicCommandIds = matchingBasicCommands.map { it.id }.toImmutableSet(),
                        groupsMatchedByCommand = groupsMatchedByCommandIds.toImmutableSet(),
                    )
                }
            } catch (ignore: CancellationException) {
                // Preserve previous results on cancellation
            }
        }
    }
}
