package com.linuxcommandlibrary.app.ui.screens.aichat

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.linuxcommandlibrary.ai.chat.ChatMessage
import com.linuxcommandlibrary.ai.chat.ChatRepository
import com.linuxcommandlibrary.ai.chat.ChatViewModel
import com.linuxcommandlibrary.ai.llm.LlmRole
import com.linuxcommandlibrary.app.resources.Res
import com.linuxcommandlibrary.app.resources.ai_assistant
import com.linuxcommandlibrary.app.resources.ai_input_placeholder
import com.linuxcommandlibrary.app.resources.ai_not_configured
import com.linuxcommandlibrary.app.resources.ai_send
import com.linuxcommandlibrary.app.resources.ai_settings
import com.linuxcommandlibrary.app.ui.AppIcons
import com.linuxcommandlibrary.app.ui.composables.PaneTopBar
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.koinInject

/**
 * Full-screen AI chat interface.
 *
 * Features:
 * - Conversation history in a scrollable list
 * - Streaming-aware message bubbles (shows spinner while waiting)
 * - Automatic scroll-to-bottom on new messages
 * - Input field with send button
 * - Settings shortcut in the top bar
 */
@Composable
fun AiChatScreen(
    onBack: (() -> Unit)? = null,
    onOpenSettings: () -> Unit = {},
) {
    val viewModel: ChatViewModel = koinInject()
    val uiState by viewModel.uiState.collectAsState()
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    val notConfiguredStr = stringResource(Res.string.ai_not_configured)
    LaunchedEffect(uiState.errorMessage) {
        val key = uiState.errorMessage ?: return@LaunchedEffect
        val displayMsg = if (key == ChatRepository.NOT_CONFIGURED_ERROR_KEY) notConfiguredStr else key
        scope.launch {
            snackbarHostState.showSnackbar(displayMsg)
            viewModel.dismissError()
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            PaneTopBar(
                title = stringResource(Res.string.ai_assistant),
                onBack = onBack,
                actions = {
                    IconButton(
                        modifier = Modifier.pointerHoverIcon(PointerIcon.Hand),
                        onClick = onOpenSettings,
                    ) {
                        Icon(
                            imageVector = AppIcons.Info,
                            contentDescription = stringResource(Res.string.ai_settings),
                        )
                    }
                },
            )

            MessageList(
                messages = uiState.messages,
                isWaiting = uiState.isWaitingForResponse,
                modifier = Modifier.weight(1f),
            )

            ChatInputBar(
                enabled = !uiState.isWaitingForResponse,
                onSend = viewModel::sendMessage,
            )
        }

        SnackbarHost(
            hostState = snackbarHostState,
            modifier = Modifier.align(Alignment.BottomCenter),
        )
    }
}

// ──────────────────────────────────────────────
//  Message list
// ──────────────────────────────────────────────

@Composable
private fun MessageList(
    messages: List<ChatMessage>,
    isWaiting: Boolean,
    modifier: Modifier = Modifier,
) {
    val listState = rememberLazyListState()

    LaunchedEffect(messages.size, isWaiting) {
        if (messages.isNotEmpty()) {
            listState.animateScrollToItem(messages.lastIndex)
        }
    }

    LazyColumn(
        state = listState,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        item { Spacer(Modifier.height(8.dp)) }
        items(messages) { message ->
            MessageBubble(message = message)
        }
        item { Spacer(Modifier.height(8.dp)) }
    }
}

// ──────────────────────────────────────────────
//  Message bubble
// ──────────────────────────────────────────────

@Composable
private fun MessageBubble(message: ChatMessage) {
    val isUser = message.role == LlmRole.USER
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = if (isUser) Arrangement.End else Arrangement.Start,
    ) {
        Card(
            shape = RoundedCornerShape(
                topStart = 16.dp,
                topEnd = 16.dp,
                bottomStart = if (isUser) 16.dp else 4.dp,
                bottomEnd = if (isUser) 4.dp else 16.dp,
            ),
            colors = CardDefaults.cardColors(
                containerColor = if (isUser) {
                    MaterialTheme.colorScheme.primaryContainer
                } else {
                    MaterialTheme.colorScheme.surfaceContainerHigh
                },
            ),
            modifier = Modifier.widthIn(max = 320.dp),
        ) {
            Box(modifier = Modifier.padding(horizontal = 14.dp, vertical = 10.dp)) {
                if (message.isStreaming && message.content.isEmpty()) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(18.dp),
                        strokeWidth = 2.dp,
                    )
                } else {
                    Text(
                        text = message.content,
                        style = MaterialTheme.typography.bodyMedium,
                        color = if (message.isError) {
                            MaterialTheme.colorScheme.error
                        } else {
                            MaterialTheme.colorScheme.onSurface
                        },
                    )
                }
            }
        }
    }
}

// ──────────────────────────────────────────────
//  Input bar
// ──────────────────────────────────────────────

@Composable
private fun ChatInputBar(
    enabled: Boolean,
    onSend: (String) -> Unit,
) {
    var text by remember { mutableStateOf("") }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.surface)
            .padding(horizontal = 16.dp, vertical = 12.dp)
            .imePadding(),
        verticalAlignment = Alignment.Bottom,
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier.weight(1f),
            placeholder = { Text(stringResource(Res.string.ai_input_placeholder)) },
            enabled = enabled,
            maxLines = 5,
            shape = RoundedCornerShape(24.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Send),
            keyboardActions = KeyboardActions(
                onSend = {
                    if (text.isNotBlank() && enabled) {
                        onSend(text)
                        text = ""
                    }
                },
            ),
        )

        Spacer(Modifier.width(8.dp))

        IconButton(
            onClick = {
                if (text.isNotBlank() && enabled) {
                    onSend(text)
                    text = ""
                }
            },
            enabled = text.isNotBlank() && enabled,
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
                .background(
                    if (text.isNotBlank() && enabled) {
                        MaterialTheme.colorScheme.primary
                    } else {
                        MaterialTheme.colorScheme.surfaceVariant
                    },
                )
                .pointerHoverIcon(PointerIcon.Hand),
        ) {
            Icon(
                imageVector = AppIcons.Send,
                contentDescription = stringResource(Res.string.ai_send),
                tint = if (text.isNotBlank() && enabled) {
                    MaterialTheme.colorScheme.onPrimary
                } else {
                    MaterialTheme.colorScheme.onSurfaceVariant
                },
            )
        }
    }
}
