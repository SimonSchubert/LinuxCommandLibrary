package com.linuxcommandlibrary.ai.jsonrpc

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement

/**
 * Shared [Json] instance configured for JSON-RPC / MCP use.
 * - Unknown keys are ignored for forward-compatibility.
 * - Null values in JSON are encoded to remove the key from the output.
 */
val JsonRpcJson = Json {
    ignoreUnknownKeys = true
    encodeDefaults = false
    isLenient = true
    explicitNulls = false
}

/** Encode any serializable object to [JsonElement] using [JsonRpcJson]. */
inline fun <reified T> T.toJsonElement(): JsonElement = JsonRpcJson.encodeToJsonElement(this)

/** Decode a [JsonElement] to a concrete type using [JsonRpcJson]. */
inline fun <reified T> JsonElement.fromJsonElement(): T = JsonRpcJson.decodeFromJsonElement(this)
