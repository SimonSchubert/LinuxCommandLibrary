package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.basicgroups

import androidx.lifecycle.ViewModel
import com.linuxcommandlibrary.shared.databaseHelper
import kotlinx.collections.immutable.toImmutableList
import kotlinx.collections.immutable.toPersistentMap
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

/* Copyright 2022 Simon Schubert
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

class BasicGroupsViewModel(categoryId: Long) : ViewModel() {

    private val _uiState = MutableStateFlow(BasicGroupsUiState())
    val uiState = _uiState.asStateFlow()

    init {
        val groups = databaseHelper.getBasicGroupsByQuery(categoryId).toImmutableList()
        _uiState.value = BasicGroupsUiState(basicGroups = groups)
    }

    fun isGroupCollapsed(id: Long): Boolean = _uiState.value.collapsedMap.getOrDefault(id, true)

    fun toggleCollapse(id: Long) {
        _uiState.update { currentState ->
            val newMap = currentState.collapsedMap.toMutableMap()
            newMap[id] = !currentState.collapsedMap.getOrDefault(id, true)
            currentState.copy(collapsedMap = newMap.toPersistentMap())
        }
    }
}
