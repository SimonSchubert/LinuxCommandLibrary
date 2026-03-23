package com.linuxcommandlibrary.app.ui.screens.tips

import com.linuxcommandlibrary.app.data.TipsRepository
import com.linuxcommandlibrary.app.platform.showAndroidTerminalTip
import com.linuxcommandlibrary.shared.TextElement
import com.linuxcommandlibrary.shared.TipInfo
import com.linuxcommandlibrary.shared.TipSectionElement
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
            val tips = tipsRepository.getTips()
            _tips.value = if (showAndroidTerminalTip) {
                (tips + createTerminalSetupTip()).toImmutableList()
            } else {
                tips.toImmutableList()
            }
        }
    }

    private fun createTerminalSetupTip(): TipInfo {
        val sections = persistentListOf(
            TipSectionElement.Text(
                persistentListOf(
                    TextElement.Plain("Android 15+ includes a built-in Linux terminal running Debian. Here's how to enable it:"),
                ),
            ),
            TipSectionElement.Text(
                persistentListOf(
                    TextElement.Plain("1. Open "),
                    TextElement.Link("Settings", "settings"),
                ),
            ),
            TipSectionElement.Text(
                persistentListOf(
                    TextElement.Plain("2. Scroll down and tap "),
                    TextElement.Bold("System"),
                ),
            ),
            TipSectionElement.Text(
                persistentListOf(
                    TextElement.Plain("3. Tap "),
                    TextElement.Bold("Developer options"),
                ),
            ),
            TipSectionElement.Text(
                persistentListOf(
                    TextElement.Plain("If not visible, go to "),
                    TextElement.Bold("Settings > About phone"),
                    TextElement.Plain(" and tap "),
                    TextElement.Bold("Build number"),
                    TextElement.Plain(" 7 times to unlock it"),
                ),
            ),
            TipSectionElement.Text(
                persistentListOf(
                    TextElement.Plain("4. Scroll down to the "),
                    TextElement.Bold("Linux terminal"),
                    TextElement.Plain(" toggle and enable it"),
                ),
            ),
            TipSectionElement.Text(
                persistentListOf(
                    TextElement.Plain("5. Open the "),
                    TextElement.Link("Terminal", "terminal"),
                    TextElement.Plain(" app from your app drawer"),
                ),
            ),
            TipSectionElement.Text(
                persistentListOf(
                    TextElement.Plain("6. Follow the on-screen setup to complete the installation"),
                ),
            ),
            TipSectionElement.Text(
                persistentListOf(
                    TextElement.Plain("The terminal runs a Debian Linux environment with full package management via "),
                    TextElement.Bold("apt"),
                    TextElement.Plain(". You can install tools, compilers, and servers just like on a regular Debian system."),
                ),
            ),
        )
        return TipInfo(
            id = -1,
            title = "Set up the built-in Linux terminal",
            sections = sections,
        )
    }
}
