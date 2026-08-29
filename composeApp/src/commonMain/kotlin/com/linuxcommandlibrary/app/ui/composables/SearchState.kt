package com.linuxcommandlibrary.app.ui.composables

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue

class SearchState(
    private val textFieldValue: MutableState<TextFieldValue>,
    private val isVisibleState: MutableState<Boolean>,
    private val focusEpochState: MutableState<Int>,
) {
    val searchText: String get() = textFieldValue.value.text
    val currentValue: TextFieldValue get() = textFieldValue.value
    val isVisible: Boolean get() = isVisibleState.value
    val focusEpoch: Int get() = focusEpochState.value
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
    fun requestFocus() {
        focusEpochState.value += 1
    }
}

@Composable
fun rememberSearchState(initialText: String = ""): SearchState {
    val textFieldValue = rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue(text = initialText, selection = TextRange(initialText.length)))
    }
    val isVisible = rememberSaveable { mutableStateOf(initialText.isNotEmpty()) }
    // Transient request signal, not state — `remember` only. After process death the user
    // returns to a focused-but-not-keyboard-raised search field, which is fine.
    val focusEpoch = remember { mutableIntStateOf(0) }
    return remember { SearchState(textFieldValue, isVisible, focusEpoch) }
}
