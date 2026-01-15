package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.basiccategories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.linuxcommandlibrary.shared.databaseHelper
import databases.BasicCategory
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
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

class BasicCategoriesViewModel : ViewModel() {

    private val _basicCategories = MutableStateFlow<ImmutableList<BasicCategory>>(persistentListOf())
    val basicCategories = _basicCategories.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            _basicCategories.value = databaseHelper.getBasics().toImmutableList()
        }
    }
}
