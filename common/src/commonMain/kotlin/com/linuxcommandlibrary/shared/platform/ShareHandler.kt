package com.linuxcommandlibrary.shared.platform

/**
 * Platform abstraction for sharing text.
 */
interface ShareHandler {
    /**
     * Share text content.
     * On Android: Opens share sheet
     * On iOS: Opens UIActivityViewController
     * On Desktop: Copies to clipboard
     */
    fun shareText(text: String)
}
