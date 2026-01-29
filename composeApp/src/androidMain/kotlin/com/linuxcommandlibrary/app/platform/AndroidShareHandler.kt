package com.linuxcommandlibrary.app.platform

import android.content.Context
import android.content.Intent
import com.linuxcommandlibrary.shared.platform.ShareHandler

class AndroidShareHandler(private val context: Context) : ShareHandler {
    override fun shareText(text: String) {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, text)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        try {
            context.startActivity(
                Intent.createChooser(intent, "Share command").apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                },
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
