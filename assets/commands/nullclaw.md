# TAGLINE

Autonomous AI assistant infrastructure written in Zig

# TLDR

**Start interactive agent** conversation

```nullclaw agent```

**Send a single message** and exit

```nullclaw agent -m "[message]"```

**Start the HTTP gateway** on a custom port

```nullclaw gateway --port [3000]```

**Run the onboarding wizard** interactively

```nullclaw onboard --interactive```

**Start a messaging channel**

```nullclaw channel start [telegram]```

**Check system health** and configuration

```nullclaw status```

**Run diagnostics**

```nullclaw doctor```

**Install as a system service**

```nullclaw service install```

# SYNOPSIS

**nullclaw** [_command_] [_options_]

# PARAMETERS

**agent**
> Interactive or single-message conversation mode.

**-m**, **--message** _MESSAGE_
> Execute a single message then exit (used with agent).

**gateway**
> Start HTTP runtime with integrated channels.

**--port** _PORT_
> Listen port for the gateway (default: 3000).

**onboard**
> Configuration wizard for initial setup.

**--api-key** _KEY_
> Set API key directly during onboarding.

**--provider** _PROVIDER_
> Specify model provider during onboarding.

**--interactive**
> Step-by-step interactive configuration.

**channel** {**start**|**stop**|**status**} [_CHANNEL_NAME_]
> Manage messaging integrations.

**service** {**install**|**status**|**stop**}
> Background daemon management.

**status**
> Display system health and configuration summary.

**doctor**
> Run comprehensive system diagnostics.

**migrate** **openclaw** [**--dry-run**]
> Import data from compatible systems. Use --dry-run to preview without applying.

# DESCRIPTION

**nullclaw** is a minimalist AI agent framework built entirely in Zig, delivering a single static 678 KB binary with under 2 ms startup time and approximately 1 MB peak memory usage. It runs on any hardware with a CPU — ARM, x86, and RISC-V architectures are supported without modification.

The framework integrates 22+ AI providers (including Anthropic, OpenAI, Ollama, and OpenRouter), 18 communication channels (Telegram, Signal, Discord, Slack, iMessage, Matrix, WhatsApp, IRC, and more), and customizable tools — all with zero external runtime dependencies beyond libc.

All subsystems use vtable interfaces enabling swappable implementations without code changes. This covers providers, channels, memory backends, tools, runtimes, and security sandboxes. The memory system uses hybrid search combining FTS5 full-text indexing with vector similarity within SQLite.

# CONFIGURATION

Configuration resides at **~/.nullclaw/config.json** and follows OpenClaw-compatible schema with snake_case formatting.

```
{
  "models": {
    "providers": {
      "anthropic": {
        "api_key": "sk-..."
      }
    }
  },
  "agents": {
    "defaults": {
      "model": {
        "primary": "claude-sonnet-4-20250514"
      }
    }
  }
}
```

Providers are nested under **models.providers**, the default model under **agents.defaults.model.primary**, and channels use **accounts** wrappers.

# CAVEATS

Requires **Zig 0.15.2** (exact version) to build from source. The binary has no external dependencies beyond libc, but individual providers and channels require their own API keys or service accounts to function. The project is OpenClaw-compatible but not a drop-in replacement — configuration migration via **nullclaw migrate openclaw** may require manual adjustments.

# HISTORY

**NullClaw** is a successor in the claw-family of AI agent frameworks, following **OpenClaw** and **ZeroClaw**. Written entirely in **Zig**, it was designed for extreme minimalism and portability, targeting edge computing and resource-constrained environments where traditional runtimes are impractical. The project maintains a test suite of 3,230+ tests.

# SEE ALSO

[ollama](/man/ollama)(1)
