# TAGLINE

LPU-powered terminal coding assistant

# TLDR

**Start interactive chat** session

```groq```

**Run without installation** using npx

```npx groq-code-cli@latest```

**Set generation temperature** for responses

```groq -t [0.7]```

**Provide a custom system message**

```groq -s "You are a helpful coding assistant"```

**Enable debug logging** to file

```groq -d```

**Configure proxy** for API requests

```groq --proxy [http://proxy:8080]```

# SYNOPSIS

**groq** [**-t** _temperature_] [**-s** _message_] [**-d**] [**-p** _proxy_]

# PARAMETERS

**-t**, **--temperature** _temp_
> Set generation temperature controlling response randomness. Default: 1.

**-s**, **--system** _message_
> Provide a custom system message for the conversation.

**-d**, **--debug**
> Enable debug logging output to debug-agent.log.

**-p**, **--proxy** _url_
> Configure proxy for API requests. Supports HTTP, HTTPS, and SOCKS5 protocols.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Show version number.

# SLASH COMMANDS

**/help**
> Display help and available commands.

**/login**
> Authenticate with API credentials.

**/model**
> View and select available Groq models.

**/clear**
> Clear chat history and context.

**/reasoning**
> Toggle reasoning content display.

**/stats**
> Show session statistics and token usage.

# DESCRIPTION

**groq** (Groq Code CLI) is a command-line coding assistant powered by Groq's LPU (Language Processing Unit) inference engine, known for extremely fast response times. It provides an interactive terminal-based interface for AI-assisted code generation and development tasks.

The CLI stores configuration in a **.groq/** folder in your home directory, including API keys and model preferences. Users can select different language models available on the Groq platform using the **/model** command.

Proxy configuration follows a priority order: CLI flag (**--proxy**) takes precedence over **HTTPS_PROXY**, which takes precedence over **HTTP_PROXY** environment variables.

# CONFIGURATION

**~/.groq/**
> Configuration directory storing API keys, model preferences, and session data.

# CAVEATS

Requires a **GROQ_API_KEY** environment variable or authentication via the **/login** command. API usage is subject to Groq's rate limits and terms of service. The CLI requires Node.js for installation.

# HISTORY

Groq Code CLI was released as an open-source project by Groq to showcase their LPU inference capabilities for developers. Groq, founded in **2016**, developed custom tensor streaming processor chips optimized for AI inference, achieving significantly faster response times than traditional GPU-based solutions. The CLI leverages this speed advantage for interactive coding workflows.

# SEE ALSO

[claude](/man/claude)(1), [ollama](/man/ollama)(1), [anthropic](/man/anthropic)(1)
