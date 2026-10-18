# TAGLINE

Local code graph and project memory for coding agents, in one Rust program

# TLDR

Install from the **Homebrew tap**

```brew install graphicle-ai/tap/graphicle```

**Set up** the current repository (index, MCP, Git hooks)

```graphicle setup```

Accept the defaults **without prompts**

```graphicle setup --yes```

Ask a question and print **cited excerpts** (no model required)

```graphicle context "[where are failed requests retried?]"```

Write an **answer** once a model is configured

```graphicle ask "[where is tax added to prices?]"```

Set the **answer model** (key stays in the environment)

```graphicle config set model anthropic```

Open the **local app** in a browser

```graphicle open```

Check the install, project, agents, and hooks

```graphicle doctor```

Build a **code-only graph** with the graph engine

```graphicle graph extract . --code-only```

Undo what setup wrote (backups restored)

```graphicle disconnect```

# SYNOPSIS

**graphicle** [**--data-dir** _DIR_] [**--config** _FILE_] [_command_] [_options_]

# DESCRIPTION

**graphicle** maps a repository into a code graph, stores docs, decisions, and captured agent sessions, and returns cited excerpts (file and line) within a token budget. One Rust program provides the command line, an MCP server, a loopback web app, and SQLite storage. No account and no telemetry. macOS and Linux; native Windows is not shipped yet.

`graphicle setup` syncs the folder (honours `.gitignore`, skips secrets such as `.env`), builds the code graph with tree-sitter, connects agents it finds (Claude Code, Codex, Cursor, VS Code, Claude Desktop), optionally turns on session capture, adds a Graphicle section to `AGENTS.md`, and installs Git hooks. Every file it changes outside the data folder is listed and backed up once as `<file>.graphicle-bak`. `graphicle disconnect` undoes that.

`graphicle context` and the MCP tools call no model. `graphicle ask` needs a configured model to write prose; without one it prints the evidence. `graphicle graph` forwards remaining arguments to the **graphicle-graph** engine beside this binary (else on PATH): `graphicle graph extract . --code-only`, then `graphicle graph affected "retry()"`. The code-graph MCP tools keep Graphify names such as `query_graph`.

Default data folder: `~/.local/share/graphicle` on Linux (`$XDG_DATA_HOME/graphicle` if set), `~/Library/Application Support/Graphicle` on macOS. Override with **--data-dir** or **GRAPHICLE_DATA_DIR**. Loopback by default (app and MCP on 127.0.0.1, default port **8854**). Version **0.1.0** (core). Apache-2.0. The graph engine is a Rust port of Graphify; memory, the app, and session capture are not part of Graphify.

# COMMANDS

**setup** [_PATH_] [**--yes**] [**--clients** _LIST_] [**--no-capture**] [**--no-hooks**] [**--no-instructions**] [**--switch-from-graphify**] [**--json**]
> Index _PATH_ (default: this folder), connect agents, and install hooks. **--clients** is `all`, `none`, or a comma list (`claude-code`, `codex`, `cursor`, `vscode`, `claude`). **--yes** accepts defaults. Safe to run again.

**ask** _QUESTION_ [**--project** _ID_] [**--workflow** **basic**|**reflect**] [**--retain**] [**--max-calls** _N_] [**--json**]
> Answer from retrieved excerpts. Default workflow **basic** (one model call). **reflect** lets the model search further; **--retain** saves that answer as a memory draft. Default **--max-calls** 4.

**context** _QUESTION_ [**--project** _ID_] [**--workspace**] [**--max-tokens** _N_] [**--json**]
> Cited excerpts only, no model. Default **--max-tokens** 3000. **--workspace** searches up to 8 readable projects.

**doctor** [**--fix**] [**--project** _ID_] [**--port** _N_] [**--json**]
> Check the program, this project, agent entries, hooks, and model. **--fix** re-syncs and rewrites agent entries whose program is missing.

**status** [**--project** _ID_] [**--json**]
> Project sync, code graph, agents, hooks, and model. With no subcommand, **graphicle** in a project prints a similar status.

**open** [_PATH_] [**--port** _N_]
> Open the app (alias **start**). Default port 8854. Prints the URL when no browser can start, or when **GRAPHICLE_NO_BROWSER=1**.

**sync** [_PATH_] [**--project** _ID_] [**--background**] [**--no-graph**] [**--json**] [**--quiet**]
> Import or update a folder and build its code graph. Git hooks run **--quiet**.

**mcp** [**--project** _ID_ | **--workspace**]
> Serve sources, memory, and the code graph over stdio MCP.

**graph** [_ENGINE_ARGS_...]
> Run **graphicle-graph** with the remaining words unchanged. `graphicle graph` alone prints the engine help.

**connect** [_CLIENT_] [**--all**] [**--project** _ID_] [**--hooks**] [**--graph**] [**--json**]
> Connect one client (`claude-code`, `codex`, `cursor`, `vscode`, `claude`) or **--all**.

**disconnect** [_CLIENT_] [**--all**] [**--json**]
> Remove Graphicle's client entries, hooks, instruction section, and Git-hook lines. Restores a backup when the file still matches.

**config** [**set**|**show**|**path**|**example**] ...
> `graphicle config set model anthropic` (or **openai**, **ollama**) records the environment variable name, never the key.

**serve** [**--listen** _ADDR_] [**--port** _N_] [**--open**]
> HTTP app and worker. Default listen **127.0.0.1**, port **8854**.

**backup** _PATH_ / **restore** _PATH_
> Consistent SQLite backup; restore writes a new data directory and never overwrites existing data.

# CONFIGURATION

**GRAPHICLE_DATA_DIR**
> Data folder (same as **--data-dir**). Holds `reviews.sqlite3`, `models.json`, `local-session.json`.

**models.json**
> Optional model profiles in the data folder, or **--config** _FILE_. `graphicle config example` prints a starter file. Keys are named via `key_env`, never stored in the file.

**ANTHROPIC_API_KEY**, **OPENAI_API_KEY**, **OLLAMA_HOST**
> Used when `config set model` selects that provider. Ollama default `http://127.0.0.1:11434`.

Default project limits: 100,000 text files and 1 GiB of text (`GRAPHICLE_MAX_PROJECT_FILES`, `GRAPHICLE_MAX_PROJECT_BYTES`).

# CAVEATS

Without a model, **ask** prints evidence only. A full `graphicle graph extract` (without **--code-only**) may send documents and images to the configured LLM. Session capture drops `<private>…</private>` spans and redacts credentials. Native Windows is planned; WSL2 is untested. Nothing leaves the machine unless you configure a model, a connector, `graphicle update --feed`, or GitHub CLI features.

# SEE ALSO

[graphicle-graph](/man/graphicle-graph)(1), [graf](/man/graf)(1), [graphify-csharp](/man/graphify-csharp)(1), [ctags](/man/ctags)(1), [cscope](/man/cscope)(1), [rg](/man/rg)(1), [claude](/man/claude)(1), [codex](/man/codex)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/graphicle-ai/graphicle)```

```[Documentation](https://github.com/graphicle-ai/graphicle/blob/main/docs/quickstart.md)```

<!-- verified: 2026-10-14 -->
