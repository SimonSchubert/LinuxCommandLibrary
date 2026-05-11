package com.linuxcommandlibrary.ai.chat

import com.linuxcommandlibrary.ai.llm.LlmConfig
import com.linuxcommandlibrary.ai.llm.LlmMessage
import com.linuxcommandlibrary.ai.llm.LlmProvider
import com.linuxcommandlibrary.ai.llm.LlmProviderType
import com.linuxcommandlibrary.ai.llm.LlmRole
import com.linuxcommandlibrary.ai.llm.LlmToolCall
import com.linuxcommandlibrary.ai.llm.OllamaProvider
import com.linuxcommandlibrary.ai.llm.OpenAiProvider
import com.linuxcommandlibrary.ai.tools.LinuxLibraryToolRegistry
import com.linuxcommandlibrary.shared.platform.PreferencesStorage
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

/**
 * Orchestrates conversation between the user and the configured LLM provider.
 *
 * Implements an **agentic loop**: after each assistant turn, if the model requested
 * tool calls, this repository executes them via [LinuxLibraryToolRegistry], appends the
 * results as [LlmRole.TOOL] messages, and re-invokes the model — repeating until no
 * further tool calls are requested.
 */
class ChatRepository(
    private val toolRegistry: LinuxLibraryToolRegistry,
    private val preferences: PreferencesStorage,
) {
    companion object {
        private const val KEY_PROVIDER_TYPE = "ai_provider_type"
        private const val KEY_API_KEY = "ai_api_key"
        private const val KEY_BASE_URL = "ai_base_url"
        private const val KEY_MODEL_ID = "ai_model_id"
        const val NOT_CONFIGURED_ERROR_KEY = "ai_not_configured"

        /** Default system prompt injected into every conversation. */
        const val SYSTEM_PROMPT = """You are a helpful Linux assistant built into the Linux Command Library app.
You have access to tools that let you search the command database and Linux basics guide.
Always prefer using the provided tools to give accurate, up-to-date answers.
Keep responses concise and practical. Use code blocks for commands."""
    }

    // ──────────────────────────────────────────────
    //  Configuration
    // ──────────────────────────────────────────────

    fun saveConfig(config: LlmConfig) {
        preferences.putString(KEY_PROVIDER_TYPE, config.providerType.name)
        preferences.putString(KEY_API_KEY, config.apiKey)
        preferences.putString(KEY_BASE_URL, config.baseUrl)
        preferences.putString(KEY_MODEL_ID, config.modelId)
    }

    fun loadConfig(): LlmConfig {
        val typeName = preferences.getString(KEY_PROVIDER_TYPE, LlmProviderType.OPENAI.name)
        val type = LlmProviderType.entries.firstOrNull { it.name == typeName } ?: LlmProviderType.OPENAI
        return LlmConfig(
            providerType = type,
            apiKey = preferences.getString(KEY_API_KEY, ""),
            baseUrl = preferences.getString(KEY_BASE_URL, ""),
            modelId = preferences.getString(KEY_MODEL_ID, ""),
        )
    }

    fun isConfigured(): Boolean {
        val config = loadConfig()
        return when (config.providerType) {
            LlmProviderType.OLLAMA ->
                config.baseUrl.isNotBlank() || config.providerType.defaultBaseUrl.isNotBlank()

            LlmProviderType.OPENAI ->
                config.apiKey.isNotBlank()

            LlmProviderType.OPENAI_COMPATIBLE ->
                config.baseUrl.isNotBlank() && config.modelId.isNotBlank()
        }
    }

    // ──────────────────────────────────────────────
    //  Sending messages
    // ──────────────────────────────────────────────

    /**
     * Send a user message and return the assistant's complete response.
     * Executes the agentic tool-call loop internally.
     *
     * @param history Full conversation history (system prompt excluded – it is prepended here).
     * @param userMessage Latest user text.
     */
    suspend fun sendMessage(
        history: List<LlmMessage>,
        userMessage: String,
    ): Result<String> = runCatching {
        val provider = buildProvider()
        val tools = toolRegistry.allTools()

        val messages = buildList {
            add(LlmMessage(role = LlmRole.SYSTEM, content = SYSTEM_PROMPT))
            addAll(history)
            add(LlmMessage(role = LlmRole.USER, content = userMessage))
        }.toMutableList()

        // Agentic loop – execute tool calls until the model produces a final text response
        repeat(MAX_TOOL_CALL_ROUNDS) {
            val response = provider.chat(messages, tools)
            if (response.toolCalls.isEmpty()) {
                return@runCatching response.content
            }
            // Append the assistant tool-call turn, including the tool_calls payload so
            // that OpenAI-compatible APIs can match subsequent tool-result messages by ID.
            messages.add(
                LlmMessage(
                    role = LlmRole.ASSISTANT,
                    content = response.content,
                    toolCalls = response.toolCalls,
                ),
            )
            // Execute each tool and append results
            response.toolCalls.forEach { call ->
                val result = executeToolCall(call)
                messages.add(
                    LlmMessage(
                        role = LlmRole.TOOL,
                        content = result,
                        toolCallId = call.id,
                        toolName = call.name,
                    ),
                )
            }
        }
        error("Max tool call rounds ($MAX_TOOL_CALL_ROUNDS) exceeded without a final response.")
    }

    /**
     * Stream the assistant response token by token.
     * Note: streaming does not support tool calls in this implementation.
     */
    suspend fun streamMessage(
        history: List<LlmMessage>,
        userMessage: String,
    ): Flow<String> {
        val provider = runCatching { buildProvider() }.getOrNull() ?: return emptyFlow()
        val messages = buildList {
            add(LlmMessage(role = LlmRole.SYSTEM, content = SYSTEM_PROMPT))
            addAll(history)
            add(LlmMessage(role = LlmRole.USER, content = userMessage))
        }
        return provider.stream(messages, emptyList())
    }

    // ──────────────────────────────────────────────
    //  Internal helpers
    // ──────────────────────────────────────────────

    /**
     * Cached provider keyed by the config it was created from.
     * Re-used on subsequent calls so that each [sendMessage] / [streamMessage]
     * does not spin up a fresh Ktor [HttpClient] (and associated thread pool).
     * The old provider is closed whenever the config changes.
     *
     * [providerMutex] serialises the check-then-act so that concurrent coroutines
     * cannot simultaneously observe a stale cache and create duplicate providers.
     */
    private val providerMutex = Mutex()
    private var cachedProvider: Pair<LlmConfig, LlmProvider>? = null

    private suspend fun buildProvider(): LlmProvider = providerMutex.withLock {
        val config = loadConfig()
        cachedProvider?.let { (cachedConfig, provider) ->
            if (cachedConfig == config) return@withLock provider
            closeProvider(provider)
        }
        val newProvider: LlmProvider = when (config.providerType) {
            LlmProviderType.OLLAMA -> OllamaProvider(config)
            else -> OpenAiProvider(config)
        }
        cachedProvider = config to newProvider
        newProvider
    }

    private fun closeProvider(provider: LlmProvider) = provider.close()

    private suspend fun executeToolCall(call: LlmToolCall): String {
        val result = runCatching {
            toolRegistry.call(call.name, call.arguments)
        }.getOrElse { e ->
            return "Tool '${call.name}' failed: ${e.message}"
        }
        return result.content.joinToString("\n") { it.text ?: "" }
    }

    private companion object {
        const val MAX_TOOL_CALL_ROUNDS = 5
    }
}
