package com.linuxcommandlibrary.app.ui.screens.basicgroups

import com.linuxcommandlibrary.app.data.BasicsRepository
import com.linuxcommandlibrary.shared.BasicGroup
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class BasicEditorViewModel(
    categoryId: String,
    basicsRepository: BasicsRepository,
    scope: CoroutineScope,
) {
    private val _groups = MutableStateFlow<ImmutableList<BasicGroup>>(persistentListOf())
    val groups = _groups.asStateFlow()

    init {
        scope.launch(Dispatchers.Default) {
            val basicInfo = basicsRepository.getBasicInfo(categoryId)
            if (basicInfo != null) {
                _groups.value = basicInfo.groups.toImmutableList()
            }
        }
    }
}
