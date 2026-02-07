# TAGLINE

AI-powered terminal coding assistant

# TLDR

**Start an interactive session** in the current directory

```copilot```

**Start with an initial prompt**

```copilot "[prompt]"```

**Run a one-off command** and exit (non-interactive)

```copilot -p "[prompt]"```

**Continue the most recent** conversation

```copilot --continue```

**Resume a specific session** by ID

```copilot --resume```

**Reference specific files** in your prompt

```copilot "Explain @[path/to/file.js]"```

**Run shell commands directly** without model calls

```copilot "![git status]"```

# SYNOPSIS

**copilot** [_options_] [_prompt_]

# PARAMETERS

**-p**, **--prompt**
> Print mode: process prompt and exit without interactive session.

**--continue**
> Continue the most recently closed local session.

**--resume**
> Cycle through and resume local and remote interactive sessions.

**--allow-all-paths**
> Disable path verification for shell commands.

**--allow-all-urls**
> Disable URL verification for external access.

**--allow-url** _domain_
> Pre-approve specific domains for web access (e.g., --allow-url github.com).

**--agent** _agent-name_
> Specify a custom agent to use for the session.

# SLASH COMMANDS

**/login**
> Authenticate to GitHub.

**/add-dir** _path_
> Add a trusted directory manually.

**/cwd** _path_
> Switch working directory without ending session.

**/delegate** _prompt_
> Hand off current session to Copilot coding agent on GitHub.

**/agent**
> Select from available custom agents.

**/model**
> Choose from available models (Claude Sonnet 4.5, Claude Sonnet 4, GPT-5, GPT-5 mini, GPT-4.1).

**/mcp add**
> Add a new MCP server.

**/usage**
> View session statistics and token usage breakdown.

**/context**
> Display visual overview of current token usage.

**/compact**
> Manually compress conversation history.

**/feedback**
> Submit feedback, bug reports, or feature suggestions.

**?**
> Display available commands and options.

# DESCRIPTION

**GitHub Copilot CLI** brings AI-powered coding assistance directly to your terminal, enabling natural language conversations to build, debug, and understand code. It operates as an agentic coding assistant that can read, write, and execute code in your development environment.

The tool works in two main modes: interactive mode for extended sessions with ongoing dialogue, and programmatic mode (-p) for scripted automation and one-off commands. Copilot can navigate codebases, edit files, run shell commands, and perform complex multi-step development tasks.

Special syntax includes **@** for file references (e.g., @src/app.js) and **!** for direct shell command execution without model calls. The CLI supports tab completion for paths and maintains conversation history across sessions.

# CAVEATS

Requires an active **GitHub Copilot subscription**. Organization or enterprise administrators can disable Copilot CLI access. The **--allow-all-paths** and **--allow-all-urls** flags bypass safety prompts and should be used cautiously. Native Windows support in PowerShell is experimental; WSL is recommended.

# HISTORY

GitHub Copilot CLI was released by **GitHub** in **2024** as an extension of their Copilot AI assistant. Originally launched as a shell command suggestion tool, it evolved into a full agentic coding assistant in **2025**. By **January 2026**, it added enhanced agents, context management, MCP server integration, and expanded model selection including GPT-5 and Claude Sonnet 4.5.

# SEE ALSO

[gh](/man/gh)(1), [claude](/man/claude)(1), [git](/man/git)(1)
