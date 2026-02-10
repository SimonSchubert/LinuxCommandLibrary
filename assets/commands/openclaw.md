# TAGLINE

open-source autonomous AI assistant that runs locally or on private servers

# TLDR

**Start an interactive session**

```openclaw```

**Send a one-off command**

```openclaw "[task]"```

**Configure messaging integration**

```openclaw config --telegram```

**Run in server mode**

```openclaw serve --port [3000]```

**List connected services**

```openclaw services```

**Check calendar and upcoming events**

```openclaw calendar list```

# SYNOPSIS

**openclaw** [_options_] [_command_]

**openclaw** **serve** [_options_]

**openclaw** **config** [_options_]

# PARAMETERS

_COMMAND_
> Natural language task or instruction for the AI assistant.

**serve**
> Start OpenClaw in server mode for persistent operation.

**--port** _PORT_
> Port number for server mode (default: 3000).

**config**
> Configure integrations and settings.

**--telegram**
> Set up Telegram bot integration.

**--whatsapp**
> Set up WhatsApp integration.

**--signal**
> Set up Signal integration.

**services**
> List all connected messaging services and integrations.

**calendar**
> Manage calendar operations (list, add, remove).

**--local**
> Run entirely on local machine without external APIs.

**--model** _MODEL_
> Specify the AI model to use.

**--verbose**
> Enable verbose logging output.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**OpenClaw** is an open-source autonomous AI assistant that runs locally or on private servers. It accepts commands through multiple messaging platforms including WhatsApp, Telegram, and Signal, enabling voice and text-based interaction from any device.

The assistant can manage calendars, send messages, automate workflows, and execute tasks autonomously. It operates with a focus on privacy by running locally without requiring cloud services, though it can optionally connect to external AI APIs for enhanced capabilities.

OpenClaw integrates with personal productivity tools and smart home systems. It supports scheduling, reminders, email drafting, and multi-step task automation. The server mode allows persistent operation as a background service.

# CAVEATS

Messaging integrations require API tokens from respective platforms. Running locally requires sufficient computational resources for AI model inference. Some features may require external API keys when not using local models. Ensure proper security configuration when exposing the server to networks.

# HISTORY

OpenClaw was created by **Peter Steinberger**, founder of PSPDFKit. Originally named **Clawdbot** and later **Moltbot**, it was renamed to OpenClaw when released as open source. The project gained significant traction in the developer community, accumulating over 68,000 GitHub stars. It represents a privacy-focused approach to personal AI assistants.

# SEE ALSO

[claude](/man/claude)(1), [ollama](/man/ollama)(1), [llm](/man/llm)(1)
