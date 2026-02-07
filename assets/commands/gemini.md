# TAGLINE

AI-powered agentic coding assistant from Google

# TLDR

**Start an interactive session**

```gemini```

**Run a prompt non-interactively**

```gemini -p "[explain this code]"```

**Use a specific model**

```gemini -m [gemini-2.5-flash]```

**Get JSON output for scripting**

```gemini -p "[prompt]" --output-format json```

**Run with sandbox mode enabled**

```gemini --sandbox```

**Include a file in the conversation**

```gemini``` then ```@[path/to/file.py] [explain this code]```

**Execute a shell command from within**

```gemini``` then ```![ls -la]```

# SYNOPSIS

**gemini** [_options_] [_prompt_]

# PARAMETERS

**-p** _PROMPT_
> Run in non-interactive mode with the given prompt

**-m** _MODEL_
> Specify model variant (gemini-2.5-pro, gemini-2.5-flash, gemini-3-pro)

**--output-format** _FORMAT_
> Output format: text, json, or stream-json

**--sandbox**, **-s**
> Run in sandboxed Docker environment for safety

**--yolo**
> Auto-approve all actions (enables sandbox by default)

**--help**
> Display help information

**--version**
> Show version number

# IN-CHAT COMMANDS

**/model**
> Select a different Gemini model

**/clear**
> Clear terminal screen and scrollback

**/resume**
> Browse and resume previous conversations

**/stats**
> Show token usage and session duration

**/compress**
> Summarize chat context to save tokens

**/memory add** _text_
> Add text to AI's instructional memory

**/tools**
> List available tools

**/mcp list**
> Show connected MCP servers

**/quit**
> Exit the CLI

**@**_path_
> Include file or directory content in prompt

**!**_command_
> Execute a shell command

# CONFIGURATION

**GEMINI.md**
> Project-specific instructions and context loaded from the working directory.

**~/.config/gemini/config.json**
> User configuration for API keys, default models, and preferences.

# DESCRIPTION

**Gemini CLI** is Google's open-source AI agent that brings the power of Gemini directly into your terminal. It enables developers to write, refactor, and debug code, execute commands, and analyze entire repositories using natural language.

The CLI uses a reason and act (ReAct) loop with built-in tools including Google Search grounding, file operations, shell commands, and web fetching. It supports MCP (Model Context Protocol) for custom integrations and can be configured with project-specific instructions via GEMINI.md files.

Free tier users get 60 requests per minute and 1,000 requests per day with a personal Google account, accessing models with a 1 million token context window. The tool works across macOS, Linux, and Windows.

# CAVEATS

Requires authentication with a Google account or API key (set via **GEMINI_API_KEY** environment variable). Shell commands and file modifications can be dangerous; use **--sandbox** mode for untrusted operations. Token usage can be significant for large codebases.

# HISTORY

Gemini CLI was launched by **Google** on **June 25, 2025** as an open-source tool under the Apache 2.0 license. It was built on the Gemini 2.5 Pro model and introduced alongside a new Gemini logo. By December 2025, free tier users gained access to Gemini 3 Pro and Flash models.

# SEE ALSO

[claude](/man/claude)(1), [opencode](/man/opencode)(1), [aider](/man/aider)(1), [gcloud](/man/gcloud)(1)
