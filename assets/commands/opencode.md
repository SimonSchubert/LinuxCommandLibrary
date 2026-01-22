# TLDR

**Launch the interactive TUI**

```opencode```

**Open a specific project directory**

```opencode [path/to/project]```

**Run a prompt non-interactively**

```opencode run "[fix the bug in main.go]"```

**Use a specific model**

```opencode --model [anthropic/claude-sonnet-4]```

**Continue the last session**

```opencode --continue```

**Resume a specific session**

```opencode --session [session_id]```

**Start the web interface**

```opencode web```

**List available models**

```opencode models```

# SYNOPSIS

**opencode** [_command_] [_options_] [_project_]

# PARAMETERS

**--model**, **-m** _PROVIDER/MODEL_
> Specify the AI model to use (e.g., anthropic/claude-sonnet-4, openai/gpt-4o)

**--continue**, **-c**
> Resume the last session

**--session**, **-s** _ID_
> Continue a specific session by ID

**--prompt** _TEXT_
> Provide an initial prompt when launching

**--agent** _NAME_
> Select a specific agent (build, plan, or custom)

**--port** _NUMBER_
> Server port for web or serve commands

**--help**, **-h**
> Display help information

**--version**, **-v**
> Show version number

# COMMANDS

**run**
> Execute a prompt non-interactively and exit

**serve**
> Start a headless server for API access

**web**
> Launch the web interface with HTTP server

**attach**
> Connect TUI to a remote OpenCode server

**auth login**
> Configure API keys for providers

**models**
> Display all available models across configured providers

**session list**
> Show all saved sessions

**stats**
> View token usage and cost analytics

**mcp add**
> Register an MCP (Model Context Protocol) server

# DESCRIPTION

**OpenCode** is an open-source AI coding agent that runs in your terminal, desktop, or IDE. It provides Claude-Code-level capabilities without locking you to a single model or platform, supporting over 75 AI models including Claude, GPT, Gemini, and local models.

The default TUI mode offers an interactive chat interface with two built-in agents: **build** (full access for development) and **plan** (read-only for analysis). Switch between them with the Tab key. OpenCode integrates with Language Server Protocol for code intelligence and connects to your GitHub workflow for CI/CD automation.

Unlike cloud-based assistants, OpenCode gives you control over your data. You choose the model provider and what gets shared. Running a local model keeps your entire workflow private.

# CAVEATS

Requires API keys for cloud model providers (configured via **opencode auth login**). Token usage can be significant for large codebases. The tool defaults to launching a TUI which requires a compatible terminal emulator.

# HISTORY

OpenCode was created by **Jay V**, **Frank Wang**, **Dax Raad**, and **Adam Elmore** from the team behind SST (Serverless Stack). It launched on **June 19, 2024** in response to the rise of proprietary AI coding assistants. The project grew to **650,000 monthly users** within five months and has over **70,000 GitHub stars**. It is released under the MIT license.

# SEE ALSO

[aider](/man/aider)(1), [claude](/man/claude)(1), [copilot](/man/copilot)(1)
