# TLDR

**Start an interactive session**

```nanobot```

**Send a one-off command**

```nanobot "[task]"```

**Run with a specific local model**

```nanobot --model [model_name]```

**Start in server mode for Telegram integration**

```nanobot serve --telegram```

**Schedule a recurring task**

```nanobot schedule "[task]" --cron "[cron_expression]"```

**List active scheduled tasks**

```nanobot tasks```

# SYNOPSIS

**nanobot** [_options_] [_command_]

**nanobot** **serve** [_options_]

**nanobot** **schedule** [_options_]

# PARAMETERS

_COMMAND_
> Natural language task or instruction for the AI assistant.

**serve**
> Start nanobot in server mode for messaging platform integration.

**--telegram**
> Enable Telegram bot integration.

**--whatsapp**
> Enable WhatsApp integration.

**schedule**
> Create a scheduled or recurring task.

**--cron** _EXPRESSION_
> Cron expression for task scheduling.

**tasks**
> List all active scheduled tasks.

**--model** _MODEL_
> Specify the local LLM to use.

**--local**
> Force fully local operation without external APIs.

**--port** _PORT_
> Port number for server mode (default: 3000).

**--verbose**
> Enable verbose logging output.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**nanobot** is an ultra-lightweight open-source AI assistant built in approximately 4,000 lines of code. It supports interaction through messaging platforms including Telegram and WhatsApp, enabling voice and text-based communication from any device.

The assistant runs local language models for privacy-focused operation and can execute scheduled tasks autonomously using cron expressions. It supports multi-step task automation, reminders, and conversational interaction without requiring cloud AI services.

nanobot is designed to be simple to deploy and extend, with minimal dependencies and a small footprint suitable for running on low-resource hardware including Raspberry Pi devices.

# CAVEATS

Messaging platform integrations require API tokens from their respective services. Running local models requires sufficient RAM and compute resources. Scheduled tasks persist only while the server process is running unless configured with a process manager.

# HISTORY

nanobot was created by **the HKUDS research group** (Data Intelligence Lab at the University of Hong Kong). It was designed as a minimalist alternative to larger AI assistant frameworks, emphasizing simplicity and local-first operation. The project gained attention for achieving broad AI assistant functionality in a remarkably small codebase.

# SEE ALSO

[openclaw](/man/openclaw)(1), [claude](/man/claude)(1), [ollama](/man/ollama)(1), [llm](/man/llm)(1)
