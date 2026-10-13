# TAGLINE

Expose a Janas-LLM model as MCP tools over stdio

# TLDR

**Run** as an MCP server with a chat model

```janas-mcp [models/qwen3-4b.jns]```

Add an **embedding** model (enables the `embed` tool)

```janas-mcp [models/qwen3-4b.jns] --embedding-model [models/qwen3-embedding-0.6b.jns]```

Cap the **answer** length and turn **reasoning** off

```janas-mcp [models/qwen3-4b.jns] --max [2048] --think [off]```

Register with **Claude Code**

```claude mcp add janas -- /path/to/janas-mcp /path/to/model.jns```

# SYNOPSIS

**janas-mcp** [_model.jns_] [_options_]

# DESCRIPTION

**janas-mcp** offers a model running on this machine to Model Context Protocol clients (Claude Code, editors, other agents) as tools over **stdio**. The client starts the process, writes JSON-RPC on standard input, and reads answers on standard output; everything else goes to standard error.

Tools:

- **generate** — ask the chat model a question (prompt, optional system message, longest answer, temperature) and return the answer
- **embed** — return the vector of a text, only when **--embedding-model** is given

Every call starts a conversation of its own. The reasoning of a model that reasons is never returned, only the answer. A ping is answered while a generation runs; `notifications/cancelled` stops it.

The server answers both eras of the protocol: a request that names revision 2026-07-28 in `_meta` is served statelessly, and a client that opens with `initialize` gets the handshake of the revision it asks for (2025-11-25, 2025-06-18, 2025-03-26, or 2024-11-05).

Configure it like any other stdio MCP server:

```
{"mcpServers": {"janas": {"command": "/path/to/janas-mcp",
                          "args": ["/path/to/qwen3-4b.jns"]}}}
```

At least one of a chat model or **--embedding-model** is required.

# PARAMETERS

_model.jns_
> Chat model for the **generate** tool.

**--embedding-model** _file_
> A model that gives embeddings (Qwen3-Embedding). Enables the **embed** tool.

**--mtp** _file_
> The chat model's multi-token prediction block.

**--ctx** _tokens_
> Context length (default **16384**).

**--cache** _GiB_
> RAM for streamed experts (default: automatic).

**--reserve** _GiB_
> Memory left to other programs.

**--temp** _t_
> Default temperature (default **0.7**).

**--max** _tokens_
> Default longest answer (default **2048**).

**--think** _on_|_off_
> Reasoning before answering, for models that do it (default **off**; the reasoning is never returned).

**--timeout** _s_
> Longest a generation may run (default **600**; **0**: no limit).

**-h**, **--help**
> Print usage.

# CAVEATS

This is an MCP **server**, not an interactive chat. Do not run it in a terminal expecting a prompt; a client must spawn it. The chat model and the embedding model are optional individually, but omitting both is an error. Same hardware and format limits as the rest of Janas: `.jns` files, x86-64 Linux or Windows, experimental, hard on RAM and disk.

# HISTORY

**janas-mcp** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (first public release **September 2026**, GNU GPL 3 or later). It links **Mbed TLS** so `https://` MCP servers can be used from other Janas programs; this binary itself speaks stdio to its client.

# SEE ALSO

[janas-chat](/man/janas-chat)(1), [janas-server](/man/janas-server)(1), [janas-get](/man/janas-get)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/docs/serving.md)```

<!-- verified: 2026-10-13 -->
