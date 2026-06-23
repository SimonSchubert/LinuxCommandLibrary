# TAGLINE

Local-first persistent memory for AI coding agents over MCP

# TLDR

**Detect your agent and wire the MCP entry**

```pmb setup```

**Show how many memories are stored and where**

```pmb stats```

**Search stored memory for a query**

```pmb recall "[query]"```

**Open the interactive terminal UI**

```pmb tui```

**Open the web dashboard (port 8765)**

```pmb dashboard```

**Index a codebase into memory**

```pmb index project [.]```

**Wire a specific agent (Claude Code, Cursor, Codex)**

```pmb connect [claude]```

# SYNOPSIS

**pmb** _command_ [_arguments_] [_options_]

# DESCRIPTION

**pmb** provides local-first persistent memory for AI coding agents such as Claude Code, Cursor, and Codex, exposed over the **Model Context Protocol** (MCP). It stores decisions, lessons, and project facts in a single SQLite file on disk together with a local vector store, so it works fully offline with no API keys, accounts, or telemetry.

Once wired into an agent, pmb automatically injects relevant memory before the agent acts and captures new context through lifecycle hooks. Retrieval is hybrid, combining BM25 keyword search, vector similarity, and a graph of entities, and returns results in tens of milliseconds. The command-line interface drives setup, ingestion (codebases, PDFs, ChatGPT/Claude exports), maintenance, configuration, and inspection of what has been remembered.

pmb is installed from PyPI as **pmb-ai**, which provides the **pmb** command, or run directly via **npx pmb-ai**. Each workspace lives under **~/.pmb/<workspace_name>/** and is a self-contained directory that can be copied, version-controlled, or synced between machines.

# COMMANDS

**setup**

> Detect the current agent and wire the MCP server entry.

**connect** _agent_ [**--workspace** _name_]

> Wire a specific agent (Claude Code, Cursor, Codex, and others), optionally pointing at a shared workspace.

**stats**

> Show memory counts and storage information.

**recall** _"query"_

> Search stored memory and print results with debug output.

**tui**

> Launch the interactive terminal user interface.

**dashboard**

> Start the web UI on port 8765.

**index** _project|pdf_ _target_

> Scan and embed a codebase, a PDF file, or a directory of PDFs (with **--recurse**).

**import chatgpt** _path_

> Import a ChatGPT or Claude conversation export.

**hooks** _install|list|uninstall_ _agent_

> Manage the lifecycle hooks that auto-capture and restore context.

**config** _list|get|set_ [_key_] [_value_]

> Inspect or change settings.

**forget** _ulid_ [**--hard**]

> Archive a stored fact, or permanently delete it with **--hard**.

**doctor**

> Run a health check on the installation.

# CONFIGURATION

**~/.pmb/<workspace_name>/**

> Per-workspace directory holding the SQLite event database, the LanceDB vector store, and configuration files. Copy or sync this directory to move memory between machines.

**pmb config set** _key_ _value_

> Change one of the documented settings; **pmb config list** shows the common keys and **--pro** reveals the full set.

# CAVEAT

pmb stores everything locally and is offline by default, but memory written by the ambient auto-write layer is captured automatically, so review what is retained on shared or sensitive projects and use **pmb forget** or **pmb forget-auto** to prune it. Hooks integration depends on the host agent supporting MCP lifecycle hooks; **pmb hooks capabilities** shows what each agent supports.

# SEE ALSO

[claude](/man/claude)(1), [aider](/man/aider)(1), [cursor](/man/cursor)(1), [ollama](/man/ollama)(1)

# RESOURCES

```[Source code](https://github.com/oleksiijko/pmb)```

<!-- verified: 2026-06-23 -->
