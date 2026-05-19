package com.linuxcommandlibrary.app.ui.screens.commandlist

import com.linuxcommandlibrary.app.data.CommandInfo
import com.linuxcommandlibrary.app.data.CommandsRepository
import com.linuxcommandlibrary.app.data.DataManager
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
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

    /**
     * Re-exposes DataManager's live bookmark set. Updates automatically when
     * the user adds or removes a bookmark anywhere in the app.
     */
    val bookmarkedNames = dataManager.bookmarkNames

    private var loadJob: Job? = null

    init {
        // Load commands once, then re-sort on every bookmark change so bookmarked
        // items float to the top. Combined into one coroutine so the bookmark
        // sort always sees the loaded list (avoids a race where bookmarks emit
        // first against an empty list and then never re-apply).
        loadJob = scope.launch(Dispatchers.Default) {
            val all = commandsRepository.getCommands()
            dataManager.bookmarkNames.collect { bookmarks ->
                _commands.value = all.sortedBy { it.name !in bookmarks }.toImmutableList()
            }
        }
    }

    fun cancel() {
        loadJob?.cancel()
    }
}
