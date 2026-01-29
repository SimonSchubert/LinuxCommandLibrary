package com.linuxcommandlibrary.app.platform

import com.linuxcommandlibrary.shared.platform.PreferencesStorage
import com.linuxcommandlibrary.shared.platform.ReviewHandler
import platform.StoreKit.SKStoreReviewController

class IosReviewHandler(private val preferences: PreferencesStorage) : ReviewHandler {
    override fun incrementAppStartCount() {
        val count = preferences.getInt(APP_START_COUNT_KEY, 0) + 1
        preferences.putInt(APP_START_COUNT_KEY, count)
    }

    override fun requestReviewIfNeeded() {
        val count = preferences.getInt(APP_START_COUNT_KEY, 0)
        if (count > 0 && count % 3 == 0) {
            SKStoreReviewController.requestReview()
        }
    }

    companion object {
        private const val APP_START_COUNT_KEY = "app_start_count"
    }
}
