# TAGLINE

AI-powered agentic coding assistant from Alibaba

# TLDR

**Start an interactive session**

```qwen```

**Run in headless mode with a prompt**

```qwen -p "[explain this codebase]"```

**Reference a local file in your query**

```qwen``` then ```@[src/main.ts] [explain this file]```

**Configure authentication**

```qwen``` then ```/auth```

**Show session statistics**

```qwen``` then ```/stats```

**Compress conversation history to save tokens**

```qwen``` then ```/compress```

# SYNOPSIS

**qwen** [_options_]

# PARAMETERS

**-p** _PROMPT_
> Run in headless mode with the provided prompt

# IN-SESSION COMMANDS

**/help**
> Display available commands

**/auth**
> Configure authentication method

**/clear**
> Clear conversation history

**/compress**
> Compress history to save tokens

**/stats**
> Show current session information

**/bug**
> Submit a bug report

**/exit**, **/quit**
> Exit the application

# KEYBOARD SHORTCUTS

**Ctrl+C**
> Cancel current operation

**Ctrl+D**
> Exit on empty line

**Up/Down**
> Navigate command history

**@**_filepath_
> Reference local files in queries

# DESCRIPTION

**Qwen Code** is an open-source AI coding agent for the terminal from Alibaba, optimized for the Qwen3-Coder model. It helps developers understand large codebases, automate tedious work, and ship faster with agentic coding capabilities.

Built in TypeScript and forked from Gemini CLI, it offers a similar experience but is open to any model supporting the OpenAI completions API. Features include Skills, SubAgents, and Plan Mode for full agentic workflows. The tool supports deep code understanding beyond normal context windows and workflow automation for PR handling, rebases, and formatting.

Authentication options include Qwen OAuth (2,000 free requests/day) or OpenAI-compatible APIs. IDE integrations are available for VS Code, Zed, and JetBrains.

# CAVEATS

Requires authentication via Qwen OAuth or OpenAI-compatible API keys. Environment variables **OPENAI_API_KEY**, **OPENAI_BASE_URL**, and **OPENAI_MODEL** can be set for custom providers. Version 0.5.0 supports running four concurrent instances in a single terminal.

# HISTORY

Qwen Code was launched by **Alibaba** in **July 2025** alongside the Qwen3-Coder model. The flagship model is Qwen3-Coder-480B-A35B-Instruct, a 480B-parameter Mixture-of-Experts model with 35B active parameters supporting 256K native context and 1M tokens with extrapolation. The tool is released as open-source on GitHub.

# SEE ALSO

[gemini](/man/gemini)(1), [claude](/man/claude)(1), [opencode](/man/opencode)(1), [aider](/man/aider)(1)
