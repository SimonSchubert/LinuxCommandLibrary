package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.sortedSearch
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList
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
                )
            }
            return
        }
        searchJob = viewModelScope.launch(Dispatchers.IO) {
            try {
                ensureActive()

                val commands = databaseHelper.getCommandsByQuery(searchText).sortedSearch(searchText)
                val basicGroups = databaseHelper.getBasicGroupsByQuery(searchText)

                ensureActive()

                _uiState.update { currentState ->
                    currentState.copy(
                        filteredCommands = commands.toImmutableList(),
                        filteredBasicGroups = basicGroups.toImmutableList(),
                    )
                }
            } catch (ignore: CancellationException) {
                // Preserve previous results on cancellation
            }
        }
    }
}
