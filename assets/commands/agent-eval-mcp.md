# TAGLINE

Previous name of the Agent-first-browse MCP server

# TLDR

Serve MCP on **standard input and output**

```agent-eval-mcp```

Write screenshots to a **directory**

```agent-eval-mcp --screenshot-dir [path/to/dir]```

Log details on **standard error**

```agent-eval-mcp --verbose```

# SYNOPSIS

**agent-eval-mcp** [_options_]

# PARAMETERS

**--screenshot-dir** _directory_
> Directory for PNG screenshots. The default is chosen by the server.

**--verbose**
> Write debug logs to standard error.

# DESCRIPTION

**agent-eval-mcp** starts the same Model Context Protocol server as **agent-browse-mcp**. Both names are console scripts installed by the agent-first-browse package, and both call the same entry point. New client configurations should use **agent-browse-mcp**. This name remains so older configs keep working.

The server speaks JSON-RPC on standard input and output, launches Chromium, and exposes the browser tools documented for **agent-browse-mcp**. Tool names that began with the older eval prefix are still accepted.

# SEE ALSO

[agent-browse-mcp](/man/agent-browse-mcp)(1), [agent-eval](/man/agent-eval)(1), [agent-first-browse](/man/agent-first-browse)(1)

# RESOURCES

```[Source code](https://github.com/SandeepAi369/Agent-first-browse)```

```[Documentation](https://github.com/SandeepAi369/Agent-first-browse/blob/main/README.md)```

<!-- verified: 2026-11-26 -->
