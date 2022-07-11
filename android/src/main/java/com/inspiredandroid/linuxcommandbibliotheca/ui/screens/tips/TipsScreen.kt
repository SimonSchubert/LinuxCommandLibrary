@file:OptIn(ExperimentalMaterialApi::class)

package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.tips

import androidx.compose.foundation.layout.*
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
fun TipsScreen(onNavigate: (String) -> Unit = {}, viewModel: TipsViewModel = viewModel()) {
    StaggeredVerticalGrid(
        maxColumnWidth = 420.dp,
        modifier = Modifier.padding(4.dp).verticalScroll(rememberScrollState())
    ) {
        viewModel.mergedTips.forEach { mergedTip ->
            Card(elevation = 4.dp, modifier = Modifier.padding(4.dp).fillMaxWidth()) {
                Column(modifier = Modifier.padding(6.dp)) {
                    Text(
                        mergedTip.tip.title,
                        fontSize = 18.sp,
                        style = MaterialTheme.typography.subtitle1,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    mergedTip.sections.forEach { sectionElement ->
                        when (sectionElement) {
                            is TipSectionTextElement -> {
                                Text(sectionElement.text)
                            }
                            is TipSectionCodeElement -> {
                                Code(sectionElement.command, sectionElement.elements, onNavigate)
                            }
                            is TipSectionNestedCodeElement -> {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Text(
                                        sectionElement.text,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.width(40.dp),
                                        textAlign = TextAlign.Center
                                    )
                                    Code(
                                        sectionElement.command,
                                        sectionElement.elements,
                                        onNavigate
                                    )
                                }
                            }
                            is TipSectionNestedTextElement -> {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Text(
                                        sectionElement.text,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.width(40.dp),
                                        textAlign = TextAlign.Center
                                    )
                                    Text(sectionElement.info, modifier = Modifier.padding(8.dp))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
