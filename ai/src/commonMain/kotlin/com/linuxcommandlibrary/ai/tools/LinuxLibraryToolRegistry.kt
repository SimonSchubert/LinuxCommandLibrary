package com.linuxcommandlibrary.ai.tools

import com.linuxcommandlibrary.ai.jsonrpc.JsonRpcJson
import com.linuxcommandlibrary.ai.mcp.McpContent
import com.linuxcommandlibrary.ai.mcp.McpContentType
import com.linuxcommandlibrary.ai.mcp.McpException
import com.linuxcommandlibrary.ai.mcp.McpTool
import com.linuxcommandlibrary.ai.mcp.McpToolCallResult
import com.linuxcommandlibrary.app.data.BasicsRepository
import com.linuxcommandlibrary.app.data.BasicGroupMatch
import com.linuxcommandlibrary.app.data.CommandsRepository
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonObject

/**
 * Registry of all MCP tools exposed by the Linux Command Library.
 *
 * Each tool is defined with a name, description, and JSON Schema for its input.
 * The [call] method dispatches to the appropriate handler.
 */
class LinuxLibraryToolRegistry(
    private val commandsRepository: CommandsRepository,
    private val basicsRepository: BasicsRepository,
) {

    fun allTools(): List<McpTool> = listOf(
        searchCommandsTool,
        getCommandDetailTool,
        searchBasicsTool,
    )

    suspend fun call(name: String, arguments: JsonObject?): McpToolCallResult =
        when (name) {
            SEARCH_COMMANDS -> searchCommands(arguments)
            GET_COMMAND_DETAIL -> getCommandDetail(arguments)
            SEARCH_BASICS -> searchBasics(arguments)
            else -> McpToolCallResult(
                content = listOf(McpContent(type = McpContentType.TEXT, text = "Unknown tool: $name")),
                isError = true,
            )
        }

    // ──────────────────────────────────────────────
    //  Tool: search_commands
    // ──────────────────────────────────────────────

    private val searchCommandsTool = McpTool(
        name = SEARCH_COMMANDS,
        description = "Search for Linux commands by name or keyword. Returns a list of matching command names.",
        inputSchema = buildJsonObject {
            put("type", "object")
            putJsonObject("properties") {
                putJsonObject("query") {
                    put("type", "string")
                    put("description", "Search query (command name or keyword)")
                }
            }
            put("required", JsonRpcJson.parseToJsonElement("""["query"]"""))
        },
    )

    private fun searchCommands(arguments: JsonObject?): McpToolCallResult {
        val query = arguments?.get("query")?.jsonPrimitive?.content ?: ""
        val results = commandsRepository.getCommandsByQuery(query).take(20)
        val text = if (results.isEmpty()) {
            "No commands found for query: '$query'"
        } else {
            results.joinToString("\n") { "- ${it.name}" }
        }
        return textResult(text)
    }

    // ──────────────────────────────────────────────
    //  Tool: get_command_detail
    // ──────────────────────────────────────────────

    private val getCommandDetailTool = McpTool(
        name = GET_COMMAND_DETAIL,
        description = "Get detailed information (man page sections) for a specific Linux command.",
        inputSchema = buildJsonObject {
            put("type", "object")
            putJsonObject("properties") {
                putJsonObject("command") {
                    put("type", "string")
                    put("description", "Exact Linux command name (e.g. 'ls', 'grep', 'curl')")
                }
            }
            put("required", JsonRpcJson.parseToJsonElement("""["command"]"""))
        },
    )

    private fun getCommandDetail(arguments: JsonObject?): McpToolCallResult {
        val commandName = arguments?.get("command")?.jsonPrimitive?.content ?: ""
        val sections = commandsRepository.getSections(commandName)
        if (sections.isEmpty()) {
            return textResult("No details found for command: '$commandName'")
        }
        val text = buildString {
            appendLine("# $commandName")
            sections.forEach { section ->
                appendLine("\n## ${section.title}")
                appendLine(section.content)
            }
        }
        return textResult(text)
    }

    // ──────────────────────────────────────────────
    //  Tool: search_basics
    // ──────────────────────────────────────────────

    private val searchBasicsTool = McpTool(
        name = SEARCH_BASICS,
        description = "Search the Linux basics guide sections. Returns matching sections with command examples.",
        inputSchema = buildJsonObject {
            put("type", "object")
            putJsonObject("properties") {
                putJsonObject("query") {
                    put("type", "string")
                    put("description", "Topic to search (e.g. 'files', 'network', 'permissions')")
                }
            }
            put("required", JsonRpcJson.parseToJsonElement("""["query"]"""))
        },
    )

    private fun searchBasics(arguments: JsonObject?): McpToolCallResult {
        val query = arguments?.get("query")?.jsonPrimitive?.content ?: ""
        val matches = basicsRepository.getMatchingGroups(query).take(10)
        val text = if (matches.isEmpty()) {
            "No basics sections found for query: '$query'"
        } else {
            matches.joinToString("\n\n") { match ->
                "**${match.categoryTitle} › ${match.description}**"
            }
        }
        return textResult(text)
    }

    // ──────────────────────────────────────────────
    //  Helpers
    // ──────────────────────────────────────────────

    private fun textResult(text: String) = McpToolCallResult(
        content = listOf(McpContent(type = McpContentType.TEXT, text = text)),
    )

    companion object {
        const val SEARCH_COMMANDS = "search_commands"
        const val GET_COMMAND_DETAIL = "get_command_detail"
        const val SEARCH_BASICS = "search_basics"
    }
}
