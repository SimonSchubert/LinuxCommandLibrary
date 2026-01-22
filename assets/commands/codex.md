# TLDR

**Launch interactive terminal UI**

```codex```

**Start with an initial prompt**

```codex "[fix the authentication bug]"```

**Run non-interactively and output results**

```codex exec "[refactor this function]"```

**Use a specific model**

```codex --model [gpt-5.2-codex]```

**Enable full auto mode for unattended work**

```codex --full-auto```

**Continue a previous session**

```codex resume --last```

**Attach an image for context**

```codex -i [screenshot.png] "[fix this UI bug]"```

# SYNOPSIS

**codex** [_options_] [_prompt_]

# PARAMETERS

**--model**, **-m** _MODEL_
> Override the default model (e.g., gpt-5.2-codex, codex-mini-latest)

**--sandbox**, **-s** _POLICY_
> Sandbox policy: read-only, workspace-write, or danger-full-access

**--ask-for-approval**, **-a** _MODE_
> Control approval timing: untrusted, on-failure, on-request, or never

**--full-auto**
> Enable low-friction mode with on-request approvals and workspace-write sandbox

**--yolo**
> Disable approvals and sandboxing (use only in hardened environments)

**--cd**, **-C** _PATH_
> Set working directory before processing

**--add-dir** _PATH_
> Grant additional directories write access

**--image**, **-i** _PATH_
> Attach image files to the initial prompt

**--oss**
> Use local open-source model via Ollama

**--search**
> Enable web search capability

**--profile**, **-p** _NAME_
> Load configuration profile from config.toml

**--help**
> Display help information

# COMMANDS

**exec**, **e**
> Run non-interactively; supports --json, --output-last-message

**resume**
> Continue a previous session by ID or use --last

**fork**
> Branch a previous session into a new thread

**apply**, **a**
> Apply latest diff from Codex Cloud task to local repository

**cloud**
> Browse or execute cloud tasks

**login**
> Authenticate via ChatGPT OAuth or API key

**logout**
> Remove stored credentials

**mcp**
> Manage Model Context Protocol servers (add, list, remove)

**sandbox**
> Run commands under macOS seatbelt or Linux Landlock sandboxing

**completion**
> Generate shell completions (bash, zsh, fish, powershell)

# DESCRIPTION

**Codex** is OpenAI's official terminal-based coding agent. It launches into a full-screen terminal UI that can read your repository, suggest and implement code changes, and execute commands while you iterate conversationally.

The tool maintains security through OS-level sandboxing with three safety modes: **read-only** (consultative, no changes), **auto** (default, asks before touching files outside workspace), and **full access** (unrestricted, use with caution). Model-generated commands run in isolated environments using macOS seatbelt or Linux Landlock.

Codex integrates with ChatGPT Plus, Pro, Business, and Enterprise subscriptions, or can be used with API credits. It supports cloud tasks for offloading complex work and provides MCP integration for extended capabilities.

# CAVEATS

Requires authentication with a ChatGPT account or OpenAI API key. The **--yolo** flag bypasses all safety measures and should only be used in isolated environments. Network access is restricted by default; enable with **--search** or full-access sandbox mode.

# HISTORY

OpenAI originally launched Codex as a code autocompletion API in **August 2021**, which powered GitHub Copilot. The **Codex CLI** terminal agent was released on **April 16, 2025** under the Apache 2.0 license, with version 1.0.0 shipping in **May 2025**. Codex Cloud launched in **June 2025** for ChatGPT Plus users. The GPT-5.2-Codex model was released in **December 2025** with enhanced agentic coding capabilities.

# SEE ALSO

[claude](/man/claude)(1), [gemini](/man/gemini)(1), [opencode](/man/opencode)(1), [copilot](/man/copilot)(1)
