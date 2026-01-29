package com.linuxcommandlibrary.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
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

data class CustomColors(
    val navBarBackground: Color = Color(0xFF00695C),
)

val LocalCustomColors = compositionLocalOf { CustomColors() }

@Composable
fun LinuxTheme(content: @Composable () -> Unit) {
    val darkMode = isSystemInDarkTheme()
    val darkColors = darkColors(
        primary = Color(0xFFe45151),
        secondary = Color.White,
        background = Color(0xFF262626),
        surface = Color(0xFF262626),
    )
    val lightColors = lightColors(
        primary = Color(0xFFe45151),
        secondary = Color.Black,
        background = Color.White,
        surface = Color.White,
    )
    val colorSchema = if (darkMode) darkColors else lightColors

    val techMonoFont = FontFamily(
        Font(Res.font.share_tech_mono),
    )

    val codeTextStyle = TextStyle(
        fontFamily = techMonoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        color = colorSchema.secondary,
    )

    val typography = Typography(
        subtitle2 = codeTextStyle,
    )

    val customColors = if (darkMode) {
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
            colors = colorSchema,
            typography = typography,
            content = content,
        )
    }
}
