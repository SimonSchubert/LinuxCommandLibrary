package com.linuxcommandlibrary.app.platform

import com.linuxcommandlibrary.shared.platform.ReviewHandler

class LinuxReviewHandler : ReviewHandler {
    override fun requestReviewIfNeeded() {
        // No-op: no store review prompt on Linux
    }

    override fun incrementAppStartCount() {
        // No-op
    }
}
