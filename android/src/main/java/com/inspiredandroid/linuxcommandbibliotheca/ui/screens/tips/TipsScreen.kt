@file:OptIn(ExperimentalMaterialApi::class)

package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.tips

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.inspiredandroid.linuxcommandbibliotheca.ui.shared.Code
import com.inspiredandroid.linuxcommandbibliotheca.ui.shared.StaggeredVerticalGrid
import databases.Tip
import databases.TipSection

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

data class MergedTip(val tip: Tip, val sections: List<TipSection>)

@Composable
fun TipsScreen(onNavigate: (String) -> Unit = {}, viewModel: TipsViewModel = viewModel()) {
    StaggeredVerticalGrid(
        maxColumnWidth = 420.dp,
        modifier = Modifier.padding(4.dp).verticalScroll(rememberScrollState())
    ) {
        viewModel.mergedTips.forEach { mergedTip ->
            Card(elevation = 4.dp, modifier = Modifier.padding(4.dp)) {
                Column(modifier = Modifier.padding(6.dp)) {
                    Text(
                        mergedTip.tip.title,
                        fontSize = 18.sp,
                        style = MaterialTheme.typography.subtitle1,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    mergedTip.sections.forEach { section ->
                        when (section.type) {
                            0L -> {
                                // Remove html specific characters
                                val text = section.data1.replace("\\n", "").replace("<b>", "").replace("</b>", "")
                                    .replace("\\'", "")
                                Text(text)
                            }
                            1L -> Code(section.data1, section.extra, onNavigate)
                            3L -> {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Text(
                                        section.data1,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.width(40.dp),
                                        textAlign = TextAlign.Center
                                    )
                                    if (section.data2.startsWith("$")) {
                                        Code(section.data2, section.extra, onNavigate)
                                    } else {
                                        Text(section.data2, modifier = Modifier.padding(8.dp))
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
