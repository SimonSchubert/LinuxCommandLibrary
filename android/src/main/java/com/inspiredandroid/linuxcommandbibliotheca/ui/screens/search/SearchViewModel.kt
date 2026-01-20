package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.inspiredandroid.linuxcommandbibliotheca.data.CommandsRepository
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlin.coroutines.cancellation.CancellationException

class SearchViewModel(
    private val commandsRepository: CommandsRepository,
) : ViewModel() {

    private val _uiState = MutableStateFlow(SearchUiState())
    val uiState = _uiState.asStateFlow()

    private var searchJob: Job? = null
    fun search(searchText: String) {
        searchJob?.cancel()
        if (searchText.isBlank()) {
            _uiState.update {
                it.copy(filteredCommands = persistentListOf())
            }
            return
        }
        searchJob = viewModelScope.launch(Dispatchers.IO) {
            try {
                ensureActive()

                val commands = commandsRepository.getCommandsByQuery(searchText)

                _uiState.update { currentState ->
                    currentState.copy(filteredCommands = commands.toImmutableList())
                }
            } catch (ignore: CancellationException) {
                // Preserve previous results on cancellation
            }
        }
    }
}
