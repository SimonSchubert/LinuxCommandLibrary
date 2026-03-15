package com.linuxcommandlibrary.app.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable

data class DynamicThemeColors(
    val colorScheme: ColorScheme,
    val customColors: CustomColors,
)

@Composable
expect fun dynamicThemeColors(darkTheme: Boolean): DynamicThemeColors?
