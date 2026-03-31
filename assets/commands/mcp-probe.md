# TAGLINE

Interactive MCP protocol debugger and testing TUI

# TLDR

**Debug an MCP server** via stdio

```mcp-probe debug --stdio [command]```

**Debug via HTTP+SSE**

```mcp-probe debug --http-sse [url]```

**Debug via Streamable HTTP**

```mcp-probe debug --streamable-http [url]```

**Run compliance validation**

```mcp-probe validate --http-sse [url] --suite all```

# SYNOPSIS

**mcp-probe** _command_ [_options_]

# PARAMETERS

**debug**
> Launch interactive TUI debugger for an MCP server.

**validate**
> Run automated compliance tests against an MCP server.

**--stdio** _COMMAND_
> Connect to MCP server via stdio transport.

**--http-sse** _URL_
> Connect to MCP server via HTTP+SSE transport.

**--streamable-http** _URL_
> Connect to MCP server via Streamable HTTP transport.

**--suite** _SUITE_
> Compliance test suite to run (all, initialization, capabilities, security, performance).

**--format** _FORMAT_
> Output format for validation reports (html, markdown, json, yaml).

# DESCRIPTION

**mcp-probe** is an interactive debugger and testing toolkit for Model Context Protocol (MCP) servers. The TUI provides automatic discovery of tools, resources, and prompts, advanced fuzzy search, and multiple view modes for inspecting server responses.

It supports compliance testing with report generation in HTML, Markdown, JSON, and YAML formats, making it suitable for CI/CD pipeline integration.

# CAVEATS

Requires a running MCP server to connect to. Transport support depends on the server's implementation.

# HISTORY

**mcp-probe** was created by **conikeec** and is written in **Rust** using the Ratatui library.

# SEE ALSO

[claude](/man/claude)(1)
