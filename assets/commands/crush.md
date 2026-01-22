# TLDR

**Start an interactive session**

```crush```

**Change to a specific working directory**

```crush --cwd [path/to/project]```

**Skip all permission prompts (use with caution)**

```crush --yolo```

**Enable debug logging**

```crush --debug```

**Use a custom data directory**

```crush --data-dir [path/to/data]```

**View recent logs**

```crush logs```

**Follow logs in real time**

```crush logs --follow```

**Run non-interactively**

```crush run "[fix the bug in main.go]"```

# SYNOPSIS

**crush** [_options_] [_command_]

# PARAMETERS

**--cwd** _PATH_
> Change to a specific directory before starting

**--data-dir** _PATH_
> Override the default data directory location

**--debug**
> Enable debug logging for troubleshooting

**--yolo**
> Skip all permission prompts (dangerous, use with caution)

**--help**
> Display help information

**--version**
> Show version number

# COMMANDS

**run** _PROMPT_
> Run Crush in non-interactive mode with a prompt

**logs**
> Print the last 1000 lines of logs

**logs --tail** _N_
> Print the last N lines of logs

**logs --follow**
> Follow logs in real time

# DESCRIPTION

**Crush** is a glamorous AI coding agent for your terminal, developed by Charmbracelet. Built in Go for speed and efficiency, it provides a terminal user interface (TUI) for interacting with various AI models to help with coding tasks, debugging, and file operations.

Crush supports multiple AI providers including OpenAI, Anthropic, Google Gemini, Groq, OpenRouter, AWS Bedrock, and local models via Ollama and LM Studio. It uses Language Server Protocol (LSP) for enhanced code context and is extensible via Model Context Protocol (MCP) servers with stdio, http, and sse transports.

The tool offers excellent cross-platform compatibility, supporting macOS, Linux, Windows (PowerShell and WSL), FreeBSD, OpenBSD, and NetBSD. Configuration is stored in JSON files with settings for providers, LSP, MCP servers, and permissions.

# CAVEATS

Requires API keys from supported providers set via environment variables (ANTHROPIC_API_KEY, OPENAI_API_KEY, etc.) or configured in crush.json. The **--yolo** flag bypasses all permission prompts and should be used with extreme caution. Debug mode with **--debug** generates verbose logging.

# HISTORY

Crush was developed by **Charmbracelet**, a company known for creating engaging terminal applications. It was previously known as OpenCode AI before being renamed to Crush. The project is released under the FSL-1.1-MIT license (MIT-compatible) and has gained over 8,900 GitHub stars. Version 0.4.0 was released in August 2025.

# SEE ALSO

[claude](/man/claude)(1), [opencode](/man/opencode)(1), [aider](/man/aider)(1), [codex](/man/codex)(1)
