package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.tips

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.inspiredandroid.linuxcommandbibliotheca.data.TipInfo
import com.inspiredandroid.linuxcommandbibliotheca.data.TipsRepository
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class TipsViewModel(
    private val tipsRepository: TipsRepository,
) : ViewModel() {

    private val _tips = MutableStateFlow<ImmutableList<TipInfo>>(persistentListOf())
    val tips = _tips.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            _tips.value = tipsRepository.getTips().toImmutableList()
        }
    }
}
