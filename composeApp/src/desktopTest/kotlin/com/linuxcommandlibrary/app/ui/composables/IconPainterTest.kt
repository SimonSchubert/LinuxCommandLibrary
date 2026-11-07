package com.linuxcommandlibrary.app.ui.composables

import com.linuxcommandlibrary.app.resources.Res
import com.linuxcommandlibrary.app.resources.allDrawableResources
import kotlin.test.Test
import kotlin.test.assertTrue

class IconPainterTest {

    @Test
    fun everyAppIconHasADrawable() {
        val missing = AppIcon.entries.map(::appIconAssetName).filterNot(Res.allDrawableResources::containsKey)
        assertTrue(missing.isEmpty(), "No drawable for: $missing")
    }
}
