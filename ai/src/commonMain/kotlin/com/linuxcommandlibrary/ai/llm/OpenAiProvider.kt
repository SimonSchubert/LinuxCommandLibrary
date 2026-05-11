package com.linuxcommandlibrary.ai.llm

import com.linuxcommandlibrary.ai.jsonrpc.JsonRpcJson
import com.linuxcommandlibrary.ai.mcp.McpTool
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.header
import io.ktor.client.request.post
import io.ktor.client.request.preparePost
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsChannel
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import io.ktor.utils.io.readUTF8Line
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

/**
 * LLM provider implementation for the OpenAI Chat Completions API.
 *
 * Compatible with:
 * - OpenAI (https://api.openai.com/v1)
 * - Groq (https://api.groq.com/openai/v1)
 * - LM Studio / LocalAI (http://localhost:1234/v1)
 * - Any other OpenAI-compatible endpoint
 */
class OpenAiProvider(
    private val config: LlmConfig,
    httpClient: HttpClient? = null,
) : LlmProvider {

    override val name: String get() = config.providerType.displayName

    private val baseUrl: String = config.baseUrl.ifBlank { config.providerType.defaultBaseUrl }
    private val modelId: String = config.modelId.ifBlank { config.providerType.defaultModel }

    private val client: HttpClient = httpClient ?: HttpClient {
        install(ContentNegotiation) { json(JsonRpcJson) }
        defaultRequest {
            header(HttpHeaders.Authorization, "Bearer ${config.apiKey}")
        }
    }

    override suspend fun chat(messages: List<LlmMessage>, tools: List<McpTool>): LlmResponse {
        val request = buildChatRequest(messages, tools, stream = false)
        val response: OpenAiChatResponse = client.post("$baseUrl/chat/completions") {
            contentType(ContentType.Application.Json)
            setBody(request)
        }.body()

        val choice = response.choices.firstOrNull()
            ?: return LlmResponse(content = "", finishReason = LlmFinishReason.ERROR)

        val toolCalls = choice.message.toolCalls?.map { tc ->
            LlmToolCall(
                id = tc.id,
                name = tc.function.name,
                arguments = JsonRpcJson.decodeFromString<JsonObject>(tc.function.arguments),
            )
        } ?: emptyList()

        val finishReason = when (choice.finishReason) {
            "tool_calls" -> LlmFinishReason.TOOL_CALLS
            "length" -> LlmFinishReason.LENGTH
            else -> LlmFinishReason.STOP
        }

        return LlmResponse(
            content = choice.message.content ?: "",
            toolCalls = toolCalls,
            finishReason = finishReason,
        )
    }

    override fun stream(messages: List<LlmMessage>, tools: List<McpTool>): Flow<String> = flow {
        val request = buildChatRequest(messages, tools, stream = true)
        client.preparePost("$baseUrl/chat/completions") {
            contentType(ContentType.Application.Json)
            setBody(request)
        }.execute { response ->
            val channel = response.bodyAsChannel()
            while (!channel.isClosedForRead) {
                val line = channel.readUTF8Line() ?: break
                if (!line.startsWith("data: ")) continue
                val data = line.removePrefix("data: ").trim()
                if (data == "[DONE]") break
                val chunk = runCatching {
                    JsonRpcJson.decodeFromString<OpenAiStreamChunk>(data)
                }.getOrNull() ?: continue
                val delta = chunk.choices.firstOrNull()?.delta?.content ?: continue
                emit(delta)
            }
        }
    }

    private fun buildChatRequest(
        messages: List<LlmMessage>,
        tools: List<McpTool>,
        stream: Boolean,
    ) = OpenAiChatRequest(
        model = modelId,
        messages = messages.map { msg ->
            OpenAiMessage(
                role = msg.role.name.lowercase(),
                content = msg.content,
                toolCallId = msg.toolCallId,
                name = msg.toolName,
            )
        },
        tools = tools.takeIf { it.isNotEmpty() }?.map { tool ->
            OpenAiTool(
                function = OpenAiFunction(
                    name = tool.name,
                    description = tool.description,
                    parameters = tool.inputSchema,
                ),
            )
        },
        stream = stream,
    )

    fun close() = client.close()
}

// ──────────────────────────────────────────────
//  OpenAI REST API DTOs
// ──────────────────────────────────────────────

@Serializable
private data class OpenAiChatRequest(
    val model: String,
    val messages: List<OpenAiMessage>,
    val tools: List<OpenAiTool>? = null,
    val stream: Boolean = false,
)

@Serializable
private data class OpenAiMessage(
    val role: String,
    val content: String? = null,
    @SerialName("tool_call_id") val toolCallId: String? = null,
    val name: String? = null,
    @SerialName("tool_calls") val toolCalls: List<OpenAiToolCall>? = null,
)

@Serializable
private data class OpenAiTool(
    val type: String = "function",
    val function: OpenAiFunction,
)

@Serializable
private data class OpenAiFunction(
    val name: String,
    val description: String? = null,
    val parameters: JsonObject,
)

@Serializable
private data class OpenAiToolCall(
    val id: String,
    val type: String = "function",
    val function: OpenAiFunctionCall,
)

@Serializable
private data class OpenAiFunctionCall(
    val name: String,
    val arguments: String,
)

@Serializable
private data class OpenAiChatResponse(
    val choices: List<OpenAiChoice>,
)

@Serializable
private data class OpenAiChoice(
    val message: OpenAiMessage,
    @SerialName("finish_reason") val finishReason: String? = null,
)

@Serializable
private data class OpenAiStreamChunk(
    val choices: List<OpenAiStreamChoice>,
)

@Serializable
private data class OpenAiStreamChoice(
    val delta: OpenAiDelta,
    @SerialName("finish_reason") val finishReason: String? = null,
)

@Serializable
private data class OpenAiDelta(
    val content: String? = null,
    @SerialName("tool_calls") val toolCalls: List<OpenAiToolCall>? = null,
)
