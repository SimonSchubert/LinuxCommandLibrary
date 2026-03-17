package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.app.platform.backIcon
import com.linuxcommandlibrary.app.ui.theme.LocalCustomColors

class SearchState(
    private val textFieldValue: androidx.compose.runtime.MutableState<TextFieldValue>,
    private val isVisibleState: androidx.compose.runtime.MutableState<Boolean>,
) {
    val searchText: String get() = textFieldValue.value.text
    val currentValue: TextFieldValue get() = textFieldValue.value
    val isVisible: Boolean get() = isVisibleState.value
    fun updateText(value: TextFieldValue) {
        textFieldValue.value = value
    }
    fun clearText() {
        textFieldValue.value = TextFieldValue("")
    }
    fun show() {
        isVisibleState.value = true
    }
    fun hide() {
        isVisibleState.value = false
    }
    fun clear() {
        textFieldValue.value = TextFieldValue(text = "", selection = TextRange(0))
        isVisibleState.value = false
    }
}

@Composable
fun rememberSearchState(): SearchState {
    val textFieldValue = rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue(text = "", selection = TextRange(0)))
    }
    val isVisible = rememberSaveable { mutableStateOf(false) }
    return remember { SearchState(textFieldValue, isVisible) }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchTopBar(
    title: String,
    searchState: SearchState,
) {
    val focusRequester = remember { FocusRequester() }
    val topBarContent = LocalCustomColors.current.topBarContent

    TopAppBar(
        expandedHeight = 56.dp,
        title = {
            if (searchState.isVisible) {
                BasicTextField(
                    value = searchState.currentValue,
                    onValueChange = { searchState.updateText(it) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .focusRequester(focusRequester),
                    textStyle = MaterialTheme.typography.titleMedium.copy(color = topBarContent),
                    cursorBrush = SolidColor(topBarContent),
                    singleLine = true,
                    decorationBox = { innerTextField ->
                        Box(contentAlignment = Alignment.CenterStart) {
                            if (searchState.searchText.isEmpty()) {
                                Text(
                                    "Search...",
                                    style = MaterialTheme.typography.titleMedium,
                                    color = topBarContent.copy(alpha = 0.7f),
                                )
                            }
                            innerTextField()
                        }
                    },
                )
            } else {
                Text(
                    title,
                    modifier = Modifier.semantics { contentDescription = "TopAppBarTitle" },
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        },
        colors = appTopBarColors(),
        navigationIcon = {
            if (searchState.isVisible) {
                IconButton(
                    modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                    onClick = { searchState.clear() },
                ) {
                    Icon(
                        imageVector = backIcon,
                        contentDescription = "Back",
                    )
                }
            }
        },
        actions = {
            if (searchState.isVisible && searchState.searchText.isNotEmpty()) {
                IconButton(
                    modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                    onClick = { searchState.clearText() },
                ) {
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = "Clear",
                    )
                }
            }
            if (!searchState.isVisible) {
                IconButton(
                    modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                    onClick = { searchState.show() },
                ) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = "Search",
                    )
                }
            }
        },
    )

    LaunchedEffect(searchState.isVisible) {
        if (searchState.isVisible) {
            focusRequester.requestFocus()
        }
    }
}
