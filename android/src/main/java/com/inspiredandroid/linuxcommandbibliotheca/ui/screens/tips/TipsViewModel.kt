package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.tips

import androidx.lifecycle.ViewModel
import com.linuxcommandlibrary.shared.CommandElement
import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.getCommandList
import databases.Tip
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

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

    var tips: ImmutableList<MergedTip>

    init {
        val tipSectionsFromDB = databaseHelper.getTipSections() // Renamed to avoid confusion with MergedTip.sections
        tips = databaseHelper.getTips().map { tip ->
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
                }.toImmutableList(), // Convert list of sections for a tip to ImmutableList
            )
        }.toImmutableList() // Convert final list of MergedTip to ImmutableList
    }
}
