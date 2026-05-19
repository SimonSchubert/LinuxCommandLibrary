package com.linuxcommandlibrary.ai.mcp

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject

// ──────────────────────────────────────────────
//  MCP Lifecycle
// ──────────────────────────────────────────────

@Serializable
data class McpClientInfo(
    val name: String,
    val version: String,
)

@Serializable
data class McpServerInfo(
    val name: String,
    val version: String,
)

@Serializable
data class McpCapabilities(
    val tools: McpToolsCapability? = null,
    val resources: McpResourcesCapability? = null,
    val prompts: McpPromptsCapability? = null,
)

@Serializable
class McpToolsCapability

@Serializable
class McpResourcesCapability

@Serializable
class McpPromptsCapability

@Serializable
data class McpInitializeParams(
    val protocolVersion: String = MCP_PROTOCOL_VERSION,
    val capabilities: McpCapabilities,
    val clientInfo: McpClientInfo,
)

@Serializable
data class McpInitializeResult(
    val protocolVersion: String,
    val capabilities: McpCapabilities,
    val serverInfo: McpServerInfo,
    val instructions: String? = null,
)

// ──────────────────────────────────────────────
//  Tools
// ──────────────────────────────────────────────

/**
 * Describes a callable tool exposed by an MCP server.
 */
@Serializable
data class McpTool(
    val name: String,
    val description: String? = null,
    val inputSchema: JsonObject,
)

@Serializable
data class McpToolsListResult(
    val tools: List<McpTool>,
    val nextCursor: String? = null,
)

@Serializable
data class McpToolCallParams(
    val name: String,
    val arguments: JsonObject? = null,
)

@Serializable
data class McpToolCallResult(
    val content: List<McpContent>,
    val isError: Boolean = false,
)

// ──────────────────────────────────────────────
//  Resources
// ──────────────────────────────────────────────

@Serializable
data class McpResource(
    val uri: String,
    val name: String,
    val description: String? = null,
    val mimeType: String? = null,
)

@Serializable
data class McpResourcesListResult(
    val resources: List<McpResource>,
    val nextCursor: String? = null,
)

@Serializable
data class McpResourceReadParams(val uri: String)

@Serializable
data class McpResourceReadResult(val contents: List<McpContent>)

// ──────────────────────────────────────────────
//  Prompts
// ──────────────────────────────────────────────

@Serializable
data class McpPrompt(
    val name: String,
    val description: String? = null,
    val arguments: List<McpPromptArgument>? = null,
)

@Serializable
data class McpPromptArgument(
    val name: String,
    val description: String? = null,
    val required: Boolean = false,
)

@Serializable
data class McpPromptsListResult(
    val prompts: List<McpPrompt>,
    val nextCursor: String? = null,
)

// ──────────────────────────────────────────────
//  Content blocks
// ──────────────────────────────────────────────

/**
 * Polymorphic content block returned by tools and resources.
 * Discriminated by the `type` field.
 */
@Serializable
data class McpContent(
    val type: String,
    val text: String? = null,
    val data: String? = null,
    val mimeType: String? = null,
    val uri: String? = null,
)

object McpContentType {
    const val TEXT = "text"
    const val IMAGE = "image"
    const val RESOURCE = "resource"
}

// ──────────────────────────────────────────────
//  MCP method names
// ──────────────────────────────────────────────

object McpMethod {
    const val INITIALIZE = "initialize"
    const val INITIALIZED = "notifications/initialized"
    const val TOOLS_LIST = "tools/list"
    const val TOOLS_CALL = "tools/call"
    const val RESOURCES_LIST = "resources/list"
    const val RESOURCES_READ = "resources/read"
    const val PROMPTS_LIST = "prompts/list"
    const val PROMPTS_GET = "prompts/get"
}

const val MCP_PROTOCOL_VERSION = "2024-11-05"
