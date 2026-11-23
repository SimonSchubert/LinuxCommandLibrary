# TAGLINE

Cursor's AI-powered coding agent for the terminal

# TLDR

**Start an interactive agent session**

```agent```

**Start with an initial prompt**

```agent "[fix the auth bug in login.ts]"```

**Run a one-off prompt** and print the result (non-interactive)

```agent -p "[add tests for api.js]"```

**Run non-interactively with a specific model**

```agent -p "[review changes]" --model [gpt-5]```

**Resume the previous session**

```agent --continue```

**Resume a specific chat** by ID

```agent --resume [chat-id]```

**Start in plan mode** for complex tasks

```agent --plan "[migrate from Redux to Zustand]"```

**Emit structured JSON** for scripting

```agent -p "[task]" --output-format [json]```

**Auto-approve file edits** (headless CI)

```agent -p "[task]" --force --trust```

**List previous chat sessions**

```agent ls```

**Run headless in a fresh Git worktree**

```agent -p "[task]" --force --trust --worktree [feature-name]```

# SYNOPSIS

**agent** [_command_] [_options_] [_prompt_]

**cursor-agent** [_command_] [_options_] [_prompt_]

> Note: the installer creates **agent** as the primary binary and keeps **cursor-agent** as a legacy alias. The `cursor` command installed by the Cursor editor is the editor launcher (like `code`), not the agent CLI.

# COMMANDS

**agent** [_prompt_] (default)
> Start the AI coding agent. Adding a quoted prompt starts with that prompt pre-filled.

**login** / **logout** / **status** / **whoami**
> Manage authentication. `status` (alias `whoami`) reports the signed-in user.

**about**
> Show version, system, and account information.

**models**
> List models available to the account (same as `--list-models`).

**mcp** _subcommand_
> Manage Model Context Protocol servers: `login`, `list`, `list-tools`, `enable`, `disable`.

**sandbox** _subcommand_
> Configure the command sandbox (`enable`, `disable`, `reset`) or run one command in it (`sandbox run`).

**worker start**
> Start a private cloud worker that runs Cloud Agents in your own environment.

**acp**
> Run as an ACP server (advanced integrations).

**update**
> Update the CLI to the latest release.

**ls**
> Open previous chats and pick one to resume.

**resume**
> Resume the latest chat session.

**create-chat**
> Create a new empty chat and print its ID.

**generate-rule** (alias **rule**)
> Interactively create a new Cursor rule.

**install-shell-integration** / **uninstall-shell-integration**
> Add or remove the CLI's shell integration in `~/.zshrc`.

# PARAMETERS

**-p**, **--print**
> Print mode: run the prompt non-interactively, print the response, then exit. Has access to all tools, including write and shell.

**--output-format** _FORMAT_
> `text` (human readable, default), `json` (single result object), or `stream-json` (NDJSON event stream).

**--stream-partial-output**
> Emit incremental text deltas (only with `--print` and `stream-json`).

**--model** _NAME_
> Model to use (run `agent models` for the current list).

**--mode** _MODE_
> `plan` or `ask`; agent mode is the default when no mode is given.

**--plan**
> Shorthand for `--mode plan`.

**--continue**
> Continue the previous session (alias for `--resume=-1`).

**--resume** [_chat-id_]
> Resume a specific chat.

**-f**, **--force**, **--yolo**
> Run all tool calls without prompting (except explicitly denied ones).

**--sandbox** _MODE_
> Sandbox behavior: `enabled` or `disabled`.

**--trust**
> Trust the workspace without prompting (headless mode only).

**--approve-mcps**
> Automatically approve all configured MCP servers.

**--workspace** _PATH_
> Working directory to use instead of the current one.

**-w**, **--worktree** [_NAME_]
> Run in a new Git worktree under `~/.cursor/worktrees/<repo>/<name>`; a name is generated if omitted.

**--worktree-base** _BRANCH_
> Branch or ref to base the new worktree on (default: current HEAD).

**--list-models**
> List all available models and exit.

**--plugin-dir** _PATH_
> Load a local plugin directory (repeatable).

**--api-key** _KEY_
> API key (env: `CURSOR_API_KEY`).

**-H**, **--header** _"Name: Value"_
> Add a custom header to agent requests (repeatable).

**-v**, **--version**
> Print the version.

**-h**, **--help**
> Show help for the command.

# INTERACTIVE MODES

**Agent mode**: full tool access (read, edit, run, search).
**Plan mode**: design the approach first, with clarifying questions, before coding.
**Ask mode**: read-only exploration and Q&A.

Switch to plan mode inside a session with `Shift+Tab` or `/plan`, and to ask mode with `/ask`. Prefix a message with `&` to hand it off to a background Cloud Agent.

# DESCRIPTION

**agent** is Cursor's terminal-native AI coding assistant. It mirrors the same agent loop the Cursor editor uses, but in a plain terminal so it can live alongside Vim, Neovim, Emacs, JetBrains IDEs, or CI pipelines. Sessions are persistent and resumable. Print mode makes the agent scriptable: combine `--output-format json` with shell tooling to pipe agent output into other programs.

The CLI uses the same subscription and model quota as the Cursor editor. Cloud Agent (triggered in-session) offloads long-running tasks to Cursor's servers so the local shell stays responsive.

# CAVEATS

Requires a Cursor account; usage counts against the same plan as the editor. The CLI is updated frequently and flags may change between releases. In non-interactive mode `--force` (a.k.a. `--yolo`) is typically needed so the agent does not stall on approval prompts; pair with `--trust` when running under CI. MCP servers must be approved once unless `--approve-mcps` is used.

# HISTORY

**Cursor** was founded in **2022** by Anysphere as an AI-first fork of VS Code. The CLI was introduced in **2025** as **cursor-agent** to expose the same agent loop outside the editor, so Cursor can be used from terminals and CI. The primary binary was later renamed to **agent**, with `cursor-agent` kept as an alias.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [gemini](/man/gemini)(1), [aider](/man/aider)(1), [code](/man/code)(1)

# RESOURCES

```[Homepage](https://cursor.com/cli)```

```[Documentation](https://cursor.com/docs/cli/overview)```

<!-- verified: 2026-11-23 -->
