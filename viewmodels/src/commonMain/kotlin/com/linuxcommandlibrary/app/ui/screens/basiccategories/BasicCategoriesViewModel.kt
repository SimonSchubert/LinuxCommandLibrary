package com.linuxcommandlibrary.app.ui.screens.basiccategories

import com.linuxcommandlibrary.app.data.BasicCategory
import com.linuxcommandlibrary.app.data.BasicsRepository
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class BasicCategoriesViewModel(
    private val basicsRepository: BasicsRepository,
    private val scope: CoroutineScope,
) {
    private val _basicCategories = MutableStateFlow<ImmutableList<BasicCategory>>(persistentListOf())
    val basicCategories = _basicCategories.asStateFlow()

    private var loadJob: Job? = null

    init {
        loadJob = scope.launch(Dispatchers.Default) {
            _basicCategories.value = basicsRepository.getCategories()
        }
    }

    fun cancel() {
        loadJob?.cancel()
    }
}
