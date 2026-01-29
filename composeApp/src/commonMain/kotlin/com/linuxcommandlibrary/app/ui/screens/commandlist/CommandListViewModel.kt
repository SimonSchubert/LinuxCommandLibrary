package com.linuxcommandlibrary.app.ui.screens.commandlist

import com.linuxcommandlibrary.app.data.CommandInfo
import com.linuxcommandlibrary.app.data.CommandsRepository
import com.linuxcommandlibrary.app.data.DataManager
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CommandListViewModel(
    private val dataManager: DataManager,
    private val commandsRepository: CommandsRepository,
    private val scope: CoroutineScope,
) {
    private val _commands = MutableStateFlow<ImmutableList<CommandInfo>>(persistentListOf())
    val commands = _commands.asStateFlow()

    init {
        updateCommands()
    }

    fun updateCommands() {
        scope.launch(Dispatchers.Default) {
            _commands.update {
                commandsRepository.getCommands().sortedBy { !hasBookmark(it.name) }.toImmutableList()
            }
        }
    }

    fun hasBookmark(name: String): Boolean = dataManager.hasBookmark(name)
}
