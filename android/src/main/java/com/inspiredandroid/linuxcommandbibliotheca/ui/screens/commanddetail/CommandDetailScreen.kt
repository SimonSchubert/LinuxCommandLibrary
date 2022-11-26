@file:OptIn(ExperimentalMaterialApi::class)

package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commanddetail

import android.widget.TextView
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.text.HtmlCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.CommandView
import com.linuxcommandlibrary.shared.TextCommandElement
import databases.CommandSection

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
fun CommandDetailScreen(
    onNavigate: (String) -> Unit = {},
    commandId: Long,
    viewModel: CommandDetailModel = viewModel(factory = CommandDetailModelFactory(commandId))
) {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        viewModel.sections.forEach { section ->
            CommandSectionColumn(section, onNavigate)
        }
    }
}

@Composable
fun CommandSectionColumn(
    section: CommandSection,
    onNavigate: (String) -> Unit = {}
) {
    var collapsed by remember { mutableStateOf(false) }
    ListItem(text = {
        Text(
            section.title.uppercase(),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    },
        modifier = Modifier.clickable {
            collapsed = !collapsed
        })
    if (collapsed) {
        if (section.title == "TLDR") {
            Column(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            ) {

                val tldrParts = section.content.split("<b>")
                tldrParts.forEachIndexed { index, s ->
                    val split = s.split("</b><br>")
                    if (split.size > 1) {
                        Text(
                            text = split[0],
                            fontSize = 16.sp,
                            style = MaterialTheme.typography.subtitle1,
                            fontWeight = FontWeight.Bold
                        )

                        val command = "$ " + split[1].replace("<br>", "").replace("`", "")
                        CommandView(command, listOf(TextCommandElement(command)), onNavigate)
                    }
                    if (index != tldrParts.lastIndex) {
                        Spacer(Modifier.height(8.dp))
                    }
                }
            }
        } else {
            val color = MaterialTheme.colors.onSurface
            ListItem(text = {
                AndroidView(factory = { context ->
                    TextView(context).apply {
                        val content =
                            HtmlCompat.fromHtml(section.content, HtmlCompat.FROM_HTML_MODE_LEGACY)
                        text = content.dropLastWhile { it.isWhitespace() }
                        setTextColor(color.toArgb())
                    }
                })
            })
        }
    }
}
