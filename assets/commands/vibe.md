# TAGLINE

Mistral AI command-line coding assistant

# TLDR

**Start an interactive session**

```vibe```

**Start with an initial prompt**

```vibe "[refactor the main function to be more modular]"```

**Run non-interactively for scripting**

```vibe --prompt "[add unit tests for the auth module]"```

**Auto-approve all tool executions**

```vibe --auto-approve```

**Use a custom agent configuration**

```vibe --agent [my_custom_agent]```

**Resume the most recent session**

```vibe --continue```

**Resume a specific session**

```vibe --resume [session_id]```

**Limit turns and cost in non-interactive mode**

```vibe --prompt "[fix lint errors]" --max-turns [10] --max-price [2.50]```

**Reference a file in prompt**

```vibe``` then ```@[path/to/file.py] [explain this code]```

**Execute a shell command directly**

```vibe``` then ```![ls -la]```

# SYNOPSIS

**vibe** [_options_] [_prompt_]

# PARAMETERS

**--prompt** _TEXT_
> Run non-interactively with the provided prompt (auto-approve enabled by default).

**--auto-approve**
> Automatically approve all tool executions without prompting.

**--agent** _NAME_
> Select an agent profile (built-ins: default, plan, accept-edits, auto-approve) or load a custom TOML from the agents directory.

**-c**, **--continue**
> Resume the most recent session.

**--resume** _SESSION_ID_
> Resume a specific session by ID.

**--max-turns** _N_
> Limit the number of assistant turns in non-interactive mode.

**--max-price** _DOLLARS_
> Abort the session if cost exceeds the specified dollar amount.

**--enabled-tools** _TOOL_
> Restrict which built-in tools are available (supports glob patterns).

**--output** _FORMAT_
> Output format: `text`, `json`, or `stream`.

**--workdir** _PATH_
> Set the working directory for the session.

**--setup**
> Run interactive API key configuration.

# INTERACTIVE CONTROLS

**Ctrl+J** or **Shift+Enter**
> Insert newline for multi-line input.

**Ctrl+G**
> Edit the current input in an external editor.

**Ctrl+O**
> Toggle the tool output view.

**Ctrl+T**
> Toggle the todo list view.

**Ctrl+R**
> Start voice recording (Escape to cancel).

**Shift+Tab**
> Toggle auto-approve mode on/off.

**@**_filename_
> Autocomplete file paths in prompts.

**!**_command_
> Execute shell commands directly, bypassing the agent.

**/**_command_
> Run a built-in or custom slash command (e.g. `/help`).

# BUILT-IN TOOLS

**read_file**, **write_file**, **search_replace**
> File operations for reading, writing, and modifying code

**bash**
> Stateful terminal for command execution

**grep**
> Code search with ripgrep support

**todo**
> Task tracking and list management

# DESCRIPTION

**Mistral Vibe CLI** is an open-source command-line coding assistant powered by Devstral 2, Mistral's 123B-parameter coding model with a 256K context window. It explores, modifies, and executes changes across your codebase using natural language.

The tool provides project-aware context by automatically scanning your file structure and Git status. Features include smart file references with @ autocomplete, shell command execution with !, and multi-file orchestration that understands your entire codebase. It supports the Agent Communication Protocol (ACP) for IDE integration.

Vibe runs in interactive chat mode by default, offering a conversational AI agent that breaks down complex tasks into actionable steps. Non-interactive mode enables scripting and automation workflows.

# CAVEATS

Requires a Mistral API key set via **MISTRAL_API_KEY** environment variable or stored in **~/.vibe/.env** (override the config home with **VIBE_HOME**). Install via `curl -LsSf https://mistral.ai/vibe/install.sh | bash`, `uv tool install mistral-vibe`, or `pip install mistral-vibe`. Linux and macOS are the primary platforms; Windows is supported but secondary. Auto-approve mode executes commands without confirmation and can be destructive — prefer the **plan** agent for review-first workflows.

# HISTORY

Mistral Vibe CLI was announced by **Mistral AI** on **December 9, 2025** alongside Devstral 2. It is released under the Apache 2.0 license and built in Python. Mistral offered free API access to Devstral 2 through December 2025, with pricing beginning January 2026. The tool integrates with the Zed IDE as an extension.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [gemini](/man/gemini)(1), [aider](/man/aider)(1)
