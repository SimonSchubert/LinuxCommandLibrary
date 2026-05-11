package com.linuxcommandlibrary.ai.llm

import com.linuxcommandlibrary.ai.jsonrpc.JsonRpcJson
import com.linuxcommandlibrary.ai.mcp.McpTool
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.post
import io.ktor.client.request.preparePost
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsChannel
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import io.ktor.utils.io.readUTF8Line
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * LLM provider implementation for Ollama local inference server.
 *
 * Default endpoint: http://localhost:11434
 * Docs: https://github.com/ollama/ollama/blob/main/docs/api.md
 */
class OllamaProvider(
    private val config: LlmConfig,
    httpClient: HttpClient? = null,
) : LlmProvider {

    override val name: String get() = config.providerType.displayName

    private val baseUrl: String = config.baseUrl.ifBlank { LlmProviderType.OLLAMA.defaultBaseUrl }
    private val modelId: String = config.modelId.ifBlank { LlmProviderType.OLLAMA.defaultModel }

    private val client: HttpClient = httpClient ?: HttpClient {
        install(ContentNegotiation) { json(JsonRpcJson) }
    }

    override suspend fun chat(messages: List<LlmMessage>, tools: List<McpTool>): LlmResponse {
        val request = OllamaChatRequest(
            model = modelId,
            messages = messages.toOllama(),
            stream = false,
        )
        val response: OllamaChatResponse = client.post("$baseUrl/api/chat") {
            contentType(ContentType.Application.Json)
            setBody(request)
        }.body()

        return LlmResponse(
            content = response.message.content,
            finishReason = if (response.done) LlmFinishReason.STOP else LlmFinishReason.LENGTH,
        )
    }

    override fun stream(messages: List<LlmMessage>, tools: List<McpTool>): Flow<String> = flow {
        val request = OllamaChatRequest(
            model = modelId,
            messages = messages.toOllama(),
            stream = true,
        )
        client.preparePost("$baseUrl/api/chat") {
            contentType(ContentType.Application.Json)
            setBody(request)
        }.execute { response ->
            val channel = response.bodyAsChannel()
            while (!channel.isClosedForRead) {
                val line = channel.readUTF8Line() ?: break
                val chunk = runCatching {
                    JsonRpcJson.decodeFromString<OllamaChatResponse>(line)
                }.getOrNull() ?: continue
                if (chunk.message.content.isNotEmpty()) {
                    emit(chunk.message.content)
                }
                if (chunk.done) break
            }
        }
    }

    private fun List<LlmMessage>.toOllama() = map { msg ->
        OllamaMessage(
            role = when (msg.role) {
                LlmRole.SYSTEM -> "system"
                LlmRole.USER -> "user"
                LlmRole.ASSISTANT -> "assistant"
                LlmRole.TOOL -> "tool"
            },
            content = msg.content,
        )
    }

    fun close() = client.close()
}

// ──────────────────────────────────────────────
//  Ollama REST API DTOs
// ──────────────────────────────────────────────

@Serializable
private data class OllamaChatRequest(
    val model: String,
    val messages: List<OllamaMessage>,
    val stream: Boolean = false,
)

@Serializable
private data class OllamaMessage(
    val role: String,
    val content: String,
)

@Serializable
private data class OllamaChatResponse(
    val model: String = "",
    val message: OllamaMessage,
    val done: Boolean = false,
)
