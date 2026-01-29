package com.linuxcommandlibrary.app.ui.screens.basicgroups

import com.linuxcommandlibrary.app.data.BasicsRepository
import kotlinx.collections.immutable.toImmutableList
import kotlinx.collections.immutable.toImmutableMap
import kotlinx.collections.immutable.toPersistentMap
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
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

    init {
        scope.launch(Dispatchers.Default) {
            val (groups, commandsMap) = basicsRepository.getGroupsAndCommands(categoryId)
            _uiState.update {
                it.copy(
                    basicGroups = groups.toImmutableList(),
                    commandsByGroupId = commandsMap.mapValues { entry ->
                        entry.value.toImmutableList()
                    }.toImmutableMap(),
                )
            }
        }
    }

    fun toggleCollapse(id: Long) {
        _uiState.update { currentState ->
            val newMap = currentState.collapsedMap.toMutableMap()
            val currentValue = currentState.collapsedMap[id] ?: true
            newMap[id] = !currentValue
            currentState.copy(collapsedMap = newMap.toPersistentMap())
        }
    }
}
