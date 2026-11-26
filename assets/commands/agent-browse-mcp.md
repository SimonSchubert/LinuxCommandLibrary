# TAGLINE

Expose a local browser to MCP clients over standard input

# TLDR

Serve MCP on **standard input and output**

```agent-browse-mcp```

Write screenshots to a **directory**

```agent-browse-mcp --screenshot-dir [path/to/dir]```

Log details on **standard error**

```agent-browse-mcp --verbose```

# SYNOPSIS

**agent-browse-mcp** [_options_]

# PARAMETERS

**--screenshot-dir** _directory_
> Directory for PNG screenshots the screenshot tool saves. The default is chosen by the server.

**--verbose**
> Write debug logs to standard error.

# DESCRIPTION

**agent-browse-mcp** is the Model Context Protocol server from Agent-first-browse. An MCP client starts it and speaks JSON-RPC on standard input and output. The server launches Chromium and exposes tools to start a session, read the page, click or type, take a screenshot, stop a session, compare the legacy and v2 engines, and export metrics.

No model API key is required. The client decides what to do with the page. **agent-eval-mcp** is the previous name of this same program and accepts the same options.

A typical client configuration runs it with **uvx** from the **agent-first-browse** package. The package's Chromium build must be installed once before the first session.

# CAVEATS

This process is a server for one client on stdin. It is not an interactive shell. A headed browser on a machine without a display needs a virtual framebuffer. Do not expose the process on a network socket; the protocol is local stdio.

# SEE ALSO

[agent-eval](/man/agent-eval)(1), [agent-first-browse](/man/agent-first-browse)(1), [agent-eval-mcp](/man/agent-eval-mcp)(1)

# RESOURCES

```[Source code](https://github.com/SandeepAi369/Agent-first-browse)```

```[Documentation](https://github.com/SandeepAi369/Agent-first-browse/blob/main/README.md)```

<!-- verified: 2026-11-26 -->
