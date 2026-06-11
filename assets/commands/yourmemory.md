# TAGLINE

Agentic AI memory MCP server with forgetting-curve decay

# TLDR

**Run the** stdio MCP server (typically launched by an AI client, not a human)

```yourmemory```

**Print the executable path** and a ready-to-paste MCP config block

```yourmemory-path```

**Install** the CLI from PyPI

```pip install yourmemory```

**Identify the agent** that owns a memory namespace via env var

```YOURMEMORY_USER=[agent_name] yourmemory```

# SYNOPSIS

**yourmemory**

**yourmemory-path**

# PARAMETERS

**yourmemory**
> Start the stdio Model Context Protocol server. Reads JSON-RPC requests on stdin and writes responses on stdout; intended to be launched by an MCP-compatible client.

**yourmemory-path**
> Print the absolute path to the **yourmemory** executable along with a JSON config snippet ready to paste into an MCP client configuration.

**YOURMEMORY_USER** (environment)
> Identifies the agent owning the memory namespace. Multiple agents on the same instance get isolated private memories plus shared context.

# DESCRIPTION

**yourmemory** is a Model Context Protocol (MCP) server that gives AI coding agents long-term memory with biological decay modeled after the **Ebbinghaus forgetting curve**. Memories that are recalled often gain strength; memories that are not decay over time, mimicking human retention.

The server exposes three tools to MCP clients:

**recall_memory(query)**
> Hybrid retrieval combining vector similarity, BM25 keyword scoring, and graph expansion, ranked by similarity and strength.

**store_memory(content, importance, category?, visibility?)**
> Persists a new memory with an importance score (0-1). Categories include **strategy**, **fact**, **assumption**, and **failure**. Visibility may be **private** or **shared**.

**update_memory(id, new_content, importance)**
> Re-embeds and replaces an existing memory entry.

It plugs into any MCP-aware client (Claude Code, Cursor, Cline, Windsurf, Continue, Zed) and supports multiple agents sharing one instance with namespace isolation.

# CONFIGURATION

Most clients are configured with a JSON snippet pointing **command** at the **yourmemory** binary:

```
{
  "mcpServers": {
    "yourmemory": {
      "command": "yourmemory",
      "env": { "YOURMEMORY_USER": "agent-1" }
    }
  }
}
```

Run **yourmemory-path** to get the absolute executable path required by clients that do not resolve **PATH** at launch time. No external database or service is required; storage is local.

# CAVEATS

Not a general-purpose Linux command - **yourmemory** is meaningful only when launched by an MCP client. Running it directly leaves it waiting for JSON-RPC traffic on stdin. The decay model means memories that are not reinforced are eventually surfaced less; importance and category should be chosen carefully to avoid losing critical facts. Requires Python 3 and **pip** for installation.

# HISTORY

**YourMemory** was released by **sachitrafa** in **2025** as an open-source MCP memory server. It cites benchmark results on the **LoCoMo** long-context conversation benchmark, claiming roughly 16 percentage points better recall than Mem0. The project is written in Python and distributed via PyPI.

# SEE ALSO

[claude](/man/claude)(1), [pip](/man/pip)(1)
