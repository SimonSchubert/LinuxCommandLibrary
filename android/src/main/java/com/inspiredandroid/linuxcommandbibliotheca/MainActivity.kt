package com.inspiredandroid.linuxcommandbibliotheca

import android.content.Intent
import android.os.Bundle
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.BottomBar
import com.inspiredandroid.linuxcommandbibliotheca.ui.composables.TopBar
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.basiccategories.BasicCategoriesScreen
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.basicgroups.BasicGroupsScreen
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commanddetail.CommandDetailScreen
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commandlist.CommandListScreen
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.search.SearchScreen
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.tips.TipsScreen
import com.inspiredandroid.linuxcommandbibliotheca.ui.theme.LinuxTheme
import com.inspiredandroid.linuxcommandbibliotheca.ui.theme.LocalCustomColors
import com.linuxcommandlibrary.shared.hasDatabase
import com.linuxcommandlibrary.shared.initDatabase
import org.koin.android.ext.android.inject

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

class MainActivity : AppCompatActivity() {

    private val preferenceManager by inject<PreferenceUtil>()

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge(statusBarStyle = SystemBarStyle.dark(android.graphics.Color.TRANSPARENT))
        super.onCreate(savedInstanceState)

        if (!hasDatabase(this) || !preferenceManager.isDatabaseUpToDate()) {
            startActivity(Intent(this, InitializeDatabaseActivity::class.java))
            preferenceManager.updateDatabaseVersion()
            finish()
            return
        }

        initDatabase(this)

        setContent {
            LinuxTheme {
                Box(
                    Modifier
                        .background(MaterialTheme.colors.primary)
                        .statusBarsPadding(),
                ) {
                    Box(
                        Modifier
                            .background(LocalCustomColors.current.navBarBackground)
                            .systemBarsPadding(),
                    ) {
                        LinuxApp()
                    }
                }
            }
        }
    }
}

const val DEEPLINK_URI = "https://linuxcommandlibrary.com"

@Composable
fun LinuxApp() {
    val navController = rememberNavController()
    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val searchTextValue = remember {
        mutableStateOf(
            TextFieldValue(text = "", selection = TextRange(0)),
        )
    }
    val showSearch = remember { mutableStateOf(false) }
    val onNavigate: (String) -> Unit = {
        navController.navigate(it)
    }

    Scaffold(
        topBar = {
            TopBar(
                navBackStackEntry = navBackStackEntry,
                textFieldValue = searchTextValue,
                onNavigateBack = {
                    navController.popBackStack()
                },
                showSearch = showSearch,
            )
        },
        bottomBar = {
            BottomBar(
                navController = navController,
                resetSearch = {
                    searchTextValue.value = TextFieldValue(text = "", selection = TextRange(0))
                    showSearch.value = false
                },
            )
        },
    ) { innerPadding ->
        Box(
            modifier = Modifier.padding(innerPadding),
        ) {
            NavHost(
                navController = navController,
                startDestination = Screen.Basics.route,
            ) {
                composable(
                    Screen.Basics.route,
                    deepLinks = listOf(
                        navDeepLink { uriPattern = "$DEEPLINK_URI/basics" },
                        navDeepLink { uriPattern = "$DEEPLINK_URI/basics.html" },
                    ),
                ) {
                    BasicCategoriesScreen(
                        onNavigate = onNavigate,
                    )
                }
                composable(
                    Screen.Commands.route,
                    deepLinks = listOf(
                        navDeepLink { uriPattern = "$DEEPLINK_URI/" },
                        navDeepLink { uriPattern = "$DEEPLINK_URI/index.html" },
                    ),
                ) {
                    CommandListScreen(
                        onNavigate = onNavigate,
                    )
                }
                composable(
                    Screen.Tips.route,
                    deepLinks = listOf(
                        navDeepLink { uriPattern = "$DEEPLINK_URI/tips" },
                        navDeepLink { uriPattern = "$DEEPLINK_URI/tips.html" },
                    ),
                ) {
                    TipsScreen(onNavigate)
                }
                composable(
                    "basicgroups?categoryId={categoryId}&categoryName={categoryName}",
                    arguments = listOf(
                        navArgument("categoryId") { defaultValue = "" },
                        navArgument("categoryName") {},
                    ),
                    deepLinks = listOf(
                        navDeepLink {
                            uriPattern = "$DEEPLINK_URI/basic/{categoryName}.html"
                        },
                        navDeepLink { uriPattern = "$DEEPLINK_URI/basic/{categoryName}" },
                    ),
                ) { backStackEntry ->
                    val categoryId = backStackEntry.getCategoryId()
                    if (categoryId != null) {
                        BasicGroupsScreen(
                            categoryId = categoryId,
                            onNavigate = onNavigate,
                        )
                    } else {
                        // open tips screen on invalid deeplink parameters
                        TipsScreen(onNavigate)
                    }
                }
                composable(
                    "command?commandId={commandId}&commandName={commandName}",
                    arguments = listOf(
                        navArgument("commandId") { defaultValue = "" },
                        navArgument("commandName") {},
                    ),
                    deepLinks = listOf(
                        navDeepLink { uriPattern = "$DEEPLINK_URI/man/{commandName}.html" },
                        navDeepLink { uriPattern = "$DEEPLINK_URI/man/{commandName}" },
                    ),
                ) { backStackEntry ->
                    val commandId = backStackEntry.getCommandId()
                    if (commandId != null) {
                        CommandDetailScreen(
                            commandId = commandId,
                            onNavigate = onNavigate,
                        )
                    } else {
                        // open tips screen on invalid deeplink parameters
                        TipsScreen(onNavigate)
                    }
                }
            }

            val isSearchVisible = remember(
                searchTextValue.value.text,
                navBackStackEntry.value?.destination?.route,
            ) {
                searchTextValue.value.text.isNotEmpty() &&
                    navBackStackEntry.value?.destination?.route?.startsWith("command?") == false
            }
            AnimatedVisibility(
                visible = isSearchVisible,
                enter = fadeIn(animationSpec = tween(300)),
                exit = fadeOut(animationSpec = tween(durationMillis = 300, delayMillis = 300)), // work around for navigation overlaps
            ) {
                SearchScreen(
                    searchText = searchTextValue.value.text,
                    onNavigate = {
                        navController.navigate(it)
                    },
                )
            }
        }
    }
}

sealed class Screen(
    val route: String,
    @StringRes val resourceId: Int,
    @DrawableRes val drawableRes: Int,
) {
    data object Commands : Screen("commands", R.string.commands, R.drawable.ic_search_40dp)
    data object Basics : Screen("basics", R.string.basics, R.drawable.ic_puzzle)
    data object Tips : Screen("tips", R.string.tips, R.drawable.ic_idea)
}
