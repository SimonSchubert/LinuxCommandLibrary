package com.linuxcommandlibrary.app.ui.screens.search

import com.linuxcommandlibrary.app.data.BasicsRepository
import com.linuxcommandlibrary.app.data.CommandsRepository
import kotlinx.collections.immutable.persistentListOf
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
    private val basicsRepository: BasicsRepository,
    private val scope: CoroutineScope,
) {
    private val _uiState = MutableStateFlow(SearchUiState())
    val uiState = _uiState.asStateFlow()

    private var searchJob: Job? = null

    fun cancel() {
        searchJob?.cancel()
    }

    fun search(searchText: String) {
        searchJob?.cancel()
        if (searchText.isBlank()) {
            _uiState.update {
                it.copy(filteredCommands = persistentListOf(), filteredBasicGroups = persistentListOf())
            }
            return
        }
        searchJob = scope.launch(Dispatchers.Default) {
            try {
                ensureActive()

                val commands = commandsRepository.getCommandsByQuery(searchText)
                ensureActive()
                val basicGroups = basicsRepository.getMatchingGroups(searchText)

                _uiState.update { currentState ->
                    currentState.copy(
                        filteredCommands = commands,
                        filteredBasicGroups = basicGroups,
                    )
                }
            } catch (ignore: CancellationException) {
                // Preserve previous results on cancellation
            }
        }
    }
}
