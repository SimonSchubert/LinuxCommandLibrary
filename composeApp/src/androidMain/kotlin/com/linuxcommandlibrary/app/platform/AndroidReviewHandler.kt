package com.linuxcommandlibrary.app.platform

import com.linuxcommandlibrary.shared.platform.ReviewHandler

class AndroidReviewHandler : ReviewHandler {
    override fun requestReviewIfNeeded() {
        // No-op on Android - uses Play Store button in AppInfoDialog
    }

    override fun incrementAppStartCount() {
        // No-op on Android
    }
}
