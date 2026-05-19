package com.linuxcommandlibrary.ai.jsonrpc

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonContentPolymorphicSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonObject

/**
 * JSON-RPC 2.0 request message.
 * https://www.jsonrpc.org/specification
 */
@Serializable
data class JsonRpcRequest(
    val jsonrpc: String = JSON_RPC_VERSION,
    val method: String,
    val params: JsonElement? = null,
    val id: JsonRpcId? = null,
)

/**
 * JSON-RPC 2.0 response message (result or error, never both).
 */
@Serializable
data class JsonRpcResponse(
    val jsonrpc: String = JSON_RPC_VERSION,
    val result: JsonElement? = null,
    val error: JsonRpcError? = null,
    val id: JsonRpcId? = null,
)

/**
 * JSON-RPC 2.0 notification (request without id – no response expected).
 */
@Serializable
data class JsonRpcNotification(
    val jsonrpc: String = JSON_RPC_VERSION,
    val method: String,
    val params: JsonElement? = null,
)

/**
 * JSON-RPC 2.0 error object.
 */
@Serializable
data class JsonRpcError(
    val code: Int,
    val message: String,
    val data: JsonElement? = null,
)

/**
 * Standard JSON-RPC 2.0 error codes.
 */
object JsonRpcErrorCode {
    const val PARSE_ERROR = -32700
    const val INVALID_REQUEST = -32600
    const val METHOD_NOT_FOUND = -32601
    const val INVALID_PARAMS = -32602
    const val INTERNAL_ERROR = -32603
}

const val JSON_RPC_VERSION = "2.0"
