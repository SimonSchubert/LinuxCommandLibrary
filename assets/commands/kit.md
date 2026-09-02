# TAGLINE

Coding agent runtime and terminal client

# TLDR

Write the default **config and MCP files** under **~/.kit**

```kit init```

Log in with a **ChatGPT subscription** (native OAuth)

```kit auth login openai```

Start the **interactive terminal UI** in a project

```kit tui --root [path/to/project]```

Run **one prompt** and print the session id

```kit prompt --root [path/to/project] "[Summarize this repo in three lines]"```

**Resume** that session in the TUI

```kit tui --root [path/to/project] --resume [session_id]```

List **durable sessions** for a workspace

```kit sessions --root [path/to/project]```

Serve **ACP on stdio** for an editor

```kit acp --root [path/to/project]```

Run a **headless ACP daemon** on HTTP

```kit serve --root [path/to/project] --remote-acp --no-a2a --no-stdio --http [0.0.0.0:8081] --server-credential-file [path/to/token]```

Use **OpenRouter** for a one-shot prompt

```kit prompt --provider openrouter --model [anthropic/claude-sonnet-5] --root [path/to/project] "[Summarize this repo]"```

# SYNOPSIS

**kit** [_global-options_] **init**

**kit** [_global-options_] **auth** _action_ _provider_ [_options_]

**kit** [_global-options_] **tui** [_options_]

**kit** [_global-options_] **prompt** [_options_] _prompt_

**kit** [_global-options_] **sessions** [**--root** _path_]

**kit** [_global-options_] **acp** [_options_]

**kit** [_global-options_] **serve** [_options_]

# PARAMETERS

**--root** _path_
> Working directory and project context. Defaults to **root** in **~/.kit/config.toml**, then the current directory. The path must exist and be a directory. It supplies project context and relative paths; it does not sandbox filesystem access.

**--model** _name_
> Model identifier. Defaults to **model** in config, then **gpt-5.4**. **kit init** writes **gpt-5.6-sol**.

**--provider** {_openai-subscription_|_openrouter_|_speakeasy_}
> Model provider. Defaults to config, then **openai-subscription**.

**--reasoning-effort** {_default_|_low_|_medium_|_high_}
> Reasoning effort for **tui**, **prompt**, **serve**, and **acp**. **default** leaves effort unset so the provider default applies.

**--resume** _session-id_
> Continue a persisted session. On **prompt** and **tui** the id is the option value. On **serve** and **acp** use **--session-id** together with **--resume**.

**--force**
> Reclaim a stale session lock. Accepted only together with **--resume**. Does not steal a lock held by a live Kit process.

**--mcp-config** _path_
> Highest-precedence MCP server file. Merged after plugins, **mcp_config** from TOML, and **.mcp.json** in the project root.

**--credential-store** {_memory_|_keychain_|_file_}
> Shared credential backend for OpenAI, Speakeasy, and MCP. Defaults to config, then **memory**. Standalone **auth login** rejects **memory**.

**--credential-dir** _path_
> Directory for **--credential-store file**. Required with **file**; invalid with **memory** or **keychain**.

**--otel-endpoint** _url_
> OTLP/gRPC collector for GenAI traces (no **/v1/traces** suffix). Overrides config, then **OTEL_EXPORTER_OTLP_ENDPOINT**. Empty value disables export.

**--openrouter-api-key** _key_
> OpenRouter API key on the command line. Prefer **OPENROUTER_API_KEY** or stored credentials so the key is not visible in process listings.

**--help**
> Show command help.

**--version**
> Print the Kit version.

# COMMANDS

**init**
> Create **~/.kit/** and write recommended **config.toml** plus an empty **mcp.json** when those files do not exist. Leaves existing files unchanged.

**auth login** _provider_
> Authenticate **openai**, **openrouter**, or **speakeasy** into the selected credential store.

**auth status** _provider_
> Show whether stored credentials for that provider are present.

**auth logout** _provider_
> Remove stored credentials. OpenAI logout revokes the refresh token first unless **--local-only** is set.

**tui**
> Start the ACP-backed terminal client. It launches **kit serve** as a child and talks to it over ACP v2. **--a2a** _addr_ sets the HTTP listen address (otherwise an available loopback port).

**prompt** _text_
> Run one persisted prompt, print the answer, then print **session_id:** _id_ and exit.

**sessions**
> List durable top-level sessions for a workspace, newest first (tab-separated UPDATED, ID, TITLE, PREVIEW). Subagent sessions are omitted from the catalog.

**acp**
> Serve only the Agent Client Protocol on stdio. **--protocol-version** {_1_|_2_} selects the wire version (default **1**).

**serve**
> Serve ACP on stdio and optionally A2A / remote ACP over HTTP. **--http** / **--a2a** _addr_ is the listen address. **--remote-acp** exposes ACP at **/acp** (v1 and v2) and **/acp/v2** (v2 only). **--no-a2a** and **--no-stdio** require **--remote-acp**. **--server-credential-file** _path_ requires that file's bearer token on every HTTP request.

# SLASH COMMANDS

Available in **kit tui** while the session is idle.

**/new** [_prompt_]
> Close the current session and start a fresh persisted one. Optional text becomes the first prompt. The previous session remains resumable by id.

**/resume** _session-id_
> Close the current session and resume another durable session.

**/sessions**
> Open a newest-first session picker for this workspace.

**/close**
> Close the current session and exit the TUI.

**/compact** [_prompt_]
> Compact conversation history. Optional text is sent as the next user message after compaction.

**/model**
> Open the model selector. Tab also writes the choice to **~/.kit/config.toml**.

**/effort** [_default_|_low_|_medium_|_high_]
> Set reasoning effort, or open the selector with no argument.

**/agents**
> Toggle the subagent roster.

# DESCRIPTION

**kit** is Speakeasy's coding agent runtime. One static binary provides a terminal client, an Agent Client Protocol (ACP) server, an A2A endpoint, and a subagent orchestrator. The model is given a single tool, **compose**: a short Runlet program that can run shell commands, edit files, call MCP tools, load skills, and spawn subagents in one round trip.

**kit tui** is an interactive ACP client. **kit prompt** is the non-interactive counterpart for scripts. Editors and other ACP clients can attach with **kit acp** (stdio) or **kit serve --remote-acp** (HTTP/SSE or WebSocket). Kit can also drive Claude Code, Codex, Cursor, or another ACP harness as a subagent.

Providers are a ChatGPT subscription (**openai-subscription**, via **kit auth login openai**), OpenRouter, and the Speakeasy AI Control Plane. Sessions are append-only JSONL transcripts under **~/.kit/sessions**, compacted automatically at 80% of the provider context window, and resumed from **tui**, **prompt**, or an ACP client.

Kit has no permissions framework, sandbox, or web UI. **--root** selects the working directory and the **AGENTS.md** instruction chain; it does not restrict filesystem access. Treat Kit as a runtime inside a security boundary you already trust.

# CONFIGURATION

**~/.kit/config.toml**
> User configuration loaded by every runtime and auth command. Command-line flags override this file; missing keys use built-in defaults. Unknown keys are ignored. **kit init** writes **model = "gpt-5.6-sol"**, **credential_store = "file"**, **credential_dir = "~/.kit/credentials"**, and **mcp_config = "~/.kit/mcp.json"**.

**~/.kit/mcp.json**
> Default global MCP server map. Project-root **.mcp.json** and **--mcp-config** can overlay it.

**~/.kit/credentials**
> File-backed credential directory when **credential_store** is **file**.

**~/.kit/sessions**
> Durable JSONL transcripts and session locks, grouped by a hash of the workspace root.

**AGENTS.md**
> Project instructions loaded from the working directory and its ancestors into the initial transcript.

**.mcp.json** (project root)
> Project MCP servers. Live edits are reloaded before tool search and MCP auth calls.

**.agents/skills**, **~/.agents/skills**
> Agent Skills directories (**SKILL.md** per skill). Project skills override user skills of the same name.

TOML keys such as **provider**, **model**, **acp** profiles, **subagent**, and **plugins** are documented in the bundled getting-started guide. Precedence for settings exposed on the CLI is: command line, then **~/.kit/config.toml**, then built-ins.

# CAVEATS

Kit is **not a security boundary**. The agent can read and write files and run commands with the privileges of the Kit process. Run it in a sandbox or machine you trust.

**--root** must be an existing directory. A bad path reports that the working directory could not be opened; a non-directory reports that the working directory is not a directory.

Provider login cannot use **--credential-store memory**. Use **keychain** or **file** (with **--credential-dir**) for **kit auth login**, and pass the same store to later runtime commands. Memory credentials are process-local and are not shared with the TUI's **kit serve** child.

A non-loopback **kit serve** HTTP listener should set **--server-credential-file** and appropriate network controls.

The name **kit** is used by other software. Confirm **kit --help** reports "Coding agent runtime and terminal client" before relying on a distro package.

The upstream install script currently publishes binaries for **macOS arm64** and **Linux x86-64**. Docker images cover linux/amd64 and linux/arm64.

# HISTORY

**kit** is an open-source (MIT) coding agent runtime written in **Rust** by **Speakeasy**. It remains a **0.1.x** release as of **September 2026**, with production use reported on engineering tasks in **mid-2026**.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [opencode](/man/opencode)(1), [cline](/man/cline)(1), [aider](/man/aider)(1), [mise](/man/mise)(1)

# RESOURCES

```[Source code](https://github.com/speakeasy-api/kit)```

```[Documentation](https://github.com/speakeasy-api/kit/blob/main/docs/user/getting-started-and-configuration.md)```

<!-- verified: 2026-09-02 -->
