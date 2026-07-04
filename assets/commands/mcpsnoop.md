# TAGLINE

Wireshark for MCP – transparent proxy and live TUI for AI client/server traffic

# TLDR

**Wrap a server** to inspect live MCP (Model Context Protocol) JSON-RPC traffic

```mcpsnoop -- node build/index.js```

**Run the demo**

```mcpsnoop demo```

**Proxy an HTTP MCP server**

```mcpsnoop http --target http://localhost:3000/mcp --listen :7000```

**Start the TUI** (pairs automatically with wrapped servers)

```mcpsnoop```

# SYNOPSIS

**mcpsnoop** [--] [_server_ _args_...]

**mcpsnoop** http [--target _url_] [--listen _addr_]

**mcpsnoop** demo

# DESCRIPTION

mcpsnoop is a transparent proxy and interactive terminal UI for debugging traffic between AI clients (Claude Desktop, Cursor, Claude Code, etc.) and MCP servers. Unlike the official MCP Inspector, which connects as a separate client, mcpsnoop sits in the actual data path so it sees the real calls made by your client.

It consists of two cooperating roles in one binary:

- The shim (`mcpsnoop -- <server command>`) that your client spawns. It forwards bytes verbatim while capturing every JSON-RPC frame.
- The hub/TUI (`mcpsnoop` with no arguments) that receives frames and provides a live, filterable, replay-capable interface.

The two halves discover each other automatically via a well-known socket and on-disk logs; order of starting does not matter.

# FEATURES

- Live colour-coded JSON-RPC stream (requests, responses, notifications, server stderr)
- Hung-call detection with live timers
- Capability inspector
- Frame inspector with search
- Replay of any captured tool call against a fresh server copy
- Powerful filter query language (`tool:`, `status:`, `dir:`, etc.)
- Single static binary, zero runtime dependencies

# INSTALL

go install github.com/kerlenton/mcpsnoop/cmd/mcpsnoop@latest

Or via Homebrew:

brew tap kerlenton/mcpsnoop
brew install mcpsnoop

Prebuilt binaries are available from the Releases page.

# PARAMETERS

**--**  
> End flag processing; everything after is the wrapped server command and its arguments.

For the HTTP reverse-proxy mode:

**--target** _url_  
> Target HTTP MCP endpoint.

**--listen** _addr_  
> Address to listen on (e.g. `:7000`).

# CAVEATS

Only wrap servers you trust. mcpsnoop executes the command you configure. The tool is pre-1.0; behaviour may change in minor releases.

# SEE ALSO

[modelcontextprotocol/inspector](https://github.com/modelcontextprotocol/inspector)

```[Source code](https://github.com/kerlenton/mcpsnoop)
<!-- verified: 2026-07-04 -->
```