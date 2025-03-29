@file:OptIn(ExperimentalMaterialApi::class)

package com.inspiredandroid.linuxcommandbibliotheca.ui.screens.basicgroups

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.inspiredandroid.linuxcommandbibliotheca.getIconResource
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.CommandView
import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.getCommandList
import databases.BasicGroup
import org.koin.androidx.compose.koinViewModel
import org.koin.core.parameter.parametersOf

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
fun BasicGroupsScreen(
    categoryId: Long,
    viewModel: BasicGroupsViewModel = koinViewModel<BasicGroupsViewModel>(
        parameters = { parametersOf(categoryId) },
    ),
    onNavigate: (String) -> Unit = {},
) {
    LazyColumn(Modifier.fillMaxSize()) {
        items(
            items = viewModel.basicGroups,
            key = { it.id },
        ) { basicGroup ->
            BasicGroupColumn(viewModel, basicGroup, onNavigate)
        }
    }
}

@Composable
private fun BasicGroupColumn(
    viewModel: BasicGroupsViewModel,
    basicGroup: BasicGroup,
    onNavigate: (String) -> Unit = {},
) {
    ListItem(
        text = { Text(basicGroup.description) },
        icon = {
            Icon(
                painterResource(basicGroup.getIconResource()),
                contentDescription = null,
                modifier = Modifier.size(40.dp),
            )
        },
        modifier = Modifier.clickable {
            viewModel.toggleCollapse(basicGroup.id)
        },
    )

    if (viewModel.isGroupCollapsed(basicGroup.id)) {
        val commands = databaseHelper.getBasicCommands(basicGroup.id)
        commands.forEach { basicCommand ->
            CommandView(
                basicCommand.command,
                basicCommand.command.getCommandList(basicCommand.mans),
                onNavigate,
            )
        }
    }
}
