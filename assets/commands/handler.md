# TAGLINE

A2A Protocol client TUI and CLI

# TLDR

**Launch the interactive TUI**

```handler tui```

**Start the local A2A server agent**

```handler server```

**Send a message to an agent**

```handler send --url [agent_url] --message "[message]"```

**Validate an A2A agent**

```handler validate --url [agent_url]```

# SYNOPSIS

**handler** _command_ [_options_]

# DESCRIPTION

**handler** is a client and developer toolkit for the **A2A (Agent-to-Agent) Protocol**, providing both a TUI and CLI interface for interacting with A2A-compliant agents. It allows developers to send messages, validate agents, manage tasks, and chat interactively with AI agents from the terminal.

The tool includes a built-in local A2A server agent (requires **Ollama** running locally) for testing and development purposes.

# PARAMETERS

**tui**
> Launch the interactive terminal user interface

**server**
> Start the local A2A server agent

**send**
> Send a message to an agent

**validate**
> Validate an A2A agent endpoint

**--url** _URL_
> Target agent URL

**--message** _TEXT_
> Message to send

**--verbose**
> Enable verbose output

**--debug**
> Enable debug logging

# CAVEATS

The built-in server agent requires **Ollama** to be running locally. The A2A Protocol is relatively new and agent compatibility may vary across implementations.

# HISTORY

**handler** was created by **Al Duncanson** and is written in **Python**. It was developed as a developer toolkit for Google's **Agent-to-Agent (A2A) Protocol**, which enables communication between AI agents from different frameworks.

# SEE ALSO

[curl](/man/curl)(1)
