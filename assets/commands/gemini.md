# TAGLINE

AI-powered agentic coding assistant from Google

# TLDR

**Start an interactive session**

```gemini```

**Run a prompt non-interactively** (headless mode)

```gemini -p "[explain this code]"```

**Use a specific model**

```gemini -m [flash]```

**Start interactive session** with initial prompt

```gemini -i "[explain this code]"```

**Get JSON output for scripting**

```gemini -p "[prompt]" --output-format json```

**Resume the most recent session**

```gemini -r latest```

**Run with sandbox mode enabled**

```gemini --sandbox```

**Include a file in the conversation**

```gemini -i "@[path/to/file.py] [explain this code]"```

**Pipe content into a prompt**

```cat [logs.txt] | gemini -p "[summarize this]"```

**Add an MCP server**

```gemini mcp add [name] [command]```

# SYNOPSIS

**gemini** [_options_] [_prompt_]

**gemini** _extensions|mcp|skills|update_ [_args_]

# PARAMETERS

_PROMPT_
> Positional prompt. Defaults to interactive mode in a terminal; use **-p** for non-interactive runs.

**-p**, **--prompt** _PROMPT_
> Run in headless (non-interactive) mode with the given prompt. Appended to stdin input if provided.

**-i**, **--prompt-interactive** _PROMPT_
> Execute the prompt and continue in interactive mode.

**-m**, **--model** _MODEL_
> Model alias (auto, pro, flash, flash-lite) or concrete model name (default: auto).

**-o**, **--output-format** _FORMAT_
> Output format: text, json, or stream-json.

**-r**, **--resume** _SESSION_
> Resume a previous session, by **latest**, index number, or ID.

**--list-sessions**
> List available sessions for the current project and exit.

**--delete-session** _INDEX_
> Delete a session by index number.

**-s**, **--sandbox**
> Run in a sandboxed environment for safer execution.

**--approval-mode** _MODE_
> Tool approval mode: default, auto_edit, yolo, or plan.

**-y**, **--yolo**
> Deprecated. Auto-approve all actions; use **--approval-mode=yolo**.

**-w**, **--worktree** [_NAME_]
> Start in a new git worktree (requires the experimental.worktrees setting).

**--include-directories** _DIRS_
> Additional directories to include in the workspace.

**-e**, **--extensions** _NAMES_
> Extensions to use (default: all enabled).

**-l**, **--list-extensions**
> List available extensions and exit.

**--allowed-mcp-server-names** _NAMES_
> Allowed MCP server names.

**--skip-trust**
> Trust the current workspace for this session, skipping the folder trust check.

**--screen-reader**
> Enable screen reader mode.

**-d**, **--debug**
> Enable debug mode with verbose logging.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Show version number.

# IN-CHAT COMMANDS

**/model**
> Select a different Gemini model

**/clear**
> Clear the screen and conversation context, starting a new session

**/resume**
> Browse and resume previous conversations

**/stats**
> Show session usage statistics

**/compress**
> Summarize chat context to save tokens

**/memory show**
> Display the loaded GEMINI.md memory

**/memory refresh**
> Reload memory from GEMINI.md files

**/tools**
> List available tools

**/mcp list**
> Show configured MCP servers and tools

**/quit**
> Exit the CLI

**@**_path_
> Include file or directory content in prompt

**!**_command_
> Execute a shell command

# DESCRIPTION

**Gemini CLI** is Google's open-source AI agent that brings Gemini into the terminal. It enables developers to write, refactor, and debug code, execute commands, and analyze entire repositories using natural language.

Built-in tools include Google Search grounding, file operations, shell commands, and web fetching. It supports MCP (Model Context Protocol) servers for custom integrations, plus extensions and skills managed with the matching subcommands.

The CLI is now positioned for enterprise use with Gemini Code Assist Standard or Enterprise licenses on Google Cloud, plus legacy paid API and Vertex AI keys.

# CONFIGURATION

**GEMINI.md**
> Project-specific instructions and context loaded from the working directory and parent directories.

**~/.gemini/settings.json**
> User settings. A project can override them in **.gemini/settings.json**.

# CAVEATS

Since **June 18, 2026**, free individual access and Google AI Pro and Ultra plans no longer work with Gemini CLI; those users moved to **Antigravity CLI** (**agy**). The upstream README also states it is not tuned for the Gemini 4 series. An API key can be set via the **GEMINI_API_KEY** environment variable. Shell commands and file modifications can be dangerous; **--sandbox** uses macOS Seatbelt or a container such as Docker or Podman.

# HISTORY

Gemini CLI was launched by **Google** on **June 25, 2025** as an open-source tool under the Apache 2.0 license. In **June 2026**, Google moved individual users to Antigravity CLI and refocused Gemini CLI on enterprise Code Assist workflows.

# SEE ALSO

[claude](/man/claude)(1), [opencode](/man/opencode)(1), [aider](/man/aider)(1), [gcloud](/man/gcloud)(1)

# RESOURCES

```[Source code](https://github.com/google-gemini/gemini-cli)```

```[Homepage](https://geminicli.com/)```

```[Documentation](https://geminicli.com/docs/)```

<!-- verified: 2026-11-09 -->
