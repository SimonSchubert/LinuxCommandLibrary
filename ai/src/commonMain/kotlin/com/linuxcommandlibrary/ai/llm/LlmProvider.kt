package com.linuxcommandlibrary.ai.llm

import com.linuxcommandlibrary.ai.mcp.McpTool
import kotlinx.coroutines.flow.Flow

/**
 * Platform-agnostic abstraction for a Large Language Model provider.
 *
 * Implementations:
 * - [OpenAiProvider] — OpenAI-compatible REST API (OpenAI, Groq, LocalAI, LM Studio …)
 * - [OllamaProvider] — Ollama local inference server
 */
interface LlmProvider {

    /** Human-readable display name (shown in settings UI). */
    val name: String

    /**
     * Send a list of messages and receive a complete response.
     *
     * @param messages  Conversation history including the latest user turn.
     * @param tools     Optional MCP tools the model may call.
     * @return          The assistant's response (may include tool-call requests).
     */
    suspend fun chat(messages: List<LlmMessage>, tools: List<McpTool> = emptyList()): LlmResponse

    /**
     * Stream the assistant response token by token.
     *
     * @return [Flow] of incremental text deltas; collect until the flow completes.
     */
    fun stream(messages: List<LlmMessage>, tools: List<McpTool> = emptyList()): Flow<String>
}
