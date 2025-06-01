package com.inspiredandroid.linuxcommandbibliotheca.ui.composables

import androidx.activity.compose.LocalActivity
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavBackStackEntry
import com.inspiredandroid.linuxcommandbibliotheca.R
import com.inspiredandroid.linuxcommandbibliotheca.getCommandId
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.AppInfoDialog
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.BookmarkFeedbackDialog
import com.inspiredandroid.linuxcommandbibliotheca.ui.screens.commanddetail.CommandDetailViewModel
import com.linuxcommandlibrary.shared.databaseHelper
import com.linuxcommandlibrary.shared.getHtmlFileName
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
fun TopBar(
    navBackStackEntry: State<NavBackStackEntry?>,
    textFieldValue: MutableState<TextFieldValue>,
    onNavigateBack: () -> Unit,
    isSearchVisible: MutableState<Boolean>,
) {
    val route = navBackStackEntry.value?.destination?.route

    if (route == "commands" || route == "basics") {
        val hideSearchCallback = remember { { isSearchVisible.value = false } }
        val showSearchCallback = remember { { isSearchVisible.value = true } }
        SearchTopBar(
            title = getTitleByRoute(navBackStackEntry.value),
            textFieldValue = textFieldValue,
            isSearchVisible = isSearchVisible.value,
            hideSearch = hideSearchCallback,
            showSearch = showSearchCallback,
        )
    } else if (route?.startsWith("command?") == true) {
        DetailTopBar(
            commandId = navBackStackEntry.value?.getCommandId() ?: 0,
            title = getTitleByRoute(navBackStackEntry.value),
            onNavigateBack = onNavigateBack,
        )
    } else {
        val title = getTitleByRoute(navBackStackEntry.value)
        val showBackIcon = route != "tips" // Simplified from original when
        val showAppInfoIcon = route == "tips"
        GenericTopBar(
            title = title,
            showBackIcon = showBackIcon,
            onNavigateBack = onNavigateBack,
            showAppInfoIcon = showAppInfoIcon
        )
    }
}

@Composable
private fun GenericTopBar(
    title: String,
    showBackIcon: Boolean,
    onNavigateBack: () -> Unit,
    showAppInfoIcon: Boolean
) {
    var showDialog by remember { mutableStateOf(false) }

    TopAppBar(
        title = {
            Text(
                title,
                modifier = Modifier.semantics { contentDescription = "TopAppBarTitle" },
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        },
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = Color.White,
        navigationIcon = if (showBackIcon) {
            {
                IconButton(onClick = { onNavigateBack() }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.back),
                    )
                }
            }
        } else {
            null
        },
        actions = {
            if (showAppInfoIcon) {
                IconButton(onClick = {
                    showDialog = true
                }) {
                    Icon(
                        imageVector = Icons.Filled.Info,
                        contentDescription = stringResource(R.string.info),
                    )
                }
            }
        },
    )
    if (showDialog) {
        AppInfoDialog(onDismiss = { showDialog = false })
    }
}

@Composable
private fun DetailTopBar(
    commandId: Long,
    viewModel: CommandDetailViewModel = koinViewModel(
        key = commandId.toString(),
        viewModelStoreOwner = LocalActivity.current as ViewModelStoreOwner,
        parameters = { parametersOf(commandId) },
    ),
    title: String,
    onNavigateBack: () -> Unit,
) {
    val uiState by viewModel.state.collectAsStateWithLifecycle()
    val isAllExpanded by remember { derivedStateOf { uiState.isAllExpanded() } }

    TopAppBar(
        title = {
            Text(
                title,
                modifier = Modifier.semantics { contentDescription = "TopAppBarTitle" },
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        },
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = Color.White,
        navigationIcon = {
            IconButton(onClick = onNavigateBack) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = stringResource(R.string.back),
                )
            }
        },
        actions = {
            IconButton(onClick = {
                viewModel.onToggleAllExpanded()
            }) {
                if (isAllExpanded) {
                    Icon(
                        painterResource(R.drawable.ic_collapse_all),
                        contentDescription = stringResource(R.string.collapse_all),
                    )
                } else {
                    Icon(
                        painterResource(R.drawable.ic_expand_all),
                        contentDescription = stringResource(R.string.expand_all),
                    )
                }
            }
            IconButton(onClick = {
                if (uiState.isBookmarked) {
                    viewModel.removeBookmark()
                } else {
                    viewModel.addBookmark()
                }
            }) {
                if (uiState.isBookmarked) {
                    Icon(
                        painterResource(R.drawable.ic_bookmark_black_24dp),
                        contentDescription = stringResource(R.string.remove_bookmark),
                    )
                } else {
                    Icon(
                        painterResource(R.drawable.ic_bookmark_border_black_24dp),
                        contentDescription = stringResource(R.string.add_bookmark),
                    )
                }
            }
        },
    )

    if (uiState.showBookmarkDialog) {
        BookmarkFeedbackDialog(onDismiss = { viewModel.hideBookmarkDialog() })
    }
}

@Composable
private fun SearchTopBar(
    title: String,
    textFieldValue: MutableState<TextFieldValue>,
    isSearchVisible: Boolean,
    hideSearch: () -> Unit,
    showSearch: () -> Unit,
) {
    val focusRequester = remember { FocusRequester() }

    TopAppBar(
        title = {
            Text(
                title,
                modifier = Modifier.semantics { contentDescription = "TopAppBarTitle" },
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        },
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = Color.White,
        navigationIcon = if (isSearchVisible) {
            {
                IconButton(onClick = {
                    textFieldValue.value = TextFieldValue("")
                    hideSearch()
                }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = stringResource(id = R.string.back),
                    )
                }
            }
        } else {
            null
        },
        actions = {
            if (isSearchVisible) {
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 2.dp)
                        .focusRequester(focusRequester)
                        .semantics { contentDescription = "SearchField" },
                    value = textFieldValue.value,
                    onValueChange = { tfv ->
                        textFieldValue.value = tfv
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        backgroundColor = Color.Transparent,
                        cursorColor = LocalContentColor.current.copy(alpha = LocalContentAlpha.current),
                        trailingIconColor = Color.White,
                    ),
                    trailingIcon = {
                        IconButton(onClick = {
                            textFieldValue.value = TextFieldValue("")
                            hideSearch()
                        }) {
                            Icon(
                                imageVector = Icons.Filled.Close,
                                contentDescription = stringResource(id = R.string.reset),
                            )
                        }
                    },
                    maxLines = 1,
                    singleLine = true,
                )
            } else {
                IconButton(onClick = {
                    showSearch()
                }) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = stringResource(R.string.search),
                    )
                }
            }
        },
    )
    LaunchedEffect(isSearchVisible) {
        if (isSearchVisible) {
            focusRequester.requestFocus()
        }
    }
}

@Composable
private fun getTitleByRoute(backStackEntry: NavBackStackEntry?): String {
    if (backStackEntry == null) {
        return "Linux"
    }
    return when (val route = backStackEntry.destination.route) {
        "commands" -> stringResource(R.string.commands)
        "basics" -> stringResource(R.string.basics)
        "tips" -> stringResource(R.string.tips)
        else -> {
            if (route?.startsWith("command?") == true) {
                backStackEntry.arguments?.getString("commandName") ?: ""
            } else if (route?.startsWith("basicgroups?") == true) {
                val deeplinkName = backStackEntry.arguments?.getString("categoryName") ?: ""
                // Remember the category title calculation based on deeplinkName
                // Assuming databaseHelper.getBasics() result is stable or changes infrequently.
                // If getBasics() is very cheap, remember might be overkill.
                // If getBasics() is expensive, this helps.
                // A more robust solution might involve moving data loading to ViewModel
                // and passing only necessary data to Composables.
                remember(deeplinkName) {
                    val categories = databaseHelper.getBasics() // This could return ImmutableList
                    val category = categories.firstOrNull { it.getHtmlFileName() == deeplinkName }
                    category?.title ?: "Not found"
                }
            } else {
                ""
            }
        }
    }
}
