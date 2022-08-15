package com.inspiredandroid.linuxcommandbibliotheca.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.inspiredandroid.linuxcommandbibliotheca.R

/* Copyright 2022 Simon Schubert
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

@Composable
fun LinuxTheme(content: @Composable () -> Unit) {
    val darkMode = isSystemInDarkTheme()
    val ourDarkColorScheme = darkColors(
        primary = Color(0xFFe45151),
        secondary = Color.White,
        background = Color(0xFF262626)
    )
    val ourLightColorScheme = lightColors(
        primary = Color(0xFFe45151),
        secondary = Color.Black
    )
    val colorSchema = if (darkMode) ourDarkColorScheme else ourLightColorScheme

    val systemUiController = rememberSystemUiController()
    systemUiController.setSystemBarsColor(
        color = Color(0xFFd34747)
    )
    val techMonoFont = FontFamily(
        Font(R.font.share_tech_mono)
    )

    val codeTextStyle = TextStyle(
        fontFamily = techMonoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        color = colorSchema.secondary
    )

    val typography = Typography(
        subtitle2 = codeTextStyle
    )

    MaterialTheme(
        colors = colorSchema,
        typography = typography,
        content = content
    )
}
