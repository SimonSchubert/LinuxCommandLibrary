package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commandlist

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.inspiredandroid.linuxcommandbibliotheca.PreferenceUtil
import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.search
import databases.Command

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

class CommandListViewModel(val preferenceUtil: PreferenceUtil) : ViewModel() {

    private val commands: List<Command> = databaseHelper.getCommands()
    var filteredCommands = mutableStateListOf<Command>()

    fun filterCommands(searchText: String) {
        filteredCommands.clear()
        filteredCommands.addAll(
            if (searchText.isEmpty()) {
                if (preferenceUtil.bookmarksIds.isNotEmpty()) {
                    commands.sortedBy { !hasBookmark(it.id) }
                } else {
                    commands
                }
            } else {
                commands.search(searchText)
            },
        )
    }

    fun hasBookmark(id: Long): Boolean = preferenceUtil.hasBookmark(id)
}
