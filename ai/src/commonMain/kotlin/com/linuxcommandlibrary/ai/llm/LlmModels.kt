package com.linuxcommandlibrary.ai.llm

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

// ──────────────────────────────────────────────
//  Message roles
// ──────────────────────────────────────────────

enum class LlmRole { SYSTEM, USER, ASSISTANT, TOOL }

// ──────────────────────────────────────────────
//  Conversation messages
// ──────────────────────────────────────────────

/**
 * A single turn in a conversation, with an optional tool-call result.
 */
data class LlmMessage(
    val role: LlmRole,
    val content: String,
    /** Present when this message carries a tool-call result (role == TOOL). */
    val toolCallId: String? = null,
    val toolName: String? = null,
)

// ──────────────────────────────────────────────
//  Response
// ──────────────────────────────────────────────

/**
 * Complete response from [LlmProvider.chat].
 *
 * If the model decided to call one or more tools, [toolCalls] will be non-empty and
 * [content] may be blank.  The caller should execute the tool calls, append the results
 * as [LlmRole.TOOL] messages, and re-invoke [LlmProvider.chat] in a loop until
 * [toolCalls] is empty (agentic loop).
 */
data class LlmResponse(
    val content: String,
    val toolCalls: List<LlmToolCall> = emptyList(),
    val finishReason: LlmFinishReason = LlmFinishReason.STOP,
)

/**
 * A single tool-call instruction from the model.
 */
data class LlmToolCall(
    val id: String,
    val name: String,
    val arguments: JsonObject,
)

enum class LlmFinishReason {
    STOP,
    TOOL_CALLS,
    LENGTH,
    ERROR,
}

// ──────────────────────────────────────────────
//  Provider configuration
// ──────────────────────────────────────────────

/**
 * Runtime configuration for an [LlmProvider].
 * Persisted in [PreferencesStorage] by [AiSettingsRepository].
 */
data class LlmConfig(
    val providerType: LlmProviderType,
    val apiKey: String = "",
    val baseUrl: String = "",
    val modelId: String = "",
)

enum class LlmProviderType(val displayName: String, val defaultBaseUrl: String, val defaultModel: String) {
    OPENAI("OpenAI", "https://api.openai.com/v1", "gpt-4o-mini"),
    OLLAMA("Ollama (local)", "http://localhost:11434", "llama3.2"),
    OPENAI_COMPATIBLE("OpenAI-compatible", "", ""),
}
