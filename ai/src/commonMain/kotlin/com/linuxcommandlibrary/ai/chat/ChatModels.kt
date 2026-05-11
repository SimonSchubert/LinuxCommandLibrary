package com.linuxcommandlibrary.ai.chat

import com.linuxcommandlibrary.ai.llm.LlmRole

/** A single message in the AI chat conversation. */
data class ChatMessage(
    val id: String,
    val role: LlmRole,
    val content: String,
    val isStreaming: Boolean = false,
    val isError: Boolean = false,
)

/** Current state of the AI chat conversation. */
data class ChatUiState(
    val messages: List<ChatMessage> = emptyList(),
    val isWaitingForResponse: Boolean = false,
    val errorMessage: String? = null,
    val isConfigured: Boolean = false,
)
