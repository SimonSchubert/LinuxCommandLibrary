package com.linuxcommandlibrary.ai.di

import com.linuxcommandlibrary.ai.chat.ChatRepository
import com.linuxcommandlibrary.ai.chat.ChatViewModel
import com.linuxcommandlibrary.ai.mcp.McpClient
import com.linuxcommandlibrary.ai.mcp.McpServer
import com.linuxcommandlibrary.ai.mcp.McpServerInfo
import com.linuxcommandlibrary.ai.tools.LinuxLibraryToolRegistry
import org.koin.dsl.module

/**
 * Koin module for the AI layer.
 *
 * Provides:
 * - [LinuxLibraryToolRegistry] — MCP tools backed by the command/basics repositories
 * - [McpServer] — in-process MCP server for tool dispatch
 * - [ChatRepository] — high-level chat orchestrator (LLM + agentic tool loop)
 * - [ChatViewModel] — UI state manager for the AI chat screen
 *
 * [McpClient] is *not* registered as a singleton because each remote endpoint
 * requires a distinct URL; create instances on demand where needed.
 */
val aiModule = module {
    single {
        LinuxLibraryToolRegistry(
            commandsRepository = get(),
            basicsRepository = get(),
        )
    }

    single {
        McpServer(
            toolRegistry = get(),
            serverInfo = McpServerInfo(
                name = "linux-command-library-mcp",
                version = "1.0.0",
            ),
        )
    }

    single {
        ChatRepository(
            toolRegistry = get(),
            preferences = get(),
        )
    }

    factory {
        ChatViewModel(
            chatRepository = get(),
            scope = get(),
        )
    }
}
