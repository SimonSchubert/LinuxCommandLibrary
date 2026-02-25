# TAGLINE

Ultra-lightweight personal AI assistant

# TLDR

**Initialize** configuration and set up credentials

```nanobot onboard```

**Start an interactive** CLI chat session with the AI agent

```nanobot agent```

**Start the multi-channel gateway** for chat platform integrations

```nanobot gateway```

**Authenticate** with a chat platform (e.g. WhatsApp QR linking)

```nanobot channels login```

# SYNOPSIS

**nanobot** [_command_] [_options_]

# PARAMETERS

**onboard**
> Initialize configuration and set up the environment for first-time use. Creates config at **~/.nanobot/config.json**.

**agent**
> Start an interactive CLI chat session with the AI agent.

**gateway**
> Run the multi-channel gateway to connect chat platforms such as Telegram, Discord, WhatsApp, Slack, and others.

**channels login**
> Authenticate with chat platforms, primarily used for WhatsApp QR-code linking.

# DESCRIPTION

**nanobot** is an ultra-lightweight personal AI assistant that delivers core agent functionality in approximately 4,000 lines of Python code. It connects closed and open-source LLMs to a local coding agent that can run commands, read logs, execute scripts, and search files on your machine.

Nanobot supports multiple LLM providers including OpenRouter, Anthropic (Claude), OpenAI (GPT), DeepSeek, Google Gemini, Groq, and custom OpenAI-compatible endpoints. It integrates with chat platforms such as Telegram, Discord, WhatsApp, Feishu, Slack, Email, QQ, DingTalk, and Mochat, allowing the agent to be accessed from various messaging services via the gateway command.

The tool uses MCP (Model Context Protocol) for extending capabilities with external tools and services.

# CONFIGURATION

Configuration is stored in **~/.nanobot/config.json**. Run **nanobot onboard** for interactive setup.

Minimal configuration requires a provider API key and model selection:

```
{
  "providers": {
    "openrouter": {
      "apiKey": "sk-or-v1-xxx"
    }
  },
  "agents": {
    "defaults": {
      "model": "anthropic/claude-opus-4-5"
    }
  }
}
```

Supported providers: **openrouter**, **anthropic**, **openai**, **deepseek**, **groq**, **gemini**, **minimax**, and **custom** (any OpenAI-compatible endpoint).

# CAVEATS

Nanobot executes commands on your local machine with your user permissions. Always review agent actions before granting broad tool access. The tool requires network access for LLM API calls and chat platform integrations. Provider API keys are stored in plaintext in the config file.

# HISTORY

Nanobot was developed by **HKUDS** (Hong Kong University Data Science Lab) as an ultra-lightweight alternative to larger AI coding assistants. First released in **2025**, it aimed to provide core agent functionality with a minimal codebase, emphasizing research-readiness and a clean, modifiable architecture. The project gained traction as an accessible entry point for developers exploring agentic AI workflows.

# SEE ALSO

[picoclaw](/man/picoclaw)(1), [claude](/man/claude)(1)
