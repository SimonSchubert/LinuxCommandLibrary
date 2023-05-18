package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.tips

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.getCommandList
import databases.CommandSection
import databases.Tip
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.time.measureDuration

sealed class TipSectionElement {
    data class Text(val text: String) : TipSectionElement()
    data class Code(val command: String, val elements: List<CommandElement>) :
        TipSectionElement()

    data class NestedCode(
        val text: String,
        val command: String,
        val elements: List<CommandElement>
    ) : TipSectionElement()

    data class NestedText(val text: String, val info: String) : TipSectionElement()
}

data class MergedTip(val tip: Tip, val sections: List<TipSectionElement>)

class TipsViewModel : ViewModel() {

    var tips: List<MergedTip>

    init {
        val sections = databaseHelper.getTipSections()
        tips = databaseHelper.getTips().map { tip ->
                MergedTip(tip, sections.filter { it.tip_id == tip.id }.map { section ->
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
                                section.data1.getCommandList(section.extra)
                            )
                        }

                        3L -> {
                            if (section.data2.startsWith("$")) {
                                TipSectionElement.NestedCode(
                                    section.data1,
                                    section.data2,
                                    section.data2.getCommandList(section.extra)
                                )
                            } else {
                                TipSectionElement.NestedText(section.data1, section.data2)
                            }
                        }

                        else -> {
                            TipSectionElement.Text("")
                        }
                    }
                })
            }
    }
}