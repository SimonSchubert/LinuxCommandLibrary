package com.linuxcommandlibrary.app.platform

import com.linuxcommandlibrary.shared.platform.ReviewHandler

class DesktopReviewHandler : ReviewHandler {
    override fun requestReviewIfNeeded() {
        // No-op on Desktop
    }

    override fun incrementAppStartCount() {
        // No-op on Desktop
    }
}
