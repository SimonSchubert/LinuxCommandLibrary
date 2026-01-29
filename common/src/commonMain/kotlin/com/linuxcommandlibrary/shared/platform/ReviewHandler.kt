package com.linuxcommandlibrary.shared.platform

interface ReviewHandler {
    fun requestReviewIfNeeded()
    fun incrementAppStartCount()
}
