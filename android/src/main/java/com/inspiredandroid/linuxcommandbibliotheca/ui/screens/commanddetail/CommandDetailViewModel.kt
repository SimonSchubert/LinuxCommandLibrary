package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commanddetail

import androidx.lifecycle.ViewModel
import com.inspiredandroid.linuxcommandbibliotheca.DataManager
import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.getSortPriority
import databases.CommandSection
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableMap
import kotlinx.collections.immutable.toImmutableList
import kotlinx.collections.immutable.toImmutableMap
import kotlinx.coroutines.flow.MutableStateFlow
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

class CommandDetailViewModel(
    private val commandId: Long,
    private val dataManager: DataManager,
) : ViewModel() {

    val state: MutableStateFlow<CommandDetailUiState>

    init {
        val sectionsData = databaseHelper.getSections(commandId).sortedBy { it.getSortPriority() }
        val isAutoExpandEnabled = dataManager.isAutoExpandSections()
        state = MutableStateFlow(
            CommandDetailUiState(
                sections = sectionsData.toImmutableList(),
                expandedSectionsMap = sectionsData.associate {
                    it.id to isAutoExpandEnabled
                }.toImmutableMap(),
                isBookmarked = dataManager.hasBookmark(commandId),
            ),
        )
    }

    fun onToggleAllExpanded() {
        val isAllExpanded = state.value.isAllExpanded()
        state.update {
            val currentMap = it.expandedSectionsMap
            val updatedMap = currentMap.toMutableMap()
            updatedMap.replaceAll { _, _ -> !isAllExpanded }
            it.copy(expandedSectionsMap = updatedMap.toImmutableMap())
        }
        dataManager.setAutoExpandSections(!isAllExpanded)
    }

    fun onToggleExpanded(id: Long) {
        state.update {
            val currentMap = it.expandedSectionsMap
            val updatedMap = currentMap.toMutableMap()
            updatedMap[id] = !updatedMap.getOrDefault(id, false)
            it.copy(expandedSectionsMap = updatedMap.toImmutableMap())
        }
    }

    fun removeBookmark() {
        state.update {
            it.copy(isBookmarked = false)
        }
        dataManager.removeBookmark(commandId)
    }

    fun addBookmark() {
        state.update {
            it.copy(
                isBookmarked = true,
                showBookmarkDialog = true,
            )
        }
        dataManager.addBookmark(commandId)
    }

    fun hideBookmarkDialog() {
        state.update {
            it.copy(showBookmarkDialog = false)
        }
    }
}
