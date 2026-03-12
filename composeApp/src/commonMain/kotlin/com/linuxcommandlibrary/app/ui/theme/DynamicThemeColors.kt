package com.linuxcommandlibrary.app.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable

data class DynamicThemeColors(
    val colors: Colors,
    val customColors: CustomColors,
)

@Composable
expect fun dynamicThemeColors(darkTheme: Boolean): DynamicThemeColors?
