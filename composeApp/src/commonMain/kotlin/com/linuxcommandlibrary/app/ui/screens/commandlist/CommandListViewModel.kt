package com.linuxcommandlibrary.app.ui.screens.commandlist

import com.linuxcommandlibrary.app.data.CommandInfo
import com.linuxcommandlibrary.app.data.CommandsRepository
import com.linuxcommandlibrary.app.data.DataManager
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.ImmutableSet
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.persistentSetOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.collections.immutable.toImmutableSet
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CommandListViewModel(
    private val dataManager: DataManager,
    private val commandsRepository: CommandsRepository,
    private val scope: CoroutineScope,
) {
    private val _commands = MutableStateFlow<ImmutableList<CommandInfo>>(persistentListOf())
    val commands = _commands.asStateFlow()

    private val _bookmarkedNames = MutableStateFlow<ImmutableSet<String>>(persistentSetOf())
    val bookmarkedNames = _bookmarkedNames.asStateFlow()

    init {
        updateCommands()
    }

    fun updateCommands() {
        scope.launch(Dispatchers.Default) {
            val allCommands = commandsRepository.getCommands()
            val bookmarks = allCommands
                .filter { dataManager.hasBookmark(it.name) }
                .map { it.name }
                .toImmutableSet()
            _bookmarkedNames.value = bookmarks
            _commands.value = allCommands
                .sortedBy { it.name !in bookmarks }
                .toImmutableList()
        }
    }
}
