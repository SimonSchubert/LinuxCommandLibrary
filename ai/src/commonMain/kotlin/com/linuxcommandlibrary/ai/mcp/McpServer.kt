package com.linuxcommandlibrary.ai.mcp

import com.linuxcommandlibrary.ai.jsonrpc.JsonRpcError
import com.linuxcommandlibrary.ai.jsonrpc.JsonRpcErrorCode
import com.linuxcommandlibrary.ai.jsonrpc.JsonRpcJson
import com.linuxcommandlibrary.ai.jsonrpc.JsonRpcNotification
import com.linuxcommandlibrary.ai.jsonrpc.JsonRpcRequest
import com.linuxcommandlibrary.ai.jsonrpc.JsonRpcResponse
import com.linuxcommandlibrary.ai.jsonrpc.fromJsonElement
import com.linuxcommandlibrary.ai.jsonrpc.toJsonElement
import com.linuxcommandlibrary.ai.tools.LinuxLibraryToolRegistry
import kotlinx.serialization.json.JsonNull

/**
 * In-process MCP server that handles JSON-RPC requests and delegates to [LinuxLibraryToolRegistry].
 *
 * The server is transport-agnostic — it receives a serialised JSON-RPC request string and
 * returns a serialised response string.  The caller is responsible for transport (HTTP, stdio,
 * WebSocket, etc.).
 */
class McpServer(
    private val toolRegistry: LinuxLibraryToolRegistry,
    private val serverInfo: McpServerInfo = McpServerInfo(
        name = "linux-command-library-mcp",
        version = "1.0.0",
    ),
) {
    private var initialized = false

    /**
     * Process a raw JSON-RPC request string and return a JSON-RPC response string.
     * Returns `null` for notifications (no id → no response expected).
     */
    suspend fun handle(requestJson: String): String? {
        val request = runCatching {
            JsonRpcJson.decodeFromString<JsonRpcRequest>(requestJson)
        }.getOrElse { e ->
            val errorResponse = JsonRpcResponse(
                error = JsonRpcError(JsonRpcErrorCode.PARSE_ERROR, "Parse error: ${e.message}"),
            )
            return JsonRpcJson.encodeToString(JsonRpcResponse.serializer(), errorResponse)
        }

        // Notifications (no id) require no response
        if (request.id == null) {
            handleNotification(request)
            return null
        }

        val response = handleRequest(request)
        return JsonRpcJson.encodeToString(JsonRpcResponse.serializer(), response)
    }

    private suspend fun handleRequest(request: JsonRpcRequest): JsonRpcResponse {
        return try {
            val result = when (request.method) {
                McpMethod.INITIALIZE -> handleInitialize(request)
                McpMethod.TOOLS_LIST -> handleToolsList()
                McpMethod.TOOLS_CALL -> handleToolsCall(request)
                McpMethod.RESOURCES_LIST -> handleResourcesList()
                else -> throw McpException(
                    JsonRpcErrorCode.METHOD_NOT_FOUND,
                    "Method not found: ${request.method}",
                )
            }
            JsonRpcResponse(result = result, id = request.id)
        } catch (e: McpException) {
            JsonRpcResponse(
                error = JsonRpcError(code = e.code, message = e.message),
                id = request.id,
            )
        } catch (e: Exception) {
            JsonRpcResponse(
                error = JsonRpcError(JsonRpcErrorCode.INTERNAL_ERROR, e.message ?: "Internal error"),
                id = request.id,
            )
        }
    }

    private fun handleNotification(request: JsonRpcRequest) {
        if (request.method == McpMethod.INITIALIZED) {
            initialized = true
        }
    }

    private fun handleInitialize(request: JsonRpcRequest): kotlinx.serialization.json.JsonElement {
        val result = McpInitializeResult(
            protocolVersion = MCP_PROTOCOL_VERSION,
            capabilities = McpCapabilities(
                tools = McpToolsCapability(),
                resources = McpResourcesCapability(),
            ),
            serverInfo = serverInfo,
            instructions = "Linux Command Library MCP server. Use tools to search commands and basics.",
        )
        return result.toJsonElement()
    }

    private fun handleToolsList(): kotlinx.serialization.json.JsonElement {
        val result = McpToolsListResult(tools = toolRegistry.allTools())
        return result.toJsonElement()
    }

    private suspend fun handleToolsCall(request: JsonRpcRequest): kotlinx.serialization.json.JsonElement {
        val params = request.params?.fromJsonElement<McpToolCallParams>()
            ?: throw McpException(JsonRpcErrorCode.INVALID_PARAMS, "Missing params")
        val result = toolRegistry.call(params.name, params.arguments)
        return result.toJsonElement()
    }

    private fun handleResourcesList(): kotlinx.serialization.json.JsonElement {
        val result = McpResourcesListResult(resources = emptyList())
        return result.toJsonElement()
    }
}
