package com.linuxcommandlibrary.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.linuxcommandlibrary.app.resources.Res
import com.linuxcommandlibrary.app.resources.share_tech_mono
import org.jetbrains.compose.resources.Font

val BrandRed = Color(0xFFe45151)
val BrandDarkRed = Color(0xFFc62828)
val BrandRedMuted = Color(0xFF5E2A2A)
val BrandRedSurface = Color(0xFFFFE5E0)

/**
 * Body/explanation text, slightly dimmed against [onSurface] so titles stand out
 * (matches the web's muted body). Used by rich-content surfaces (basics, tips).
 */
val ColorScheme.mutedBodyText: Color
    get() = onSurface.copy(alpha = 0.75f)

data class CustomColors(
    val navBarBackground: Color = Color(0xFF00695C),
    val topBarBackground: Color = BrandRed,
    val topBarContent: Color = Color.White,
)

val LocalCustomColors = compositionLocalOf { CustomColors() }

@Composable
fun LinuxTheme(
    darkMode: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val darkColors = darkColorScheme(
        primary = BrandRed,
        onPrimary = Color.White,
        primaryContainer = BrandDarkRed,
        onPrimaryContainer = Color.White,
        secondary = BrandRed,
        onSecondary = Color.White,
        secondaryContainer = BrandRedMuted,
        onSecondaryContainer = Color.White,
        onSurface = Color.White,
        onSurfaceVariant = Color(0xFFCCCCCC),
        background = Color(0xFF262626),
        surface = Color(0xFF262626),
        surfaceContainerLowest = Color(0xFF1A1A1A),
        surfaceContainerLow = Color(0xFF2D2D2D),
        surfaceContainer = Color(0xFF1E1E1E),
        surfaceContainerHigh = Color(0xFF383838),
        surfaceContainerHighest = Color(0xFF3D3D3D),
        surfaceVariant = Color(0xFF3D3D3D),
        surfaceTint = Color.Transparent,
    )
    val lightColors = lightColorScheme(
        primary = BrandRed,
        onPrimary = Color.White,
        primaryContainer = BrandRedSurface,
        onPrimaryContainer = BrandDarkRed,
        secondary = BrandRed,
        onSecondary = Color.White,
        secondaryContainer = BrandRedSurface,
        onSecondaryContainer = BrandDarkRed,
        onSurface = Color.Black,
        onSurfaceVariant = Color(0xFF555555),
        background = Color.White,
        surface = Color.White,
        surfaceContainerLowest = Color.White,
        surfaceContainerLow = Color(0xFFF5F5F5),
        surfaceContainer = Color(0xFFEEEEEE),
        surfaceContainerHigh = Color(0xFFE8E8E8),
        surfaceContainerHighest = Color(0xFFE0E0E0),
        surfaceVariant = Color(0xFFE0E0E0),
        surfaceTint = Color.Transparent,
    )
    val dynamicColors = dynamicThemeColors(darkMode)
    val colorSchema = dynamicColors?.colorScheme ?: if (darkMode) darkColors else lightColors

    val techMonoFont = FontFamily(
        Font(Res.font.share_tech_mono),
    )

    val codeTextStyle = TextStyle(
        fontFamily = techMonoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        color = colorSchema.onSurface,
    )

    val typography = Typography(
        titleSmall = codeTextStyle,
    )

    val customColors = dynamicColors?.customColors ?: if (darkMode) {
        CustomColors(
            navBarBackground = Color(0xFF2D2D2D),
        )
    } else {
        CustomColors(
            navBarBackground = Color(0xFFFAFAFA),
        )
    }
    CompositionLocalProvider(LocalCustomColors provides customColors) {
        MaterialTheme(
            colorScheme = colorSchema,
            typography = typography,
            content = content,
        )
    }
}
