# TAGLINE

Codebase context graph for coding agents

# TLDR

**Install** the CLI and wire it into detected coding agents

```npm install -g @nanonets/graft```

```graft init```

**Preview** which files **init** would write

```graft init --dry-run```

**Build** the structural graph (tree-sitter, no API key)

```graft build```

**Add** LLM concept nodes and per-symbol summaries

```graft build --deep```

**Query** the graph for a task

```graft ask "[how does authentication work]"```

**Search** indexed files, grouped by enclosing symbol

```graft grep "[pattern]"```

**Map** the repo (directory clusters, hubs, hotspots)

```graft map```

**Fail CI** if the graph has drifted from the code

```graft check```

# SYNOPSIS

**graft** [_global-options_] _command_ [_args_] [_options_]

# DESCRIPTION

**graft** (npm package **@nanonets/graft**) builds a local context graph of a source tree so coding agents spend less time rediscovering the repo. The default **graft build** is a deterministic tree-sitter pass: it writes a per-symbol wiring graph and per-file cards under **graft/** and needs no API key. **graft build --deep** adds LLM-written concept markdown (**graft/*.md**) plus per-symbol summaries and crux excerpts, using the provider you configure.

The graph is a regenerable cache. **graft build** adds **graft/** to **.gitignore**; teammates run **graft build** locally. What you typically commit is the agent wiring **graft init** writes (for example **.claude/**). Query commands walk up to the nearest ancestor that already has a **graft/** index, so they work from a subdirectory.

**graft init** detects coding agents (Claude Code, Cursor, Gemini, Copilot, Codex via **AGENTS.md**, Kiro, Windsurf, AdaL) and writes each host's native instruction or skill file. Claude Code also gets a statusline, post-edit hooks, and an MCP server in **.mcp.json**. On a non-TTY (CI, piped shell) **init** writes nothing unless you pass **--agents**, **--yes**, or **--all-agents**.

**ask**, **skeleton**, **callers**, **grep**, and **map** refresh the structural graph before answering if the working tree moved (no LLM). **graft check** never auto-refreshes; it is the drift report (exit **1** when stale or missing).

Full-fidelity parsers cover TypeScript/JavaScript (JSX/TSX), Python, Go, and Java. A broader tree-sitter tier covers Rust, C, C++, C#, Ruby, PHP, Kotlin, Scala, Swift, Elixir, Solidity, OCaml, Zig, and Dart. Unsupported files are skipped. **graft build --lsp** optionally adds compiler-grade call edges when **rust-analyzer**, **clangd**, **gopls**, **pyright**, or **typescript-language-server** is on **PATH**.

Requires **Node.js 20+**. MIT licensed. The package ships no product telemetry; the only network calls are the LLM requests you configure and an optional once-a-day npm version check used to print an upgrade nudge.

# COMMANDS

**init** [_dir_] [**--dry-run**] [**--agents** _ids..._] [**-y**] [**--all-agents**] [**--no-agents**] [**--no-build**] [**--no-mcp**] [**--no-hooks**] [**--no-global**] [**--list-agents**]

> Prompt for (or select) agents, write instruction/skill files, optionally register MCP/hooks, and build the graph unless **--no-build**. Agent ids include **claude**, **cursor**, **gemini**, **copilot**, **agents**, **kiro**, **windsurf**, **adal**. Selecting **agents** can also write user-level Codex files under **~/.codex/** unless **--no-global**.

**build** [_dir_] [**--deep**] [**-e** _exts..._] [**--no-reuse**] [**--lsp**] [**-j** _n_] [**--include-dir** _name_]

> Build **graft/**. Without **--deep**, structural only. **--deep** without **GRAFT_API_KEY** falls back to structural and prints a warning.

**ask** _query_ [_dir_] [**-n** _limit_] [**--source**] [**--full**] [**--in** _scope_] [**--json**] [**--no-refresh**]

> Ranked nodes with file:line. **--source** inlines excerpts so the pack can stand alone.

**grep** _pattern_ [_dir_] [**-i**] [**--fixed**] [**--in** _path_] [**--json**] [**--no-refresh**]

> Exhaustive search over indexed files, grouped by enclosing symbol and ranked by coupling.

**map** [_dir_] [**--max-dirs** _n_] [**--json**] [**--no-refresh**]

> Token-budgeted orientation: directory clusters, hubs, and hotspots.

**callers** _symbol_ [_dir_] [**--direction** _in_|_out_] [**-d** _n_] [**--in** _path_] [**--json**] [**--no-refresh**]

> Incoming references (default) or outgoing with **--direction out**. **-d** walks transitively (**all** for the full closure).

**skeleton** _file_ [_dir_] [**--json**] [**--no-refresh**]

> Signatures only for one file (repo-relative path or unique basename).

**check** [_dir_] [**-e** _exts..._] [**--json**]

> Exit **1** if **graft/** is missing or stale. Does not rebuild.

**viz** [_dir_] [**-p** _port_] [**--no-open**]

> Serve the bundled interactive viewer (default port **4400**).

**mcp** [_dir_]

> Model Context Protocol server on stdio (**graft_find_code**, **graft_file_api**, **graft_trace_calls**, **graft_find_all**, **graft_repo_map**, **graft_check_freshness**).

**version** / **upgrade**

> Print installed vs latest npm version, or run **npm install -g** of the latest.

# PARAMETERS

**--dir** _path_

> Graph directory (default **\<repo\>/graft**). Also **GRAFT_DIR**.

**--provider** _openai_|_anthropic_

> LLM wire format for **--deep** (env **GRAFT_PROVIDER**). **openai** is any OpenAI-compatible endpoint.

**--model** _id_, **--api-key** _key_, **--base-url** _url_

> Model, key, and endpoint (env **GRAFT_MODEL**, **GRAFT_API_KEY**, **GRAFT_BASE_URL**).

**-v**, **--version**

> Print the installed version and exit.

**--no-refresh** / **GRAFT_NO_REFRESH=1**

> On query commands, answer from the graph on disk without a structural rebuild. **GRAFT_REFRESH=hash** hashes every file instead of trusting size+mtime.

# CONFIGURATION

Provider settings can live in the environment or a **.env** file (see the package **.env.example**):

**GRAFT_PROVIDER**
> **openai** (default wire format, including OpenRouter, Fireworks, Groq, LiteLLM, Ollama) or **anthropic** (native API).

**GRAFT_API_KEY**, **GRAFT_MODEL**, **GRAFT_BASE_URL**
> Required for **graft build --deep**. **OPENROUTER_API_KEY** is still honored as a deprecated fallback.

**GRAFT_DIR**
> Override the graph directory (same as **--dir**).

# CAVEATS

This is the NanoNets coding-agent CLI, not Git commit grafts and not older Unix tools also named **graft**. **init** on a pipe without **--agents**/**--yes** is a no-op. Codex **agents** wiring can change **~/.codex/** for every repo on the machine. **--deep** quality depends on the model you choose; the structural graph never calls one. Language coverage is the listed tree-sitter set only.

# INSTALL

```aur: yay -S graft```

<!-- packages: 2026-08-14 -->

# SEE ALSO

[claude](/man/claude)(1), [cursor](/man/cursor)(1), [grep](/man/grep)(1), [npx](/man/npx)(1)

# RESOURCES

```[Source code](https://github.com/NanoNets/Graft)```

```[Homepage](https://graft.nanonets.ai)```

```[Documentation](https://github.com/NanoNets/Graft#readme)```

<!-- verified: 2026-08-14 -->
