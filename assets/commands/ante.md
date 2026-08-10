# TAGLINE

Self-contained terminal coding agent with multi-provider and offline support

# TLDR

**Launch interactive terminal UI**

```ante```

**Run a one-shot headless task**

```ante -p "[add error handling to src/main.rs]"```

**Pipe a diff for review**

```git diff | ante -p "[review this for security issues]"```

**Use a specific provider and model**

```ante --provider [openai] --model [gpt-5.5] -p "[refactor the database module]"```

**Run fully offline with a local GGUF model**

```ante --offline-model [~/.ante/models/model.gguf] -p "[add tests]"```

**Resume a saved session**

```ante --resume [ses_...] -p "[now add tests]"```

**Update to the latest release**

```ante update```

# SYNOPSIS

**ante** [_options_] [**-p** _prompt_]

**ante** **serve**

**ante** **gateway**

**ante** **update** [_options_]

# PARAMETERS

**-p**, **--prompt** _PROMPT_
> Run in headless mode with the given prompt and exit when done

**-m**, **--model** _MODEL_
> Override the model name

**--provider** _PROVIDER_
> Override the API provider (for example anthropic, openai, gemini, xai, openrouter, local)

**--profile** _NAME_
> Use **~/.ante/**_NAME_**.settings.json** instead of the default settings; **ANTE_PROFILE** is equivalent

**--effort** _LEVEL_
> Override model effort: min, low, medium, high, xhigh, or max

**--yolo**
> Skip all interactive tool approval prompts

**--output-format** _FORMAT_
> Headless output format: json, human, or minimal (default: minimal)

**--offline-model** _PATH_
> Path to a local GGUF model file; boots built-in local inference and uses the local provider

**-r**, **--resume** _SESSION_ID_
> Resume a previously saved session by ID

**--no-session-save**
> Do not persist a transcript or resumable snapshot

**--check**
> After the main task, run a verification pass on the work

**--system-prompt** _PROMPT_
> Replace the default system prompt entirely

**--system-prompt-file** _PATH_
> Read a replacement system prompt from a UTF-8 file

**--append-system-prompt** _TEXT_
> Append text to the system prompt

**--no-skills**
> Skip skill discovery; no skills are advertised or invocable

**--tools** _TOOLS_...
> Replace the default tool set with exactly these tools

**--include-tools** _TOOLS_...
> Add tools on top of the default or **--tools** set

**--exclude-tools** _TOOLS_...
> Remove tools after **--tools** and **--include-tools**

# COMMANDS

**serve**
> Run as a long-lived daemon over a structured JSONL protocol for editor plugins and integrations

**gateway**
> Run Ante as a Slack or Discord bot

**update**
> Install the latest release; supports **--channel** and **--version**

# DESCRIPTION

**ante** is a self-contained coding agent from Antigma Labs that runs in the terminal. It is distributed as a single Rust binary (~15MB) with no runtime language dependencies. Day-to-day use is an interactive TUI (**ante** with no arguments); headless one-shots use **-p** / **--prompt**.

It works with many cloud providers (Anthropic, OpenAI, Gemini, Grok/xAI, Open Router, and OpenAI-compatible endpoints) via API keys or OAuth, and can also run fully offline against a local GGUF model through a built-in inference engine. Configuration lives under **~/.ante/** (settings, catalog, and optional named profiles).

Subcommands cover programmatic embedding (**ante serve**), chat-platform bots (**ante gateway**), and self-updates (**ante update**). Features include multi-agent orchestration, skills, MCP servers, and persistent memory across sessions.

# CAVEATS

Ante is in alpha/preview: expect breaking changes and incomplete functionality. Official support is macOS and Linux (Windows users are directed to WSL). Headless mode implies auto-approval of tool calls (yolo). Cloud providers need credentials (for example **ANTHROPIC_API_KEY**, **OPENAI_API_KEY**); offline mode needs a local GGUF. The prebuilt binary is free to use during the alpha under separate binary terms; open-source parts of the repository are Apache-2.0. Install via the official script (**curl -fsSL https://ante.run/install.sh | bash**); distro packages named **ante** are typically a different project (the Ante programming language).

# CONFIGURATION

Default settings: **~/.ante/settings.json**

Named profiles: **~/.ante/**_name_**.settings.json** (select with **--profile** or **ANTE_PROFILE**)

Provider/model catalog overrides: **~/.ante/catalog.json**

Binary install location defaults to **~/.ante/bin** (override with **ANTE_INSTALL_DIR** during install)

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [opencode](/man/opencode)(1), [aider](/man/aider)(1), [goose](/man/goose)(1)

# RESOURCES

```[Source code](https://github.com/AntigmaLabs/ante)```

```[Homepage](https://antigma.ai)```

```[Documentation](https://docs.antigma.ai)```

<!-- verified: 2026-08-10 -->
