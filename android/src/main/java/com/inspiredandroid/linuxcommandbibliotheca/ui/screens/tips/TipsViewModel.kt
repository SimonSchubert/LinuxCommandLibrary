package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.tips

import androidx.lifecycle.ViewModel
import com.linuxcommandlibrary.shared.databaseHelper


class TipsViewModel : ViewModel() {

    var mergedTips: List<MergedTip>

    init {
        val sections = databaseHelper.getTipSections()
        mergedTips = databaseHelper.getTips().map { tip ->
            MergedTip(tip, sections.filter { it.tip_id == tip.id })
        }
    }
}