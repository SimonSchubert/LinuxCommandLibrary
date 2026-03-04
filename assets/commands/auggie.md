# TAGLINE

AI-powered agentic coding CLI from Augment Code

# TLDR

**Start an interactive session** in the current directory

```auggie```

**Start with an initial prompt**

```auggie "[prompt]"```

**Run a one-off command** and print to stdout

```auggie --print "[prompt]"```

**Continue the most recent** conversation

```auggie --continue```

**Resume a specific session** by ID

```auggie --resume [session_id]```

**Use a specific model**

```auggie --model [sonnet4.5]```

**Pipe input** and run non-interactively

```cat [file.txt] | auggie --print "[analyze this code]"```

**Disable a specific tool** for the session

```auggie --remove-tool [web-fetch]```

# SYNOPSIS

**auggie** [_options_] [_prompt_]

**auggie** **login** | **logout**

**auggie** **models** **list**

**auggie** **session** **list** | **continue** | **resume** [_id_] | **share**

**auggie** **mcp** **add** | **add-json** | **list** | **remove**

**auggie** **tools** **list** | **add** | **remove**

**auggie** **rules** **list**

**auggie** **command** [_command-name_] | **help**

**auggie** **plugin** **marketplace** **add** | **list** | **update** | **remove**

**auggie** **plugin** **list** | **enable** | **disable** | **reload**

# PARAMETERS

**--print**, **-p**
> Run the prompt once and print the result to stdout, then exit. Useful for CI/CD pipelines and scripted automation.

**--quiet**
> Return only the final output, suppressing intermediate messages and progress indicators.

**--compact**
> Output tool calls, results, and response as single lines.

**--output-format** _FORMAT_
> Output format for print mode (e.g., json).

**--continue**, **-c**
> Resume the most recent conversation session.

**--resume** _ID_
> Resume a specific session by ID or ID prefix.

**-f**
> Filter session list to the current workspace only.

**--dont-save-session**
> Skip saving conversation history for this session.

**--delete-saved-sessions**
> Remove all saved sessions.

**--model** _NAME_
> Select the model to use. Short names are supported (e.g., sonnet4.5).

**--instruction** _TEXT_
> Provide an initial instruction for interactive mode.

**--instruction-file** _PATH_
> Load the initial instruction from a file.

**--workspace-root** _PATH_
> Set the workspace root directory.

**--rules** _PATH_
> Append additional rules from a file.

**--remove-tool** _NAME_
> Disable a specific tool for the session. Can be repeated.

**--permission** _SETTING_
> Configure tool permissions at runtime.

**--max-turns** _N_
> Cap the number of agent iterations in print mode.

**--enhance-prompt**
> Improve prompts automatically before sending to the agent (non-interactive mode).

**--image** _PATH_
> Attach an image to the prompt.

**--shell** _SHELL_
> Set the shell to use for command execution.

**--startup-script** _PATH_
> Specify a shell startup script.

**--mcp**
> Run auggie as an MCP tool server.

**--mcp-config** _PATH_
> Load MCP server configuration from a JSON file or inline JSON string.

**--mcp-auto-workspace**
> Enable automatic workspace discovery in MCP mode.

**-w** _PATH_
> Specify a workspace directory to pre-index.

**--log-file** _PATH_
> Enable error logging to a file in MCP mode (default: /tmp/augment-log.txt).

**--acp**
> Enable Agent Client Protocol support for external editor integration.

**--allow-indexing**
> Allow codebase indexing in ACP mode.

**--augment-session-json** _JSON_
> Provide authentication session as JSON.

**--help**, **-h**
> Show help information.

**--version**
> Display the installed version.

# DESCRIPTION

**auggie** is a terminal-based AI coding agent built by Augment Code. It uses Augment's Context Engine for deep semantic understanding of codebases, going beyond simple text matching to comprehend project structure, dependencies, and relationships across large repositories.

The tool operates in two primary modes. Interactive mode provides a full TUI with real-time streaming, visual progress indicators, vim-style keybindings, and observable tool execution. Non-interactive mode (--print) enables scripted automation for CI/CD pipelines, code review workflows, and headless environments.

auggie supports sub-agents for specialized tasks such as security audits, test writing, and data analysis, and can execute multiple agents in parallel. Sessions are persistent and resumable, allowing conversations to be continued across terminal sessions or shared with teammates via the /share command.

The CLI integrates with Model Context Protocol (MCP) servers for extended capabilities including GitHub, Linear, and Jira connectivity. It can also run as an MCP server itself, enabling integration with other tools. Multiple AI models are supported, and users can switch between them using the --model flag or the Option+M hotkey in the TUI.

Custom slash commands can be defined as markdown files in .augment/commands/ or ~/.augment/commands/ directories, enabling reusable prompts for tasks like code review, bug fixing, and security analysis. User-specific rules in ~/.augment/rules/ and workspace rules customize agent behavior per project.

The plugin system allows extending functionality through marketplaces, and an agent skills framework loads specialized domain knowledge from SKILL.md files following the agentskills.io specification.

# CONFIGURATION

**~/.augment/settings.json**
> Global user settings including MCP server configuration, tool permissions, model preferences, auto-update behavior, and default shell.

**.augment/commands/**
> Project-level custom slash commands as markdown files with frontmatter.

**~/.augment/commands/**
> User-level custom slash commands available across all projects.

**~/.augment/rules/**
> User-specific rules for customizing agent behavior globally.

**.augment/.agents/**
> Directory for skill and agent discovery using SKILL.md and AGENTS.md files.

# CAVEATS

Requires Node.js 22 or higher. Authentication via auggie login is mandatory before first use, and an active Augment subscription is required to use the tool. The CLI auto-updates by default; this can be disabled via the autoUpdate setting or the AUGMENT_DISABLE_AUTO_UPDATE environment variable. The software is proprietary and licensed under a custom license from Augment Computing, Inc.

# HISTORY

**auggie** was announced by **Augment Code** on **July 31, 2025** and launched in beta, with enterprise customers receiving immediate access and a phased rollout to teams and individuals. The GitHub repository was created in **September 2025**. By version **0.7.0**, the CLI dropped its beta label and reached general availability. Development has been rapid, with features like MCP server support, Agent Client Protocol integration, session sharing, parallel tool calls, plugin marketplaces, and agent skills added across frequent releases. The tool is part of Augment Code's broader platform that also includes VS Code and JetBrains IDE extensions.

# SEE ALSO

[claude](/man/claude)(1), [copilot](/man/copilot)(1), [aider](/man/aider)(1), [codex](/man/codex)(1), [opencode](/man/opencode)(1), [grok](/man/grok)(1)
