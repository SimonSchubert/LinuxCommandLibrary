# TAGLINE

A2A Protocol client TUI and CLI

# TLDR

**Launch the interactive TUI**

```handler tui```

**Fetch an agent's card**

```handler card get --url [http://localhost:8000]```

**Validate an agent card** from a URL or local file

```handler card validate --file [agent-card.json]```

**Send a message** to an agent

```handler message send --url [agent_url] --text "[message]"```

**Stream the reply** with a file attached

```handler message stream --url [agent_url] --text "[Review this]" --file [report.pdf]```

**Save a server** to the configuration, then use it by name

```handler server add [name] --url [agent_url]```

**List tasks** of a configured server as JSON

```handler --output json task list --server [name]```

**Cancel a task**

```handler task cancel [task_id] --server [name]```

# SYNOPSIS

**handler** [_global options_] _command_ [_subcommand_] [_options_]

# DESCRIPTION

**handler** is a client and developer toolkit for the **A2A (Agent-to-Agent) Protocol**, providing both a TUI and a scriptable CLI for interacting with A2A-compliant agents. It can fetch and validate agent cards, send and stream messages (text, files, and structured data), and list, inspect, cancel, and resubscribe to tasks.

Servers can be stored in a global or repository-scoped configuration with authentication (bearer token, API key, HTTP Basic, mTLS, OAuth2 client credentials, or OpenID Connect) and then referenced with **--server**. Handler also ships a local webhook receiver for push notifications and an MCP server that exposes A2A operations as tools to other agents.

# PARAMETERS

**tui**
> Launch the interactive terminal user interface

**web**
> Serve the TUI as a web application

**card get** | **card validate**
> Retrieve or validate an agent card

**message send** | **message stream**
> Send a message and wait for, or stream, the response

**task list** | **get** | **cancel** | **resubscribe** | **notification**
> Manage tasks and their push notification configs

**session list** | **show** | **clear**
> Inspect or clear saved conversation state

**server add** | **list** | **show** | **remove** | **validate**
> Manage configured A2A servers

**server run push** [**--host** _HOST_] [**--port** _PORT_] [**--token** _TOKEN_]
> Start a local webhook receiver for push notifications (default **127.0.0.1:9000**)

**mcp**
> Run a local MCP server exposing A2A tools

**docs** | **version** | **update**
> Open the documentation, print the version, or update Handler

**--url** _URL_
> Target agent URL

**-s**, **--server** _NAME_
> Use a configured server instead of a URL

**-t**, **--text** _TEXT_
> Message text (for **message** commands)

**-f**, **--file** _PATH_
> Attach a local file or URL (repeatable)

**-C**, **--continue**
> Continue the saved conversation with the agent

**--output** _text_|_json_|_ndjson_
> Output format (global option, default **text**)

**-v**, **--verbose**
> Enable verbose output

**-d**, **--debug**
> Enable debug logging

# CAVEATS

Global options such as **--output** must come before the command. The A2A Protocol is relatively new and agent compatibility may vary across implementations. gRPC transport requires installing the **grpc** extra.

# HISTORY

**handler** was created by **Al Duncanson** and is written in **Python**. It is published on PyPI as **a2a-handler**. Early versions bundled a built-in Ollama-backed A2A agent for testing, which was later removed to keep Handler a pure client.

# SEE ALSO

[curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/alDuncanson/Handler)```

```[Documentation](https://handler.alduncanson.com)```

<!-- verified: 2026-11-23 -->
