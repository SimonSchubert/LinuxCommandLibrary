# TLDR

**Start an interactive session**

```kimi```

**Switch to agent mode**

Press **Ctrl+K** in interactive session

**Execute shell commands**

Press **Ctrl+X** in interactive session

**Start as ACP server for IDE integration**

```kimi acp```

**Add an HTTP MCP server**

```kimi mcp add --transport http [name] [url]```

**Add an stdio MCP server**

```kimi mcp add --transport stdio [name] -- [command] [args]```

**List configured MCP servers**

```kimi mcp list```

**Remove an MCP server**

```kimi mcp remove [name]```

# SYNOPSIS

**kimi** [_command_] [_options_]

# COMMANDS

**acp**
> Start as Agent Client Protocol server for IDE integration

**mcp add**
> Add a new MCP (Model Context Protocol) server

**mcp list**
> List configured MCP servers

**mcp remove**
> Remove an MCP server

**mcp auth**
> Authenticate with an MCP server

# MCP OPTIONS

**--transport** _TYPE_
> Transport type: http or stdio

**--auth oauth**
> Use OAuth authentication for HTTP transport

**--header** _"KEY: value"_
> Add custom headers for HTTP transport

**--mcp-config-file** _PATH_
> Connect to MCP servers using a JSON configuration file

# KEYBOARD SHORTCUTS

**Ctrl+K**
> Switch to intelligent agent mode

**Ctrl+X**
> Execute shell commands directly

# DESCRIPTION

**Kimi CLI** is Moonshot AI's command-line agent for AI-driven coding and terminal operations. It features a dual-mode interaction design combining traditional shell operations with intelligent agent capabilities, switchable with a single keystroke.

The tool supports three UI modes: shell mode for interactive terminal interface, print mode for non-interactive scripting, and ACP mode for editor integration. It can read and edit code, execute shell commands, search and fetch web pages, and autonomously plan and adjust actions during execution.

Built on Python 3.13+ with async patterns, Kimi CLI defaults to Moonshot AI's Kimi API but supports any OpenAI-compatible endpoint through the kosong framework. It integrates with MCP servers for extended tool functionality.

# CAVEATS

Currently in technical preview. Requires Python 3.13+ and Moonshot AI API access. MCP server configuration uses JSON format. The ACP protocol enables integration with editors like Zed but requires the **/setup** command for initial configuration.

# HISTORY

Kimi CLI was developed by **Moonshot AI** and released as open-source under the Apache 2.0 license. It is powered by the Kimi K2 model, a state-of-the-art mixture-of-experts model with 32 billion activated parameters and 1 trillion total parameters, optimized for agentic capabilities.

# SEE ALSO

[claude](/man/claude)(1), [gemini](/man/gemini)(1), [codex](/man/codex)(1), [qwen-code](/man/qwen-code)(1)
