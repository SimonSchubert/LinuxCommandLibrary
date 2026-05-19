package com.linuxcommandlibrary.ai.chat

import com.linuxcommandlibrary.ai.llm.LlmConfig
import com.linuxcommandlibrary.ai.llm.LlmMessage
import com.linuxcommandlibrary.ai.llm.LlmRole
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

/**
 * ViewModel for the AI chat screen.
 *
 * Manages conversation history, sends user messages through [ChatRepository]
 * (which handles the agentic tool-call loop), and exposes [uiState] to the UI.
 */
@OptIn(ExperimentalUuidApi::class)
class ChatViewModel(
    private val chatRepository: ChatRepository,
    private val scope: CoroutineScope,
) {

    private val _uiState = MutableStateFlow(
        ChatUiState(isConfigured = chatRepository.isConfigured()),
    )
    val uiState: StateFlow<ChatUiState> = _uiState.asStateFlow()

    private val _history = mutableListOf<LlmMessage>()
    private var streamingJob: Job? = null

    // ──────────────────────────────────────────────
    //  Public API
    // ──────────────────────────────────────────────

    /** Send a new user message. */
    fun sendMessage(text: String) {
        if (text.isBlank()) return
        if (!chatRepository.isConfigured()) {
            _uiState.update { it.copy(errorMessage = ChatRepository.NOT_CONFIGURED_ERROR_KEY) }
            return
        }

        val userMessageId = Uuid.random().toString()
        val assistantMessageId = Uuid.random().toString()

        _uiState.update { state ->
            state.copy(
                messages = state.messages + ChatMessage(
                    id = userMessageId,
                    role = LlmRole.USER,
                    content = text,
                ),
                isWaitingForResponse = true,
                errorMessage = null,
            )
        }

        streamingJob = scope.launch(Dispatchers.Default) {
            // Add streaming placeholder
            _uiState.update { state ->
                state.copy(
                    messages = state.messages + ChatMessage(
                        id = assistantMessageId,
                        role = LlmRole.ASSISTANT,
                        content = "",
                        isStreaming = true,
                    ),
                )
            }

            chatRepository.sendMessage(_history.toList(), text)
                .onSuccess { responseText ->
                    _history.add(LlmMessage(role = LlmRole.USER, content = text))
                    _history.add(LlmMessage(role = LlmRole.ASSISTANT, content = responseText))

                    _uiState.update { state ->
                        state.copy(
                            messages = state.messages.map { msg ->
                                if (msg.id == assistantMessageId) {
                                    msg.copy(content = responseText, isStreaming = false)
                                } else {
                                    msg
                                }
                            },
                            isWaitingForResponse = false,
                        )
                    }
                }
                .onFailure { e ->
                    _uiState.update { state ->
                        state.copy(
                            messages = state.messages.map { msg ->
                                if (msg.id == assistantMessageId) {
                                    msg.copy(
                                        content = e.message ?: "",
                                        isStreaming = false,
                                        isError = true,
                                    )
                                } else {
                                    msg
                                }
                            },
                            isWaitingForResponse = false,
                            errorMessage = e.message,
                        )
                    }
                }
        }
    }

    /** Clear conversation history. */
    fun clearConversation() {
        streamingJob?.cancel()
        _history.clear()
        _uiState.update {
            ChatUiState(isConfigured = chatRepository.isConfigured())
        }
    }

    /** Update provider configuration and refresh the configured state. */
    fun saveConfig(config: LlmConfig) {
        chatRepository.saveConfig(config)
        _uiState.update { it.copy(isConfigured = chatRepository.isConfigured()) }
    }

    /** Load current configuration. */
    fun loadConfig(): LlmConfig = chatRepository.loadConfig()

    fun dismissError() {
        _uiState.update { it.copy(errorMessage = null) }
    }
}
