# TAGLINE

Autonomous AI agent runtime built in Rust

# TLDR

**Initialize** configuration with interactive setup wizard

```zeroclaw onboard --interactive```

**Start an interactive** CLI agent session

```zeroclaw agent```

**Send a single message** without entering interactive mode

```zeroclaw agent -m "[message]"```

**Start the full autonomous daemon** with channels and scheduler

```zeroclaw daemon```

**Check system health** and run diagnostics

```zeroclaw doctor```

**List all supported** LLM providers

```zeroclaw providers```

# SYNOPSIS

**zeroclaw** [_command_] [_subcommand_] [_options_]

# PARAMETERS

**onboard**
> Initialize or reconfigure the workspace. Creates **~/.zeroclaw/config.toml** and scaffold files.

**onboard --interactive**
> Run the full 9-step configuration wizard.

**onboard --api-key** _KEY_ **--provider** _PROVIDER_ [**--model** _MODEL_]
> Non-interactive setup with API key and provider in one command.

**onboard --channels-only**
> Repair or reconfigure channels and allowlists only.

**agent** [**-m** _MESSAGE_]
> Run interactive CLI agent or send a single message with **-m**.

**agent --provider** _PROVIDER_
> Override the default provider for this session.

**gateway** [**--port** _PORT_]
> Start the HTTP/WebSocket server for external integrations. Default port: 42617.

**daemon**
> Start the full autonomous runtime with gateway, channels, heartbeat, and scheduler.

**status**
> Display comprehensive system status including provider, memory, channels, and security.

**doctor** [**models** | **traces**]
> Run system diagnostics. Optionally check model catalogs or inspect runtime traces.

**service install** | **start** | **stop** | **status** | **restart**
> Manage zeroclaw as a background system service (systemd or OpenRC).

**channel list** | **doctor** | **start**
> List, health-check, or start configured messaging channels.

**channel add** _TYPE_ _JSON_CONFIG_
> Add a new messaging channel configuration.

**channel bind-telegram** _USER_ID_
> Add a Telegram user to the allowlist.

**auth login** _PROVIDER_ [_PROFILE_]
> Authenticate via OAuth or device code flow.

**auth status** | **logout** _PROFILE_ID_
> Show or remove authentication profiles.

**memory stats** | **list** | **search** _QUERY_ | **delete** _KEY_ | **prune**
> Manage the built-in memory system.

**cron add** _NAME_ _SCHEDULE_ _MESSAGE_ [**--tz** _TIMEZONE_]
> Schedule a recurring task with a cron expression.

**cron list** | **remove** _NAME_
> List or remove scheduled tasks.

**skills list** | **install** _NAME_ | **remove** _NAME_
> Manage agent skills and extensions.

**migrate openclaw** [**--dry-run**]
> Import memory from an OpenClaw runtime.

**completions** _SHELL_
> Generate shell completions for bash, zsh, fish, powershell, or nushell.

**providers**
> List all supported LLM providers and aliases.

**estop** [**--resume**]
> Engage or resume from emergency stop.

# DESCRIPTION

**zeroclaw** is a lightweight, security-first autonomous AI agent runtime built entirely in Rust. It serves as infrastructure for agentic workflows, abstracting models, tools, memory, and execution into a single binary that can be deployed across ARM, x86, and RISC-V architectures.

The runtime compiles to an approximately 9MB binary with cold start under 10 milliseconds and less than 5MB RAM usage at idle. It uses a trait-driven architecture where providers, channels, memory backends, and tools are swappable through configuration without code changes.

ZeroClaw includes a built-in hybrid search memory system combining vector embeddings with keyword search (SQLite-backed), requiring no external dependencies. It supports 28+ LLM providers including OpenRouter, Anthropic, OpenAI, Gemini, Ollama, and any OpenAI-compatible endpoint. Messaging integrations cover 70+ channels including Telegram, Discord, Slack, iMessage, Matrix, Signal, and WhatsApp.

The agent supports multi-turn conversations with context preservation, tool execution (shell, file, git, browser), scheduled tasks via cron expressions, and hardware peripheral control for IoT devices.

# CONFIGURATION

Configuration is stored in **~/.zeroclaw/config.toml**. Run **zeroclaw onboard --interactive** for guided setup.

```
[providers]
default = "openrouter"

[providers.openrouter]
api_key = "sk-or-v1-xxx"
model = "anthropic/claude-opus-4-5"

[memory]
backend = "sqlite"

[runtime]
kind = "native"

[channels.telegram]
bot_token = "123:ABC..."
allowed_users = ["123456789"]
```

Supported memory backends: **sqlite** (default, hybrid search), **postgres**, **markdown**, and **none** (stateless).

Environment variables override config values: **ZEROCLAW_API_KEY**, **ZEROCLAW_PROVIDER**, **ZEROCLAW_MODEL**, **ZEROCLAW_WORKSPACE**.

# CAVEATS

ZeroClaw executes shell commands and file operations with your user permissions. The agent can modify files and run arbitrary commands when tool use is enabled. API keys are stored in **config.toml** and **auth-profiles.json** (encrypted at rest if secrets encryption is enabled). Channel integrations require the daemon to be running. Compilation from source requires at least 2GB RAM and 6GB disk space due to the Rust toolchain.

# HISTORY

ZeroClaw was created by **ZeroClaw Labs** and first released in **2025** as a Rust-based alternative to existing AI agent runtimes. It was designed around the principle of zero overhead and zero lock-in, targeting deployment on resource-constrained hardware while maintaining production-grade extensibility. The project introduced a trait-driven architecture allowing providers, channels, and tools to be swapped without code changes, and gained attention for achieving sub-10ms cold start times with a single-binary deployment model.

# SEE ALSO

[nanobot](/man/nanobot)(1), [picoclaw](/man/picoclaw)(1), [claude](/man/claude)(1), [openclaw](/man/openclaw)(1)
