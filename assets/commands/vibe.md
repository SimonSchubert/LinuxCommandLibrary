# TAGLINE

Mistral AI command-line coding assistant

# TLDR

**Start an interactive session**

```vibe```

**Start with an initial prompt**

```vibe "[refactor the main function to be more modular]"```

**Run non-interactively for scripting**

```vibe -p "[add unit tests for the auth module]"```

**Run headless and approve all tool calls**

```vibe -p "[fix the failing tests]" --auto-approve```

**Pipe input into a headless run**

```git diff | vibe -p "[review this diff]"```

**Limit turns and cost in non-interactive mode**

```vibe -p "[fix lint errors]" --max-turns [10] --max-price [2.50]```

**Use a custom agent configuration**

```vibe --agent [my_custom_agent]```

**Resume the most recent session**

```vibe --continue```

**Pick a session to resume** (or pass a session ID)

```vibe --resume```

**Work in an isolated git worktree**

```vibe --worktree [feature-name]```

**Reference a file in prompt**

```vibe``` then ```@[path/to/file.py] [explain this code]```

**Execute a shell command directly**

```vibe``` then ```![ls -la]```

# SYNOPSIS

**vibe** [_options_] [_prompt_]

**vibe** **mcp** **add** | **remove** [_args_]

**vibe** **config** **schema**

**vibe** **update**

# PARAMETERS

**-p**, **--prompt** [_TEXT_]
> Run in headless (programmatic) mode: send the prompt, print the response, and exit. Without _TEXT_, the prompt is read from stdin.

**--prompt-file** _PATH_
> Run headless with the prompt read from a file.

**--auto-approve**, **--yolo**
> Approve all tool calls without prompting. Without it, headless mode denies any tool call that would need approval.

**--smart-approve**
> Classify each tool call and auto-run the safe ones, prompting only for risky ones.

**--approval-policy** _NAME_
> Approval policy: ask, accept-edits (default), smart-approve, auto-approve, or a custom one.

**--agent** _NAME_
> Select an agent profile (built-in, or custom from `~/.vibe/agents/NAME.toml`). Defaults to the `default_agent` config setting.

**-c**, **--continue**
> Continue the last session in this folder.

**--resume** [_SESSION_ID_]
> Resume a specific session, or show an interactive picker without an ID.

**--model** _ALIAS_
> Use this model alias instead of `active_model` (headless mode, new sessions, not saved).

**--thinking** _LEVEL_
> Thinking level: off, low, medium, high, xhigh, max (headless mode, new sessions).

**--max-turns** _N_
> Limit the number of assistant turns (headless mode only).

**--max-price** _DOLLARS_
> Stop once the cumulative cost reaches this amount (headless mode only).

**--max-tokens** _N_
> Stop once the cumulative prompt and completion tokens reach this budget (headless mode only).

**--time-limit** _SECONDS_
> Interrupt the run after this many seconds; the session can be resumed later.

**--output** _FORMAT_
> Headless output format: `text` (default), `json` (all messages at the end), or `streaming` (newline-delimited JSON).

**--output-dir** _DIR_
> Write `export.json` (usage, cost, outcome) and a copy of the session journal to _DIR_.

**--system-prompt-file** _PATH_
> Replace Vibe's own system prompt instructions with the file's text (headless mode only).

**--enabled-tools** _TOOL_
> Enable specific tools; in headless mode all others are disabled. Repeatable; supports globs and `re:` regexes.

**--disabled-tools** _TOOL_
> Disable specific tools after **--enabled-tools** filtering. Repeatable.

**--workdir** _PATH_
> Change to this directory before running.

**--add-dir** _PATH_
> Grant file access to an additional directory. Repeatable.

**--trust**
> Trust the working directory for this invocation only.

**--worktree** [_NAME_]
> Run inside a git worktree under `$VIBE_HOME/worktrees`, creating or reusing branch _NAME_.

**--setup**
> Set up the API key and exit.

**--check-upgrade**, **update**
> Check for a Vibe update now and prompt to install it.

**-v**, **--version**
> Show version and exit.

# INTERACTIVE CONTROLS

**Ctrl+J**, **Alt+Enter**, or **Shift+Enter**
> Insert newline for multi-line input.

**Escape**
> Interrupt the current operation; press twice to rewind to a previous message.

**Ctrl+G**
> Edit the current input in an external editor.

**Ctrl+O**
> Toggle the tool output view.

**Ctrl+R**
> Search prompt history.

**Ctrl+T**
> Start or stop voice recording when voice mode is on.

**Alt+\\**
> Toggle the todo list panel.

**Shift+Tab**
> Cycle through agents (approval modes).

**@**_filename_
> Autocomplete file paths in prompts.

**!**_command_
> Execute shell commands directly, bypassing the agent.

**/**_command_
> Run a built-in or custom slash command (e.g. `/help`, `/model`, `/compact`, `/resume`, `/mcp`).

# BUILT-IN TOOLS

**read_file**, **write_file**, **edit**
> File operations for reading, writing, and modifying code

**bash**
> Terminal command execution

**grep**
> Code search with ripgrep support

**web_fetch**, **web_search**
> Fetch pages and search the web

**todo**, **task**, **ask_user_question**
> Task tracking, subagents, and clarifying questions

# DESCRIPTION

**Mistral Vibe** is an open-source command-line coding agent from Mistral AI, originally launched with Devstral 2, Mistral's 123B-parameter coding model with a 256K context window. It reads your code, edits files, and runs commands using natural language, asking for approval before risky actions.

The tool provides project-aware context by scanning your file structure, Git status, and **AGENTS.md** files. Features include smart file references with @ autocomplete, shell command execution with !, slash commands, skills, MCP servers, subagents, and git worktree sessions. It supports the Agent Client Protocol (ACP) for IDE integration via the **vibe-acp** entry point.

Vibe runs in interactive mode by default. Headless mode (**-p**) enables scripting and automation workflows; commands the agent runs see `VIBE_SESSION=1` in their environment.

# CONFIGURATION

**~/.vibe/config.toml**
> User configuration (active model, default agent and approval policy, telemetry, theme). A project-level `.vibe/config.toml` is used in trusted folders.

**~/.vibe/agents/**_NAME_**.toml**
> Custom agent profiles with tool permissions and allowlists.

# CAVEATS

Requires signing in with a Mistral account or a Mistral API key (**MISTRAL_API_KEY**, or stored under **~/.vibe**; override the config home with **VIBE_HOME**). Install via `curl -LsSf https://mistral.ai/vibe/install.sh | bash` or `uv tool install --python 3.14 mistral-vibe`; Python 3.12 or later is required. Auto-approve mode executes commands without confirmation and can be destructive. Telemetry is on by default; set `enable_telemetry = false` in config.toml to disable it.

# HISTORY

Mistral Vibe CLI was announced by **Mistral AI** on **December 9, 2025** alongside Devstral 2. It is released under the Apache 2.0 license and was originally written in Python; the interactive terminal UI has since been rewritten in **Rust**, launched through the Python package. The project does not accept external pull requests.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [gemini](/man/gemini)(1), [aider](/man/aider)(1)

# RESOURCES

```[Source code](https://github.com/mistralai/mistral-vibe)```

```[Homepage](https://mistral.ai/products/vibe)```

```[Documentation](https://docs.mistral.ai/vibe/code/overview)```

<!-- verified: 2026-11-23 -->
