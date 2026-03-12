package com.linuxcommandlibrary.app.ui.theme

import android.os.Build
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
actual fun dynamicThemeColors(darkTheme: Boolean): DynamicThemeColors? {
    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.S) return null

    val context = LocalContext.current
    val m3Scheme = if (darkTheme) {
        dynamicDarkColorScheme(context)
    } else {
        dynamicLightColorScheme(context)
    }

    val colors = if (darkTheme) {
        darkColors(
            primary = BrandRed,
            primaryVariant = BrandDarkRed,
            secondary = m3Scheme.onSurface,
            background = m3Scheme.background,
            surface = m3Scheme.surface,
        )
    } else {
        lightColors(
            primary = BrandRed,
            primaryVariant = BrandDarkRed,
            secondary = m3Scheme.onSurface,
            background = m3Scheme.background,
            surface = m3Scheme.surface,
        )
    }

    val customColors = CustomColors(
        navBarBackground = m3Scheme.surfaceContainer,
    )

    return DynamicThemeColors(colors = colors, customColors = customColors)
}
