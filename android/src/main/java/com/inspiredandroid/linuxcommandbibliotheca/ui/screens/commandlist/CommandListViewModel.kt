package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commandlist

import android.content.SharedPreferences
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.inspiredandroid.linuxcommandbibliotheca.PreferenceUtil
import com.linuxcommandlibrary.shared.databaseHelper
import databases.Command
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

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

class CommandListViewModel(private val preferenceUtil: PreferenceUtil) : ViewModel() {

    private val _commands = MutableStateFlow<List<Command>>(emptyList())
    val commands = _commands.asStateFlow()

    private val preferenceListener = SharedPreferences.OnSharedPreferenceChangeListener { _, key ->
        if (key == PreferenceUtil.KEY_BOOKMARKS) {
            updateCommands()
        }
    }

    init {
        updateCommands()
        preferenceUtil.prefs.registerOnSharedPreferenceChangeListener(preferenceListener)
    }

    private fun updateCommands() {
        viewModelScope.launch(Dispatchers.IO) {
            _commands.update {
                databaseHelper.getCommands().sortedBy { !hasBookmark(it.id) }
            }
        }
    }

    fun hasBookmark(id: Long): Boolean = preferenceUtil.hasBookmark(id)

    override fun onCleared() {
        preferenceUtil.prefs.unregisterOnSharedPreferenceChangeListener(preferenceListener)
        super.onCleared()
    }
}
