package com.linuxcommandlibrary.app.platform

import com.linuxcommandlibrary.shared.platform.ShareHandler
import kotlinx.cinterop.ExperimentalForeignApi
import platform.posix.fputs
import platform.posix.pclose
import platform.posix.popen

/**
 * Copies to the clipboard, matching Desktop's share-is-copy behaviour.
 * wl-copy first (Wayland/Hyprland), xclip as the X11 fallback.
 */
class LinuxShareHandler : ShareHandler {
    @OptIn(ExperimentalForeignApi::class)
    override fun shareText(text: String) {
        for (command in listOf("wl-copy", "xclip -selection clipboard")) {
            val pipe = popen(command, "w") ?: continue
            val wrote = fputs(text, pipe) >= 0
            val exit = pclose(pipe)
            if (wrote && exit == 0) return
        }
    }
}
