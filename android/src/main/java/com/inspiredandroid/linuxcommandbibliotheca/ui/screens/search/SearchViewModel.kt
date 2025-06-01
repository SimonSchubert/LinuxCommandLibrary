package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.search

import androidx.compose.runtime.mutableStateMapOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.sortedSearch
import databases.BasicGroup
import databases.Command
import kotlinx.collections.immutable.ImmutableList
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

class SearchViewModel : ViewModel() {

    private val collapsedMap = mutableStateMapOf<Long, Boolean>()

    fun isGroupCollapsed(id: Long): Boolean = collapsedMap[id] == true

    fun toggleCollapse(id: Long) {
        collapsedMap[id] = !collapsedMap.getOrDefault(id, false)
    }

    private val _filteredCommands = MutableStateFlow<ImmutableList<Command>>(persistentListOf())
    val filteredCommands = _filteredCommands.asStateFlow()

    private val _filteredBasicGroups = MutableStateFlow<ImmutableList<BasicGroup>>(persistentListOf())
    val filteredBasicGroups = _filteredBasicGroups.asStateFlow()

    private var searchJob: Job? = null
    fun search(searchText: String) {
        searchJob?.cancel()
        searchJob = viewModelScope.launch(Dispatchers.IO) {
            try {
                ensureActive()

                val commands = databaseHelper.getCommandsByQuery(searchText).sortedSearch(searchText)
                val basicGroups = databaseHelper.getBasicGroupsByQuery(searchText)

                ensureActive()

                _filteredCommands.update { commands.toImmutableList() }
                _filteredBasicGroups.update { basicGroups.toImmutableList() }
            } catch (ignore: CancellationException) { }
        }
    }
}
