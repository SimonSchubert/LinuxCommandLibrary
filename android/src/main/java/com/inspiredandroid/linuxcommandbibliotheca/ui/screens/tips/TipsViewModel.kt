package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.tips

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.getCommandList
import databases.Tip
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

sealed class TipSectionElement {
    data class Text(val text: String) : TipSectionElement()
    data class Code(val command: String, val elements: ImmutableList<CommandElement>) : TipSectionElement()

    data class NestedCode(
        val text: String,
        val command: String,
        val elements: ImmutableList<CommandElement>,
    ) : TipSectionElement()

    data class NestedText(val text: String, val info: String) : TipSectionElement()
}

data class MergedTip(val tip: Tip, val sections: ImmutableList<TipSectionElement>)

class TipsViewModel : ViewModel() {

    private val _tips = MutableStateFlow<ImmutableList<MergedTip>>(persistentListOf())
    val tips = _tips.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            val tipSectionsFromDB = databaseHelper.getTipSections()
            val mergedTips = databaseHelper.getTips().map { tip ->
                MergedTip(
                    tip,
                    tipSectionsFromDB.filter { it.tip_id == tip.id }.map { section ->
                        when (section.type) {
                            0L -> {
                                val text =
                                    section.data1.replace("\\n", "").replace("<b>", "").replace("</b>", "")
                                        .replace("\\'", "")
                                TipSectionElement.Text(text)
                            }

                            1L -> {
                                TipSectionElement.Code(
                                    section.data1,
                                    section.data1.getCommandList(section.extra).toImmutableList(),
                                )
                            }

                            3L -> {
                                if (section.data2.startsWith("$")) {
                                    TipSectionElement.NestedCode(
                                        section.data1,
                                        section.data2,
                                        section.data2.getCommandList(section.extra).toImmutableList(),
                                    )
                                } else {
                                    TipSectionElement.NestedText(section.data1, section.data2)
                                }
                            }

                            else -> {
                                TipSectionElement.Text("")
                            }
                        }
                    }.toImmutableList(),
                )
            }.toImmutableList()
            _tips.value = mergedTips
        }
    }
}
