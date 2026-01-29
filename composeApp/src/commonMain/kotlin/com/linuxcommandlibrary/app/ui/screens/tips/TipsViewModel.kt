package com.linuxcommandlibrary.app.ui.screens.tips

import com.linuxcommandlibrary.app.data.TipInfo
import com.linuxcommandlibrary.app.data.TipsRepository
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class TipsViewModel(
    private val tipsRepository: TipsRepository,
    private val scope: CoroutineScope,
) {
    private val _tips = MutableStateFlow<ImmutableList<TipInfo>>(persistentListOf())
    val tips = _tips.asStateFlow()

    init {
        scope.launch(Dispatchers.Default) {
            _tips.value = tipsRepository.getTips().toImmutableList()
        }
    }
}
