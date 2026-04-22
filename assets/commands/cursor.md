# TAGLINE

Cursor's AI-powered coding agent for the terminal

# TLDR

**Start an interactive agent session**

```cursor-agent```

**Start with an initial prompt**

```cursor-agent "[fix the auth bug in login.ts]"```

**Run a one-off prompt** and print the result (non-interactive)

```cursor-agent -p "[add tests for api.js]"```

**Run non-interactively with a specific model**

```cursor-agent -p "[review changes]" --model [gpt-5]```

**Resume the previous session**

```cursor-agent --continue```

**Resume a specific chat** by ID

```cursor-agent --resume [chat-id]```

**Start in plan mode** for complex tasks

```cursor-agent --plan "[migrate from Redux to Zustand]"```

**Emit structured JSON** for scripting

```cursor-agent -p "[task]" --output-format [json]```

**Auto-approve file edits** (headless CI)

```cursor-agent -p "[task]" --force --trust```

**List previous chat sessions**

```cursor-agent ls```

# SYNOPSIS

**cursor-agent** [_command_] [_options_] [_prompt_]

> Note: the binary installed by the Cursor CLI is usually named **cursor-agent**. Some distributions also create a `cursor` shim.

# COMMANDS

**agent** (default)
> Start the AI coding agent. Adding a quoted prompt starts with that prompt pre-filled.

**login** / **logout** / **status** / **whoami**
> Manage authentication. `status` (alias `whoami`) reports the signed-in user.

**about**
> Show version, system, and account information.

**models** / **--list-models**
> List models available to the account.

**mcp**
> Manage Model Context Protocol servers (install, enable, disable, list).

**acp**
> Run as an ACP server (advanced integrations).

**update**
> Update cursor-agent to the latest release.

**ls**
> List past chat sessions.

**resume** [_chat-id_]
> Resume the most recent or a specific chat.

**create-chat**
> Create a new empty chat and print its ID.

**generate-rule** (alias **rule**)
> Interactively create a new Cursor rule.

**install-shell-integration** / **uninstall-shell-integration**
> Add or remove cursor-agent's integration in `~/.zshrc`.

# PARAMETERS

**-p**, **--print**
> Print mode: run the prompt non-interactively, stream the response, then exit.

**--output-format** _FORMAT_
> `text` (human readable, default), `json` (single result object), or `stream-json` (NDJSON event stream).

**--stream-partial-output**
> Emit incremental token deltas rather than complete messages.

**--model** _NAME_
> Model to use (run `cursor-agent models` for the current list).

**--mode** _MODE_
> `agent` (default), `plan`, or `ask`.

**--plan**
> Shorthand for `--mode plan`.

**--continue**
> Continue the most recent session (shorthand for `--resume` with no id).

**--resume** [_chat-id_]
> Resume a specific chat.

**-f**, **--force**, **--yolo**
> Run all tool calls without prompting (except explicitly denied ones).

**--sandbox** _MODE_
> Sandbox behavior: `enabled` or `disabled`.

**--trust**
> Trust the workspace without prompting (required for headless runs).

**--approve-mcps**
> Automatically approve all configured MCP servers.

**--workspace** _PATH_
> Working directory to use instead of the current one.

**--worktree**
> Create a new Git worktree under `~/.cursor/worktrees` and run there.

**--api-key** _KEY_
> API key (env: `CURSOR_API_KEY`).

**-H**, **--header** _"Name: Value"_
> Add a custom header to requests.

**-v**, **--version**
> Print the version.

**-h**, **--help**
> Show help for the command.

# INTERACTIVE MODES

**Agent mode** — full tool access (read, edit, run, search).
**Plan mode** — collaboratively design an approach; no edits without confirmation.
**Ask mode** — read-only exploration and Q&A.

Toggle from inside a session with `Shift+Tab` or the slash commands `/plan`, `/ask`. Prefix a message with `&` to hand it off to a background Cloud Agent.

# DESCRIPTION

**cursor-agent** is Cursor's terminal-native AI coding assistant. It mirrors the same agent loop the Cursor editor uses, but in a plain terminal so it can live alongside Vim, Neovim, Emacs, JetBrains IDEs, or CI pipelines. Sessions are persistent and resumable. Print mode makes the agent scriptable — combine `--output-format json` with shell tooling to pipe agent output into other programs.

The CLI uses the same subscription and model quota as the Cursor editor. Cloud Agent (triggered in-session) offloads long-running tasks to Cursor's servers so the local shell stays responsive.

# CAVEATS

Requires an active Cursor subscription. Still in beta — flags may change between releases. In non-interactive mode `--force` (a.k.a. `--yolo`) is typically needed so the agent does not stall on approval prompts; pair with `--trust` when running under CI. MCP servers must be approved once unless `--approve-mcps` is used.

# HISTORY

**Cursor** was founded in **2022** by Anysphere as an AI-first fork of VS Code. The **cursor-agent** CLI was introduced in **2025** to expose the same agent loop outside the editor, so Cursor can be used from terminals and CI.

# SEE ALSO

[claude](/man/claude)(1), [aider](/man/aider)(1), [code](/man/code)(1)
