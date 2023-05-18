@file:OptIn(ExperimentalMaterialApi::class)

package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.tips

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.CommandView
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.NestedCommandView
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.NestedText
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.SectionTitle
import org.koin.androidx.compose.getViewModel

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

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TipsScreen(onNavigate: (String) -> Unit = {}, viewModel: TipsViewModel = getViewModel()) {

    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Adaptive(minSize = 300.dp),
    ) {

        items(count = viewModel.tips.size,
            key = { viewModel.tips[it].tip.id }
        ) {
            val tip = viewModel.tips[it]

            Card(
                elevation = 4.dp, modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(8.dp)) {

                    SectionTitle(title = tip.tip.title)

                    tip.sections.forEach { element ->
                        when (element) {
                            is TipSectionElement.Text -> {
                                Text(element.text)
                            }

                            is TipSectionElement.Code -> {
                                CommandView(
                                    command = element.command,
                                    elements = element.elements,
                                    onNavigate = onNavigate
                                )
                            }

                            is TipSectionElement.NestedCode -> {
                                NestedCommandView(
                                    text = element.text,
                                    command = element.command,
                                    commandElements = element.elements,
                                    onNavigate = onNavigate
                                )
                            }

                            is TipSectionElement.NestedText -> {
                                NestedText(
                                    textLeft = element.text,
                                    textRight = element.info
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

