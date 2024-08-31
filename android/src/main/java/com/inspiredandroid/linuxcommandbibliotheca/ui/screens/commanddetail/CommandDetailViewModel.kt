package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commanddetail

import androidx.compose.runtime.mutableStateMapOf
import androidx.lifecycle.ViewModel
import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.getSortPriority

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

class CommandDetailViewModel(commandId: Long) : ViewModel() {

    private val collapsedMap = mutableStateMapOf<Long, Boolean>()

    var sections = databaseHelper.getSections(commandId).sortedBy { it.getSortPriority() }

    fun isGroupCollapsed(id: Long): Boolean {
        return collapsedMap[id] == true
    }

    fun toggleCollapse(id: Long) {
        collapsedMap[id] = !collapsedMap.getOrDefault(id, false)
    }
}
