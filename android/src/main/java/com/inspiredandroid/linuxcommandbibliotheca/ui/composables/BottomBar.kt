package com.inspiredandroid.linuxcommandbibliotheca.ui.composables

import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.inspiredandroid.linuxcommandbibliotheca.Screen

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
fun BottomBar(navController: NavHostController) {
    val items = listOf(
        Screen.Basics,
        Screen.Tips,
        Screen.Commands
    )
    // TODO: read current route from navcontroller
    val selectedRoute = rememberSaveable{ mutableStateOf(Screen.Basics.route) }

    BottomNavigation(backgroundColor = MaterialTheme.colors.surface) {
        items.forEach { screen ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        painterResource(id = screen.drawableRes),
                        null,
                        modifier = Modifier.size(24.dp)
                    )
                },
                label = { Text(stringResource(screen.resourceId)) },
                selected = screen.route == selectedRoute.value,
                selectedContentColor = Color(0xFFe45151),
                unselectedContentColor = MaterialTheme.colors.onSurface,
                onClick = {
                    navController.navigate(screen.route) {
                        selectedRoute.value = screen.route
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

