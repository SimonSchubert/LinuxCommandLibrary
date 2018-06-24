package com.inspiredandroid.linuxcommandbibliotheca.misc

import android.content.Context
import android.graphics.Typeface

object TypefaceUtils {

    private var typeface: Typeface? = null

    /**
     * Get typeface by filename from assets main directory
     *
     * @param context
     * @return
     */
    fun getTypeFace(context: Context): Typeface {
        if (typeface == null) {
            typeface = Typeface.createFromAsset(context.assets, "ShareTechMono-Regular.ttf")
        }
        return typeface ?: Typeface.createFromAsset(context.assets, "ShareTechMono-Regular.ttf")
    }
}