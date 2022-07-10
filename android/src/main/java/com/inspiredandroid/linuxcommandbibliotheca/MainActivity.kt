package com.inspiredandroid.linuxcommandbibliotheca

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink
import com.inspiredandroid.linuxcommandbibliotheca.ui.bars.BottomBar
import com.inspiredandroid.linuxcommandbibliotheca.ui.bars.TopBar
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.BasicGroupsScreen
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.basiccategories.BasicCategoriesScreen
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commanddetail.CommandDetailScreen
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commandlist.CommandListScreen
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.tips.TipsScreen
import com.inspiredandroid.linuxcommandbibliotheca.ui.theme.LinuxTheme
import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.getHtmlFileName
import com.linuxcommandlibrary.shared.hasDatabase
import com.linuxcommandlibrary.shared.initDatabase

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

const val deepLinkUri = "https://linuxcommandlibrary.com"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (!hasDatabase(this)) {
            startActivity(Intent(this, InitializeDatabaseActivity::class.java))
            finish()
            return
        }

        initDatabase(this)

        setContent {
            LinuxApp()
        }
    }
}

@Composable
fun LinuxApp() {
    val navController = rememberNavController()
    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry.value?.destination
    val bookmarkManager = BookmarkManager()
    val searchTextValue = remember {
        mutableStateOf(
            TextFieldValue(text = "", selection = TextRange(0))
        )
    }
    val onNavigate: (String) -> Unit = {
        navController.navigate(it)
    }

    LinuxTheme {
        Scaffold(
            topBar = {
                TopBar(navBackStackEntry,
                    searchTextValue,
                    onNavigateBack = {
                        navController.popBackStack()
                    })
            },
            bottomBar = {
                BottomBar(currentDestination, navController)
            }) { innerPadding ->
            NavHost(
                navController,
                startDestination = Screen.Basics.route,
                Modifier.padding(innerPadding)
            ) {

                composable(
                    Screen.Basics.route,
                    deepLinks = listOf(
                        navDeepLink { uriPattern = "$deepLinkUri/basics" },
                        navDeepLink { uriPattern = "$deepLinkUri/basics.html" })
                ) {
                    BasicCategoriesScreen(onNavigate)
                }
                composable(
                    Screen.Commands.route,
                    deepLinks = listOf(
                        navDeepLink { uriPattern = "$deepLinkUri/" },
                        navDeepLink { uriPattern = "$deepLinkUri/index.html" })
                ) {
                    val bookmarkedIds = bookmarkManager.getBookmarkIds(LocalContext.current)
                    CommandListScreen(
                        databaseHelper.getCommands(),
                        searchTextValue.value.text,
                        bookmarkedIds,
                        onNavigate
                    )
                }
                composable(
                    Screen.Tips.route,
                    deepLinks = listOf(
                        navDeepLink { uriPattern = "$deepLinkUri/tips" },
                        navDeepLink { uriPattern = "$deepLinkUri/tips.html" })
                ) {
                    TipsScreen(onNavigate)
                }
                composable(
                    "basicgroups?categoryId={categoryId}&categoryName={categoryName}",
                    arguments = listOf(navArgument("categoryId") {}, navArgument("categoryName") {})
                ) { backStackEntry ->
                    val categoryId =
                        backStackEntry.arguments?.getString("categoryId")?.toLongOrNull() ?: 0L
                    BasicGroupsScreen(onNavigate, categoryId)
                }
                composable(
                    "command?commandId={commandId}&commandName={commandName}",
                    arguments = listOf(navArgument("commandId") {}, navArgument("commandName") {})
                ) { backStackEntry ->
                    val commandId =
                        backStackEntry.arguments?.getString("commandId")?.toLongOrNull() ?: 0L
                    CommandDetailScreen(onNavigate, commandId)
                }
                // Only used for deeplinks with slightly different parameters
                composable(
                    "basicgroups?categoryName={deepLinkCategoryName}",
                    arguments = listOf(navArgument("deepLinkCategoryName") {}),
                    deepLinks = listOf(
                        navDeepLink {
                            uriPattern = "$deepLinkUri/basic/{deepLinkCategoryName}.html"
                        },
                        navDeepLink { uriPattern = "$deepLinkUri/basic/{deepLinkCategoryName}" })
                ) { backStackEntry ->
                    val categoryName =
                        backStackEntry.arguments?.getString("deepLinkCategoryName") ?: ""
                    val categories = databaseHelper.getBasics()
                    val category = categories.firstOrNull { it.getHtmlFileName() == categoryName }
                    if (category != null) {
                        BasicGroupsScreen(onNavigate, category.id)
                    } else {
                        BasicCategoriesScreen(onNavigate)
                    }
                }
                // Only used for deeplinks with slightly different parameters
                composable(
                    "command?commandName={commandName}",
                    arguments = listOf(navArgument("commandName") {}),
                    deepLinks = listOf(
                        navDeepLink { uriPattern = "$deepLinkUri/man/{commandName}.html" },
                        navDeepLink { uriPattern = "$deepLinkUri/man/{commandName}" })
                ) { backStackEntry ->
                    val commandName = backStackEntry.arguments?.getString("commandName") ?: ""

                    val command = databaseHelper.getCommand(commandName)
                    if (command != null) {
                        CommandDetailScreen(onNavigate, command.id)
                    } else {
                        val bookmarkedIds = bookmarkManager.getBookmarkIds(LocalContext.current)
                        CommandListScreen(
                            databaseHelper.getCommands(),
                            searchTextValue.value.text,
                            bookmarkedIds,
                            onNavigate
                        )
                    }
                }
            }
        }
    }
}

sealed class Screen(
    val route: String,
    @StringRes val resourceId: Int,
    @DrawableRes val drawableRes: Int
) {
    object Commands : Screen("commands", R.string.commands, R.drawable.ic_search_40dp)
    object Basics : Screen("basics", R.string.basics, R.drawable.ic_puzzle)
    object Tips : Screen("tips", R.string.tips, R.drawable.ic_idea)
}