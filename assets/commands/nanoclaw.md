# TLDR

**Start nanoclaw and run initial setup**

```claude```

```/setup```

**Send a message via WhatsApp trigger word**

```@Andy [message]```

**Schedule a recurring briefing**

```@Andy schedule a daily news briefing at 8am```

**Ask a question in a group chat**

```@Andy what's the weather forecast for today?```

# SYNOPSIS

**nanoclaw** (runs as a Claude agent via **claude** command, then **/setup**)

# PARAMETERS

**/setup**
> Interactive setup wizard within the Claude session to configure WhatsApp integration, scheduled tasks, and container settings.

**@**_TRIGGER_ _MESSAGE_
> Send a message to nanoclaw via WhatsApp using the configured trigger word (default: @Andy).

# DESCRIPTION

**nanoclaw** is a lightweight personal AI assistant powered by Claude that runs in an isolated container environment. It integrates with WhatsApp for natural messaging-based interaction, allowing users to communicate with their AI assistant from any device.

Each group chat gets its own isolated context with individual memory and a sandboxed filesystem, ensuring conversations and data remain separated. The assistant supports scheduled task automation for recurring jobs such as daily briefings, news summaries, and reminders.

nanoclaw runs as a single Node.js process backed by SQLite for storage. It uses Apple Container or Docker for isolation and the Claude Agent SDK for AI capabilities. Setup is performed interactively through the **claude** command followed by the **/setup** slash command.

# CAVEATS

Requires a Claude API key and WhatsApp Business API access. Container isolation depends on Apple Container (macOS) or Docker being available. Scheduled tasks only run while the process is active. WhatsApp integration requires a phone number and business account setup.

# HISTORY

nanoclaw was created by **Gavriel Cohen** as a minimalist personal AI assistant focused on WhatsApp integration and container-based isolation. It was designed to provide a lightweight alternative to heavier assistant frameworks while maintaining strong security boundaries between conversation contexts.

# SEE ALSO

[openclaw](/man/openclaw)(1), [nanobot](/man/nanobot)(1), [claude](/man/claude)(1), [leon](/man/leon)(1)
