package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.tips

import androidx.lifecycle.ViewModel
import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.getCommandList
import databases.Tip

sealed class TipSectionElement
data class TipSectionTextElement(val text: String) : TipSectionElement()
data class TipSectionCodeElement(val command: String, val elements: List<CommandElement>) :
    TipSectionElement()

data class TipSectionNestedCodeElement(
    val text: String,
    val command: String,
    val elements: List<CommandElement>
) : TipSectionElement()

data class TipSectionNestedTextElement(val text: String, val info: String) : TipSectionElement()

data class MergedTip(val tip: Tip, val sections: List<TipSectionElement>)

class TipsViewModel : ViewModel() {

    var mergedTips: List<MergedTip>

    init {
        val sections = databaseHelper.getTipSections()
        mergedTips = databaseHelper.getTips().map { tip ->
            MergedTip(tip, sections.filter { it.tip_id == tip.id }.map { section ->
                when (section.type) {
                    0L -> {
                        val text =
                            section.data1.replace("\\n", "").replace("<b>", "").replace("</b>", "")
                                .replace("\\'", "")
                        TipSectionTextElement(text)
                    }
                    1L -> {
                        TipSectionCodeElement(
                            section.data1,
                            section.data1.getCommandList(section.extra)
                        )
                    }
                    3L -> {
                        if (section.data2.startsWith("$")) {
                            TipSectionNestedCodeElement(
                                section.data1,
                                section.data2,
                                section.data2.getCommandList(section.extra)
                            )
                        } else {
                            TipSectionNestedTextElement(section.data1, section.data2)
                        }
                    }
                    else -> {
                        TipSectionTextElement("")
                    }
                }
            })
        }
    }
}