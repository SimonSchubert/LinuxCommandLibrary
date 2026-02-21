# TAGLINE

open-source autonomous AI agent that runs locally or on private servers

# TLDR

**Run the first-time setup wizard**

```openclaw onboard```

**Start the gateway for persistent operation**

```openclaw gateway```

**Install the gateway as a system daemon**

```openclaw gateway install```

**Send a task to the agent**

```openclaw agent --message "[task]"```

**List and manage installed skills**

```openclaw skills```

**Check system health and connected services**

```openclaw status```

# SYNOPSIS

**openclaw** [_command_] [_options_]

**openclaw** **gateway** [_options_]

**openclaw** **agent** [_options_]

# PARAMETERS

**onboard**
> Run the interactive setup wizard to configure messaging platforms and install the gateway daemon.

**gateway**
> Start the Gateway server for persistent operation (default port: 18789).

**gateway install**
> Install the Gateway as a system daemon (launchd on macOS, systemd on Linux).

**gateway start**
> Start the installed Gateway daemon.

**gateway stop**
> Stop the running Gateway daemon.

**gateway restart**
> Restart the Gateway daemon.

**agent --message** _MESSAGE_
> Send a natural language task or instruction to the AI agent.

**config get** _PATH_
> Retrieve a configuration value.

**config set** _PATH_ _VALUE_
> Set a configuration value.

**skills**
> List and manage installed skills from the skill registry.

**status**
> Display system health, connected services, and active sessions.

**doctor**
> Run diagnostics to identify configuration or connectivity issues.

**cron**
> Manage scheduled recurring tasks.

**sessions**
> List active and past agent sessions.

**--port** _PORT_
> Port number for the gateway (default: 18789).

**--verbose**
> Enable verbose logging output.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**OpenClaw** is a free, open-source, MIT-licensed autonomous AI agent that runs locally or on private servers. Written in TypeScript and installed via npm, it uses large language models to execute tasks autonomously through messaging platforms. Supported channels include WhatsApp, Telegram, Signal, Slack, Discord, Google Chat, iMessage, Microsoft Teams, Matrix, and WebChat, enabling voice and text-based interaction from any device.

The agent operates through a Gateway architecture that provides persistent background operation. The Gateway listens on multiple ports for its control plane, messaging relay, and other services. Tasks are dispatched to the agent via messaging platforms or the CLI, and the agent can perform multi-step workflows, manage calendars, draft emails, send messages, and automate system commands.

OpenClaw supports fully local operation using local LLM backends such as Ollama, allowing all reasoning and task execution to happen on-device without any data sent to external services. It can also connect to external AI APIs for enhanced capabilities. A skills framework with 50+ built-in skills and a community registry (ClaHub) provides extensible integrations for calendars, email, smart home systems, and more.

# CAVEATS

Messaging integrations require API tokens or credentials from their respective platforms. Running with local models requires sufficient computational resources for LLM inference. The onboarding wizard guides initial configuration of messaging channels and daemon installation. Ensure proper network security when exposing the Gateway to external networks.

# HISTORY

OpenClaw was created in November 2025 by **Peter Steinberger**, co-founder and former CEO of PSPDFKit. The project was originally named **Clawdbot** and was open source from the start. In January 2026, Anthropic threatened legal action over the trademark similarity between "Clawd" and "Claude," prompting a rename to **Moltbot**. Just three days later, the project was renamed again to **OpenClaw** after cryptocurrency scammers hijacked abandoned social media accounts associated with the Moltbot name. The project grew rapidly, becoming one of the fastest-growing repositories in GitHub history and surpassing 200,000 stars within 84 days. In February 2026, Steinberger announced he was joining OpenAI to lead next-generation personal AI agents, and the OpenClaw Foundation was established to steward the open-source project.

# SEE ALSO

[claude](/man/claude)(1), [ollama](/man/ollama)(1), [llm](/man/llm)(1)
