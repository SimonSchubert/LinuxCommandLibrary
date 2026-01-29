package com.linuxcommandlibrary.app.platform

import com.linuxcommandlibrary.shared.platform.ShareHandler
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection

class DesktopShareHandler : ShareHandler {
    override fun shareText(text: String) {
        val clipboard = Toolkit.getDefaultToolkit().systemClipboard
        clipboard.setContents(StringSelection(text), null)
    }
}
