# TLDR

**Start an interactive session**

```forge```

**Run a direct prompt without interactive mode**

```forge -p "[fix the bug in main.rs]"```

**Execute commands from a file**

```forge -c [commands.txt]```

**Run a workflow**

```forge -w [workflow.yaml]```

**Enable restricted shell mode**

```forge --restricted```

**Configure AI provider credentials**

```forge provider login```

**List configured MCP servers**

```forge mcp list```

# SYNOPSIS

**forge** [_options_]

# PARAMETERS

**-p**, **--prompt** _PROMPT_
> Direct prompt to process without entering interactive mode

**-c**, **--command** _FILE_
> Path to a file containing initial commands to execute

**-w**, **--workflow** _FILE_
> Path to a file containing the workflow to execute

**-e**, **--event** _EVENT_
> Dispatch an event to the workflow

**--conversation** _FILE_
> Path to a file containing a conversation to resume

**-r**, **--restricted**
> Enable restricted shell mode for enhanced security

**--verbose**
> Enable verbose output mode

**-h**, **--help**
> Print help information

**-V**, **--version**
> Print version

# COMMANDS

**provider login**
> Configure AI provider credentials interactively

**provider logout**
> Remove provider credentials

**provider list**
> Show supported AI providers

**mcp list**
> List all configured MCP servers

**mcp add**
> Add a new MCP server interactively

**mcp add-json**
> Add an MCP server using JSON format

**mcp get**
> Get details of a specific MCP server

**mcp remove**
> Remove an MCP server

# DESCRIPTION

**Forge** is an open-source AI coding assistant that works natively inside your terminal. Written in Rust, it integrates seamlessly with your existing shell (bash, zsh, fish) and provides AI-powered code assistance without requiring a separate IDE or GUI.

Forge supports over 300 AI models including Claude, GPT, Gemini, Grok, and DeepSeek. It uses a multi-agent architecture with specialized agents: **Forge** for implementation, **Muse** for planning, **Prime** for documentation review, **Parker** for technical writing, and **Sage** for codebase exploration.

The tool analyzes project files, dependencies, and Git history to provide context-aware suggestions with sub-50ms startup time. All operations run locally, keeping your code on your machine for privacy and security.

# CAVEATS

Requires API keys from supported AI providers, configured via **forge provider login**. The **--restricted** flag limits shell access for enhanced security but reduces functionality. Configuration files include **forge.yaml** for project settings and **.mcp.json** for Model Context Protocol servers.

# HISTORY

Forge was developed by **Antinomy** as an open-source alternative to proprietary AI coding tools like Cursor and Claude Code. It is written in Rust for performance and released under an open-source license. The project is hosted at github.com/antinomyhq/forge.

# SEE ALSO

[claude](/man/claude)(1), [aider](/man/aider)(1), [codex](/man/codex)(1), [opencode](/man/opencode)(1)
