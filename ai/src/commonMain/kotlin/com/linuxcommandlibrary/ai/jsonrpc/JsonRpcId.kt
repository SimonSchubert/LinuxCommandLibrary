package com.linuxcommandlibrary.ai.jsonrpc

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put

/**
 * Polymorphic JSON-RPC request ID – can be a string, integer, or null (notification).
 * Stored as a nullable String for simplicity; numeric IDs are preserved as string digits.
 */
typealias JsonRpcId = JsonElement

/** Convenience builder for a string-keyed request ID. */
fun jsonRpcId(value: String): JsonRpcId = JsonPrimitive(value)

/** Convenience builder for an integer-keyed request ID. */
fun jsonRpcId(value: Long): JsonRpcId = JsonPrimitive(value)
