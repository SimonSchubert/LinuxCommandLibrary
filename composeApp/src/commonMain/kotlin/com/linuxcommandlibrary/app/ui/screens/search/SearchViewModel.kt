package com.linuxcommandlibrary.app.ui.screens.search

import com.linuxcommandlibrary.app.data.CommandsRepository
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.CoroutineScope
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
    private val scope: CoroutineScope,
) {
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
        searchJob = scope.launch(Dispatchers.Default) {
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
