package com.linuxcommandlibrary.ai.mcp

import com.linuxcommandlibrary.ai.jsonrpc.JsonRpcError
import com.linuxcommandlibrary.ai.jsonrpc.JsonRpcErrorCode
import com.linuxcommandlibrary.ai.jsonrpc.JsonRpcId
import com.linuxcommandlibrary.ai.jsonrpc.JsonRpcJson
import com.linuxcommandlibrary.ai.jsonrpc.JsonRpcRequest
import com.linuxcommandlibrary.ai.jsonrpc.JsonRpcResponse
import com.linuxcommandlibrary.ai.jsonrpc.fromJsonElement
import com.linuxcommandlibrary.ai.jsonrpc.jsonRpcId
import com.linuxcommandlibrary.ai.jsonrpc.toJsonElement
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject

/**
 * Lightweight MCP client that communicates over HTTP using JSON-RPC 2.0.
 *
 * Typical flow:
 * 1. [initialize] — negotiate protocol version and capabilities
 * 2. [listTools]  — discover available tools
 * 3. [callTool]   — invoke a tool with arguments
 *
 * @param endpointUrl Full URL of the MCP server endpoint (e.g. "http://localhost:3000/mcp").
 * @param httpClient  Optional pre-configured Ktor [HttpClient]; a default is created if omitted.
 */
class McpClient(
    private val endpointUrl: String,
    httpClient: HttpClient? = null,
) {
    private val client: HttpClient = httpClient ?: HttpClient {
        install(ContentNegotiation) { json(JsonRpcJson) }
    }

    private val idMutex = Mutex()
    private var idCounter = 0L
    private suspend fun nextId(): JsonRpcId {
        return idMutex.withLock { jsonRpcId(++idCounter) }
    }

    // ──────────────────────────────────────────────
    //  Lifecycle
    // ──────────────────────────────────────────────

    /**
     * Send the MCP `initialize` request and return the server's capabilities.
     */
    suspend fun initialize(clientInfo: McpClientInfo): McpInitializeResult {
        val params = McpInitializeParams(
            capabilities = McpCapabilities(tools = McpToolsCapability()),
            clientInfo = clientInfo,
        )
        val result = call(McpMethod.INITIALIZE, params.toJsonElement())
        return result.fromJsonElement()
    }

    /**
     * Send the `notifications/initialized` notification (no response expected).
     * Fire-and-forget: many servers return no body for notifications, so we discard
     * the response entirely.
     */
    suspend fun notifyInitialized() {
        runCatching {
            client.post(endpointUrl) {
                contentType(ContentType.Application.Json)
                setBody(JsonRpcRequest(method = McpMethod.INITIALIZED, params = JsonNull, id = null))
            }
        }
    }

    // ──────────────────────────────────────────────
    //  Tools
    // ──────────────────────────────────────────────

    /** List all tools exposed by the MCP server. */
    suspend fun listTools(): List<McpTool> {
        val result = call(McpMethod.TOOLS_LIST, null)
        return result.fromJsonElement<McpToolsListResult>().tools
    }

    /**
     * Call a named tool with an optional argument map.
     *
     * @param name      Tool name as returned by [listTools].
     * @param arguments Key-value map of input arguments (must match the tool's `inputSchema`).
     */
    suspend fun callTool(name: String, arguments: JsonObject? = null): McpToolCallResult {
        val params = McpToolCallParams(name = name, arguments = arguments)
        val result = call(McpMethod.TOOLS_CALL, params.toJsonElement())
        return result.fromJsonElement()
    }

    // ──────────────────────────────────────────────
    //  Resources
    // ──────────────────────────────────────────────

    /** List all resources exposed by the MCP server. */
    suspend fun listResources(): List<McpResource> {
        val result = call(McpMethod.RESOURCES_LIST, null)
        return result.fromJsonElement<McpResourcesListResult>().resources
    }

    /** Read the content of a specific resource by URI. */
    suspend fun readResource(uri: String): List<McpContent> {
        val params = McpResourceReadParams(uri = uri)
        val result = call(McpMethod.RESOURCES_READ, params.toJsonElement())
        return result.fromJsonElement<McpResourceReadResult>().contents
    }

    // ──────────────────────────────────────────────
    //  Internal helpers
    // ──────────────────────────────────────────────

    private suspend fun call(method: String, params: JsonElement?): JsonElement {
        val request = JsonRpcRequest(method = method, params = params, id = nextId())
        val response = postRaw(request)
        response.error?.let { err ->
            throw McpException(code = err.code, message = err.message)
        }
        return response.result
            ?: throw McpException(
                code = JsonRpcErrorCode.INTERNAL_ERROR,
                message = "MCP response missing both 'result' and 'error' for method '$method'",
            )
    }

    private suspend fun postRaw(request: JsonRpcRequest): JsonRpcResponse =
        client.post(endpointUrl) {
            contentType(ContentType.Application.Json)
            setBody(request)
        }.body()

    fun close() = client.close()
}

/**
 * Thrown when the MCP server returns a JSON-RPC error object.
 */
class McpException(val code: Int, override val message: String) : Exception(message)
