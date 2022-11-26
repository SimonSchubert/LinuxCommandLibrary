@file:OptIn(ExperimentalMaterialApi::class)

package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.tips

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.CommandView
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.NestedCommandView
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.NestedText
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.SectionTitle
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.StaggeredVerticalGrid

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
        modifier = Modifier
            .padding(4.dp)
            .verticalScroll(rememberScrollState())
            .semantics { contentDescription = "Scroll" }
    ) {
        viewModel.mergedTips.forEach { mergedTip ->
            Card(
                elevation = 4.dp, modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(8.dp)) {

                    SectionTitle(title = mergedTip.tip.title)

                    mergedTip.sections.forEach { sectionElement ->
                        when (sectionElement) {
                            is TipSectionTextElement -> {
                                Text(sectionElement.text)
                            }

                            is TipSectionCodeElement -> {
                                CommandView(
                                    command = sectionElement.command,
                                    elements = sectionElement.elements,
                                    onNavigate = onNavigate
                                )
                            }

                            is TipSectionNestedCodeElement -> {
                                NestedCommandView(
                                    text = sectionElement.text,
                                    command = sectionElement.command,
                                    commandElements = sectionElement.elements,
                                    onNavigate = onNavigate
                                )
                            }

                            is TipSectionNestedTextElement -> {
                                NestedText(
                                    textLeft = sectionElement.text,
                                    textRight = sectionElement.info
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

