package com.linuxcommandlibrary.app.platform

import com.linuxcommandlibrary.shared.platform.ShareHandler
import platform.UIKit.UIActivityViewController
import platform.UIKit.UIApplication

class IosShareHandler : ShareHandler {
    override fun shareText(text: String) {
        val activityViewController = UIActivityViewController(
            activityItems = listOf(text),
            applicationActivities = null,
        )

        val rootViewController = UIApplication.sharedApplication.keyWindow?.rootViewController
        rootViewController?.presentViewController(
            activityViewController,
            animated = true,
            completion = null,
        )
    }
}
