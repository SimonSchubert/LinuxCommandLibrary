package com.linuxcommandlibrary.app.ui.screens.basicgroups

import com.linuxcommandlibrary.app.data.BasicsRepository
import kotlinx.collections.immutable.toImmutableMap
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class BasicGroupsViewModel(
    categoryId: String,
    basicsRepository: BasicsRepository,
    scope: CoroutineScope,
) {
    private val _uiState = MutableStateFlow(BasicGroupsUiState())
    val uiState = _uiState.asStateFlow()

    private var loadJob: Job? = null

    init {
        loadJob = scope.launch(Dispatchers.Default) {
            val (groups, sectionsMap) = basicsRepository.getGroupsAndSections(categoryId)
            _uiState.update {
                it.copy(
                    basicGroups = groups,
                    sectionsByGroupId = sectionsMap,
                )
            }
        }
    }

    fun cancel() {
        loadJob?.cancel()
    }

    fun toggleCollapse(id: Long) {
        _uiState.update { currentState ->
            val newMap = currentState.collapsedMap.toMutableMap()
            val currentValue = currentState.collapsedMap[id] ?: true
            newMap[id] = !currentValue
            currentState.copy(collapsedMap = newMap.toImmutableMap())
        }
    }

    fun expand(id: Long) {
        _uiState.update { currentState ->
            currentState.copy(collapsedMap = (currentState.collapsedMap + (id to false)).toImmutableMap())
        }
    }
}
