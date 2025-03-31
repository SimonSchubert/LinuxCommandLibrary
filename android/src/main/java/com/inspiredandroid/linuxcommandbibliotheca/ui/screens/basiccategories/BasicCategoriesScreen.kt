@file:OptIn(ExperimentalMaterialApi::class)

package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.basiccategories

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.inspiredandroid.linuxcommandbibliotheca.getIconResource
import com.linuxcommandlibrary.shared.getHtmlFileName
import org.koin.androidx.compose.koinViewModel

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
fun BasicCategoriesScreen(
    viewModel: BasicCategoriesViewModel = koinViewModel(),
    onNavigate: (String) -> Unit,
) {
    LazyVerticalGrid(
        modifier = Modifier.fillMaxSize(),
        columns = GridCells.Adaptive(minSize = 300.dp),
    ) {
        items(
            items = viewModel.basicCategories,
            key = { it.id },
        ) { basicCategory ->
            ListItem(
                text = { Text(basicCategory.title) },
                icon = {
                    Icon(
                        painterResource(basicCategory.getIconResource()),
                        contentDescription = null,
                        modifier = Modifier.size(40.dp),
                    )
                },
                modifier = Modifier.clickable {
                    onNavigate(
                        "basicgroups?categoryId=${basicCategory.id}&categoryName=${basicCategory.getHtmlFileName()}",
                    )
                },
            )
        }
    }
}
