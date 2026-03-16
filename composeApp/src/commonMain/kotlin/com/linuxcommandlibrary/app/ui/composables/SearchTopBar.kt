package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
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

@Composable
fun SearchTopBar(
    title: String,
    searchState: SearchState,
) {
    val focusRequester = remember { FocusRequester() }

    val topBarContent = LocalCustomColors.current.topBarContent
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(LocalCustomColors.current.topBarBackground)
            .heightIn(min = 56.dp)
            .padding(horizontal = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (searchState.isVisible) {
            IconButton(
                modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                onClick = { searchState.clear() },
            ) {
                Icon(
                    imageVector = backIcon,
                    contentDescription = "Back",
                    tint = topBarContent,
                )
            }
            OutlinedTextField(
                value = searchState.currentValue,
                onValueChange = { searchState.updateText(it) },
                modifier = Modifier
                    .weight(1f)
                    .focusRequester(focusRequester)
                    .padding(start = 8.dp, end = 8.dp),
                placeholder = { Text("Search...", color = topBarContent.copy(alpha = 0.7f)) },
                textStyle = MaterialTheme.typography.titleMedium.copy(color = topBarContent),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = topBarContent,
                    unfocusedTextColor = topBarContent,
                    cursorColor = topBarContent,
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent,
                    disabledBorderColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    focusedTrailingIconColor = topBarContent,
                    unfocusedTrailingIconColor = topBarContent,
                    focusedPlaceholderColor = topBarContent.copy(alpha = 0.7f),
                    unfocusedPlaceholderColor = topBarContent.copy(alpha = 0.7f),
                ),
                maxLines = 1,
                singleLine = true,
            )
            if (searchState.searchText.isNotEmpty()) {
                IconButton(
                    modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                    onClick = { searchState.clearText() },
                ) {
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = "Clear",
                        tint = topBarContent,
                    )
                }
            }
        } else {
            Text(
                title,
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
                    .semantics { contentDescription = "TopAppBarTitle" },
                style = MaterialTheme.typography.titleLarge,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                color = topBarContent,
            )
            IconButton(
                modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                onClick = { searchState.show() },
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search",
                    tint = topBarContent,
                )
            }
        }
    }

    LaunchedEffect(searchState.isVisible) {
        if (searchState.isVisible) {
            focusRequester.requestFocus()
        }
    }
}
